package com.geo.toolbox

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.animation.Crossfade
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import com.geo.toolbox.navigation.NavRoute
import com.geo.toolbox.ui.pages.AnalyzePage
import com.geo.toolbox.ui.pages.CameraPage
import com.geo.toolbox.ui.pages.GpsPage
import com.geo.toolbox.ui.pages.RecordPage
import com.geo.toolbox.ui.widgets.GlassNavBar

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MaterialTheme {
                Surface(modifier = Modifier.fillMaxSize()) {
                    var currentRoute: NavRoute by remember { mutableStateOf(NavRoute.Gps) }

                    Scaffold(
                        bottomBar = {
                            GlassNavBar(
                                selectedRoute = currentRoute,
                                onRouteSelect = { currentRoute = it }
                            )
                        }
                    ) { innerPadding ->
                        Box(
                            modifier = Modifier
                                .fillMaxSize()
                                .padding(innerPadding)
                        ) {
                            // 页面平滑淡入淡出转场动画 Crossfade
                            Crossfade(targetState = currentRoute, label = "pageSwitch") { route ->
                                when (route) {
                                    NavRoute.Gps -> GpsPage()
                                    NavRoute.Analyze -> AnalyzePage()
                                    NavRoute.Record -> RecordPage()
                                    NavRoute.Camera -> CameraPage()
                                }
                            }
                        }
                    }
                }
            }
        }
    }
}

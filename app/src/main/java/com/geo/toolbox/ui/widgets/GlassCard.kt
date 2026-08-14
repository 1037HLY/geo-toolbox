package com.geo.toolbox.ui.widgets

import androidx.compose.animation.core.animateScaleAsState
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.geo.toolbox.ui.liquidGlass

@Composable
fun GlassPreviewCard(
    title: String,
    onClick: () -> Unit,
    modifier: Modifier = Modifier,
    content: @Composable () -> Unit = {}
) {
    var pressed by remember { mutableStateOf(false) }
    val scale by animateScaleAsState(targetValue = if (pressed) 0.96f else 1f)

    Box(
        modifier = modifier
            .fillMaxWidth()
            .padding(horizontal = 8.dp, vertical = 6.dp)
            .liquidGlass()
            .clickable { onClick() }
    ) {
        Box(
            modifier = Modifier
                .padding(16.dp)
        ) {
            Text(text = "【$title】预览窗口，点击展开大窗口")
            content()
        }
    }
}

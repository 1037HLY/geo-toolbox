package com.geo.toolbox.ui.pages

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.verticalScroll
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.geo.toolbox.ui.widgets.GlassPreviewCard

@Composable
fun RecordPage() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .verticalScroll(androidx.compose.foundation.ScrollState(0))
            .padding(top = 12.dp, bottom = 100.dp)
    ) {
        GlassPreviewCard(title = "普通样本") {}
        GlassPreviewCard(title = "钻孔样本") {}
    }
}

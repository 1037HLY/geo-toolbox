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
fun GpsPage() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .verticalScroll(androidx.compose.foundation.ScrollState(0))
            .padding(top = 12.dp, bottom = 100.dp)
    ) {
        GlassPreviewCard(title = "GPS窗口") {
            // 点击展开大窗口预留区域
        }

        GlassPreviewCard(title = "卫星窗口【极坐标图 | 卫星信息】") {
            // 大窗口上下分区占位
        }

        GlassPreviewCard(title = "轨迹窗口【实时轨迹 | 轨迹导航】") {
            // 大窗口上下分区占位
        }
    }
}

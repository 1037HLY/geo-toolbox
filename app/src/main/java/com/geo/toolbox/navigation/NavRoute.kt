package com.geo.toolbox.navigation

sealed class NavRoute(val route: String, val label: String, val iconName: String) {
    object Gps : NavRoute("gps", "GPS", "gps")
    object Analyze : NavRoute("analyze", "分析", "analyze")
    object Record : NavRoute("record", "记录", "record")
    object Camera : NavRoute("camera", "相机", "camera")
}

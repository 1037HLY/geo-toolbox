package com.geo.toolbox.ui

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp

/**
 * iOS Liquid Glass 液态玻璃模拟Modifier
 * 特性：半透基底、顶部高光渐变、边缘暗化、柔和悬浮阴影、大圆角
 */
fun Modifier.liquidGlass(
    radius: Dp = 24.dp,
    alpha: Float = 0.72f,
): Modifier {
    val glassBaseColor = Color.White.copy(alpha = alpha)
    // 顶部柔和镜面高光
    val highlightBrush = Brush.linearGradient(
        colors = listOf(
            Color.White.copy(alpha = 0.35f),
            Color.White.copy(alpha = 0f)
        ),
        start = androidx.compose.ui.geometry.Offset(0f, 0f),
        end = androidx.compose.ui.geometry.Offset(0f, 80f)
    )

    return this
        .shadow(
            elevation = 12.dp,
            shape = RoundedCornerShape(radius),
            spotColor = Color.Black.copy(alpha = 0.18f)
        )
        .clip(RoundedCornerShape(radius))
        .background(glassBaseColor)
        .background(highlightBrush)
        .border(
            width = 0.5.dp,
            color = Color.White.copy(alpha = 0.4f),
            shape = RoundedCornerShape(radius)
        )
}

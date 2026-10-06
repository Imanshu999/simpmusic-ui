package com.maxrave.simpmusic.ui.icon

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Search: ImageVector
    get() = ImageVector.Builder(
        name = "Search",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f,
    ).apply {
        path(
            stroke = SolidColor(Color.Black),
            strokeLineWidth = 1.9f,
            strokeLineCap = androidx.compose.ui.graphics.StrokeCap.Round,
            strokeLineJoin = androidx.compose.ui.graphics.StrokeJoin.Round,
        ) {
            moveTo(10.5f, 4.5f)
            arcToRelative(6f, 6f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, 12f)
            arcToRelative(6f, 6f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, -12f)
            moveTo(15f, 15f)
            lineTo(20f, 20f)
        }
    }.build()

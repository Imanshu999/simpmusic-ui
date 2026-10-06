package com.maxrave.simpmusic.ui.icon

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Home: ImageVector
    get() = ImageVector.Builder(
        name = "Home",
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
            moveTo(4.5f, 10.5f)
            lineTo(12f, 4.5f)
            lineTo(19.5f, 10.5f)
            verticalLineTo(19f)
            quadraticBezierTo(19.5f, 20f, 18.5f, 20f)
            horizontalLineTo(14.5f)
            verticalLineTo(15f)
            horizontalLineTo(9.5f)
            verticalLineTo(20f)
            horizontalLineTo(5.5f)
            quadraticBezierTo(4.5f, 20f, 4.5f, 19f)
            close()
        }
    }.build()

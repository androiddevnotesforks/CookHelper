package ru.tech.cookhelper.presentation.ui.theme

import androidx.compose.material.icons.Icons
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Icons.Rounded.Fridge: ImageVector
    get() {
        if (_fridge != null) {
            return _fridge!!
        }
        _fridge = ImageVector.Builder(
            name = "Fridge", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
            viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(7.0f, 2.0f)
                horizontalLineTo(17.0f)
                arcTo(
                    2.0f, 2.0f, 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    x1 = 19.0f,
                    y1 = 4.0f
                )
                verticalLineTo(9.0f)
                horizontalLineTo(5.0f)
                verticalLineTo(4.0f)
                arcTo(
                    2.0f, 2.0f, 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    x1 = 7.0f,
                    y1 = 2.0f
                )
                moveTo(19.0f, 19.0f)
                arcTo(
                    2.0f, 2.0f, 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    x1 = 17.0f,
                    y1 = 21.0f
                )
                verticalLineTo(22.0f)
                horizontalLineTo(15.0f)
                verticalLineTo(21.0f)
                horizontalLineTo(9.0f)
                verticalLineTo(22.0f)
                horizontalLineTo(7.0f)
                verticalLineTo(21.0f)
                arcTo(
                    2.0f, 2.0f, 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    x1 = 5.0f,
                    y1 = 19.0f
                )
                verticalLineTo(10.0f)
                horizontalLineTo(19.0f)
                verticalLineTo(19.0f)
                moveTo(8.0f, 5.0f)
                verticalLineTo(7.0f)
                horizontalLineTo(10.0f)
                verticalLineTo(5.0f)
                horizontalLineTo(8.0f)
                moveTo(8.0f, 12.0f)
                verticalLineTo(15.0f)
                horizontalLineTo(10.0f)
                verticalLineTo(12.0f)
                horizontalLineTo(8.0f)
                close()
            }
        }
            .build()
        return _fridge!!
    }

private var _fridge: ImageVector? = null

val Icons.Outlined.Fridge: ImageVector
    get() {
        if (_fridgeOutline != null) {
            return _fridgeOutline!!
        }
        _fridgeOutline = ImageVector.Builder(
            name = "FridgeOutline", defaultWidth = 24.0.dp, defaultHeight =
            24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(9.0f, 21.0f)
                verticalLineTo(22.0f)
                horizontalLineTo(7.0f)
                verticalLineTo(21.0f)
                arcTo(
                    2.0f, 2.0f, 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    x1 = 5.0f,
                    y1 = 19.0f
                )
                verticalLineTo(4.0f)
                arcTo(
                    2.0f, 2.0f, 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    x1 = 7.0f,
                    y1 = 2.0f
                )
                horizontalLineTo(17.0f)
                arcTo(
                    2.0f, 2.0f, 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    x1 = 19.0f,
                    y1 = 4.0f
                )
                verticalLineTo(19.0f)
                arcTo(
                    2.0f, 2.0f, 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    x1 = 17.0f,
                    y1 = 21.0f
                )
                verticalLineTo(22.0f)
                horizontalLineTo(15.0f)
                verticalLineTo(21.0f)
                horizontalLineTo(9.0f)
                moveTo(7.0f, 4.0f)
                verticalLineTo(9.0f)
                horizontalLineTo(17.0f)
                verticalLineTo(4.0f)
                horizontalLineTo(7.0f)
                moveTo(7.0f, 19.0f)
                horizontalLineTo(17.0f)
                verticalLineTo(11.0f)
                horizontalLineTo(7.0f)
                verticalLineTo(19.0f)
                moveTo(8.0f, 12.0f)
                horizontalLineTo(10.0f)
                verticalLineTo(15.0f)
                horizontalLineTo(8.0f)
                verticalLineTo(12.0f)
                moveTo(8.0f, 6.0f)
                horizontalLineTo(10.0f)
                verticalLineTo(8.0f)
                horizontalLineTo(8.0f)
                verticalLineTo(6.0f)
                close()
            }
        }
            .build()
        return _fridgeOutline!!
    }

private var _fridgeOutline: ImageVector? = null
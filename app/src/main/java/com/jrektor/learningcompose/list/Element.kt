package com.jrektor.learningcompose.list

import android.graphics.drawable.Icon
import androidx.annotation.DrawableRes
import androidx.annotation.StringRes
import androidx.compose.material.icons.Icons

//class annotation, hanya ada 2 annotation yakni untuk String dan Drawable.
//panggil file resourcenya
data class Element(
    @StringRes val name: Int,
    @StringRes val major: Int,
    @DrawableRes val icon: Int
)

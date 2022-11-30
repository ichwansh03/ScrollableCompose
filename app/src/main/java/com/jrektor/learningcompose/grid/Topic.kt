package com.jrektor.learningcompose.grid

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes

data class Topic(
    @StringRes val title: Int,
    val availableItem: Int,
    @DrawableRes val image: Int
)

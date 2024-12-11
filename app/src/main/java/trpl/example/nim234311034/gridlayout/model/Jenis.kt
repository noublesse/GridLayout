package trpl.example.nim234311034.gridlayout.model

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes

data class Jenis(
    @StringRes val name: Int,
    val availableCourses: Int,
    @DrawableRes val imageRes:Int
)
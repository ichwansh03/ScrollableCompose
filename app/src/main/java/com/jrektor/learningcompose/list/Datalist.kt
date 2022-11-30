package com.jrektor.learningcompose.list

import com.jrektor.learningcompose.R

//menyimpan data list dengan mengembalikan nilai dari class Element
class Datalist {
    fun loadElement(): List<Element> {
        return listOf<Element>(
            Element(R.string.name1, R.string.major1, R.drawable.ic_launcher_foreground),
            Element(R.string.name2, R.string.major1, R.drawable.ic_launcher_background),
            Element(R.string.name3, R.string.major2, R.drawable.ic_launcher_background),
            Element(R.string.name4, R.string.major3, R.drawable.ic_launcher_foreground),
            Element(R.string.name5, R.string.major1, R.drawable.ic_launcher_foreground)
        )
    }
}
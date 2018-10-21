package com.example.administrator.testlighting

import android.app.Activity
import android.os.Bundle
import android.text.Html
import kotlinx.android.synthetic.main.activity_print_all.*

class PrintAllActivity : Activity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_print_all)

        printAll(Data.map)
    }

    private fun printAll(map: Map<String, String>) {
        var i = 0
        var text = ""
        map.forEach { t, u ->
            i++
            val h1 = "<font color='red'>$t</font><br>"
            text += ("$i 语音口令:$h1")
            val h2 = "<font color='blue'>$u</font><br><br>"
            text += ("学员操作:$h2")
        }
        val html = Html.fromHtml(text)
        tv.text = html
    }
}

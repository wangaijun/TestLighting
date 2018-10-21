package com.example.administrator.testlighting

import android.app.Activity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_print_all.*

class PrintAllActivity : Activity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_print_all)

        printAll(Data.map)
    }

    private fun printAll(map: Map<String, String>) {
        var i = 0
        map.forEach { t, u ->
            i++
            tv.append("$i 语音口令:$t\n")
            tv.append("学员操作:$u\n")
        }
    }
}

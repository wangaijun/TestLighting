package com.example.administrator.testlighting

import android.app.Activity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_print_question.*

class PrintQuestionActivity : Activity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_print_question)

        printQuestion(Data.map)
    }

    private fun printQuestion(map: Map<String, String>) {
        map.forEach { t, u ->
            tv.append("$t\n\n")
        }
    }
}

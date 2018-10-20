package com.example.administrator.testlighting

import android.app.Activity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : Activity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        setViewsListener()
    }

    private fun setViewsListener() {
        btnPrintAll.setOnClickListener{}
        btnPrintQuestion.setOnClickListener{}
        btnUseWordsAnswerQuestion.setOnClickListener{}
        btnUseNumberAnswerQuestion.setOnClickListener{}
        btnTest.setOnClickListener{}
    }
}

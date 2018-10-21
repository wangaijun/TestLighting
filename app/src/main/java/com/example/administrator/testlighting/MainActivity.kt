package com.example.administrator.testlighting

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : Activity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        setViewsListener()
    }

    private fun setViewsListener() {
        btnPrintAll.setOnClickListener{startActivity(Intent(this,PrintAllActivity::class.java))}
        btnPrintQuestion.setOnClickListener{startActivity(Intent(this,PrintQuestionActivity::class.java))}
        btnUseWordsAnswerQuestion.setOnClickListener{startActivity(Intent(this,UseWordsAnswerActivityActivity::class.java))}
        btnUseNumberAnswerQuestion.setOnClickListener{startActivity(Intent(this,UseNumberAnswerQuestionActivity::class.java))}
        btnTest.setOnClickListener{startActivity(Intent(this,TestActivity::class.java))}
    }
}

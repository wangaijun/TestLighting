package com.example.administrator.testlighting

import android.app.Activity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_use_words_answer_activity.*
import java.util.*

class TestActivity : UseNumberAnswerQuestionActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        tvQuestion5.visibility = View.GONE
        tvQuestion6.visibility = View.GONE
        tvQuestion7.visibility = View.GONE
        tvQuestion8.visibility = View.GONE

        etAnswer5.visibility = View.GONE
        etAnswer6.visibility = View.GONE
        etAnswer7.visibility = View.GONE
        etAnswer8.visibility = View.GONE


    }

    override fun printQuestions() {
        val list = mutableListOf<String>()
        list.addAll(Data.map.keys)
        list.shuffle(Random(System.currentTimeMillis()))
        val listfive = list.take(5)
        val map3 = Data.map.filterKeys {
            it in listfive
        }
        printQuestions(map3)
    }
}

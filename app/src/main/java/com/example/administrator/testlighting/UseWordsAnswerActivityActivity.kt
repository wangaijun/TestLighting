package com.example.administrator.testlighting

import android.app.Activity
import android.os.Bundle
import android.text.Editable
import android.view.Gravity
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_use_words_answer_activity.*

open class UseWordsAnswerActivityActivity : Activity() {
    val us = mutableListOf<String>()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_use_words_answer_activity)

        printQuestions()
        checkRight()
    }

    private fun checkRight() {
        etAnswer0.addTextChangedListener(object : AbstractTextWatch(){
            override fun afterTextChanged(s: Editable?) {
                val input = getAnswer(s)
                when (input) {
                    us[0] -> toast("答对了")
                }
            }
        })
        etAnswer1.addTextChangedListener(object : AbstractTextWatch(){
            override fun afterTextChanged(s: Editable?) {
                val input = getAnswer(s)
                when (input) {
                    us[1] -> toast("答对了")
                }
            }
        })
        etAnswer2.addTextChangedListener(object : AbstractTextWatch(){
            override fun afterTextChanged(s: Editable?) {
                val input = getAnswer(s)
                when (input) {
                    us[2] -> toast("答对了")
                }
            }
        })
        etAnswer3.addTextChangedListener(object : AbstractTextWatch(){
            override fun afterTextChanged(s: Editable?) {
                val input = getAnswer(s)
                when (input) {
                    us[3] -> toast("答对了")
                }
            }
        })
        etAnswer4.addTextChangedListener(object : AbstractTextWatch(){
            override fun afterTextChanged(s: Editable?) {
                val input = getAnswer(s)
                when (input) {
                    us[4] -> toast("答对了")
                }
            }
        })
        etAnswer5.addTextChangedListener(object : AbstractTextWatch(){
            override fun afterTextChanged(s: Editable?) {
                val input = getAnswer(s)
                when (input) {
                    us[5] -> toast("答对了")
                }
            }
        })
        etAnswer6.addTextChangedListener(object : AbstractTextWatch(){
            override fun afterTextChanged(s: Editable?) {
                val input = getAnswer(s)
                when (input) {
                    us[6] -> toast("答对了")
                }
            }
        })
        etAnswer7.addTextChangedListener(object : AbstractTextWatch(){
            override fun afterTextChanged(s: Editable?) {
                val input = getAnswer(s)
                when (input) {
                    us[7] -> toast("答对了")
                }
            }
        })
        etAnswer8.addTextChangedListener(object : AbstractTextWatch(){
            override fun afterTextChanged(s: Editable?) {
                val input = getAnswer(s)
                when (input) {
                    us[8] -> toast("答对了")
                }
            }
        })

    }

    open fun getAnswer(s: Editable?) = s.toString()

    private fun toast(s: String) {
        val toast = Toast.makeText(this, s, Toast.LENGTH_SHORT)
        toast.setGravity(Gravity.CENTER,0,0)
        toast.show()
    }

    open fun printQuestions(){
        printQuestions(Data.map)
    }

    fun printQuestions(map:Map<String,String>) {
        var i = 0
        map.forEach { t, u ->
            when(i){
                0->tvQuestion0.text = t
                1->tvQuestion1.text = t
                2->tvQuestion2.text = t
                3->tvQuestion3.text = t
                4->tvQuestion4.text = t
                5->tvQuestion5.text = t
                6->tvQuestion6.text = t
                7->tvQuestion7.text = t
                8->tvQuestion8.text = t
            }
            us.add(u)
            i++
        }
    }
}

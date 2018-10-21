package com.example.administrator.testlighting

import android.app.Activity
import android.os.Bundle
import android.text.Editable

open class UseNumberAnswerQuestionActivity : UseWordsAnswerActivityActivity() {
    override fun getAnswer(s: Editable?): String {
        val answer = super.getAnswer(s)
        return Data.map2[answer]?:""
    }

    override fun getLayoutId(): Int {
        return R.layout.activity_use_number_answer_activity
    }
}

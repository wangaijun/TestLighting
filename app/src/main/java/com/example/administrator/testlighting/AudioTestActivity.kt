package com.example.administrator.testlighting

import android.app.Activity
import android.media.MediaPlayer
import android.os.Bundle

class AudioTestActivity : Activity() {
    val arr = arrayListOf(
        R.raw.start,
        R.raw.a0,
        R.raw.a1,
        R.raw.a2,
        R.raw.a3,
        R.raw.a4,
        R.raw.a5,
        R.raw.a6,
        R.raw.a7,
        R.raw.a8,
        R.raw.end
    )
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_audio_test)

        object : Thread(){
            override fun run() {
                playMp3(R.raw.start)
            }
        }.start()
    }

    private fun playMp3(id: Int) {
        val mp = MediaPlayer.create(this@AudioTestActivity, id)
        mp.start()
        mp.setOnCompletionListener {
            Thread.sleep(5000)
            val index = arr.indexOf(id)
            if (index<arr.size-1){
                playMp3(arr[index+1])
            }
        }
    }
}

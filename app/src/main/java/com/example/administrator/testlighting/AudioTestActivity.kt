package com.example.administrator.testlighting

import android.app.Activity
import android.media.MediaPlayer
import android.os.Bundle

class AudioTestActivity : Activity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_audio_test)

        object : Thread(){
            override fun run() {
                val mp = MediaPlayer.create(this@AudioTestActivity,R.raw.a0)
                mp.start()
                sleep(500)
            }
        }.start()
    }
}

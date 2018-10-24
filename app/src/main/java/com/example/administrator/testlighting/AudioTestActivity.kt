package com.example.administrator.testlighting

import android.app.Activity
import android.media.MediaPlayer
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_audio_test.*
import java.util.*

class AudioTestActivity : Activity() {
    private val arr = arrayListOf(
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

        btnAllAudio.setOnClickListener {
            playAllMp3()
        }

        btnAudioTest.setOnClickListener {
            playOneGroupMp3()
        }
    }

    private fun playOneGroupMp3() {
        object : Thread(){
            override fun run() {
                val list = mutableListOf<Int>()
                list.addAll(arr.subList(1,10))
                list.shuffle(Random(System.currentTimeMillis()))
                val r = list.subList(0,5)
                r.add(0,arr[0])
                r.add(arr[10])
                playMp3(R.raw.start,r)
            }
        }.start()
    }

    private fun playAllMp3() {
        object : Thread(){
            override fun run() {
                playMp3(R.raw.start, arr)
            }
        }.start()
    }

    private fun playMp3(id: Int, arr: List<Int>) {
        val mp = MediaPlayer.create(this@AudioTestActivity, id)
        mp.start()
        mp.setOnCompletionListener {
            it.release()
            Thread.sleep(5000)
            val index = arr.indexOf(id)
            if (index<arr.size-1){
                playMp3(arr[index+1],arr)
            }
        }
    }
}

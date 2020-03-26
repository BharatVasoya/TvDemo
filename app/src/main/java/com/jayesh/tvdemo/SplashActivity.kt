package com.jayesh.tvdemo

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.util.Log

class SplashActivity : Activity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)
        val background: Thread = object : Thread() {
            override fun run() {
                try {
                    sleep(2000)
                    val i = Intent(applicationContext, SignUpActivity::class.java)
                    startActivity(i)
                    finish()

                } catch (e: Exception) {
                    Log.e("TAG", e.message.toString())
                }
                super.run()
            }
        }
        background.start()


    }
}

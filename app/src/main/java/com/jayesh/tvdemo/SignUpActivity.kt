package com.jayesh.tvdemo

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_sign_up.*

class SignUpActivity : Activity() {

    var tvAlreadyAc:TextView?=null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_up)
        tvAlreadyAc=findViewById(R.id.tvAlreadyAc)
        tvAlreadyAc?.setOnClickListener {
            val intent = Intent(this,SignInActivity::class.java)
            startActivity(intent)

        }
    }
}

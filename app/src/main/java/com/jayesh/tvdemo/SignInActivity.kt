package com.jayesh.tvdemo

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import android.widget.Toast
import com.google.android.material.textfield.TextInputEditText

class SignInActivity : Activity() {
    var tvSignIn: TextView? = null
    var tvPassSignIn: TextInputEditText? = null
    var tvEmailSignIn: TextInputEditText? = null
    var pass: String = ""
    var email: String = ""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_in)
        tvSignIn = findViewById(R.id.tvSignIn)
        tvPassSignIn = findViewById(R.id.tvPassSignIn)
        tvEmailSignIn = findViewById(R.id.tvEmailSignIn)



        tvSignIn?.setOnClickListener {
            pass = tvPassSignIn?.text.toString()
            email = tvEmailSignIn?.text.toString()
            if (email == "") {
                Toast.makeText(this, "Email Password field is required", Toast.LENGTH_LONG).show()
            } else if (pass == "") {
                Toast.makeText(this, "Password field is required", Toast.LENGTH_LONG).show()
            } else {
                val i = Intent(applicationContext, MainActivity::class.java)
                startActivity(i)
                finishAffinity()
            }
        }
    }
}

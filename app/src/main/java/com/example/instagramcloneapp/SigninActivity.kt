package com.example.instagramcloneapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_signin.*

class SigninActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_signin)

        /*  this below code is to when user click on sighup button then it will redirect
        * to that page/fragment */

        signup_link_btn.setOnClickListener {

            startActivity(Intent(this,SignUpActivity::class.java))
        }
    }
}
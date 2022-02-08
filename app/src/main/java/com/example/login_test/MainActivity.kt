package com.example.login_test

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        loginBtn.setOnClickListener {

            val inputId = idEdt.text.toString()
            val inputPw = passwordEdt.text.toString()



            if (inputId == "admin@test.com" && inputPw == "qwer") {

                Toast.makeText(this, "관리자입니다.", Toast.LENGTH_SHORT).show()

            }

            else {

                Toast.makeText(this, "로그인 실패", Toast.LENGTH_SHORT).show()


            }


        }

    }
}
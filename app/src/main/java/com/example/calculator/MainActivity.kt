package com.example.calculator

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun f1(view: View) {
        intent= Intent(this,add::class.java)
        startActivity(intent)
    }

    fun f2(view: View) {
        intent= Intent(this,sub::class.java)
        startActivity(intent)
    }

    fun f3(view: View) {
        intent= Intent(this,mul::class.java)
        startActivity(intent)
    }

    fun f4(view: View) {
        intent= Intent(this,div::class.java)
        startActivity(intent)
    }
}
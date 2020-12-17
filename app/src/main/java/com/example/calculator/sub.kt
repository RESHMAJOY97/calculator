package com.example.calculator

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class sub : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sub)
    }
    fun f1(view: View) {
        var getnum1=findViewById<EditText>(R.id.a1)
        var getnum2=findViewById<EditText>(R.id.a2)
        var getres=findViewById<TextView>(R.id.res)
        var result=getnum1.text.toString().toInt()-getnum2.text.toString().toInt()
        getres.text=result.toString()
//        Toast.makeText(this,result.toString(), Toast.LENGTH_LONG).show()
    }

    fun a2(view: View) {
        intent= Intent(this,MainActivity::class.java)
        startActivity(intent)
    }
}
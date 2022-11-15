package com.example.lesson18

import android.annotation.SuppressLint
import android.content.Intent
import android.graphics.Color
import android.graphics.drawable.ColorDrawable
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import androidx.core.content.ContextCompat
import com.example.lesson18.MainActivity2.Companion.startMainActivity2

class MainActivity : AppCompatActivity() {
    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        supportActionBar?.setBackgroundDrawable(ColorDrawable(Color.parseColor("#f542e3")))
        supportActionBar?.title = "new title for MainActivity" // в тулбаре название
        supportActionBar?.setBackgroundDrawable(resources.getDrawable(R.drawable.golub)) // в тулбаре поменять картинку

        val textView = findViewById<TextView>(R.id.textView)
        val btn1 = findViewById<Button>(R.id.btn1)
        val btn2 = findViewById<Button>(R.id.btn2)


        btn1.setOnClickListener {
            textView.text = "txtcherezknopku1"
            startMainActivity2(this, textView.text.toString() + "from main activity")
        }


//
//            val intent = Intent(this, MainActivity2::class.java)
//            intent.putExtra("1", textView.text.toString() + " from Main Activity")
//            startActivity(intent)
//
//        }





    }




}
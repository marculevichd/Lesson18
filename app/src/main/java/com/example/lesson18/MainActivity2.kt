package com.example.lesson18

import android.annotation.SuppressLint
import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.system.Os.close
import android.view.Menu
import android.view.MenuItem
import android.widget.TextView

class MainActivity2 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        val textView2 = findViewById<TextView>(R.id.textView2)
        supportActionBar?.setDisplayHomeAsUpEnabled(true) // почему то не появилась стрелочка назад

        val data: String = intent.getStringExtra(KEY) ?: "аааа здесь null"
        textView2.text = data


    }


    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.item_menu, menu)

        return super.onCreateOptionsMenu(menu)
    }


    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        if(item.itemId==android.R.id.home){
            onBackPressed()
        }

        if(item.itemId==R.id.close){
            finishAffinity()
        }

        if(item.itemId==R.id.go_back){
            onBackPressed()
        }
        return super.onOptionsItemSelected(item)
    }

    companion object {

        private const val KEY = "1"

        fun startMainActivity2(context: Context, string: String) {
            val intent = Intent(context, MainActivity2::class.java)
            intent.putExtra(KEY, string)
            context.startActivity(intent)
        }


    }


}


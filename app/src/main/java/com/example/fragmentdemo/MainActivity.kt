package com.example.fragmentdemo

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val welcomeFG = WelcomeFragment()

        supportFragmentManager.beginTransaction().apply {
            replace(R.id.mainframe, welcomeFG)
            commit()
        }
    }
}
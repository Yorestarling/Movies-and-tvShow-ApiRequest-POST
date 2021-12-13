package com.ymejia.yoremovies

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.ymejia.yoremovies.databinding.ActivityMainBinding
import com.ymejia.yoremovies.general.HomeActivity

lateinit var binding: ActivityMainBinding

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //setContentView(R.layout.activity_main)

        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        setTheme(R.style.SplashTheme)

        binding.btnaccess.setOnClickListener{
            val intent = Intent(this@MainActivity,HomeActivity::class.java)
            startActivity(intent)
            this.finish()
        }


    }
}
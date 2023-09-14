package com.example.wealthapps.ui

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import com.example.wealthapps.MainActivity
import com.example.wealthapps.R
import com.example.wealthapps.databinding.ActivityRegisterPageBinding
class RegisterPage : AppCompatActivity() {
    private lateinit var binding: ActivityRegisterPageBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityRegisterPageBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.button1.setOnClickListener {

            val data = binding.etName.text.toString()
            val intent = Intent(this, MainActivity::class.java)
            intent.putExtra("name", data)
            startActivity(intent)
        }
    }
}
package com.example.database_projek

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import com.example.database_projek.data.AppDatabase
import com.example.database_projek.data.entity.User

class EditorActivity : AppCompatActivity() {
    private lateinit var fullname: EditText
    private lateinit var email: EditText
    private lateinit var password: EditText
    private lateinit var btnSave: Button
    private lateinit var database: AppDatabase
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_editor)
        fullname = findViewById(R.id.full_name)
        email = findViewById(R.id.email)
        password = findViewById(R.id.password)
        btnSave = findViewById(R.id.btn_save)

        database = AppDatabase.getInstance(applicationContext)

        btnSave.setOnClickListener {
            if (fullname.text.isNotEmpty() && email.text.isNotEmpty() && password.text.isNotEmpty()) {
                database.userDao().insertAll(
                    User(
                        null,
                        fullname.text.toString(),
                        email.text.toString(),
                        password.text.toString()
                    )
                )
                finish()
            } else {
                Toast.makeText(
                    applicationContext,
                    "Silahkan isi semua data dengan valid",
                    Toast.LENGTH_SHORT
                ).show()
            }
        }
    }
}
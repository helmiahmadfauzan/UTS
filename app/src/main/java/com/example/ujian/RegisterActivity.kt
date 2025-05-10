package com.example.ujian

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import android.widget.Button
import android.content.Intent
import android.util.Log
import android.widget.Toast

class RegisterActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_register)

        val btnRegister = findViewById<Button>(R.id.btnRegister)
        btnRegister.setOnClickListener {
            Log.d("RegisterActivity", "Tombol Register diklik")
            Toast.makeText(this, "Registrasi berhasil!", Toast.LENGTH_SHORT).show()

            val intent = Intent(this, ListChatActivity::class.java)
            startActivity(intent)
        }
    }
}
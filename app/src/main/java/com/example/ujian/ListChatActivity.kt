package com.example.ujian

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import android.widget.ListView
import android.widget.ArrayAdapter

class ListChatActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_list_chat)

        val listView = findViewById<ListView>(R.id.listViewChat)
        val chatList = listOf("Chat dengan A", "Chat dengan B", "Chat dengan C")
        val adapter = ArrayAdapter(this, android.R.layout.simple_list_item_1, chatList)
        listView.adapter = adapter
    }
}
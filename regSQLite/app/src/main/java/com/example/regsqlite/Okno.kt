package com.example.regsqlite

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class Okno : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_okno)

        val itemsList: RecyclerView = findViewById(R.id.itemsList)
        val items = arrayListOf<Item>()

        items.add(Item(1, "one", "Крымская Стевия", "с плодами боярышника", 2, 200))
        items.add(Item(2, "two", "Боярышник", "ВитаЦентр,   20 пакетиков", 3, 250))
        items.add(Item(3, "three", "Каркадэ", "с боярышником", 2, 400))

        itemsList.layoutManager = LinearLayoutManager(this)
        itemsList.adapter = ItemsAdapter(items, this)
    }
}
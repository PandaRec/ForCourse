package com.example.forcourse

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.forcourse.adapters.ShopAdapter
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val shopList:ArrayList<String> = arrayListOf("Магазин 1",
            "Магазин 2",
            "Магазин 3",
            "Магазин 4",
            "Магазин 5",
            "Магазин 6",
            "Магазин 7",
            "Магазин 8",
            "Магазин 9",
            "Магазин 10",
            "Магазин 11",
            "Магазин 12",
            "Магазин 13",
            "Магазин 14",
            "Магазин 15",
            "Магазин 16",
            "Магазин 17")
        val adapter = ShopAdapter()
        adapter.shopList =shopList

        recyclerView.adapter = adapter
    }
}
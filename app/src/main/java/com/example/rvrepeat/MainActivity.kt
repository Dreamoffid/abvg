package com.example.rvrepeat

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
      val list: List<Model> = listOf(
          Model(R.drawable.smile, "text"),
          Model(R.drawable.smile, "text"),
          Model(R.drawable.smile, "text"),
          Model(R.drawable.smile, "text"),
          Model(R.drawable.smile, "text"),
          Model(R.drawable.smile, "text"),
          Model(R.drawable.smile, "text"),
          Model(R.drawable.smile, "text"),
          Model(R.drawable.smile, "text"),
      )
        val adapter = Adapter(list)
        rv.adapter = adapter
        rv.layoutManager = LinearLayoutManager(this)
        val lm = LinearLayoutManager(this)
        lm.orientation =LinearLayoutManager.HORIZONTAL
        rv.layoutManager = lm
    }
}
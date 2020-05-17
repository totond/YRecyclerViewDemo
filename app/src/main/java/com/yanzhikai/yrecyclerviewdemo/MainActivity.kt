package com.yanzhikai.yrecyclerviewdemo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private lateinit var mAdapter: NormalAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        mAdapter = NormalAdapter(this, listOf(NormalData("1"), NormalData("2"), NormalData("3")))
        rv_main.layoutManager = LinearLayoutManager(this)
        rv_main.adapter = mAdapter
    }
}

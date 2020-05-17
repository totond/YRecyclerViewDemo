package com.yanzhikai.yrecyclerviewdemo

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class NormalAdapter(private val context: Context, private val mDataList: List<NormalData>) : RecyclerView.Adapter<NormalAdapter.NormalVH>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): NormalVH {
        return NormalVH(LayoutInflater.from(context).inflate(R.layout.layout_normal_item, parent))
    }
    override fun getItemCount(): Int {
        return mDataList.size
    }

    override fun onBindViewHolder(holder: NormalVH, position: Int) {
        holder.apply {
            tvTitle.text = mDataList[position].title
        }
    }

    class NormalVH(item: View) : RecyclerView.ViewHolder(item) {
            val tvTitle : TextView = item.findViewById(R.id.tv_title_normal)
    }
}


data class NormalData(
    val title: String = "default"
)
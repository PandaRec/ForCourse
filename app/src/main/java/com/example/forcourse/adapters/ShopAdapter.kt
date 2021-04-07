package com.example.forcourse.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.forcourse.R
import kotlinx.android.synthetic.main.main_item.view.*

class ShopAdapter : RecyclerView.Adapter<ShopAdapter.ShopViewHolder>(){
    var shopList:  ArrayList<String> = arrayListOf()
    set(value) {
        field=value
        notifyDataSetChanged()
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ShopViewHolder {
        val view : View = LayoutInflater.from(parent.context).inflate(R.layout.main_item,parent,false)
        return ShopViewHolder(view)
    }

    override fun onBindViewHolder(holder: ShopViewHolder, position: Int) {
        val currentTitle = shopList[position]
        holder.textViewTitle.text = currentTitle
    }

    override fun getItemCount(): Int {
        return shopList.size
    }

    inner class ShopViewHolder(itemView:View): RecyclerView.ViewHolder(itemView){
        val textViewTitle = itemView.textViewTitle
    }
}


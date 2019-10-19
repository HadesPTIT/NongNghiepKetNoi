package com.warrior.nongnghiepketnoi.chatlist

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class ChatAdapter(private val list: List<ChatItem>,var listener: ChatViewHolder.OnItemClickListener) : RecyclerView.Adapter<ChatViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ChatViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        return ChatViewHolder(inflater, parent,listener)
    }

    override fun onBindViewHolder(holder: ChatViewHolder, position: Int) {
        val item: ChatItem = list[position]
        holder.bind(item)
    }

    override fun getItemCount(): Int = list.size
}
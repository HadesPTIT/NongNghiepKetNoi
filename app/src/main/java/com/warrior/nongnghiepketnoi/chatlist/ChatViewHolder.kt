package com.warrior.nongnghiepketnoi.chatlist

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.warrior.nongnghiepketnoi.R

class ChatViewHolder(inflater: LayoutInflater, parent: ViewGroup) :
    RecyclerView.ViewHolder(inflater.inflate(R.layout.item_chat, parent, false)) {

    private var username: TextView? = null
    private var message: TextView? = null
    private var avatar: ImageView? = null
    private var time: TextView? = null
    private var status: ImageView? =null


    init {
        username = itemView.findViewById(R.id.name)
        message = itemView.findViewById(R.id.message)
        avatar = itemView.findViewById(R.id.profile_image)
        time = itemView.findViewById(R.id.time)
        status = itemView.findViewById(R.id.status_online)
    }

    fun bind(item: ChatItem) {
        username?.text = item.username
        message?.text = item.message
        avatar?.setImageResource(item.avatar)
        time?.text = item.time
        if (item.isOnline)
            status?.visibility = View.VISIBLE
        else status?.visibility = View.GONE
    }

}
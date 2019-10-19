package com.warrior.nongnghiepketnoi.events

import android.annotation.SuppressLint
import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.warrior.nongnghiepketnoi.R

/**
 * Created by Hades on 10/19/2019.
 */
class EventAdapter(var ctx: Context, var events: ArrayList<Event>) :
    RecyclerView.Adapter<EventAdapter.EventViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): EventViewHolder {
        val view: View = LayoutInflater.from(ctx).inflate(R.layout.item_event, parent, false)
        return EventViewHolder(view)
    }

    override fun getItemCount(): Int {
        return events.size
    }

    @SuppressLint("SetTextI18n")
    override fun onBindViewHolder(holder: EventViewHolder, position: Int) {
        val mEvent = events[position]
        holder.tv_name.text = mEvent.name
        holder.tv_message.text = mEvent.content
        holder.tv_number_follow.text = mEvent.numberInterest.toString() + " người quan tâm"
        Glide.with(ctx).load(mEvent.url).into(holder.imv_ava)
        if (!mEvent.isFollow) {
            holder.imv_follow.setImageResource(R.drawable.ic_star_gray_24dp)
        } else {
            holder.imv_follow.setImageResource(R.drawable.ic_star_green_24dp)
        }
    }


    class EventViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        internal var tv_name: TextView
        internal var tv_message: TextView
        internal var tv_number_follow: TextView
        internal var imv_follow: ImageView
        internal var imv_ava: ImageView

        init {

            imv_ava = itemView.findViewById(R.id.imv_avatar) as ImageView
            tv_name = itemView.findViewById(R.id.name) as TextView
            tv_message = itemView.findViewById(R.id.tv_message) as TextView
            tv_number_follow = itemView.findViewById(R.id.tv_number_follow) as TextView
            imv_follow = itemView.findViewById(R.id.imv_follow) as ImageView
        }
    }
}
package com.warrior.nongnghiepketnoi.chatlist.chatdetail

import android.app.Activity
import android.os.Bundle
import android.os.Handler
import android.view.View
import com.warrior.nongnghiepketnoi.R
import kotlinx.android.synthetic.main.activity_chat_detail.*

class ChatDetailActivity : Activity(){
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_chat_detail)
        Handler().postDelayed({
            progress_loading?.visibility = View.GONE
        }, 500L)
        back_button.setOnClickListener { onBackPressed() }
    }
}
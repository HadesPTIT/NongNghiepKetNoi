package com.warrior.nongnghiepketnoi.chatlist.chatdetail

import android.app.Activity
import android.os.Bundle
import androidx.fragment.app.Fragment
import com.warrior.nongnghiepketnoi.R
import kotlinx.android.synthetic.main.activity_chat_detail.*

class ChatDetailActivity : Activity(){
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_chat_detail)
        back_button.setOnClickListener { onBackPressed() }
    }
}
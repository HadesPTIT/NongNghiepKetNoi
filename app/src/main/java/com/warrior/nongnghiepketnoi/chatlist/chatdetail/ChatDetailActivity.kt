package com.warrior.nongnghiepketnoi.chatlist.chatdetail

import android.app.Activity
import android.os.Bundle
import android.os.Handler
import android.text.TextUtils
import android.view.View
import com.warrior.nongnghiepketnoi.R
import kotlinx.android.synthetic.main.activity_chat_detail.*

class ChatDetailActivity : Activity() {
    var meMessage2 : Boolean =  false
    var guestMessage2: Boolean = false

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_chat_detail)
        Handler().postDelayed({
            progress_loading?.visibility = View.GONE
        }, 500L)
        back_button.setOnClickListener { onBackPressed() }
        sendMessage()
    }

    fun sendMessage() {
        progress_loading.visibility = View.VISIBLE
        me_message.visibility = View.GONE
        guest_message.visibility = View.GONE
        me_message2.visibility = View.GONE
        guest_message2.visibility = View.GONE
        typing.visibility = View.GONE
        button_chatbox_send.setOnClickListener {
            Handler().postDelayed({
                progress_loading?.visibility = View.GONE
                if (!TextUtils.isEmpty(edittext_chatbox.text.toString())) {
                    me_message.visibility = View.VISIBLE
                    me_message.text = edittext_chatbox.text
                    edittext_chatbox.text.clear()
                    typing.visibility = View.VISIBLE

                }
            }, 500L)
            receverMessage()
        }

    }

    fun receverMessage() {
        guest_message.visibility = View.GONE
        typing.visibility = View.VISIBLE
        Handler().postDelayed({
            guest_message.visibility = View.VISIBLE
            guest_message.text = "Chào bạn !!!"
            meMessage2 = true
            typing.visibility = View.GONE
        }, 3000L)
        sendrMessage2()
    }

    fun sendrMessage2(){
        typing.visibility = View.GONE
        me_message2.visibility = View.GONE
        button_chatbox_send.setOnClickListener {
            Handler().postDelayed({
                progress_loading?.visibility = View.GONE
                if (!TextUtils.isEmpty(edittext_chatbox.text.toString())) {
                    me_message2.visibility = View.VISIBLE
                    me_message2.text = edittext_chatbox.text
                    edittext_chatbox.text.clear()
                    typing.visibility = View.VISIBLE
                }
            }, 500L)
            receverMessage2()
        }
    }
    fun receverMessage2() {
        Handler().postDelayed({
            guest_message2.visibility = View.VISIBLE
            guest_message2.text = "Bạn cần trợ giúp vấn đề gì ạ ?"
            meMessage2 = true
            typing.visibility = View.GONE
        }, 3000L)
    }
}
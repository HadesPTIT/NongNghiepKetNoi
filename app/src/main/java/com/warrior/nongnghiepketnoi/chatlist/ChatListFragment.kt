package com.warrior.nongnghiepketnoi.chatlist

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import com.warrior.nongnghiepketnoi.R
import com.warrior.nongnghiepketnoi.chatlist.chatdetail.ChatDetailActivity
import kotlinx.android.synthetic.main.fragment_chatlist.*



class ChatListFragment : Fragment(), ChatViewHolder.OnItemClickListener {


    companion object Factory {
        fun  newInstance(): ChatListFragment {
            val args = Bundle()
            val fragment = ChatListFragment()
            fragment.arguments = args
            return fragment
        }
    }

    var chatAdapter: ChatAdapter? = null
    var list : ArrayList<ChatItem> = ArrayList()
    override fun onCreateView(inflater: LayoutInflater,
                              container: ViewGroup?,
                              savedInstanceState: Bundle?): View? =
        inflater.inflate(R.layout.fragment_chatlist, container, false)

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        list.clear()
        list.add(ChatItem(R.drawable.avartar_chat,"Nam Bui","Xin chào Nam  !!!!", "20:30",false))
        list.add(ChatItem(R.drawable.avatar_chat2,"Tuân Nguyễn","Xin chào Tuân   !!!!", "20:30",true))
        list.add(ChatItem(R.drawable.avatar_chat3,"Tuyên Bui","Xin chào Tuyên   !!!!", "20:30",true))
        list.add(ChatItem(R.drawable.avatar_chat4,"Hướng Phạm ","Xin chào Hướng   !!!!", "20:30",false))
        list.add(ChatItem(R.drawable.avatar_chat5,"Long  Hoàng ","Xin chào Long   !!!!", "20:30",false))

        recyclerView.apply {
            layoutManager = LinearLayoutManager(activity)
            chatAdapter = ChatAdapter(list,this@ChatListFragment)
            recyclerView.adapter = chatAdapter
        }
    }

    override fun onItemClick(item: ChatItem) {
        var intent = Intent(activity, ChatDetailActivity::class.java)
        startActivity(intent)
    }

}
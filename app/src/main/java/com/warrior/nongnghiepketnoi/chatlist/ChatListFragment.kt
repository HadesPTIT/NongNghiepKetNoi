package com.warrior.nongnghiepketnoi.chatlist

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import com.warrior.nongnghiepketnoi.R
import kotlinx.android.synthetic.main.fragment_chatlist.*



class ChatListFragment : Fragment() {

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
        list.add(ChatItem(R.drawable.avartar_chat,"Tuân Nguyễn","Xin chào Tuân   !!!!", "20:30",true))
        list.add(ChatItem(R.drawable.avartar_chat,"Tuyên Bui","Xin chào Tuyên   !!!!", "20:30",true))
        list.add(ChatItem(R.drawable.avartar_chat,"Hướng Phạm ","Xin chào Hướng   !!!!", "20:30",false))
        list.add(ChatItem(R.drawable.avartar_chat,"Long  Hoàng ","Xin chào Long   !!!!", "20:30",false))

        recyclerView.apply {
            layoutManager = LinearLayoutManager(activity)
            chatAdapter = ChatAdapter(list)
            recyclerView.adapter = chatAdapter
        }
    }

}
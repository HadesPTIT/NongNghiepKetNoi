package com.warrior.nongnghiepketnoi

import android.net.Uri
import android.os.Bundle
import android.util.Log
import android.view.MenuItem
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import com.google.android.material.bottomnavigation.BottomNavigationView
import com.tbuonomo.morphbottomnavigation.MorphBottomNavigationView
import com.warrior.nongnghiepketnoi.newfeeds.NewFeedsFragment
import com.warrior.nongnghiepketnoi.chatlist.ChatListFragment
import com.warrior.nongnghiepketnoi.events.EventsFragment
import com.warrior.nongnghiepketnoi.qa.QAFragment


class MainActivity : AppCompatActivity() , NewFeedsFragment.OnFragmentInteractionListener {
    override fun onFragmentInteraction(uri: Uri) {
        //TODO
    }
    private lateinit var newFeedsFragment: NewFeedsFragment
    private lateinit var QAFragment: QAFragment
    private lateinit var chatListFragment: ChatListFragment
    private lateinit var eventFragment: EventsFragment

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val navigation = findViewById<MorphBottomNavigationView>(R.id.bottomNavigationView)
        navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener)
        newFeedsFragment = NewFeedsFragment.newInstance()
        chatListFragment = ChatListFragment.newInstance()
        QAFragment = com.warrior.nongnghiepketnoi.qa.QAFragment.newInstance()
        eventFragment = EventsFragment.newInstance()
        replaceFragment(newFeedsFragment)
    }
    private fun replaceFragment(frag :Fragment) {
        val ft = supportFragmentManager.beginTransaction()
        ft.replace(R.id.frame_container, frag).commit()
    }
    private val mOnNavigationItemSelectedListener =
        object : BottomNavigationView.OnNavigationItemSelectedListener {

            override fun onNavigationItemSelected(item: MenuItem): Boolean {
                when (item.itemId) {
                    R.id.navigation_new_feed -> {
                        replaceFragment(newFeedsFragment)
                        return true
                    }
                    R.id.navigation_event -> {
                        replaceFragment(eventFragment)
                        Log.e("TAG","navigation_event")
                        return true
                    }
                    R.id.navigation_qa -> {
                        replaceFragment(QAFragment)
                        return true
                    }
                    R.id.navigation_chat -> {
                        replaceFragment(chatListFragment)
                        return true
                    }
                    R.id.navigation_profile -> {
                        Log.e("TAG","navigation_profile")
                        return true
                    }
                }
                return false
            }
        }
}

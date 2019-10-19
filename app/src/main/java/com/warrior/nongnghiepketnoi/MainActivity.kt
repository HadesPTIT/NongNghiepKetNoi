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


class MainActivity : AppCompatActivity() , NewFeedsFragment.OnFragmentInteractionListener {
    override fun onFragmentInteraction(uri: Uri) {
        //TODO
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val navigation = findViewById<MorphBottomNavigationView>(R.id.bottomNavigationView)
        navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener)
        newFeedsFragment = NewFeedsFragment.newInstance()
        replaceFragment(newFeedsFragment)

    }
    private fun replaceFragment(frag :Fragment) {
        if(frag.isAdded)
            return
        val ft = supportFragmentManager.beginTransaction()
        ft.add(R.id.frame_container, frag).commit()
    }
    private lateinit var newFeedsFragment: NewFeedsFragment
    private val mOnNavigationItemSelectedListener =
        object : BottomNavigationView.OnNavigationItemSelectedListener {

            override fun onNavigationItemSelected(item: MenuItem): Boolean {
                when (item.itemId) {
                    R.id.navigation_new_feed -> {
                        replaceFragment(newFeedsFragment)
                        return true
                    }
                    R.id.navigation_event -> {
                        Log.e("TAG","navigation_event")
                        return true
                    }
                    R.id.navigation_qa -> {
                        Log.e("TAG","navigation_qa")
                        return true
                    }
                    R.id.navigation_chat -> {
                        Log.e("TAG","navigation_chat")
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

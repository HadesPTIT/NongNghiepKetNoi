package com.warrior.nongnghiepketnoi

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import com.tbuonomo.morphbottomnavigation.MorphBottomNavigationView
import android.view.MenuItem
import com.google.android.material.bottomnavigation.BottomNavigationView



class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val navigation = findViewById<MorphBottomNavigationView>(R.id.bottomNavigationView)
        navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener)
    }

    private val mOnNavigationItemSelectedListener =
        object : BottomNavigationView.OnNavigationItemSelectedListener {

            override fun onNavigationItemSelected(item: MenuItem): Boolean {
                when (item.itemId) {
                    R.id.navigation_new_feed -> {
                        Log.e("TAG","navigation_new_feed")
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

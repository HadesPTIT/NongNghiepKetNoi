package com.warrior.nongnghiepketnoi

import android.os.Bundle
import android.os.Handler
import androidx.appcompat.app.AppCompatActivity
import android.content.Intent



/**
 * Created by Hades on 10/19/2019.
 */
class SplashActivity : AppCompatActivity() {

    companion object {
        const val SPLASH_DURATION = 2000L
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)

        Handler().postDelayed({
            startActivity(Intent(this, LoginActivity::class.java))
            finish()
        }, SPLASH_DURATION)

    }

}
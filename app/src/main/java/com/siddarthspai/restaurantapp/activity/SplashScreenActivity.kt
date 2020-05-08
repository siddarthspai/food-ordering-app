package com.siddarthspai.restaurantapp.activity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.view.Window
import android.view.WindowManager
import com.siddarthspai.restaurantapp.R

class SplashScreenActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        //Remove the title bar
        requestWindowFeature(Window.FEATURE_NO_TITLE)

        setContentView(R.layout.activity_splash_screen)

        //Remove the notification bar

        this.window.setFlags(
            WindowManager.LayoutParams.FLAG_FULLSCREEN,
            WindowManager.LayoutParams.FLAG_FULLSCREEN
        )

        setContentView(R.layout.activity_splash_screen)

        Handler().postDelayed({
            val mainIntent =
                Intent(this@SplashScreenActivity, LoginRegisterActivity::class.java)
            finish()
            startActivity(mainIntent)
        }, 2000)


    }
}

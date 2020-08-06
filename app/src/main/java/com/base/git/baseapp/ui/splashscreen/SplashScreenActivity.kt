package com.base.git.baseapp.ui.splashscreen

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.base.git.baseapp.R
import com.base.git.baseapp.ui.intro.view.IntroActivity
import com.base.git.baseapp.utils.AnimViewUtil
import com.base.git.baseapp.utils.configurationEnum.Animation

class SplashScreenActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)

        initAnimationView()

        Handler(Looper.getMainLooper()).postDelayed({
            goToStartActivity()
        }, 1500)


    }

    private fun goToStartActivity(){
        val intent = Intent(this, IntroActivity::class.java)
        startActivity(intent)
        overridePendingTransition(
            R.anim.no_change,
            R.anim.no_change
        )
        finish()
    }

    private fun initAnimationView(){
        findViewById<TextView>(R.id.textTitle).startAnimation(AnimViewUtil(Animation.IN_COMING,this).startAnimation())
        findViewById<TextView>(R.id.textFooter).startAnimation(AnimViewUtil(Animation.SLIDE_IN_UP,this).startAnimation())
    }

}
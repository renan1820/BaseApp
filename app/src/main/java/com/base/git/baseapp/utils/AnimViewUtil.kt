package com.base.git.baseapp.utils

import android.content.Context
import android.view.animation.AnimationUtils
import com.base.git.baseapp.R
import com.base.git.baseapp.utils.configurationEnum.Animation

class AnimViewUtil(private val animationType: Animation, private val context: Context) {

    fun startAnimation(): android.view.animation.Animation{
        val animation: android.view.animation.Animation = AnimationUtils.loadAnimation(context, getAnimationView(animationType))
        animation.startOffset = 0
        return animation
    }

    private fun getAnimationView(animationType:Animation): Int{
        return when(animationType){
            Animation.IN_COMING -> R.anim.in_coming
            Animation.SLIDE_IN_DOWN -> R.anim.slide_in_down
            Animation.SLIDE_IN_UP -> R.anim.slide_in_up
            Animation.SLIDE_RIGHT_TO_LEFT -> R.anim.slide_right_to_left
            Animation.SLIDE_LEFT_TO_RIGHT -> R.anim.slide_left_to_right
            else  -> R.anim.no_change
        }
    }
}
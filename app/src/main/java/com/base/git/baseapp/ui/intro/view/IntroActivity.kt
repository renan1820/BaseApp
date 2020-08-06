package com.base.git.baseapp.ui.intro.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.base.git.baseapp.R
import com.base.git.baseapp.config.Constants
import com.base.git.baseapp.databinding.ActivityMainBinding
import com.base.git.baseapp.ui.intro.binding.UserGit
import com.squareup.picasso.Picasso

class IntroActivity : AppCompatActivity() {

    private val nameText = UserGit("Renan Castro")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = DataBindingUtil.setContentView<ActivityMainBinding>(this,R.layout.activity_main)
        binding.invalidateAll()
        Picasso.get().load(Constants().urlGitUserImage).into(binding.imageProfile)
        binding.textView.text = nameText.textName
    }
}
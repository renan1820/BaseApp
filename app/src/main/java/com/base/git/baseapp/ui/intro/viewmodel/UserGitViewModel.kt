package com.base.git.baseapp.ui.intro.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.base.git.baseapp.ui.intro.binding.UserGit

class UserGitViewModel:ViewModel() {
    val liveData = MutableLiveData<UserGit>()
}
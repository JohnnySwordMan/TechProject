package com.mars.login

import android.util.Log
import com.mars.loginapi.ILoginService

/**
 * @author: geyan
 * @date: 2020-09-05
 */
class LoginServiceImpl : ILoginService {

    override fun register() {
        Log.e("mars", "LoginServiceImpl-register")
    }

    override fun login(username: String, password: String) {
        Log.e("mars", "LoginServiceImpl-login-username = $username, password = $password")
    }

}
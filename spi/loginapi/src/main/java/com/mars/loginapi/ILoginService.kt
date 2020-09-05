package com.mars.loginapi

/**
 * @author: geyan
 * @date: 2020-09-05
 */

interface ILoginService {

    fun register()

    fun login(username: String, password: String)
}
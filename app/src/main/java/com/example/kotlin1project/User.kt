package com.example.kotlin1project

import Model.IUser
import android.text.TextUtils
import android.util.Patterns

class User (override val email:String,override val password:String):IUser{
    override val isDataValid: Boolean
        get() = (!TextUtils.isEmpty(email) &&
                Patterns.EMAIL_ADDRESS.matcher(email).matches() &&
                password.length > 6)
}
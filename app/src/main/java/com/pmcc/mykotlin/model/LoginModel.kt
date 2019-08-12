package com.pmcc.mykotlin.model

import android.content.Context
import android.widget.Toast
import androidx.databinding.ObservableField
import androidx.lifecycle.ViewModel

class LoginModel constructor(name: String, pwd: String) :ViewModel(){
    val n = ObservableField<String>(name)
    val p = ObservableField<String>(pwd)


    /**
     * 用户名改变回调的函数
     */
    fun onNameChanged(s: CharSequence) {
        n.set(s.toString())
    }

    /**
     * 密码改变的回调函数
     */
    fun onPwdChanged(s: CharSequence, start: Int, before: Int, count: Int) {
        p.set(s.toString())
    }

    fun login() {
        if (n.get().equals("12")
                && p.get().equals("12")
        ) {

        }
    }
}
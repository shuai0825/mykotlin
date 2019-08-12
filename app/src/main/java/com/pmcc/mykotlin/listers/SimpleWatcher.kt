package com.pmcc.mykotlin.listers

import android.text.Editable
import android.text.TextWatcher

/**
 * 简化textview监听
 */
open class SimpleWatcher:TextWatcher {
    override fun afterTextChanged(s: Editable?) {

    }

    override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {

    }

    override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {

    }
}
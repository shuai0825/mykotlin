package com.pmcc.mykotlin

import android.app.Activity
import android.os.Bundle
import android.widget.Toast

class DemoActivity : Activity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Toast.makeText(this, "你好", Toast.LENGTH_SHORT).show()
    }
}

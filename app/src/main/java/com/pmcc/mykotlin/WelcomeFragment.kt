package com.pmcc.mykotlin

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment

import kotlinx.android.synthetic.main.fragment_login.*

import kotlinx.android.synthetic.main.fragment_welcome.*


class WelcomeFragment : Fragment(), View.OnClickListener {
    override fun onClick(v: View?) {
        when (v?.id) {
            R.id.welcomeLoginBt -> {
                Toast.makeText(this.context, "登录", Toast.LENGTH_SHORT).show()
//                val bundle = Bundle()
//                bundle.putString(ConstantConfig.PARAM_DATA, "1234356")
                val bundle = LoginFragmentArgs.Builder().setText("我是通过argument标签实现传值").build().toBundle()


                findNavController().navigate(R.id.action_welcomeFragment_to_loginFragment, bundle)
            }


            R.id.welcomeRegisterBt -> {
                Toast.makeText(this.context, "注册", Toast.LENGTH_SHORT).show()
                val bundle = Bundle()
                bundle.putString("useid", "98765432")
                NavHostFragment
                        .findNavController(this)
                        .navigate(R.id.action_welcomeFragment_to_registerFragment, bundle)
            }


        }
    }


    override fun onCreateView(
            inflater: LayoutInflater, container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_welcome, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        welcomeLoginBt.setOnClickListener(this)
        welcomeRegisterBt.setOnClickListener(this)

    }
}

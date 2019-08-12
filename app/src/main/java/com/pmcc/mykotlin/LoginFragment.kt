package com.pmcc.mykotlin

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import com.pmcc.mykotlin.databinding.FragmentLoginBinding

import com.pmcc.mykotlin.model.LoginModel
import kotlinx.android.synthetic.main.fragment_login.*


class LoginFragment : Fragment() {

    private var isEnable: Boolean = false
    private val loginModel: LoginModel= LoginModel("12","12")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val text = arguments?.let { LoginFragmentArgs.fromBundle(it).text }
        Log.d("%s", text)
    }

    override fun onCreateView(
            inflater: LayoutInflater, container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View? {
        val binding: FragmentLoginBinding = DataBindingUtil.inflate(inflater, R.layout.fragment_login, container, false)
        onSubscribeUi(binding)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        btLogin.setOnClickListener {
            Log.d("%s",loginModel.n.get())
        }
    }
    private fun onSubscribeUi(binding: FragmentLoginBinding) {
        binding.model=loginModel
        binding.activity=activity

    }


}

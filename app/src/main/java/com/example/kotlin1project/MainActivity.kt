package com.example.kotlin1project


import Presenter.ILoginPresenter
import Presenter.LoginPresenter
import View.ILoginView
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import es.dmoral.toasty.Toasty

class MainActivity : AppCompatActivity(), ILoginView {
     lateinit var edt_email: EditText
     lateinit var edt_password: EditText
     lateinit var btn_login: Button


    internal lateinit var loginPresenter:ILoginPresenter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
         edt_email = findViewById(R.id.edt_email)
         edt_password = findViewById(R.id.edt_password)
         btn_login = findViewById(R.id.btn_login)

        //Init
        loginPresenter = LoginPresenter(this)
        //Event
        btn_login.setOnClickListener {
            loginPresenter.onLogin(edt_email.text.toString(),edt_password.text.toString())


        }

    }

    override fun onLoginResult(message: String) {
       Toasty.info(this,message,Toast.LENGTH_SHORT).show()
    }

}
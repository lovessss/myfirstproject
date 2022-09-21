package Presenter

import View.ILoginView
import com.example.kotlin1project.User

class LoginPresenter(internal var iLoginView: ILoginView):ILoginPresenter {
    override fun onLogin(email: String, password: String) {
        val user=User(email, password)
        val isLoginSuccess = user.isDataValid
        if (isLoginSuccess)
            iLoginView.onLoginResult("Login success")
        else
            iLoginView.onLoginResult("Login error")
    }
}
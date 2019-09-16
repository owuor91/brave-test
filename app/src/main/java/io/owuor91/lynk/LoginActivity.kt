package io.owuor91.lynk

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.Toast
import io.owuor91.lynk.R.string
import kotlinx.android.synthetic.main.activity_login.btnLogin
import kotlinx.android.synthetic.main.activity_login.etPassword
import kotlinx.android.synthetic.main.activity_login.etUsername
import kotlinx.android.synthetic.main.activity_login.textInputLayoutPassword

class LoginActivity : AppCompatActivity() {
  
  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContentView(R.layout.activity_login)
    loginUser()
  }
  
  fun loginUser() {
    btnLogin.setOnClickListener {
      var username = etUsername.text.toString()
      var password = etPassword.text.toString()
      
      if (username.equals(Constants.USERNAME) && password.equals(Constants.PASSWORD)) {
        Toast.makeText(baseContext, getString(string.login_success), Toast.LENGTH_LONG).show()
        startActivity(Intent(this, MainActivity::class.java))
        finish()
      } else {
        textInputLayoutPassword.error = getString(string.invalid_password)
      }
    }
    
  }
}

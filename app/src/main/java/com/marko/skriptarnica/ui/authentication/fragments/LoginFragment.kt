package com.marko.skriptarnica.ui.authentication.fragments

import android.util.Log
import androidx.fragment.app.Fragment
import com.google.firebase.auth.FirebaseAuth

import com.marko.skriptarnica.R
import com.marko.skriptarnica.common.showFragment
import com.marko.skriptarnica.ui.base.BaseFragment
import com.marko.skriptarnica.ui.homePage.HomePageActivity
import com.marko.skriptarnica.ui.homePage.fragments.mainPage.HomeFragment
import kotlinx.android.synthetic.main.fragment_login.*

class LoginFragment : BaseFragment() {

    private lateinit var auth: FirebaseAuth

    override fun getLayoutResourceId(): Int = R.layout.fragment_login

    override fun setupUi() {
        auth = FirebaseAuth.getInstance()
    }

    override fun setOnClickListeners() {
        loginButton.setOnClickListener{ onLoginClicked() }
        createNewAccountText.setOnClickListener { onRegistrationClicked() }
    }

    private fun onLoginClicked() {
        auth.signInWithEmailAndPassword(authEmail.text.toString(), authPassword.text.toString()).addOnCompleteListener {
            if (it.isComplete && it.isSuccessful) {
                startActivity(HomePageActivity::class.java)
            } else {
                Log.d("+++", "Login failed")
            }
        }

    }

    private fun onRegistrationClicked() {
        activity?.showFragment(R.id.authFragmentContainer, RegistrationFragment.getInstance())
    }

    companion object{
        fun getInstance(): Fragment =
            LoginFragment()
    }
}

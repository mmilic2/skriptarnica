package com.marko.skriptarnica.ui.homePage.fragments.profile

import android.util.Log
import android.util.Xml
import androidx.fragment.app.Fragment
import com.google.firebase.auth.FirebaseAuth

import com.marko.skriptarnica.R
import com.marko.skriptarnica.ui.base.BaseFragment
import kotlinx.android.synthetic.main.fragment_my_profile.*

class MyProfileFragment : BaseFragment() {

    private val fireBaseUserEmail = FirebaseAuth.getInstance().currentUser?.email

    private val user = FirebaseAuth.getInstance().currentUser

    private lateinit var auth: FirebaseAuth

    override fun getLayoutResourceId(): Int = R.layout.fragment_my_profile

    override fun setupUi() {
        setTitle("Korisnički profil")
        userEmail.text = fireBaseUserEmail.toString()
    }

    override fun setOnClickListeners() {
        changeEmailButton.setOnClickListener {
            user!!.updateEmail(newEmailEditText.text.toString()).addOnCompleteListener{task ->  
                if(task.isSuccessful){
                    Log.d("+++", "User email updated.")
                    userEmail.text = newEmailEditText.text.toString()
                }
            }
        }
        changePasswordButton.setOnClickListener {
            user!!.updatePassword(newPasswordEditText.text.toString()).addOnCompleteListener{task ->
                if(task.isSuccessful){
                    Log.d("+++", "Pasword changed.")
                }
            }
        }
    }

    companion object{
        fun getInstance(): Fragment = MyProfileFragment()
    }

}

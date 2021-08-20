package com.marko.skriptarnica.ui.authentication.fragments

import android.provider.MediaStore
import android.util.Log
import android.view.View
import android.widget.RadioButton
import androidx.core.view.get
import androidx.fragment.app.Fragment
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.auth.UserProfileChangeRequest
import com.google.firebase.firestore.FirebaseFirestore
import com.marko.skriptarnica.R
import com.marko.skriptarnica.model.User
import com.marko.skriptarnica.ui.base.BaseFragment
import com.marko.skriptarnica.ui.homePage.HomePageActivity
import kotlinx.android.synthetic.main.fragment_registration.*
import kotlinx.android.synthetic.main.fragment_registration.view.*


class RegistrationFragment : BaseFragment() {

    private lateinit var auth: FirebaseAuth
    var db = FirebaseFirestore.getInstance()

    override fun getLayoutResourceId(): Int = R.layout.fragment_registration

    override fun setupUi() {
        auth = FirebaseAuth.getInstance()
    }

    override fun setOnClickListeners() {
        registerButton.setOnClickListener{ onRegisterClicked() }
    }

    private fun onRegisterClicked() {
        auth.createUserWithEmailAndPassword(regEmail.text.toString(), regPassword.text.toString()).addOnCompleteListener {
            if (it.isComplete && it.isSuccessful){
                auth.currentUser?.updateProfile(
                    UserProfileChangeRequest
                    .Builder()
                    .setDisplayName(regUsername.text.toString())
                    .build())
                var radioButtonValue: RadioButton = radiogroup.findViewById(radiogroup.checkedRadioButtonId)

                var user: User = User(radioButtonValue.text.toString())
                db.collection("/user").document(regEmail.text.toString()
                ).set(user)
                startActivity(HomePageActivity::class.java)
            }else{
                Log.d("+++", "Register failed")
            }
        }
    }

    companion object{
        fun getInstance(): Fragment =
            RegistrationFragment()
    }



}

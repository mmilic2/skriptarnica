package com.marko.skriptarnica.ui.homePage

import android.Manifest
import android.content.pm.PackageManager
import android.util.Log
import androidx.core.app.ActivityCompat
import androidx.core.content.ContextCompat
import com.google.android.material.bottomnavigation.BottomNavigationView
import com.google.firebase.auth.FirebaseAuth
import com.marko.skriptarnica.R
import com.marko.skriptarnica.common.showFragment
import com.marko.skriptarnica.ui.authentication.AuthActivity
import com.marko.skriptarnica.ui.base.BaseActivity
import com.marko.skriptarnica.ui.homePage.fragments.mainPage.HomeFragment
import com.marko.skriptarnica.ui.homePage.fragments.profile.MyProfileFragment
import kotlinx.android.synthetic.main.activity_home_page.*

class HomePageActivity : BaseActivity() {

    private val RECORD_REQUEST_CODE = 101

    override fun getLayoutResourceId(): Int = R.layout.activity_home_page

    override fun setupUi() {
        showFragment(R.id.homePageFragmentContainer, HomeFragment.getInstance())
        setupPermissions()
        setOnClickLIsteners()
    }

    private fun setOnClickLIsteners() {
        navBar.setOnNavigationItemSelectedListener(onNavItemSelected)
    }

    private fun setupPermissions() {
        val permission = ContextCompat.checkSelfPermission(this,
            Manifest.permission.READ_EXTERNAL_STORAGE)
        if (permission != PackageManager.PERMISSION_GRANTED) {
            makeRequest()
        }
    }

    private fun makeRequest() = ActivityCompat.requestPermissions(this, arrayOf(Manifest.permission.ACCESS_MEDIA_LOCATION, Manifest.permission.WRITE_EXTERNAL_STORAGE), RECORD_REQUEST_CODE)

    override fun onRequestPermissionsResult(requestCode: Int, permissions: Array<out String>, grantResults: IntArray) {
        super.onRequestPermissionsResult(requestCode, permissions, grantResults)
        when (requestCode) {
            RECORD_REQUEST_CODE -> {
                if (grantResults.isEmpty() || grantResults[0] != PackageManager.PERMISSION_GRANTED) {
                    Log.i("+++", "Permission has been denied by user")
                } else {
                    Log.i("+++", "Permission has been granted by user")
                }
            }
        }
    }

    private val onNavItemSelected  = BottomNavigationView.OnNavigationItemSelectedListener {
        when(it.itemId){
            R.id.home -> {
                showFragment(R.id.homePageFragmentContainer, HomeFragment.getInstance())
                return@OnNavigationItemSelectedListener true
            }
            R.id.logOut -> {
                FirebaseAuth.getInstance().signOut()
                startActivity(AuthActivity::class.java)
                return@OnNavigationItemSelectedListener true
            }
            R.id.profile -> {
                showFragment(R.id.homePageFragmentContainer, MyProfileFragment.getInstance())
                return@OnNavigationItemSelectedListener true
            }
            else -> return@OnNavigationItemSelectedListener false
        }
    }

}

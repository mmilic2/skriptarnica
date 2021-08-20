package com.marko.skriptarnica.ui.authentication

import com.marko.skriptarnica.R
import com.marko.skriptarnica.common.showFragment
import com.marko.skriptarnica.ui.authentication.fragments.LoginFragment
import com.marko.skriptarnica.ui.base.BaseActivity

class AuthActivity : BaseActivity() {

    override fun getLayoutResourceId(): Int = R.layout.activity_auth

    override fun setupUi() {
        showFragment(R.id.authFragmentContainer, LoginFragment.getInstance())
    }
}

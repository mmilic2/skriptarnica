package com.marko.skriptarnica.ui.homePage

import android.content.Intent
import android.net.Uri
import com.marko.skriptarnica.R
import com.marko.skriptarnica.ui.base.BaseActivity

class FileWebView : BaseActivity() {

    override fun getLayoutResourceId(): Int = R.layout.activity_web_view

    override fun setupUi() {

        val url = intent.getStringExtra(WEB_URL)
        val webpage: Uri = Uri.parse(url)
        val intent = Intent(Intent.ACTION_VIEW, webpage)
        if (intent.resolveActivity(packageManager) != null) {
            startActivity(intent)
        }
    }

    companion object{
        const val WEB_URL = "Url"
    }
}

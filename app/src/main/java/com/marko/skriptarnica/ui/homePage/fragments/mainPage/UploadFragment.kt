package com.marko.skriptarnica.ui.homePage.fragments.mainPage

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

import com.marko.skriptarnica.R

/**
 * A simple [Fragment] subclass.
 */
class UploadFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_upload, container, false)
    }

}

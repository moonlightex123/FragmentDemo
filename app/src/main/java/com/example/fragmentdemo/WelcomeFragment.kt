package com.example.fragmentdemo

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.Fragment

class WelcomeFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val v = inflater.inflate(R.layout.fragment_welcome, container, false)

        val btnNext = v.findViewById<Button>(R.id.buttonNext)

        btnNext.setOnClickListener {

            val profileFG = ProfileFragment()
            activity!!.supportFragmentManager.beginTransaction().apply {
                replace(R.id.mainframe, profileFG)
                addToBackStack(null)
                commit()
            }
        }

        return v
    }


}
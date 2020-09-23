package com.dheeraj.tutorial.navgraph

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.navArgs
import kotlinx.android.synthetic.main.fragment_learn.*


class LearnFragment : Fragment(R.layout.fragment_learn) {

    val args: LearnFragmentArgs by navArgs()

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initViews()
    }

    private fun initViews() {
        tv_learn.text = getString(R.string.learn_string, args.name)
    }
}
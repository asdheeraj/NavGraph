package com.dheeraj.tutorial.navgraph

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import kotlinx.android.synthetic.main.fragment_main.*


class MainFragment : Fragment(R.layout.fragment_main) {
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initListeners()
    }

    private fun initListeners() {
        btn_click.setOnClickListener {
            if (editText_name.text?.toString().isNullOrEmpty()) {
                textField_name.error = "Name Cannot be empty!"
            } else {
                textField_name.error = ""
                val text = editText_name.text?.toString()
                val action = MainFragmentDirections.actionClick(text = text)
                findNavController().navigate(action)
            }
        }

        btn_learn.setOnClickListener {
            if (editText_name.text?.toString().isNullOrEmpty()) {
                textField_name.error = "Name Cannot be empty!"
            } else {
                textField_name.error = ""
                val text = editText_name.text?.toString()
                val action = MainFragmentDirections.actionLearn(name = text)
                findNavController().navigate(action)
            }
        }
    }
}
package com.example.gragmentgit

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController

class FirstFragment : Fragment() {

    private lateinit var editText1: EditText
    private lateinit var editText2: EditText
    private lateinit var addButton: Button
    private lateinit var minusButton: Button
    private lateinit var VurmaButton: Button

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_first, container, false)

        editText1 = view.findViewById(R.id.editText1)
        editText2 = view.findViewById(R.id.editText2)
        addButton = view.findViewById(R.id.addButton)
        minusButton=view.findViewById(R.id.minusButton)
        VurmaButton=view.findViewById(R.id.VurmaButton)


        addButton.setOnClickListener {
            val number1 = editText1.text.toString().toIntOrNull() ?: 0
            val number2 = editText2.text.toString().toIntOrNull() ?: 0
            val sum = number1 + number2

            val action = FirstFragmentDirections.actionFirstFragmentToSecondFragment(sum)
            findNavController().navigate(action)
        }
        minusButton.setOnClickListener {
            val number1 = editText1.text.toString().toIntOrNull() ?: 0
            val number2 = editText2.text.toString().toIntOrNull() ?: 0
            val difference = number1 - number2

            val action = FirstFragmentDirections.actionFirstFragmentToSecondFragment(difference)
            findNavController().navigate(action)
        }
        VurmaButton.setOnClickListener {
            val number1 = editText1.text.toString().toIntOrNull() ?: 0
            val number2 = editText2.text.toString().toIntOrNull() ?: 0
            val vurma = number1 * number2

            val action = FirstFragmentDirections.actionFirstFragmentToSecondFragment(vurma)
            findNavController().navigate(action)
        }


        return view
    }
}

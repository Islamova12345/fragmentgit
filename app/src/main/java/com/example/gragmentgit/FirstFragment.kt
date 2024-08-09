package com.example.gragmentgit

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.navigation.Navigation
import com.example.gragmentgit.databinding.FragmentFirstBinding

class FirstFragment : Fragment(R.layout.fragment_first) {

    private lateinit var binding: FragmentFirstBinding

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = FragmentFirstBinding.bind(view)

        binding.addButton.setOnClickListener {
            val number1 = binding.editText1.text.toString().toIntOrNull() ?: 0
            val number2 = binding.editText2.text.toString().toIntOrNull() ?: 0
            val sum = number1 + number2

            val action = FirstFragmentDirections.actionFirstFragmentToSecondFragment(sum)
            Navigation.findNavController(it).navigate(action)
        }

        binding.minusButton.setOnClickListener {
            val number1 = binding.editText1.text.toString().toIntOrNull() ?: 0
            val number2 = binding.editText2.text.toString().toIntOrNull() ?: 0
            val difference = number1 - number2

            val action = FirstFragmentDirections.actionFirstFragmentToSecondFragment(difference)
            Navigation.findNavController(it).navigate(action)
        }

        binding.VurmaButton.setOnClickListener {
            val number1 = binding.editText1.text.toString().toIntOrNull() ?: 0
            val number2 = binding.editText2.text.toString().toIntOrNull() ?: 0
            val vurma = number1 * number2

            val action = FirstFragmentDirections.actionFirstFragmentToSecondFragment(vurma)
            Navigation.findNavController(it).navigate(action)
        }

        binding.BolmeButton.setOnClickListener {
            val number1 = binding.editText1.text.toString().toIntOrNull() ?: 0
            val number2 = binding.editText2.text.toString().toIntOrNull() ?: 0
            val bolme = number1 / number2

            val action = FirstFragmentDirections.actionFirstFragmentToSecondFragment(bolme)
            Navigation.findNavController(it).navigate(action)
        }
    }
}

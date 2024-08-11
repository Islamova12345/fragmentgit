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

        // Common function to handle operations
        fun performOperation(operation: (Int, Int) -> Int) {
            val number1 = binding.editText1.text.toString().toIntOrNull() ?: 0
            val number2 = binding.editText2.text.toString().toIntOrNull() ?: 0
            val result = operation(number1, number2)

            val action = FirstFragmentDirections.actionFirstFragmentToSecondFragment(result)
            Navigation.findNavController(view).navigate(action)
        }

        binding.addButton.setOnClickListener {
            performOperation { a, b -> a + b }
        }

        binding.minusButton.setOnClickListener {
            performOperation { a, b -> a - b }
        }

        binding.VurmaButton.setOnClickListener {
            performOperation { a, b -> a * b }
        }

        binding.BolmeButton.setOnClickListener {
            performOperation { a, b -> a / b }
        }
    }
}
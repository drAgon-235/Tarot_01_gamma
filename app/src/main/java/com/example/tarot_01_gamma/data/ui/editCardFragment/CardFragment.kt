package com.example.tarot_01_gamma.data.ui.editCardFragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.activityViewModels
import com.example.tarot_01_gamma.data.ui.ViewModel
import com.example.tarot_01_gamma.databinding.FragmentCardBinding


class CardFragment : Fragment() {

    private lateinit var binding: FragmentCardBinding
    private val viewModel: ViewModel by activityViewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {

        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentCardBinding.inflate(inflater, container, false)
        return binding.root    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val cardName = requireArguments().getString("cardName")
        val cardValue = requireArguments().getString("cardValue")
        val cardMeaning = requireArguments().getString("cardMeaning")
        val cardDescription = requireArguments().getString("cardDescription")

        binding.editNameTV.setText(cardName)
        binding.editValueTV.setText(cardValue)
        binding.editMeaningtTV.setText(cardMeaning)
        binding.editDescriptionTV.setText(cardDescription)




    }
}
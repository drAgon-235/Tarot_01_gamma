package com.example.tarot_01_gamma.data.ui.veryHomeFragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.findNavController
import androidx.navigation.fragment.findNavController
import com.example.tarot_01_gamma.databinding.FragmentVeryHomeBinding


class VeryHomeFragment : Fragment() {

    private lateinit var binding: FragmentVeryHomeBinding

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
        binding = FragmentVeryHomeBinding.inflate(inflater, container, false)
        return binding.root     }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val dayCardBTN = binding.dayCardBTN
        val cardsReading = binding.cardReadingBTN
        val allCardsBTN = binding.allCardsListBTN

        allCardsBTN.setOnClickListener {
            findNavController().navigate(VeryHomeFragmentDirections.actionVeryHomeFragmentToCardsListFragment())
        }



    }
}
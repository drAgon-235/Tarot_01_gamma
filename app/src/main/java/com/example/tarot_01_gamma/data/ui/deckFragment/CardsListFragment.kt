package com.example.tarot_01_gamma.data.ui.deckFragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.activityViewModels
import com.example.tarot_01_gamma.data.ui.ViewModel

import com.example.tarot_01_gamma.databinding.FragmentCardsListBinding

class CardsListFragment : Fragment() {

    private lateinit var binding: FragmentCardsListBinding
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
        binding = FragmentCardsListBinding.inflate(inflater, container, false)
        return binding.root    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.breedsListRV.hasFixedSize()

        viewModel.loadCardsListVM()

        viewModel.cardsList.observe(viewLifecycleOwner){
            binding.breedsListRV.adapter = CardsRVAdapter(it)

        }
    }

}
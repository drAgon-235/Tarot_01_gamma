package com.example.tarot_01_gamma.data.ui

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.tarot_01_gamma.data.Repository
import com.example.tarot_01_gamma.data.model.Card
import com.example.tarot_01_gamma.data.remote.CardsApi
import kotlinx.coroutines.launch

class ViewModel : ViewModel() {

    val repository = Repository(CardsApi.apiService)

    val cardsList: LiveData<List<Card>> = repository.cardsList

    fun loadCardsListVM(){
        viewModelScope.launch {
            Log.d("ViewModel", "Load Breed List from Repisitory to VM")
            repository.loadCardListInRepository()
        }

    }
}
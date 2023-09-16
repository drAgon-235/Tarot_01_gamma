package com.example.tarot_01_gamma.data

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.example.tarot_01_gamma.data.model.Card
import com.example.tarot_01_gamma.data.remote.ApiService

class Repository(val cardsApi: ApiService) {

    private val _cardsList: MutableLiveData<List<Card>> = MutableLiveData<List<Card>>()
    val cardsList: LiveData<List<Card>>
        get() = _cardsList

    suspend fun loadCardListInRepository(){
        // Erst daten von API laden
        val loadedCards = cardsApi.getCardsFromAPI()
        // dann in Format einer Liste "umwandeln" (entpacken gem. .data.model), die der Adapter benötigt:
        val workingCardsList = loadedCards.cards
        // letztendlich in die LiveData '_cardsList' des Repository packen, die im ViewModel benutzt wird:
        _cardsList.postValue(workingCardsList)
    }

}
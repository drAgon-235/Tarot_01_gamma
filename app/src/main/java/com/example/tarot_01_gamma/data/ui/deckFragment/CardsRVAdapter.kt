package com.example.tarot_01_gamma.data.ui.deckFragment

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.navigation.findNavController
import androidx.recyclerview.widget.RecyclerView
import com.example.tarot_01_gamma.data.model.Card
import com.example.tarot_01_gamma.databinding.CardItemBinding

class CardsRVAdapter(
    private val tarotDeckList: List<Card>
) : RecyclerView.Adapter<CardsRVAdapter.ItemViewHolder>() {

    inner class ItemViewHolder(val binding: CardItemBinding) : RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemViewHolder {
        val binding = CardItemBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ItemViewHolder(binding)
    }

    override fun getItemCount(): Int {
        return tarotDeckList.size
    }

    override fun onBindViewHolder(holder: ItemViewHolder, position: Int) {
        val card = tarotDeckList[position]

        holder.binding.nameTV.text = card.name

        holder.binding.itemCardView.setOnClickListener {
            holder.itemView.findNavController()
                .navigate(
                    CardsListFragmentDirections.actionCardsListFragmentToCardFragment(cardName = card.name, cardValue = card.value, cardMeaning = card.meaning_up, cardDescription = card.desc)
                )
        }

    }
}
package com.example.mycryto.adapters

import android.view.View
import androidx.recyclerview.widget.RecyclerView
import com.example.mycryto.databinding.CardCryptoBinding

class CryptoViewHolder(view: View):RecyclerView.ViewHolder(view){
    private val binding = CardCryptoBinding.bind(view)

    fun bind(name:String ){
        binding.cryptoCardTitle.setText(name)


    }

}
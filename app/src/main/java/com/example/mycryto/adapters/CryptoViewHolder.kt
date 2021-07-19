package com.example.mycryto.adapters

import android.view.View
import androidx.recyclerview.widget.RecyclerView
import com.example.mycryto.R
import com.example.mycryto.databinding.CardCryptoBinding

class CryptoViewHolder(view: View):RecyclerView.ViewHolder(view){
    private val binding = CardCryptoBinding.bind(view )

    val image = R.drawable.ic_coin

    fun bind(name:String , slug: String ){
        binding.cryptoCardTitle.setText(name)
        binding.cryptoCardDescription.setText(slug)
        binding.cryptoCardImage.setImageResource(image)
    }

}
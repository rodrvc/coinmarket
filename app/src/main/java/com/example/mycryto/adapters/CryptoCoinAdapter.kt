package com.example.mycryto.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.mycryto.R
import com.example.mycryto.model.CryptoCoin

class CryptoCoinAdapter(private val cryptocoins: List<CryptoCoin>):RecyclerView.Adapter<CryptoViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CryptoViewHolder {
       val layoutInflater = LayoutInflater.from(parent.context)
        return CryptoViewHolder(layoutInflater.inflate(R.layout.card_crypto , parent , false))
    }

    override fun onBindViewHolder(holder: CryptoViewHolder, position: Int) {
        val item = cryptocoins[position].name
        holder.bind(item)
    }

    override fun getItemCount(): Int {
        return cryptocoins.size;
    }
}
package com.example.mycryto.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.mycryto.model.CryptoCoin
import com.example.mycryto.model.CryptoCoinProvider

class CryptoViewModel :ViewModel() {
    val cryptoModel = MutableLiveData<List<CryptoCoin>>()

    fun getCryptoCoins(){
        val coins = CryptoCoinProvider.getCoin()
        cryptoModel.postValue(coins)
    }

}
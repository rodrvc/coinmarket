package com.example.mycryto.ui.viewmodel.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.mycryto.data.model.CryptoCoin
import com.example.mycryto.data.model.CryptoCoinDetail
import com.example.mycryto.data.model.CryptoCoinProvider
import com.example.mycryto.domain.getRankingCryptoCoins
import kotlinx.coroutines.launch

class CryptoViewModel :ViewModel() {
    val cryptoModel = MutableLiveData<List<CryptoCoinDetail>>()

    var getCryptoCoins = getRankingCryptoCoins()


    fun onCreate() {
        viewModelScope.launch {
            val result = getCryptoCoins()

            if (!result.isNullOrEmpty()){
                cryptoModel.postValue(result)
            }
        }

    }

}
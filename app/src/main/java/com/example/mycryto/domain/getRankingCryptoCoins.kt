package com.example.mycryto.domain

import com.example.mycryto.data.CryptoCoinRepository
import com.example.mycryto.data.model.CryptoCoin
import com.example.mycryto.data.model.CryptoCoinDetail

class getRankingCryptoCoins {

    private val repository = CryptoCoinRepository()


    suspend operator fun invoke():List<CryptoCoinDetail>?{
        return repository.getCryptoCoin();
    }
}
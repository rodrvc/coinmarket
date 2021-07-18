package com.example.mycryto.domain

import com.example.mycryto.data.CryptoCoinRepository
import com.example.mycryto.data.model.CryptoCoin

class getRankingCryptoCoins {

    private val repository = CryptoCoinRepository()


    suspend operator fun invoke():List<CryptoCoin>?{
        return repository.getCryptoCoin();
    }
}
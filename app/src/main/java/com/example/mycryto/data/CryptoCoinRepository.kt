package com.example.mycryto.data

import com.example.mycryto.data.model.CryptoCoin
import com.example.mycryto.data.model.CryptoCoinProvider
import com.example.mycryto.data.network.CryptoCoinService

class CryptoCoinRepository {

    private val api = CryptoCoinService()

    suspend fun getCryptoCoin():List<CryptoCoin>{
        val response: List<CryptoCoin> = api.getCryptoCoins()
        CryptoCoinProvider.crytocoins = response

        return response
    }



}
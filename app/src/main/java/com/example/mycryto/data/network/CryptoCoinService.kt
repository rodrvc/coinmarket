package com.example.mycryto.data.network

import com.example.mycryto.core.RetrofitHelper
import com.example.mycryto.data.model.CryptoCoin
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class CryptoCoinService {
    private val retrofit = RetrofitHelper.getRetrifit()

    suspend fun getCryptoCoins():List<CryptoCoin>{

        return withContext(Dispatchers.IO){
            val response = retrofit.create(cryptoApiClient::class.java).getCryptoCoins()

            response.body() ?: emptyList()
        }

    }


}
package com.example.mycryto.data.network

import com.example.mycryto.core.RetrofitHelper
import com.example.mycryto.data.model.CryptoCoin
import com.example.mycryto.data.model.CryptoCoinDetail
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class CryptoCoinService {
    private val retrofit = RetrofitHelper.getRetrifit()

    suspend fun getCryptoCoins():CryptoCoin{

        return withContext(Dispatchers.IO){
            val response = retrofit.create(cryptoApiClient::class.java).getCryptoCoins()

            (response.body() ?: null)!!
        }

    }


}
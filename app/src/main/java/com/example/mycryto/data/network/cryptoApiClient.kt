package com.example.mycryto.data.network

import com.example.mycryto.data.model.CryptoCoin
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Headers

interface cryptoApiClient {
    @Headers("X-CMC_PRO_API_KEY: 45d8051d-af81-42fa-85ed-3c690296b2c1")
    @GET("map?limit=10&sort=cmc_rank")

    

    suspend fun getCryptoCoins():Response<List<CryptoCoin>>
}
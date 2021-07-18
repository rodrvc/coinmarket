package com.example.mycryto.model

class CryptoCoinProvider {
    companion object{
        fun getCoin():List<CryptoCoin>{
            return crytoMoney;
        }

        private val crytoMoney = listOf<CryptoCoin>(
            CryptoCoin("bitcon", "bitCoin"),
            CryptoCoin("etherium", "ete")
        )
    }
}
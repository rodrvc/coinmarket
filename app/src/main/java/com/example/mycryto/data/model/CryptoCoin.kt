package com.example.mycryto.data.model

data class CryptoCoin(
    val `data`: List<CryptoCoinDetail>,
    val status: Status
)

data class CryptoCoinDetail(
    val first_historical_data: String,
    val id: Int,
    val is_active: Int,
    val last_historical_data: String,
    val name: String,
    val platform: Any,
    val rank: Int,
    val slug: String,
    val symbol: String
)

data class Status(
    val credit_count: Int,
    val elapsed: Int,
    val error_code: Int,
    val error_message: Any,
    val notice: Any,
    val timestamp: String
)
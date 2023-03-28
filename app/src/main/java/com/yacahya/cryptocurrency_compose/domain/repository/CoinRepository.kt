package com.yacahya.cryptocurrency_compose.domain.repository

import com.yacahya.cryptocurrency_compose.data.remote.dto.CoinDetailDto
import com.yacahya.cryptocurrency_compose.data.remote.dto.CoinDto

interface CoinRepository {
    suspend fun getCoins(): List<CoinDto>
    suspend fun getCoinById(coinId: String): CoinDetailDto
}
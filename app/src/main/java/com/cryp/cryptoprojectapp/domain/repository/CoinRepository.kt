package com.cryp.cryptoprojectapp.domain.repository

import com.cryp.cryptoprojectapp.data.remote.dto.CoinDetails.CoinDetailDto
import com.cryp.cryptoprojectapp.data.remote.dto.CoinDto

interface CoinRepository {

    suspend fun getCoins(): List<CoinDto>

    suspend fun getCoinById(coindId: String): CoinDetailDto
}
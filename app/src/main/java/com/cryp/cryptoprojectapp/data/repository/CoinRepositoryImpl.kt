package com.cryp.cryptoprojectapp.data.repository

import com.cryp.cryptoprojectapp.data.remote.CoinPaprikaApi
import com.cryp.cryptoprojectapp.data.remote.dto.CoinDetails.CoinDetailDto
import com.cryp.cryptoprojectapp.data.remote.dto.CoinDto
import com.cryp.cryptoprojectapp.domain.repository.CoinRepository
import javax.inject.Inject

class CoinRepositoryImpl @Inject constructor(
    private val api: CoinPaprikaApi
) : CoinRepository {
    override suspend fun getCoins(): List<CoinDto> {
        return api.getCoins()
    }

    override suspend fun getCoinById(coindId: String): CoinDetailDto {
        return api.getCoinById(coindId)
    }

}
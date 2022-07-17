package com.cryp.cryptoprojectapp.presentation.coin_detail

import com.cryp.cryptoprojectapp.domain.model.CoinDetail

data class CoinDetailState(
    val isLoading: Boolean = false,
    val coin: CoinDetail? = null,
    val error: String = ""
)
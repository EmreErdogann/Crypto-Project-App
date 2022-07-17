package com.cryp.cryptoprojectapp.presentation.coin_list

import com.cryp.cryptoprojectapp.domain.model.Coin

data class CoinListState(
    val isLoading: Boolean = false,
    val coins: List<Coin> = emptyList(),
    val error: String = ""
)

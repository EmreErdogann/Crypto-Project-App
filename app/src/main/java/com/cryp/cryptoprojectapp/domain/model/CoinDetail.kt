package com.cryp.cryptoprojectapp.domain.model

import com.cryp.cryptoprojectapp.data.remote.dto.CoinDetails.TeamMember


data class CoinDetail(
    val coinId: String,
    val name: String,
    val description: String,
    val symbol: String,
    val rank: Int,
    val isActive: Boolean,
    val tags: List<String>,
    val team: List<TeamMember>
)

package com.agn.v2ray.dto

data class SubscriptionItem(
        var remarks: String = "",
        var url: String = "",
        var enabled: Boolean = true,
        val addedTime: Long = System.currentTimeMillis(),
        var lastUpdated: Long = -1,
        var autoUpdate: Boolean = false,
        val updateInterval: Int? = null,
)
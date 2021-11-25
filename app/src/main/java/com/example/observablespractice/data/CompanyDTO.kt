package com.example.observablespractice.data

import com.google.gson.annotations.SerializedName

data class CompanyDTO(
    val name: String,
    val founder: String,
    val founded: Int,
    @SerializedName("employees")
    val amountOfEmployees: Int,
    @SerializedName("launch_sites")
    val amountOfLaunchSites: Int,
    val valuation: Long
)

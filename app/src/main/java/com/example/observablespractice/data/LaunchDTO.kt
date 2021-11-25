package com.example.observablespractice.data

import com.google.gson.annotations.SerializedName
import java.util.*

data class LaunchDTO(
    val id: String,
    @SerializedName("name")
    val missionName: String,
    @SerializedName("links")
    val links: LinksDTO,
    @SerializedName("rocket")
    val rocketId: String,
    @SerializedName("success")
    val launchSuccessful: Boolean,
    @SerializedName("date_local")
    val launchLocalDate: Date
)
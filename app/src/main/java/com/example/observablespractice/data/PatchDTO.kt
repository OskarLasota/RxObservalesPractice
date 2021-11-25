package com.example.observablespractice.data

import com.google.gson.annotations.SerializedName

data class PatchDTO(
    @SerializedName("small")
    val smallUrl: String
)

package com.example.observablespractice.data

import com.google.gson.annotations.SerializedName

data class LinksDTO(
    @SerializedName("patch")
    val patchImages: PatchDTO,
    @SerializedName("article")
    val article: String,
    @SerializedName("wikipedia")
    val wiki: String,
    @SerializedName("webcast")
    val videoUrl: String
)

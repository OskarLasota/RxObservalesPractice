package com.example.observablespractice.utils

import com.example.observablespractice.data.CompanyDTO
import com.example.observablespractice.data.LaunchDTO
import com.example.observablespractice.data.RocketDTO
import io.reactivex.Single
import retrofit2.http.GET

interface ApiService {

    @GET("launches")
    fun getLaunches(): Single<List<LaunchDTO>>

    @GET("company")
    fun getCompanyInfo(): Single<CompanyDTO>

    @GET("rockets")
    fun getRocketsList(): Single<List<RocketDTO>>

}
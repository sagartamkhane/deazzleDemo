package com.example.deazzle.data.api

import com.example.deazzle.data.model.UserResp
import retrofit2.http.GET
import retrofit2.http.Query

interface ApiService {

    @GET("/api/")
    suspend fun getUsers( @Query("results") result: String): UserResp

}
package com.example.androidtest3.data.api

import com.example.androidtest3.domain.model.CharacterResponse
import retrofit2.Response
import retrofit2.http.GET

interface ApiClient {

    @GET("character")
    suspend fun getAllCharacters(): Response<CharacterResponse>
}
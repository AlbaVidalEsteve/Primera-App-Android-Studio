package com.albavidal.androidmaster.superheroapp

import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Path

interface ApiService {

    @GET("/api/6417089301668476/search/{name}")
    suspend fun  getSuperheroes(@Path("name") superheroName:String): Response<SuperHeroDataResponse>
    @GET("/api/6417089301668476/{id}")
    suspend fun  getSuperheroDetail(@Path("id") superheroId:String): Response<SuperHeroDetailResponse>
}
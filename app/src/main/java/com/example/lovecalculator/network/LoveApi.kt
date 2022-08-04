package com.example.lovecalculator.network

import android.telecom.Call
import com.example.lovecalculator.LoveModel
import retrofit2.http.GET
import retrofit2.http.Header
import retrofit2.http.Query

interface LoveApi {

    @GET("getPercentage")
    fun calculate(@Query("fname") firstName: String,
                  @Query("sname") secondName: String,
    @Header("X-RapidAPI-Key") key:String="583754b408msh00a5ac20aae4636p128dcajsn059e1c15bb5c",
    @Header("X-RapidAPI-Host") host: String="love-calculator.p.rapidapi.com"
    ):retrofit2.Call<LoveModel>

}
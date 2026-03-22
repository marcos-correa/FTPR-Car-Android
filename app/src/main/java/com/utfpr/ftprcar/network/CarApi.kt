package com.utfpr.ftprcar.network

import com.utfpr.ftprcar.model.Car
import retrofit2.http.Body
import retrofit2.http.GET
import retrofit2.http.POST

interface CarApi {

    @GET("car")
    suspend fun getCars(): List<Car>

    @POST("car")
    suspend fun addCar(@Body car: Car): Car
}

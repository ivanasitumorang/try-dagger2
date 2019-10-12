package com.wepe.trydagger.data.network

import com.wepe.trydagger.data.model.ResponseMovies
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query

interface ApiService {

    @GET("movie/popular")
    suspend fun getPopularMovies(@Query("api_key") key : String,
                                 @Query("page") page : Int) : Response<ResponseMovies>
}
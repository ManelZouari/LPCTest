package com.lakooz.lpctest.networking

import com.jakewharton.retrofit2.adapter.kotlin.coroutines.CoroutineCallAdapterFactory
import com.lakooz.lpctest.model.Pot
import io.reactivex.Single
import kotlinx.coroutines.Deferred
import retrofit2.Retrofit
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.converter.scalars.ScalarsConverterFactory
import retrofit2.create
import retrofit2.http.*

private const val BASE_URL = "https://recrutement.lepotcommuntest.fr/2019/recruiting/"
private const val ENDGET = "get-pots"
private const val ENDPOST = "create-pot"
interface RestApiClient {


/*
    private val retrofit = Retrofit.Builder()
        .addCallAdapterFactory(
            RxJava2CallAdapterFactory.create())
        .addConverterFactory(
            GsonConverterFactory.create())
        .baseUrl(BASE_URL)
        .build()


 */

    @GET(ENDGET)
    abstract fun getPots(): Deferred<List<Pot>>


    @FormUrlEncoded
    @POST(ENDPOST)
    abstract fun createPot(@Field("category") category: Int): Deferred<Pot>




    companion object {
            operator fun invoke (): RestApiClient {

                return  Retrofit.Builder()
                    .addConverterFactory(GsonConverterFactory.create())

                    .addCallAdapterFactory(CoroutineCallAdapterFactory())
                    .baseUrl(BASE_URL)
                    .build()
                    .create(RestApiClient::class.java)

            }
    }



}
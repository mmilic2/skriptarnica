package com.marko.skriptarnica.networking

import com.marko.skriptarnica.networking.interactors.ManageFileApiInteractor
import com.marko.skriptarnica.networking.interactors.ManageFileApiInteractorImpl
import retrofit2.Retrofit
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.converter.gson.GsonConverterFactory

object BackendFactory {

    private var retrofit: Retrofit? = null
    private val interceptor = HttpLoggingInterceptor().setLevel(HttpLoggingInterceptor.Level.BODY)

    private val httpClient =
        OkHttpClient.Builder()
            .addInterceptor(interceptor)
            .build()

    private val client: Retrofit? = if (retrofit == null) createRetrofit() else retrofit

    private fun createRetrofit(): Retrofit? {
        retrofit = Retrofit.Builder()
            .client(httpClient)
            .baseUrl("http://192.168.1.14:8080/")
            .addConverterFactory(GsonConverterFactory.create())
            .build()
        return retrofit
    }

    private fun getService(): ManageFileApiService = this.client!!.create(ManageFileApiService::class.java)

    fun getManageFileApiInteractor(): ManageFileApiInteractor = ManageFileApiInteractorImpl(getService())

}
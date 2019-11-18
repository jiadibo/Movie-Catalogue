package com.jiadibo.moviecatalogue.api

import android.os.Message
import com.facebook.stetho.okhttp3.StethoInterceptor
import com.jiadibo.moviecatalogue.BuildConfig
import com.jiadibo.moviecatalogue.model.BaseResponse
import okhttp3.OkHttpClient
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class ApiClient {
    companion object{
        fun getClient() : Retrofit {
            val client = OkHttpClient.Builder()
                .addNetworkInterceptor(StethoInterceptor())
                .build()

            val retrofit: Retrofit =
                    Retrofit.Builder()
                        .baseUrl(BuildConfig.BASE_URL)
                        .client(client)
                        .addConverterFactory(GsonConverterFactory.create())
                        .build()
            return retrofit
        }

        inline fun <reified T>of(java: Class<T>): T{
            return getClient().create(java)
        }
    }
}


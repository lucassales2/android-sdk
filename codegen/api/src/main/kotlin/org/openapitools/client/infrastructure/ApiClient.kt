package org.openapitools.client.infrastructure

import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.converter.scalars.ScalarsConverterFactory
import retrofit2.converter.moshi.MoshiConverterFactory

class ApiClient(
    private var baseUrl: String = "https://nstack.io",
    private var okHttpClient: OkHttpClient
) {
    init {
        normalizeBaseUrl()
    }

    val retrofitBuilder: Retrofit.Builder by lazy {

        Retrofit.Builder()
        .baseUrl(baseUrl)
        .addConverterFactory(ScalarsConverterFactory.create())
        .addConverterFactory(MoshiConverterFactory.create(Serializer.moshi))
    }

    fun <S> createService(serviceClass: Class<S>): S {
        return retrofitBuilder.client(okHttpClient).build().create(serviceClass)
    }

    private fun normalizeBaseUrl() {
        if (!baseUrl.endsWith("/")) {
            baseUrl += "/"
        }
    }
}
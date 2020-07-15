package dk.nodes.nstack.kotlin.codegen.api

import org.openapitools.client.infrastructure.CollectionFormats.*
import retrofit2.http.*
import retrofit2.Call
import okhttp3.RequestBody
import okhttp3.ResponseBody
import okhttp3.MultipartBody


interface ContinentsApi {
    @GET("/api/v2/geographic/continents")
    fun getIndex(@Header("X-Application-Id") xminusApplicationMinusId: kotlin.String, @Header("X-Rest-Api-Key") xminusRestMinusApiMinusKey: kotlin.String): Call<Unit>

    @GET("/api/v2/geographic/continents/1")
    fun getShow123(@Header("X-Application-Id") xminusApplicationMinusId: kotlin.String, @Header("X-Rest-Api-Key") xminusRestMinusApiMinusKey: kotlin.String): Call<Unit>

}

package dk.nodes.nstack.kotlin.codegen.api

import org.openapitools.client.infrastructure.CollectionFormats.*
import retrofit2.http.*
import retrofit2.Call
import okhttp3.RequestBody
import okhttp3.ResponseBody
import okhttp3.MultipartBody


interface ValidatorApi {
    @GET("/api/v2/validator/email")
    fun email(@Query("email") email: kotlin.String, @Header("X-Application-Id") xminusApplicationMinusId: kotlin.String, @Header("X-Rest-Api-Key") xminusRestMinusApiMinusKey: kotlin.String): Call<Unit>

    @GET("/api/v2/validator/phone")
    fun phone(@Query("phone") phone: kotlin.Int, @Header("X-Application-Id") xminusApplicationMinusId: kotlin.String, @Header("X-Rest-Api-Key") xminusRestMinusApiMinusKey: kotlin.String): Call<Unit>

}

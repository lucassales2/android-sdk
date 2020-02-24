package dk.nodes.nstack.kotlin.codegen.api

import org.openapitools.client.infrastructure.CollectionFormats.*
import retrofit2.http.*
import retrofit2.Call
import okhttp3.RequestBody
import okhttp3.ResponseBody
import okhttp3.MultipartBody


interface RateRemindersApi {
    @GET("/api/v2/notify/rate_reminder")
    fun getShow(@Query("platform") platform: kotlin.String, @Query("guid") guid: kotlin.Int, @Header("X-Application-Id") xminusApplicationMinusId: kotlin.String, @Header("X-Rest-Api-Key") xminusRestMinusApiMinusKey: kotlin.String): Call<Unit>

    @GET("/api/v1/notify/rate_reminder")
    fun getShow1(@Query("platform") platform: kotlin.String, @Query("guid") guid: kotlin.Int, @Header("X-Application-Id") xminusApplicationMinusId: kotlin.String, @Header("X-Rest-Api-Key") xminusRestMinusApiMinusKey: kotlin.String): Call<Unit>

    @FormUrlEncoded
    @POST("/api/v1/notify/rate_reminder/views")
    fun markasseen1(@Header("X-Application-Id") xminusApplicationMinusId: kotlin.String, @Header("X-Rest-Api-Key") xminusRestMinusApiMinusKey: kotlin.String, @Field("guid") guid: kotlin.Int, @Field("platform") platform: kotlin.String, @Field("answer") answer: kotlin.String): Call<Unit>

    @FormUrlEncoded
    @POST("/api/v2/notify/rate_reminder/views")
    fun postMarkasseen(@Header("X-Application-Id") xminusApplicationMinusId: kotlin.String, @Header("X-Rest-Api-Key") xminusRestMinusApiMinusKey: kotlin.String, @Field("guid") guid: kotlin.Int, @Field("platform") platform: kotlin.String, @Field("answer") answer: kotlin.String): Call<Unit>

}

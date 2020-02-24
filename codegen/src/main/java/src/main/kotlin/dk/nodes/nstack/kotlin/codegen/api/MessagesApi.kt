package dk.nodes.nstack.kotlin.codegen.api

import org.openapitools.client.infrastructure.CollectionFormats.*
import retrofit2.http.*
import retrofit2.Call
import okhttp3.RequestBody
import okhttp3.ResponseBody
import okhttp3.MultipartBody

import dk.nodes.nstack.kotlin.codegen.model.MarkAsSeenResponse
import dk.nodes.nstack.kotlin.codegen.model.Messages

interface MessagesApi {
    @FormUrlEncoded
    @POST("/api/v2/notify/messages/views")
    fun markasseen(@Header("X-Application-Id") xminusApplicationMinusId: kotlin.String, @Header("X-Rest-Api-Key") xminusRestMinusApiMinusKey: kotlin.String, @Field("guid") guid: kotlin.Int, @Field("message_id") messageId: kotlin.Int): Call<MarkAsSeenResponse>

    @GET("/api/v2/notify/messages")
    fun messages(@Query("platform") platform: kotlin.String, @Header("X-Application-Id") xminusApplicationMinusId: kotlin.String, @Header("X-Rest-Api-Key") xminusRestMinusApiMinusKey: kotlin.String): Call<Messages>

    @GET("/api/v1/notify/messages")
    fun messages1(@Query("platform") platform: kotlin.String, @Header("X-Application-Id") xminusApplicationMinusId: kotlin.String, @Header("X-Rest-Api-Key") xminusRestMinusApiMinusKey: kotlin.String): Call<Messages>

    @FormUrlEncoded
    @POST("/api/v1/notify/messages/views")
    fun viewmessage(@Header("X-Application-Id") xminusApplicationMinusId: kotlin.String, @Header("X-Rest-Api-Key") xminusRestMinusApiMinusKey: kotlin.String, @Field("guid") guid: kotlin.Int, @Field("message_id") messageId: kotlin.Int): Call<Unit>

}

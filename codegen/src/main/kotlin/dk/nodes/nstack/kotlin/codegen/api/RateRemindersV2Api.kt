package dk.nodes.nstack.kotlin.codegen.api

import org.openapitools.client.infrastructure.CollectionFormats.*
import retrofit2.http.*
import retrofit2.Call
import okhttp3.RequestBody
import okhttp3.ResponseBody
import okhttp3.MultipartBody

import dk.nodes.nstack.kotlin.codegen.model.ActionEventsRequest
import dk.nodes.nstack.kotlin.codegen.model.AnswerRequest

interface RateRemindersV2Api {
    @POST("/api/v2/notify/rate_reminder_v2/events")
    fun actionEvents(@Header("X-Application-Id") xminusApplicationMinusId: kotlin.String, @Header("X-Rest-Api-Key") xminusRestMinusApiMinusKey: kotlin.String, @Body actionEventsRequest: ActionEventsRequest): Call<Unit>

    @GET("/api/v2/notify/rate_reminder_v2/actions")
    fun actions(@Header("X-Application-Id") xminusApplicationMinusId: kotlin.String, @Header("X-Rest-Api-Key") xminusRestMinusApiMinusKey: kotlin.String): Call<Unit>

    @POST("/api/v2/notify/rate_reminder_v2/2/answers")
    fun answer(@Header("X-Application-Id") xminusApplicationMinusId: kotlin.String, @Header("X-Rest-Api-Key") xminusRestMinusApiMinusKey: kotlin.String, @Body answerRequest: AnswerRequest): Call<Unit>

    @GET("/api/v2/notify/rate_reminder_v2")
    fun getShow12(@Query("guid") guid: kotlin.String, @Header("X-Application-Id") xminusApplicationMinusId: kotlin.String, @Header("X-Rest-Api-Key") xminusRestMinusApiMinusKey: kotlin.String): Call<Unit>

}

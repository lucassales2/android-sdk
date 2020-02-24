package dk.nodes.nstack.kotlin.codegen.api

import org.openapitools.client.infrastructure.CollectionFormats.*
import retrofit2.http.*
import retrofit2.Call
import okhttp3.RequestBody
import okhttp3.ResponseBody
import okhttp3.MultipartBody


interface UGCApi {
    @FormUrlEncoded
    @POST("/api/v2/ugc/feedbacks")
    fun feedback(@Header("X-Application-Id") xminusApplicationMinusId: kotlin.String, @Header("X-Rest-Api-Key") xminusRestMinusApiMinusKey: kotlin.String, @Field("breadcrumbs[0][meta]") breadcrumbsLeftSquareBracket0RightSquareBracketLeftSquareBracketMetaRightSquareBracket: kotlin.String, @Field("os") os: kotlin.String, @Field("device") device: kotlin.String, @Field("app_version") appVersion: kotlin.String, @Field("name") name: kotlin.String, @Field("email") email: kotlin.String, @Field("message") message: kotlin.String, @Field("image") image: kotlin.String, @Field("type") type: kotlin.String, @Field("platform") platform: kotlin.String, @Field("meta[key]") metaLeftSquareBracketKeyRightSquareBracket: kotlin.String, @Field("breadcrumbs[0][event]") breadcrumbsLeftSquareBracket0RightSquareBracketLeftSquareBracketEventRightSquareBracket: kotlin.String, @Field("breadcrumbs[0][timestamp]") breadcrumbsLeftSquareBracket0RightSquareBracketLeftSquareBracketTimestampRightSquareBracket: kotlin.String): Call<Unit>

    @FormUrlEncoded
    @POST("/api/v1/ugc/feedbacks")
    fun postFeedback(@Header("X-Application-Id") xminusApplicationMinusId: kotlin.String, @Header("X-Rest-Api-Key") xminusRestMinusApiMinusKey: kotlin.String, @Field("os") os: kotlin.String, @Field("device") device: kotlin.String, @Field("app_version") appVersion: kotlin.String, @Field("name") name: kotlin.String, @Field("email") email: kotlin.String, @Field("message") message: kotlin.String, @Field("image") image: kotlin.String): Call<Unit>

    @FormUrlEncoded
    @POST("/api/v2/ugc/push-logs")
    fun pushLogs(@Header("X-Application-Id") xminusApplicationMinusId: kotlin.String, @Header("X-Rest-Api-Key") xminusRestMinusApiMinusKey: kotlin.String, @Field("provider") provider: kotlin.String, @Field("key") key: kotlin.String, @Field("type") type: kotlin.String, @Field("succeeded") succeeded: kotlin.Boolean, @Field("request") request: kotlin.Any, @Field("response") response: kotlin.Any, @Field("user_id") userId: kotlin.Int): Call<Unit>

    @FormUrlEncoded
    @POST("/api/v1/ugc/push-logs")
    fun pushLogs1(@Header("X-Application-Id") xminusApplicationMinusId: kotlin.String, @Header("X-Rest-Api-Key") xminusRestMinusApiMinusKey: kotlin.String, @Field("provider") provider: kotlin.String, @Field("key") key: kotlin.String, @Field("type") type: kotlin.String, @Field("succeeded") succeeded: kotlin.Boolean, @Field("request") request: kotlin.Any, @Field("response") response: kotlin.Any, @Field("user_id") userId: kotlin.Int): Call<Unit>

    @FormUrlEncoded
    @POST("/api/v2/ugc/results")
    fun result(@Header("X-Application-Id") xminusApplicationMinusId: kotlin.String, @Header("X-Rest-Api-Key") xminusRestMinusApiMinusKey: kotlin.String, @Field("key") key: kotlin.String, @Field("user") user: kotlin.String, @Field("answer") answer: kotlin.Array<kotlin.Int>, @Field("points") points: kotlin.Int, @Field("tag") tag: kotlin.String): Call<Unit>

    @FormUrlEncoded
    @POST("/api/v1/ugc/results")
    fun result1(@Header("X-Application-Id") xminusApplicationMinusId: kotlin.String, @Header("X-Rest-Api-Key") xminusRestMinusApiMinusKey: kotlin.String, @Field("key") key: kotlin.String, @Field("user") user: kotlin.String, @Field("answer") answer: kotlin.Array<kotlin.Int>, @Field("points") points: kotlin.Int, @Field("tag") tag: kotlin.String): Call<Unit>

}

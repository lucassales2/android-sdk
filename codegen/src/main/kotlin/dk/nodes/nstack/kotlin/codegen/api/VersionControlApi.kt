package dk.nodes.nstack.kotlin.codegen.api

import org.openapitools.client.infrastructure.CollectionFormats.*
import retrofit2.http.*
import retrofit2.Call
import okhttp3.RequestBody
import okhttp3.ResponseBody
import okhttp3.MultipartBody

import dk.nodes.nstack.kotlin.codegen.model.VersionControl

interface VersionControlApi {
    @GET("/api/v2/notify/updates")
    fun indexupdate(@Query("platform") platform: kotlin.String, @Query("current_version") currentVersion: kotlin.Double, @Query("last_version") lastVersion: kotlin.Double, @Header("X-Application-Id") xminusApplicationMinusId: kotlin.String, @Header("X-Rest-Api-Key") xminusRestMinusApiMinusKey: kotlin.String): Call<VersionControl>

    @FormUrlEncoded
    @POST("/api/v2/notify/updates/views")
    fun markupdateasseen(@Header("X-Application-Id") xminusApplicationMinusId: kotlin.String, @Header("X-Rest-Api-Key") xminusRestMinusApiMinusKey: kotlin.String, @Field("guid") guid: kotlin.Int, @Field("update_id") updateId: kotlin.Int, @Field("answer") answer: kotlin.String, @Field("type") type: kotlin.String): Call<Unit>

}

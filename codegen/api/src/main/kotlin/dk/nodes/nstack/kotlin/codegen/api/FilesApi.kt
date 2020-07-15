package dk.nodes.nstack.kotlin.codegen.api

import org.openapitools.client.infrastructure.CollectionFormats.*
import retrofit2.http.*
import retrofit2.Call
import okhttp3.RequestBody
import okhttp3.ResponseBody
import okhttp3.MultipartBody


interface FilesApi {
    @FormUrlEncoded
    @POST("/api/v2/content/files")
    fun store(@Header("X-Application-Id") xminusApplicationMinusId: kotlin.String, @Header("X-Rest-Api-Key") xminusRestMinusApiMinusKey: kotlin.String, @Header("Content-Type") contentMinusType: kotlin.String, @Field("name") name: kotlin.String, @Field("tags") tags: kotlin.String, @Field("gone_at") goneAt: kotlin.String, @Field("file") file: kotlin.String, @Field("privacy") privacy: kotlin.String): Call<Unit>

}

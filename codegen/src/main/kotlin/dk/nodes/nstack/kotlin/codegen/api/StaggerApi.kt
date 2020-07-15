package dk.nodes.nstack.kotlin.codegen.api

import org.openapitools.client.infrastructure.CollectionFormats.*
import retrofit2.http.*
import retrofit2.Call
import okhttp3.RequestBody
import okhttp3.ResponseBody
import okhttp3.MultipartBody


interface StaggerApi {
    @FormUrlEncoded
    @POST("/api/v2/stagger")
    fun gettag(@Header("X-Application-Id") xminusApplicationMinusId: kotlin.String, @Header("X-Rest-Api-Key") xminusRestMinusApiMinusKey: kotlin.String, @Header("Content-Type") contentMinusType: kotlin.String, @Field("text") text: kotlin.String, @Field("data-center") dataMinusCenter: kotlin.String): Call<Unit>

}

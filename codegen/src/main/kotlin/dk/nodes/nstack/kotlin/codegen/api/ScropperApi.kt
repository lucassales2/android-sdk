package dk.nodes.nstack.kotlin.codegen.api

import org.openapitools.client.infrastructure.CollectionFormats.*
import retrofit2.http.*
import retrofit2.Call
import okhttp3.RequestBody
import okhttp3.ResponseBody
import okhttp3.MultipartBody

import dk.nodes.nstack.kotlin.codegen.model.Scropper

interface ScropperApi {
    @FormUrlEncoded
    @POST("/api/v2/scropper")
    fun getfocalpoint(@Header("X-Application-Id") xminusApplicationMinusId: kotlin.String, @Header("X-Rest-Api-Key") xminusRestMinusApiMinusKey: kotlin.String, @Header("Content-Type") contentMinusType: kotlin.String, @Field("url") url: kotlin.String, @Field("data-center") dataMinusCenter: kotlin.String): Call<Scropper>

}

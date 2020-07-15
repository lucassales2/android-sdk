package dk.nodes.nstack.kotlin.codegen.api

import org.openapitools.client.infrastructure.CollectionFormats.*
import retrofit2.http.*
import retrofit2.Call
import okhttp3.RequestBody
import okhttp3.ResponseBody
import okhttp3.MultipartBody

import dk.nodes.nstack.kotlin.codegen.model.AppOpen

interface AppOpenApi {
    @FormUrlEncoded
    @POST("/api/v2/open")
    fun appopen(@Query("test") test: kotlin.Boolean, @Header("X-Application-Id") xminusApplicationMinusId: kotlin.String, @Header("X-Rest-Api-Key") xminusRestMinusApiMinusKey: kotlin.String, @Header("Accept-Language") acceptMinusLanguage: kotlin.String, @Header("N-Meta") nminusMeta: kotlin.String, @Field("platform") platform: kotlin.String, @Field("guid") guid: kotlin.String, @Field("version") version: kotlin.String, @Field("last_updated") lastUpdated: kotlin.String, @Field("dev") dev: kotlin.Boolean): Call<AppOpen>

}

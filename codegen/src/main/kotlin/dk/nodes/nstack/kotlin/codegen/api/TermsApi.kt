package dk.nodes.nstack.kotlin.codegen.api

import org.openapitools.client.infrastructure.CollectionFormats.*
import retrofit2.http.*
import retrofit2.Call
import okhttp3.RequestBody
import okhttp3.ResponseBody
import okhttp3.MultipartBody


interface TermsApi {
    @GET("/api/v2/content/terms")
    fun index(@Header("X-Application-Id") xminusApplicationMinusId: kotlin.String, @Header("X-Rest-Api-Key") xminusRestMinusApiMinusKey: kotlin.String, @Header("N-Meta") nminusMeta: kotlin.String, @Header("Accept-Language") acceptMinusLanguage: kotlin.String): Call<Unit>

    @GET("/api/v2/content/terms/some-terms-1/versions")
    fun indexversions(@Header("X-Application-Id") xminusApplicationMinusId: kotlin.String, @Header("X-Rest-Api-Key") xminusRestMinusApiMinusKey: kotlin.String, @Header("N-Meta") nminusMeta: kotlin.String, @Header("Accept-Language") acceptMinusLanguage: kotlin.String): Call<Unit>

    @GET("/api/v2/content/terms/some-terms-1/versions/newest")
    fun newestversion(@Header("X-Application-Id") xminusApplicationMinusId: kotlin.String, @Header("X-Rest-Api-Key") xminusRestMinusApiMinusKey: kotlin.String, @Header("N-Meta") nminusMeta: kotlin.String, @Header("Accept-Language") acceptMinusLanguage: kotlin.String): Call<Unit>

    @GET("/api/v2/content/terms/versions/5")
    fun showversion(@Query("guid") guid: kotlin.String, @Header("X-Application-Id") xminusApplicationMinusId: kotlin.String, @Header("X-Rest-Api-Key") xminusRestMinusApiMinusKey: kotlin.String, @Header("N-Meta") nminusMeta: kotlin.String, @Header("Accept-Language") acceptMinusLanguage: kotlin.String): Call<Unit>

    @FormUrlEncoded
    @POST("/api/v2/content/terms/versions/views")
    fun storeView(@Header("X-Application-Id") xminusApplicationMinusId: kotlin.String, @Header("X-Rest-Api-Key") xminusRestMinusApiMinusKey: kotlin.String, @Header("N-Meta") nminusMeta: kotlin.String, @Header("Accept-Language") acceptMinusLanguage: kotlin.String, @Field("term_version_id") termVersionId: kotlin.Int, @Field("guid") guid: kotlin.String, @Field("identifier") identifier: kotlin.String, @Field("locale") locale: kotlin.String): Call<Unit>

}

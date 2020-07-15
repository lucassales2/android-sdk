package dk.nodes.nstack.kotlin.codegen.api

import org.openapitools.client.infrastructure.CollectionFormats.*
import retrofit2.http.*
import retrofit2.Call
import okhttp3.RequestBody
import okhttp3.ResponseBody
import okhttp3.MultipartBody

import dk.nodes.nstack.kotlin.codegen.model.Indexlanguages
import dk.nodes.nstack.kotlin.codegen.model.Indexresource
import dk.nodes.nstack.kotlin.codegen.model.Languagebestfit
import dk.nodes.nstack.kotlin.codegen.model.Showresource

interface LocalizeApi {
    @DELETE("/api/v2/content/localize/proposals/9")
    fun deleteproposal(@Query("guid") guid: kotlin.String, @Header("X-Application-Id") xminusApplicationMinusId: kotlin.String, @Header("X-Rest-Api-Key") xminusRestMinusApiMinusKey: kotlin.String): Call<Unit>

    @GET("/api/v2/content/localize/mobile/languages")
    fun indexlanguages(@Header("X-Application-Id") xminusApplicationMinusId: kotlin.String, @Header("X-Rest-Api-Key") xminusRestMinusApiMinusKey: kotlin.String): Call<Indexlanguages>

    @GET("/api/v2/content/localize/proposals")
    fun indexproposal(@Header("X-Application-Id") xminusApplicationMinusId: kotlin.String, @Header("X-Rest-Api-Key") xminusRestMinusApiMinusKey: kotlin.String): Call<Unit>

    @GET("/api/v2/content/localize/resources/platforms/mobile")
    fun indexresource(@Header("X-Application-Id") xminusApplicationMinusId: kotlin.String, @Header("X-Rest-Api-Key") xminusRestMinusApiMinusKey: kotlin.String): Call<Indexresource>

    @GET("/api/v2/content/localize/mobile/languages/best_fit")
    fun languagebestfit(@Header("X-Application-Id") xminusApplicationMinusId: kotlin.String, @Header("X-Rest-Api-Key") xminusRestMinusApiMinusKey: kotlin.String): Call<Languagebestfit>

    @GET("/api/v2/content/localize/resources/44")
    fun showresource(): Call<Showresource>

    @FormUrlEncoded
    @POST("/api/v2/content/localize/proposals")
    fun storeproposal(@Header("X-Application-Id") xminusApplicationMinusId: kotlin.String, @Header("X-Rest-Api-Key") xminusRestMinusApiMinusKey: kotlin.String, @Field("key") key: kotlin.String, @Field("value") value: kotlin.String, @Field("locale") locale: kotlin.String, @Field("platform") platform: kotlin.String, @Field("guid") guid: kotlin.String, @Field("section") section: kotlin.String): Call<Unit>

}

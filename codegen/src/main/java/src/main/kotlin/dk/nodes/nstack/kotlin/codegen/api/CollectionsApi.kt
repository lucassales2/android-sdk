package dk.nodes.nstack.kotlin.codegen.api

import org.openapitools.client.infrastructure.CollectionFormats.*
import retrofit2.http.*
import retrofit2.Call
import okhttp3.RequestBody
import okhttp3.ResponseBody
import okhttp3.MultipartBody


interface CollectionsApi {
    @FormUrlEncoded
    @POST("/api/v2/content/collections/1/items")
    fun createitem(@Header("X-Application-Id") xminusApplicationMinusId: kotlin.String, @Header("X-Rest-Api-Key") xminusRestMinusApiMinusKey: kotlin.String, @Field("k0int") k0int: kotlin.Int, @Field("key1string") key1string: kotlin.String, @Field("key2float") key2float: kotlin.Double, @Field("key3wysiwygsim") key3wysiwygsim: kotlin.String, @Field("key4asset") key4asset: kotlin.String, @Field("key5boolean") key5boolean: kotlin.Boolean, @Field("key6wysiwygadvanced") key6wysiwygadvanced: kotlin.String): Call<Unit>

    @FormUrlEncoded
    @POST("/api/v1/content/collections/1/items")
    fun createitem1(@Header("X-Application-Id") xminusApplicationMinusId: kotlin.String, @Header("X-Rest-Api-Key") xminusRestMinusApiMinusKey: kotlin.String, @Field("k0int") k0int: kotlin.Int, @Field("key1string") key1string: kotlin.String, @Field("key2float") key2float: kotlin.Double, @Field("key3wysiwygsim") key3wysiwygsim: kotlin.String, @Field("key4asset") key4asset: kotlin.String, @Field("key5boolean") key5boolean: kotlin.Boolean, @Field("key6wysiwygadvanced") key6wysiwygadvanced: kotlin.String): Call<Unit>

    @DELETE("/api/v2/content/collections/1/items/13")
    fun deleteitem(@Header("X-Application-Id") xminusApplicationMinusId: kotlin.String, @Header("X-Rest-Api-Key") xminusRestMinusApiMinusKey: kotlin.String): Call<Unit>

    @DELETE("/api/v1/content/collections/1/items/13")
    fun deleteitem1(@Header("X-Application-Id") xminusApplicationMinusId: kotlin.String, @Header("X-Rest-Api-Key") xminusRestMinusApiMinusKey: kotlin.String): Call<Unit>

    @FormUrlEncoded
    @POST("/api/v2/content/collections/1/items/14/update")
    fun update(@Header("X-Application-Id") xminusApplicationMinusId: kotlin.String, @Header("X-Rest-Api-Key") xminusRestMinusApiMinusKey: kotlin.String, @Header("Content-Type") contentMinusType: kotlin.String, @Field("k0int") k0int: kotlin.Int, @Field("key1string") key1string: kotlin.String, @Field("key2float") key2float: kotlin.Double, @Field("key3wysiwygsim") key3wysiwygsim: kotlin.String, @Field("key4asset") key4asset: kotlin.String, @Field("key5boolean") key5boolean: kotlin.Boolean, @Field("key6wysiwygadvanced") key6wysiwygadvanced: kotlin.String): Call<Unit>

    @FormUrlEncoded
    @POST("/api/v1/content/collections/1/items/14/update")
    fun update1(@Header("X-Application-Id") xminusApplicationMinusId: kotlin.String, @Header("X-Rest-Api-Key") xminusRestMinusApiMinusKey: kotlin.String, @Header("Content-Type") contentMinusType: kotlin.String, @Field("k0int") k0int: kotlin.Int, @Field("key1string") key1string: kotlin.String, @Field("key2float") key2float: kotlin.Double, @Field("key3wysiwygsim") key3wysiwygsim: kotlin.String, @Field("key4asset") key4asset: kotlin.String, @Field("key5boolean") key5boolean: kotlin.Boolean, @Field("key6wysiwygadvanced") key6wysiwygadvanced: kotlin.String): Call<Unit>

    @GET("/api/v2/content/collections/1")
    fun view(@Header("X-Application-Id") xminusApplicationMinusId: kotlin.String, @Header("X-Rest-Api-Key") xminusRestMinusApiMinusKey: kotlin.String): Call<Unit>

    @GET("/api/v1/content/collections/1")
    fun view1(@Header("X-Application-Id") xminusApplicationMinusId: kotlin.String, @Header("X-Rest-Api-Key") xminusRestMinusApiMinusKey: kotlin.String): Call<Unit>

    @GET("/api/v2/content/collections/1/items/5")
    fun viewitem(@Header("X-Application-Id") xminusApplicationMinusId: kotlin.String, @Header("X-Rest-Api-Key") xminusRestMinusApiMinusKey: kotlin.String): Call<Unit>

    @GET("/api/v1/content/collections/1/items/5")
    fun viewitem1(@Header("X-Application-Id") xminusApplicationMinusId: kotlin.String, @Header("X-Rest-Api-Key") xminusRestMinusApiMinusKey: kotlin.String): Call<Unit>

}

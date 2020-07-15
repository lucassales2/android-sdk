package dk.nodes.nstack.kotlin.codegen.api

import org.openapitools.client.infrastructure.CollectionFormats.*
import retrofit2.http.*
import retrofit2.Call
import okhttp3.RequestBody
import okhttp3.ResponseBody
import okhttp3.MultipartBody


interface CollectionsApi {
    @FormUrlEncoded
    @POST("/api/v2/content/collections/{collectionId}/items")
    fun createitem(@Path("collectionId") collectionId: kotlin.Long, @Header("X-Application-Id") xminusApplicationMinusId: kotlin.String, @Header("X-Rest-Api-Key") xminusRestMinusApiMinusKey: kotlin.String, @Path("collection_id") collectionId2: kotlin.Int, @Field("k0int") k0int: kotlin.Int, @Field("key1string") key1string: kotlin.String, @Field("key2float") key2float: kotlin.Double, @Field("key3wysiwygsim") key3wysiwygsim: kotlin.String, @Field("key4asset") key4asset: kotlin.String, @Field("key5boolean") key5boolean: kotlin.Boolean, @Field("key6wysiwygadvanced") key6wysiwygadvanced: kotlin.String): Call<Unit>

    @DELETE("/api/v2/content/collections/{collectionId/items/{itemId}")
    fun deleteitem(@Path("collectionId") collectionId: kotlin.Long, @Path("itemId") itemId: kotlin.Long, @Header("X-Application-Id") xminusApplicationMinusId: kotlin.String, @Header("X-Rest-Api-Key") xminusRestMinusApiMinusKey: kotlin.String, @Path("collection_id") collectionId2: kotlin.Int, @Path("item_id") itemId2: kotlin.Int): Call<Unit>

    @FormUrlEncoded
    @POST("/api/v2/content/collections/{collectionId}/items/{itemId}/update")
    fun update(@Path("collectionId") collectionId: kotlin.Long, @Path("itemId") itemId: kotlin.Long, @Header("X-Application-Id") xminusApplicationMinusId: kotlin.String, @Header("X-Rest-Api-Key") xminusRestMinusApiMinusKey: kotlin.String, @Header("Content-Type") contentMinusType: kotlin.String, @Path("collection_id") collectionId2: kotlin.Int, @Path("item_id") itemId2: kotlin.Int, @Field("k0int") k0int: kotlin.Int, @Field("key1string") key1string: kotlin.String, @Field("key2float") key2float: kotlin.Double, @Field("key3wysiwygsim") key3wysiwygsim: kotlin.String, @Field("key4asset") key4asset: kotlin.String, @Field("key5boolean") key5boolean: kotlin.Boolean, @Field("key6wysiwygadvanced") key6wysiwygadvanced: kotlin.String): Call<Unit>

    @GET("/api/v2/content/collections/{collectionId}")
    fun view(@Path("collectionId") collectionId: kotlin.Long, @Header("X-Application-Id") xminusApplicationMinusId: kotlin.String, @Header("X-Rest-Api-Key") xminusRestMinusApiMinusKey: kotlin.String, @Path("collection_id") collectionId2: kotlin.Int): Call<Unit>

    @GET("/api/v2/content/collections/{collectionId}/items/{itemId}")
    fun viewitem(@Path("collectionId") collectionId: kotlin.Long, @Path("itemId") itemId: kotlin.Long, @Header("X-Application-Id") xminusApplicationMinusId: kotlin.String, @Header("X-Rest-Api-Key") xminusRestMinusApiMinusKey: kotlin.String, @Path("collection_id") collectionId2: kotlin.Int, @Path("item_id") itemId2: kotlin.Int): Call<Unit>

}

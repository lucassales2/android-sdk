package dk.nodes.nstack.kotlin.codegen.api

import org.openapitools.client.infrastructure.CollectionFormats.*
import retrofit2.http.*
import retrofit2.Call
import okhttp3.RequestBody
import okhttp3.ResponseBody
import okhttp3.MultipartBody

import dk.nodes.nstack.kotlin.codegen.model.AppopenV2

interface AdminAPIApi {
    @GET("/admin/search/company-applications")
    fun search(@Query("q") q: kotlin.String, @Header("Authorization") authorization: kotlin.String, @Header("Content-Type") contentMinusType: kotlin.String): Call<AppopenV2>

}

package dk.nodes.nstack.kotlin.codegen.api

import org.openapitools.client.infrastructure.CollectionFormats.*
import retrofit2.http.*
import retrofit2.Call
import okhttp3.RequestBody
import okhttp3.ResponseBody
import okhttp3.MultipartBody


interface DashboardsApi {
    @GET("/api/v2/content/dashboards/DAS-ad21e084-ae03-4486-a5ec-d837dfc56fd2")
    fun dashboard(@Header("X-Application-Id") xminusApplicationMinusId: kotlin.String, @Header("X-Rest-Api-Key") xminusRestMinusApiMinusKey: kotlin.String, @Header("Content-Type") contentMinusType: kotlin.String): Call<Unit>

    @GET("/api/v2/content/dashboards/visualizations/visualization-5d0dbc254bc83")
    fun visualization(@Header("X-Application-Id") xminusApplicationMinusId: kotlin.String, @Header("X-Rest-Api-Key") xminusRestMinusApiMinusKey: kotlin.String, @Header("Content-Type") contentMinusType: kotlin.String): Call<Unit>

}

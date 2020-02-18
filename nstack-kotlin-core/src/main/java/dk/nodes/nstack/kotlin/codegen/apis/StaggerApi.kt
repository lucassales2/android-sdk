/**
 * NOTE: This class is auto generated by the Swagger Gradle Codegen for the following API: API
 *
 * More info on this tool is available on https://github.com/Yelp/swagger-gradle-codegen
 */

package dk.nodes.nstack.kotlin.codegen.apis

import okhttp3.RequestBody

import io.reactivex.Completable
import retrofit2.http.Headers
import retrofit2.http.POST

@JvmSuppressWildcards
interface StaggerApi {
  /** 
   * Get tag
   * Get a tag from a text (Feedback / bug report)   **Initial response time can be 15sec in case you hit a cold container**   #### Request details Method: `POST`  URL: `api/v2/content/stagger`  #### Headers `X-Application-Id` (string) **required** _Application ID from [NStack](https://nstack.io)_  `X-Rest-Api-Key` (string) **required** _Rest API key from [NStack](https://nstack.io)_  #### Post params `text` (string) **required**  `data-center` (string) **optional, default: aws:ireland** **(Options: aws:ireland)**   #### Response codes(s) `200` OK  `412` Validation error  `500` Internal server error _Please read response message_
   * The endpoint is owned by NStack v2 service owner
   * @param text  (required)
   * @param dataCenter  (required)
   */
  @retrofit2.http.FormUrlEncoded
  @Headers(
    "X-Operation-Id: Gettag"
  )
  @POST("api/v2/stagger")
  fun gettag(
    @retrofit2.http.Field("text") text: String,
    @retrofit2.http.Field("data-center") dataCenter: String
  ): Completable

}
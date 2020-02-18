/**
 * NOTE: This class is auto generated by the Swagger Gradle Codegen for the following API: API
 *
 * More info on this tool is available on https://github.com/Yelp/swagger-gradle-codegen
 */

package dk.nodes.nstack.kotlin.codegen.apis

import okhttp3.RequestBody

import dk.nodes.nstack.kotlin.codegen.models.Messages
import io.reactivex.Completable
import io.reactivex.Single
import retrofit2.http.GET
import retrofit2.http.Headers
import retrofit2.http.POST

@JvmSuppressWildcards
interface MessagesApi {
  /** 
   * Mark as seen
   * Register a view update  #### Request details Method: `POST`  URL: `/api/v2/notify/updates/views`  #### Headers  `X-Application-Id` (string) **required** _Application ID from [NStack](https://nstack.io)_  `X-Rest-Api-Key` (string) **required** _Rest API key from [NStack](https://nstack.io)_  #### Parameters `guid` (int) **required** _[?]_  `message_id` **required** _[?]_  #### Response codes `200` OK  `412` Precondition failed
   * The endpoint is owned by NStack v2 service owner
   * @param guid  (required)
   * @param messageId  (required)
   */
  @retrofit2.http.FormUrlEncoded
  @Headers(
    "X-Operation-Id: Markasseen"
  )
  @POST("api/v2/notify/messages/views")
  fun markasseen(
    @retrofit2.http.Field("guid") guid: Int,
    @retrofit2.http.Field("message_id") messageId: Int
  ): Completable

  /** 
   * Messages
   * Get message  #### Request details Method:    `GET`  URL:    `/api/v1/notify/messages`  #### Headers  `X-Application-Id` (string) **required** _Application ID from [NStack](https://nstack.io)_  `X-Rest-Api-Key` (string) **required** _Rest API key from [NStack](https://nstack.io)_  #### Query parameters `platform` (string) **required** _[\"ios\", \"android\", \"windows\", \"web\"]_   #### Response codes `200` OK  `412` Precondition failed
   * The endpoint is owned by NStack v2 service owner
   * @param platform  (required)
   */
  @Headers(
    "X-Operation-Id: Messages",
    "Content-Type: application/json"
  )
  @GET("api/v2/notify/messages")
  fun messages(
    @retrofit2.http.Query("platform") platform: String
  ): Single<Messages>

  /** 
   * Messages1
   * Get message  #### Request details Method:    `GET`  URL:    `/api/v1/notify/messages`  #### Headers  `X-Application-Id` (string) **required** _Application ID from [NStack](https://nstack.io)_  `X-Rest-Api-Key` (string) **required** _Rest API key from [NStack](https://nstack.io)_  #### Query parameters `platform` (string) **required** _[\"ios\", \"android\", \"windows\", \"web\"]_   #### Response codes `200` OK  `412` Precondition failed
   * The endpoint is owned by NStack v2 service owner
   * @param platform  (required)
   */
  @Headers(
    "X-Operation-Id: Messages1",
    "Content-Type: application/json"
  )
  @GET("api/v1/notify/messages")
  fun messages1(
    @retrofit2.http.Query("platform") platform: String
  ): Single<Messages>

  /** 
   * View message
   * Register a view update  #### Request details Method: `POST`  URL: `/api/v1/notify/updates/views`  #### Headers  `X-Application-Id` (string) **required** _Application ID from [NStack](https://nstack.io)_  `X-Rest-Api-Key` (string) **required** _Rest API key from [NStack](https://nstack.io)_  #### Parameters `guid` (int) **required** _[?]_  `message_id` **required** _[?]_  #### Response codes `200` OK  `412` Precondition failed
   * The endpoint is owned by NStack v2 service owner
   * @param guid  (required)
   * @param messageId  (required)
   */
  @retrofit2.http.FormUrlEncoded
  @Headers(
    "X-Operation-Id: Viewmessage"
  )
  @POST("api/v1/notify/messages/views")
  fun viewmessage(
    @retrofit2.http.Field("guid") guid: Int,
    @retrofit2.http.Field("message_id") messageId: Int
  ): Completable

}
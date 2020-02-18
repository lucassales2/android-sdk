/**
 * NOTE: This class is auto generated by the Swagger Gradle Codegen for the following API: API
 *
 * More info on this tool is available on https://github.com/Yelp/swagger-gradle-codegen
 */

package dk.nodes.nstack.kotlin.codegen.apis

import okhttp3.RequestBody

import io.reactivex.Completable
import retrofit2.http.GET
import retrofit2.http.Headers

@JvmSuppressWildcards
interface IPAddressesApi {
  /** 
   * Show1
   * Retrieve details based on the requestee's ip address  #### Request details Method:    `GET`  URL:    `/api/v1/geographic/ip-address`  #### Headers  `X-Application-Id` (string) **required** _Application ID from [NStack](https://nstack.io)_  `X-Rest-Api-Key` (string) **required** _Rest API key from [NStack](https://nstack.io)_  #### Query parameters (filters) `ip` (string) _Eg: [1.2.3.4] Default is your own_  #### Response codes(s) `200` OK  `445` Entity not found
   * The endpoint is owned by NStack v2 service owner
   * @param ip  (required)
   */
  @Headers(
    "X-Operation-Id: GetShow112",
    "Content-Type: application/json"
  )
  @GET("api/v1/geographic/ip-address")
  fun getShow112(
    @retrofit2.http.Query("ip") ip: String
  ): Completable

  /** 
   * Show
   * Retrieve details based on the requestee's ip address  #### Request details Method:    `GET`  URL:    `/api/v2/geographic/ip-address`  #### Headers  `X-Application-Id` (string) **required** _Application ID from [NStack](https://nstack.io)_  `X-Rest-Api-Key` (string) **required** _Rest API key from [NStack](https://nstack.io)_  #### Query parameters (filters) `ip` (string) _Eg: [1.2.3.4] Default is your own_  #### Response codes(s) `200` OK  `404` Entity not found
   * The endpoint is owned by NStack v2 service owner
   * @param ip  (required)
   */
  @Headers(
    "X-Operation-Id: GetShow12345",
    "Content-Type: application/json"
  )
  @GET("api/v2/geographic/ip-address")
  fun getShow12345(
    @retrofit2.http.Query("ip") ip: String
  ): Completable

}
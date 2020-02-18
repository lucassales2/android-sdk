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
interface CountriesApi {
  /** 
   * Index
   * Retrieve a list of valid countries on Earth  #### Request details Method:    `GET`  URL:    `/api/v2/geographic/countries`  #### Headers  `X-Application-Id` (string) **required** _Application ID from [NStack](https://nstack.io)_  `X-Rest-Api-Key` (string) **required** _Rest API key from [NStack](https://nstack.io)_  #### Query parameters (filters) `limit` (int) _Eg: [/api/geographic/countries?limit=1] Default limit is 500_  `order_by_column` (string) _Eg; [/api/geographic/countries?order\\_by\\_column=name]_  `order_by_direction` (string) _Eg; [/api/geographic/countries?order\\_by\\_direction=asc]_  `search` (string) _Eg: [/api/geographic/countries?search=Andorra]_  `fields` (string) _Eg: [/api/geographic/countries?fields=name,code]_  `continents` (string) _Eg: [/api/geographic/countries?continents=EU,AF]_  #### Response codes(s) `200` OK  `412` Precondition failed _Invalid filters_
   * The endpoint is owned by NStack v2 service owner
   */
  @Headers(
    "X-Operation-Id: GetIndex1",
    "Content-Type: application/json"
  )
  @GET("api/v2/geographic/countries")
  fun getIndex1()
    : Completable

  /** 
   * Index1
   * Retrieve a list of valid countries on Earth  #### Request details Method:    `GET`  URL:    `/api/v1/geographic/countries`  #### Headers  `X-Application-Id` (string) **required** _Application ID from [NStack](https://nstack.io)_  `X-Rest-Api-Key` (string) **required** _Rest API key from [NStack](https://nstack.io)_  #### Query parameters (filters) `limit` (int) _Eg: [/api/geographic/countries?limit=1] Default limit is 500_  `order_by_column` (string) _Eg; [/api/geographic/countries?order\\_by\\_column=name]_  `order_by_direction` (string) _Eg; [/api/geographic/countries?order\\_by\\_direction=asc]_  `search` (string) _Eg: [/api/geographic/countries?search=Andorra]_  `fields` (string) _Eg: [/api/geographic/countries?fields=name,code]_  `continents` (string) _Eg: [/api/geographic/countries?continents=EU,AF]_  #### Response codes(s) `200` OK  `412` Precondition failed _Invalid filters_ 
   * The endpoint is owned by NStack v2 service owner
   */
  @Headers(
    "X-Operation-Id: GetIndex11",
    "Content-Type: application/json"
  )
  @GET("api/v1/geographic/countries")
  fun getIndex11()
    : Completable

  /** 
   * Show1
   * Retrieve details of a specific country on Earth  #### Request details Method:    `GET`  URL:    `/api/v1/geographic/countries/{id}`  #### Headers `X-Application-Id` (string) **required** _Application ID from [NStack](https://nstack.io)_  `X-Rest-Api-Key` (string) **required** _Rest API key from [NStack](https://nstack.io)_  #### URL Parameters `id` (int) **required** _Country id_  #### Response codes(s) `200` OK  `445` Entity not found
   * The endpoint is owned by NStack v2 service owner
   */
  @Headers(
    "X-Operation-Id: GetShow11",
    "Content-Type: application/json"
  )
  @GET("api/v1/geographic/countries/1")
  fun getShow11()
    : Completable

  /** 
   * Show
   * Retrieve details of a specific country on Earth  #### Request details Method:    `GET`  URL:    `/api/v2/geographic/countries/{id}`  #### Headers `X-Application-Id` (string) **required** _Application ID from [NStack](https://nstack.io)_  `X-Rest-Api-Key` (string) **required** _Rest API key from [NStack](https://nstack.io)_  #### URL Parameters `id` (int) **required** _Country id_  #### Response codes(s) `200` OK  `404` Entity not found
   * The endpoint is owned by NStack v2 service owner
   */
  @Headers(
    "X-Operation-Id: GetShow1234",
    "Content-Type: application/json"
  )
  @GET("api/v2/geographic/countries/4")
  fun getShow1234()
    : Completable

}
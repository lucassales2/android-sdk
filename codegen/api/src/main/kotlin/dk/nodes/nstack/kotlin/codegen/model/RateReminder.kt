/**
* API
* This is the public API for nstack.io  Setup an application and use Application-Id and Rest-Api-Key
*
* The version of the OpenAPI document: 2.5
* 
*
* NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
* https://openapi-generator.tech
* Do not edit the class manually.
*/
package dk.nodes.nstack.kotlin.codegen.model


import com.squareup.moshi.Json
/**
 * 
 * @param title 
 * @param body 
 * @param yesBtn 
 * @param laterBtn 
 * @param noBtn 
 * @param link 
 */

data class RateReminder (
    @Json(name = "title")
    val title: kotlin.String,
    @Json(name = "body")
    val body: kotlin.String,
    @Json(name = "yesBtn")
    val yesBtn: kotlin.String,
    @Json(name = "laterBtn")
    val laterBtn: kotlin.String,
    @Json(name = "noBtn")
    val noBtn: kotlin.String,
    @Json(name = "link")
    val link: kotlin.String
) 




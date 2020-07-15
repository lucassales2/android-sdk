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
 * @param id 
 * @param version 
 * @param update 
 * @param newInVersion 
 * @param changeLog 
 * @param fileUrl 
 */

data class UpdateVersion (
    @Json(name = "id")
    val id: kotlin.Int,
    @Json(name = "version")
    val version: kotlin.String,
    @Json(name = "update")
    val update: kotlin.String,
    @Json(name = "new_in_version")
    val newInVersion: kotlin.Boolean,
    @Json(name = "change_log")
    val changeLog: kotlin.String? = null,
    @Json(name = "file_url")
    val fileUrl: kotlin.String? = null
) 




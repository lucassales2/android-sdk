/**
 * NOTE: This class is auto generated by the Swagger Gradle Codegen for the following API: API
 *
 * More info on this tool is available on https://github.com/Yelp/swagger-gradle-codegen
 */

package dk.nodes.nstack.kotlin.codegen.models

import com.squareup.moshi.Json

/**
 * 
 * @property id 
 * @property message 
 * @property showSetting 
 */
data class Data3 (
        @Json(name = "id") @field:Json(name = "id") var id: Int,
        @Json(name = "message") @field:Json(name = "message") var message: String,
        @Json(name = "show_setting") @field:Json(name = "show_setting") var showSetting: String
)

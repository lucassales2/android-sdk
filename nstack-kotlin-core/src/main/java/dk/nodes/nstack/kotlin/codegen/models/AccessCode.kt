/**
 * NOTE: This class is auto generated by the Swagger Gradle Codegen for the following API: API
 *
 * More info on this tool is available on https://github.com/Yelp/swagger-gradle-codegen
 */

package dk.nodes.nstack.kotlin.codegen.models

import com.squareup.moshi.Json

/**
 * 
 * @property headerTitle 
 * @property content 
 * @property skip 
 * @property placeholder 
 * @property invalidTitle 
 * @property invalidMessage 
 */
data class AccessCode (
        @Json(name = "headerTitle") @field:Json(name = "headerTitle") var headerTitle: String,
        @Json(name = "content") @field:Json(name = "content") var content: String,
        @Json(name = "skip") @field:Json(name = "skip") var skip: String,
        @Json(name = "placeholder") @field:Json(name = "placeholder") var placeholder: String,
        @Json(name = "invalidTitle") @field:Json(name = "invalidTitle") var invalidTitle: String,
        @Json(name = "invalidMessage") @field:Json(name = "invalidMessage") var invalidMessage: String
)

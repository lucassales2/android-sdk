/**
 * NOTE: This class is auto generated by the Swagger Gradle Codegen for the following API: API
 *
 * More info on this tool is available on https://github.com/Yelp/swagger-gradle-codegen
 */

package dk.nodes.nstack.kotlin.codegen.models

import com.squareup.moshi.Json

/**
 * 
 * @property type 
 * @property tattooShop 
 * @property artist 
 * @property standard 
 */
data class CreateUser3 (
        @Json(name = "type") @field:Json(name = "type") var type: String,
        @Json(name = "tattooShop") @field:Json(name = "tattooShop") var tattooShop: String,
        @Json(name = "artist") @field:Json(name = "artist") var artist: String,
        @Json(name = "standard") @field:Json(name = "standard") var standard: String
)

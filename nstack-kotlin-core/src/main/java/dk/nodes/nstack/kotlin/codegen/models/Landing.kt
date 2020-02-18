/**
 * NOTE: This class is auto generated by the Swagger Gradle Codegen for the following API: API
 *
 * More info on this tool is available on https://github.com/Yelp/swagger-gradle-codegen
 */

package dk.nodes.nstack.kotlin.codegen.models

import com.squareup.moshi.Json

/**
 * 
 * @property hello 
 * @property there 
 * @property landingDescription 
 * @property iAmProfessional 
 * @property letsGo 
 */
data class Landing (
        @Json(name = "hello") @field:Json(name = "hello") var hello: String,
        @Json(name = "there") @field:Json(name = "there") var there: String,
        @Json(name = "landingDescription") @field:Json(name = "landingDescription") var landingDescription: String,
        @Json(name = "iAmProfessional") @field:Json(name = "iAmProfessional") var iAmProfessional: String,
        @Json(name = "letsGo") @field:Json(name = "letsGo") var letsGo: String
)

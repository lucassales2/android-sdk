/**
 * NOTE: This class is auto generated by the Swagger Gradle Codegen for the following API: API
 *
 * More info on this tool is available on https://github.com/Yelp/swagger-gradle-codegen
 */

package dk.nodes.nstack.kotlin.codegen.models

import com.squareup.moshi.Json

/**
 * 
 * @property discoverMore 
 * @property tattoos 
 */
data class EndOfFeed (
        @Json(name = "discoverMore") @field:Json(name = "discoverMore") var discoverMore: String,
        @Json(name = "tattoos") @field:Json(name = "tattoos") var tattoos: String
)

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
 * @property name 
 * @property locale 
 * @property direction 
 * @property isDefault 
 * @property isBestFit 
 */
data class Data (
        @Json(name = "id") @field:Json(name = "id") var id: Int,
        @Json(name = "name") @field:Json(name = "name") var name: String,
        @Json(name = "locale") @field:Json(name = "locale") var locale: String,
        @Json(name = "direction") @field:Json(name = "direction") var direction: String,
        @Json(name = "is_default") @field:Json(name = "is_default") var isDefault: Boolean,
        @Json(name = "is_best_fit") @field:Json(name = "is_best_fit") var isBestFit: Boolean
)

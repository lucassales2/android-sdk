/**
 * NOTE: This class is auto generated by the Swagger Gradle Codegen for the following API: API
 *
 * More info on this tool is available on https://github.com/Yelp/swagger-gradle-codegen
 */

package dk.nodes.nstack.kotlin.codegen.models

import com.squareup.moshi.Json

/**
 * 
 * @property noLanguageConnection 
 * @property noLanguages 
 * @property noPlatforms 
 * @property platformIsInProduction 
 */
data class TranslateErrors (
        @Json(name = "noLanguageConnection") @field:Json(name = "noLanguageConnection") var noLanguageConnection: String,
        @Json(name = "noLanguages") @field:Json(name = "noLanguages") var noLanguages: String,
        @Json(name = "noPlatforms") @field:Json(name = "noPlatforms") var noPlatforms: String,
        @Json(name = "platformIsInProduction") @field:Json(name = "platformIsInProduction") var platformIsInProduction: String
)

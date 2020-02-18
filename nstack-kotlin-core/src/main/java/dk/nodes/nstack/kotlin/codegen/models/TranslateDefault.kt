/**
 * NOTE: This class is auto generated by the Swagger Gradle Codegen for the following API: API
 *
 * More info on this tool is available on https://github.com/Yelp/swagger-gradle-codegen
 */

package dk.nodes.nstack.kotlin.codegen.models

import com.squareup.moshi.Json

/**
 * 
 * @property autoRedirectToFirstPlatform 
 * @property direction 
 * @property inProduction 
 * @property key 
 * @property keys 
 * @property language 
 * @property languages 
 * @property locale 
 * @property lrm 
 * @property platforms 
 * @property rlm 
 * @property section 
 * @property sections 
 * @property theKey 
 * @property theLanguage 
 * @property thePlatform 
 * @property theSection 
 * @property theTranslation 
 * @property translated 
 * @property translation 
 * @property value 
 */
data class TranslateDefault (
        @Json(name = "autoRedirectToFirstPlatform") @field:Json(name = "autoRedirectToFirstPlatform") var autoRedirectToFirstPlatform: String,
        @Json(name = "direction") @field:Json(name = "direction") var direction: String,
        @Json(name = "inProduction") @field:Json(name = "inProduction") var inProduction: String,
        @Json(name = "key") @field:Json(name = "key") var key: String,
        @Json(name = "keys") @field:Json(name = "keys") var keys: String,
        @Json(name = "language") @field:Json(name = "language") var language: String,
        @Json(name = "languages") @field:Json(name = "languages") var languages: String,
        @Json(name = "locale") @field:Json(name = "locale") var locale: String,
        @Json(name = "lrm") @field:Json(name = "lrm") var lrm: String,
        @Json(name = "platforms") @field:Json(name = "platforms") var platforms: String,
        @Json(name = "rlm") @field:Json(name = "rlm") var rlm: String,
        @Json(name = "section") @field:Json(name = "section") var section: String,
        @Json(name = "sections") @field:Json(name = "sections") var sections: String,
        @Json(name = "theKey") @field:Json(name = "theKey") var theKey: String,
        @Json(name = "theLanguage") @field:Json(name = "theLanguage") var theLanguage: String,
        @Json(name = "thePlatform") @field:Json(name = "thePlatform") var thePlatform: String,
        @Json(name = "theSection") @field:Json(name = "theSection") var theSection: String,
        @Json(name = "theTranslation") @field:Json(name = "theTranslation") var theTranslation: String,
        @Json(name = "translated") @field:Json(name = "translated") var translated: String,
        @Json(name = "translation") @field:Json(name = "translation") var translation: String,
        @Json(name = "value") @field:Json(name = "value") var value: String
)

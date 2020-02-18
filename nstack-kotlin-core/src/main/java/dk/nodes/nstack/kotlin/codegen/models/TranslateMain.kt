/**
 * NOTE: This class is auto generated by the Swagger Gradle Codegen for the following API: API
 *
 * More info on this tool is available on https://github.com/Yelp/swagger-gradle-codegen
 */

package dk.nodes.nstack.kotlin.codegen.models

import com.squareup.moshi.Json

/**
 * 
 * @property addSectionBtn 
 * @property addSectionTitle 
 * @property cacheFlushedSuccess 
 * @property deleteKeyModalText 
 * @property deleteSectionEmptyKeysModelText 
 * @property deleteSectionModalText 
 * @property flushCache 
 * @property updateValueModalTitle 
 */
data class TranslateMain (
        @Json(name = "addSectionBtn") @field:Json(name = "addSectionBtn") var addSectionBtn: String,
        @Json(name = "addSectionTitle") @field:Json(name = "addSectionTitle") var addSectionTitle: String,
        @Json(name = "cacheFlushedSuccess") @field:Json(name = "cacheFlushedSuccess") var cacheFlushedSuccess: String,
        @Json(name = "deleteKeyModalText") @field:Json(name = "deleteKeyModalText") var deleteKeyModalText: String,
        @Json(name = "deleteSectionEmptyKeysModelText") @field:Json(name = "deleteSectionEmptyKeysModelText") var deleteSectionEmptyKeysModelText: String,
        @Json(name = "deleteSectionModalText") @field:Json(name = "deleteSectionModalText") var deleteSectionModalText: String,
        @Json(name = "flushCache") @field:Json(name = "flushCache") var flushCache: String,
        @Json(name = "updateValueModalTitle") @field:Json(name = "updateValueModalTitle") var updateValueModalTitle: String
)

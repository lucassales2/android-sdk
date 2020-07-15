# LocalizeApi

All URIs are relative to *https://nstack.io*

Method | HTTP request | Description
------------- | ------------- | -------------
[**deleteproposal**](LocalizeApi.md#deleteproposal) | **DELETE** /api/v2/content/localize/proposals/9 | Deleteproposal
[**indexlanguages**](LocalizeApi.md#indexlanguages) | **GET** /api/v2/content/localize/mobile/languages | Indexlanguages
[**indexproposal**](LocalizeApi.md#indexproposal) | **GET** /api/v2/content/localize/proposals | Indexproposal
[**indexresource**](LocalizeApi.md#indexresource) | **GET** /api/v2/content/localize/resources/platforms/mobile | Indexresource
[**languagebestfit**](LocalizeApi.md#languagebestfit) | **GET** /api/v2/content/localize/mobile/languages/best_fit | Languagebestfit
[**showresource**](LocalizeApi.md#showresource) | **GET** /api/v2/content/localize/resources/44 | Showresource
[**storeproposal**](LocalizeApi.md#storeproposal) | **POST** /api/v2/content/localize/proposals | Storeproposal


<a name="deleteproposal"></a>
# **deleteproposal**
> deleteproposal(guid, xminusApplicationMinusId, xminusRestMinusApiMinusKey)

Deleteproposal

Delete a specified proposal  #### Request details  Method:    &#x60;DELETE&#x60;  URL:    &#x60;{{nstackUrl}}/api/v2/content/localize/proposals/{{proposalId}}&#x60;  #### Headers   &#x60;X-Application-Id&#x60;  &#x60;X-Rest-Api-Key&#x60;  #### Query params &#x60;guid&#x60; (string) **required**  #### URL Parameters &#x60;proposalId&#x60; (int) **required**  #### Response codes(s)  &#x60;200&#x60; OK  &#x60;404&#x60; Entity not found  &#x60;401&#x60; Invalid guid

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import dk.nodes.nstack.kotlin.codegen.model.*

val apiInstance = LocalizeApi()
val guid : kotlin.String = guid_example // kotlin.String | 
val xminusApplicationMinusId : kotlin.String = xminusApplicationMinusId_example // kotlin.String | 
val xminusRestMinusApiMinusKey : kotlin.String = xminusRestMinusApiMinusKey_example // kotlin.String | 
try {
    apiInstance.deleteproposal(guid, xminusApplicationMinusId, xminusRestMinusApiMinusKey)
} catch (e: ClientException) {
    println("4xx response calling LocalizeApi#deleteproposal")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling LocalizeApi#deleteproposal")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **guid** | **kotlin.String**|  |
 **xminusApplicationMinusId** | **kotlin.String**|  |
 **xminusRestMinusApiMinusKey** | **kotlin.String**|  |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="indexlanguages"></a>
# **indexlanguages**
> Indexlanguages indexlanguages(xminusApplicationMinusId, xminusRestMinusApiMinusKey)

Indexlanguages

Get available languages for a platfom  #### Request details  Method:    &#x60;GET&#x60;  URL:    &#x60;/api/v1/content/localize/{platform-slug}/languages&#x60;  #### Headers   &#x60;X-Application-Id&#x60;  &#x60;X-Rest-Api-Key&#x60;  #### Query params &#x60;show_inactive_languages&#x60; (bool)  #### URL Parameters &#x60;platform-slug&#x60; (string) **required**  #### Response codes(s)  &#x60;200&#x60; OK  &#x60;404&#x60; Entity not found

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import dk.nodes.nstack.kotlin.codegen.model.*

val apiInstance = LocalizeApi()
val xminusApplicationMinusId : kotlin.String = xminusApplicationMinusId_example // kotlin.String | 
val xminusRestMinusApiMinusKey : kotlin.String = xminusRestMinusApiMinusKey_example // kotlin.String | 
try {
    val result : Indexlanguages = apiInstance.indexlanguages(xminusApplicationMinusId, xminusRestMinusApiMinusKey)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling LocalizeApi#indexlanguages")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling LocalizeApi#indexlanguages")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **xminusApplicationMinusId** | **kotlin.String**|  |
 **xminusRestMinusApiMinusKey** | **kotlin.String**|  |

### Return type

**Indexlanguages**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="indexproposal"></a>
# **indexproposal**
> indexproposal(xminusApplicationMinusId, xminusRestMinusApiMinusKey)

Indexproposal

#### Request details  Method:    &#x60;GET&#x60;  URL:    &#x60;/api/v2/content/localize/proposals&#x60;  #### Post params &#x60;state&#x60; (string) **optional, default unaccepted** *Options: unaccepted, accepted, all*  &#x60;guid&#x60; (string) **optional** shows if the proposal is deletable or not for the specified guid  #### Response codes(s)  &#x60;200&#x60; OK

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import dk.nodes.nstack.kotlin.codegen.model.*

val apiInstance = LocalizeApi()
val xminusApplicationMinusId : kotlin.String = xminusApplicationMinusId_example // kotlin.String | 
val xminusRestMinusApiMinusKey : kotlin.String = xminusRestMinusApiMinusKey_example // kotlin.String | 
try {
    apiInstance.indexproposal(xminusApplicationMinusId, xminusRestMinusApiMinusKey)
} catch (e: ClientException) {
    println("4xx response calling LocalizeApi#indexproposal")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling LocalizeApi#indexproposal")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **xminusApplicationMinusId** | **kotlin.String**|  |
 **xminusRestMinusApiMinusKey** | **kotlin.String**|  |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="indexresource"></a>
# **indexresource**
> Indexresource indexresource(xminusApplicationMinusId, xminusRestMinusApiMinusKey)

Indexresource

#### Request details  Method:    &#x60;GET&#x60;  URL:    &#x60;/api/v2/content/localize/resources/platforms/{platformSlug}&#x60;  ### Url param  &#x60;platformSlug&#x60; (string) **required** *eg: mobile, backend, web*  #### Headers  &#x60;X-Application-Id&#x60; (string) **required** _Application ID from [NStack](https://nstack.io)_  &#x60;X-Rest-Api-Key&#x60; (string) **required** _Rest API key from [NStack](https://nstack.io)_   ### Query  &#x60;last_updated&#x60; (date time, ISO8601) **optional** *eg: 2019-06-21T08%3A35%3A24%2B00%3A00*  - *Remember to url encode it*  - *Set timestamp from last app open (when localization has been synced), this will calculate which localizations should be updated*  &#x60;dev&#x60; (bool) **option, default false**  - *if true, bypass publishes and only use newest resource (set of key/values)*   #### Response codes(s)  &#x60;200&#x60; OK  &#x60;404&#x60; platform not found

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import dk.nodes.nstack.kotlin.codegen.model.*

val apiInstance = LocalizeApi()
val xminusApplicationMinusId : kotlin.String = xminusApplicationMinusId_example // kotlin.String | 
val xminusRestMinusApiMinusKey : kotlin.String = xminusRestMinusApiMinusKey_example // kotlin.String | 
try {
    val result : Indexresource = apiInstance.indexresource(xminusApplicationMinusId, xminusRestMinusApiMinusKey)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling LocalizeApi#indexresource")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling LocalizeApi#indexresource")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **xminusApplicationMinusId** | **kotlin.String**|  |
 **xminusRestMinusApiMinusKey** | **kotlin.String**|  |

### Return type

**Indexresource**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="languagebestfit"></a>
# **languagebestfit**
> Languagebestfit languagebestfit(xminusApplicationMinusId, xminusRestMinusApiMinusKey)

Languagebestfit

Get best fit language from accept-language header  #### Request details Method:    &#x60;GET&#x60;  URL:    &#x60;/api/v1/content/localize/{platform-slug}/languages/best_fit&#x60;  #### Headers  &#x60;X-Application-Id&#x60;  &#x60;X-Rest-Api-Key&#x60;  &#x60;Accept-Language or X-Accept-Language&#x60;  #### URL Parameters &#x60;platform-slug&#x60; (string) **required**  #### Response codes(s)  &#x60;200&#x60; OK  &#x60;404&#x60; Entity not found

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import dk.nodes.nstack.kotlin.codegen.model.*

val apiInstance = LocalizeApi()
val xminusApplicationMinusId : kotlin.String = xminusApplicationMinusId_example // kotlin.String | 
val xminusRestMinusApiMinusKey : kotlin.String = xminusRestMinusApiMinusKey_example // kotlin.String | 
try {
    val result : Languagebestfit = apiInstance.languagebestfit(xminusApplicationMinusId, xminusRestMinusApiMinusKey)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling LocalizeApi#languagebestfit")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling LocalizeApi#languagebestfit")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **xminusApplicationMinusId** | **kotlin.String**|  |
 **xminusRestMinusApiMinusKey** | **kotlin.String**|  |

### Return type

**Languagebestfit**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="showresource"></a>
# **showresource**
> Showresource showresource()

Showresource

#### Request details  Method:    &#x60;GET&#x60;  URL:    &#x60;/api/v2/content/localize/resources/{id}&#x60;  #### Response codes(s)  &#x60;200&#x60; OK  &#x60;404&#x60; Not found

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import dk.nodes.nstack.kotlin.codegen.model.*

val apiInstance = LocalizeApi()
try {
    val result : Showresource = apiInstance.showresource()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling LocalizeApi#showresource")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling LocalizeApi#showresource")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**Showresource**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="storeproposal"></a>
# **storeproposal**
> storeproposal(xminusApplicationMinusId, xminusRestMinusApiMinusKey, key, value, locale, platform, guid, section)

Storeproposal

#### Request details  Method:    &#x60;POST&#x60;  URL:    &#x60;/api/v2/content/localize/proposals&#x60;  #### Post params &#x60;key&#x60; (string) **required**   &#x60;section&#x60; (string) **required**   &#x60;value&#x60; (string) **required**   &#x60;locale&#x60; (string) **required**  *eg: da-DK, en-GB*  &#x60;platform&#x60; (string) **required** *eg: mobile, backend, web*  #### Response codes(s)  &#x60;201&#x60; Created  &#x60;412&#x60; Preconitions failed

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import dk.nodes.nstack.kotlin.codegen.model.*

val apiInstance = LocalizeApi()
val xminusApplicationMinusId : kotlin.String = xminusApplicationMinusId_example // kotlin.String | 
val xminusRestMinusApiMinusKey : kotlin.String = xminusRestMinusApiMinusKey_example // kotlin.String | 
val key : kotlin.String = key_example // kotlin.String | 
val value : kotlin.String = value_example // kotlin.String | 
val locale : kotlin.String = locale_example // kotlin.String | 
val platform : kotlin.String = platform_example // kotlin.String | 
val guid : kotlin.String = guid_example // kotlin.String | 
val section : kotlin.String = section_example // kotlin.String | 
try {
    apiInstance.storeproposal(xminusApplicationMinusId, xminusRestMinusApiMinusKey, key, value, locale, platform, guid, section)
} catch (e: ClientException) {
    println("4xx response calling LocalizeApi#storeproposal")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling LocalizeApi#storeproposal")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **xminusApplicationMinusId** | **kotlin.String**|  |
 **xminusRestMinusApiMinusKey** | **kotlin.String**|  |
 **key** | **kotlin.String**|  |
 **value** | **kotlin.String**|  |
 **locale** | **kotlin.String**|  |
 **platform** | **kotlin.String**|  |
 **guid** | **kotlin.String**|  |
 **section** | **kotlin.String**|  |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: Not defined


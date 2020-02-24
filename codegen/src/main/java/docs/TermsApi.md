# TermsApi

All URIs are relative to *https://nstack-staging.vapor.cloud*

Method | HTTP request | Description
------------- | ------------- | -------------
[**index**](TermsApi.md#index) | **GET** /terms | Index
[**indexversions**](TermsApi.md#indexversions) | **GET** /api/v2/content/terms/some-terms-1/versions | Indexversions
[**newestversion**](TermsApi.md#newestversion) | **GET** /api/v2/content/terms/some-terms-1/versions/newest | Newestversion
[**showversion**](TermsApi.md#showversion) | **GET** /api/v2/content/terms/versions/5 | Showversion
[**storeView**](TermsApi.md#storeView) | **POST** /api/v2/content/terms/versions/views | StoreView


<a name="index"></a>
# **index**
> index(xminusApplicationMinusId, xminusRestMinusApiMinusKey, nminusMeta, acceptMinusLanguage)

Index

List all Terms  #### Request details Method: &#x60;GET&#x60;  URL: &#x60;api/v2/content/terms&#x60;  #### Headers &#x60;X-Application-Id&#x60; (string) **required** _Application ID from [NStack](https://nstack.io)_  &#x60;X-Rest-Api-Key&#x60; (string) **required** _Rest API key from [NStack](https://nstack.io)_   #### Response codes(s) &#x60;200&#x60; OK  &#x60;404&#x60; Entity not found  &#x60;500&#x60; Internal server error _Please read response message_

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import dk.nodes.nstack.kotlin.codegen.model.*

val apiInstance = TermsApi()
val xminusApplicationMinusId : kotlin.String = xminusApplicationMinusId_example // kotlin.String | 
val xminusRestMinusApiMinusKey : kotlin.String = xminusRestMinusApiMinusKey_example // kotlin.String | 
val nminusMeta : kotlin.String = nminusMeta_example // kotlin.String | 
val acceptMinusLanguage : kotlin.String = acceptMinusLanguage_example // kotlin.String | 
try {
    apiInstance.index(xminusApplicationMinusId, xminusRestMinusApiMinusKey, nminusMeta, acceptMinusLanguage)
} catch (e: ClientException) {
    println("4xx response calling TermsApi#index")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TermsApi#index")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **xminusApplicationMinusId** | **kotlin.String**|  |
 **xminusRestMinusApiMinusKey** | **kotlin.String**|  |
 **nminusMeta** | **kotlin.String**|  |
 **acceptMinusLanguage** | **kotlin.String**|  |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="indexversions"></a>
# **indexversions**
> indexversions(xminusApplicationMinusId, xminusRestMinusApiMinusKey, nminusMeta, acceptMinusLanguage)

Indexversions

List all Version  #### Request details Method: &#x60;GET&#x60;  URL: &#x60;api/v2/content/terms/{slugOrId}/versions&#x60;  #### Headers &#x60;X-Application-Id&#x60; (string) **required** _Application ID from [NStack](https://nstack.io)_  &#x60;X-Rest-Api-Key&#x60; (string) **required** _Rest API key from [NStack](https://nstack.io)_  #### Response codes(s) &#x60;200&#x60; OK  &#x60;404&#x60; Entity not found  &#x60;500&#x60; Internal server error _Please read response message_

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import dk.nodes.nstack.kotlin.codegen.model.*

val apiInstance = TermsApi()
val xminusApplicationMinusId : kotlin.String = xminusApplicationMinusId_example // kotlin.String | 
val xminusRestMinusApiMinusKey : kotlin.String = xminusRestMinusApiMinusKey_example // kotlin.String | 
val nminusMeta : kotlin.String = nminusMeta_example // kotlin.String | 
val acceptMinusLanguage : kotlin.String = acceptMinusLanguage_example // kotlin.String | 
try {
    apiInstance.indexversions(xminusApplicationMinusId, xminusRestMinusApiMinusKey, nminusMeta, acceptMinusLanguage)
} catch (e: ClientException) {
    println("4xx response calling TermsApi#indexversions")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TermsApi#indexversions")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **xminusApplicationMinusId** | **kotlin.String**|  |
 **xminusRestMinusApiMinusKey** | **kotlin.String**|  |
 **nminusMeta** | **kotlin.String**|  |
 **acceptMinusLanguage** | **kotlin.String**|  |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="newestversion"></a>
# **newestversion**
> newestversion(xminusApplicationMinusId, xminusRestMinusApiMinusKey, nminusMeta, acceptMinusLanguage)

Newestversion

List all Version  #### Request details Method: &#x60;GET&#x60;  URL: &#x60;api/v2/content/terms/{slugOrId}/versions/newest&#x60;  #### Headers &#x60;X-Application-Id&#x60; (string) **required** _Application ID from [NStack](https://nstack.io)_  &#x60;X-Rest-Api-Key&#x60; (string) **required** _Rest API key from [NStack](https://nstack.io)_  #### Response codes(s) &#x60;200&#x60; OK  &#x60;404&#x60; Entity not found  &#x60;500&#x60; Internal server error _Please read response message_

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import dk.nodes.nstack.kotlin.codegen.model.*

val apiInstance = TermsApi()
val xminusApplicationMinusId : kotlin.String = xminusApplicationMinusId_example // kotlin.String | 
val xminusRestMinusApiMinusKey : kotlin.String = xminusRestMinusApiMinusKey_example // kotlin.String | 
val nminusMeta : kotlin.String = nminusMeta_example // kotlin.String | 
val acceptMinusLanguage : kotlin.String = acceptMinusLanguage_example // kotlin.String | 
try {
    apiInstance.newestversion(xminusApplicationMinusId, xminusRestMinusApiMinusKey, nminusMeta, acceptMinusLanguage)
} catch (e: ClientException) {
    println("4xx response calling TermsApi#newestversion")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TermsApi#newestversion")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **xminusApplicationMinusId** | **kotlin.String**|  |
 **xminusRestMinusApiMinusKey** | **kotlin.String**|  |
 **nminusMeta** | **kotlin.String**|  |
 **acceptMinusLanguage** | **kotlin.String**|  |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="showversion"></a>
# **showversion**
> showversion(guid, xminusApplicationMinusId, xminusRestMinusApiMinusKey, nminusMeta, acceptMinusLanguage)

Showversion

List all Version  #### Request details Method: &#x60;GET&#x60;  URL: &#x60;api/v2/content/terms/versions/{id}&#x60;  #### Headers &#x60;X-Application-Id&#x60; (string) **required** _Application ID from [NStack](https://nstack.io)_  &#x60;X-Rest-Api-Key&#x60; (string) **required** _Rest API key from [NStack](https://nstack.io)_  &#x60;Accept-Language&#x60; (string) **optional** _Set this to get best fit locale_  #### Query params &#x60;guid&#x60; (string) **optional** _If you want &#x60;has_viewed&#x60; to be calculated_  #### Response codes(s) &#x60;200&#x60; OK  &#x60;404&#x60; Entity not found  &#x60;500&#x60; Internal server error _Please read response message_

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import dk.nodes.nstack.kotlin.codegen.model.*

val apiInstance = TermsApi()
val guid : kotlin.String = guid_example // kotlin.String | 
val xminusApplicationMinusId : kotlin.String = xminusApplicationMinusId_example // kotlin.String | 
val xminusRestMinusApiMinusKey : kotlin.String = xminusRestMinusApiMinusKey_example // kotlin.String | 
val nminusMeta : kotlin.String = nminusMeta_example // kotlin.String | 
val acceptMinusLanguage : kotlin.String = acceptMinusLanguage_example // kotlin.String | 
try {
    apiInstance.showversion(guid, xminusApplicationMinusId, xminusRestMinusApiMinusKey, nminusMeta, acceptMinusLanguage)
} catch (e: ClientException) {
    println("4xx response calling TermsApi#showversion")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TermsApi#showversion")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **guid** | **kotlin.String**|  |
 **xminusApplicationMinusId** | **kotlin.String**|  |
 **xminusRestMinusApiMinusKey** | **kotlin.String**|  |
 **nminusMeta** | **kotlin.String**|  |
 **acceptMinusLanguage** | **kotlin.String**|  |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="storeView"></a>
# **storeView**
> storeView(xminusApplicationMinusId, xminusRestMinusApiMinusKey, nminusMeta, acceptMinusLanguage, termVersionId, guid, identifier, locale)

StoreView

Create a new View #### Request details Method: &#x60;POST&#x60;  URL: &#x60;/api/v2/content/terms/versions/{id}/views&#x60;  #### Headers &#x60;X-Application-Id&#x60; (string) **required** _Application ID from [NStack](https://nstack.io)_  &#x60;X-Rest-Api-Key&#x60; (string) **required** _Rest API key from [NStack](https://nstack.io)_  #### Post params &#x60;term_version_id&#x60; (int) **required** _ID of Terms Version_  &#x60;guid&#x60; (string) **required** _GUID_  &#x60;identifier&#x60; (string) **required**  &#x60;locale&#x60; (string) **required**  #### Response codes(s) &#x60;200&#x60; OK  &#x60;412&#x60; Precondition failed _Please read response message_  &#x60;500&#x60; Internal server error _Please read response message_

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import dk.nodes.nstack.kotlin.codegen.model.*

val apiInstance = TermsApi()
val xminusApplicationMinusId : kotlin.String = xminusApplicationMinusId_example // kotlin.String | 
val xminusRestMinusApiMinusKey : kotlin.String = xminusRestMinusApiMinusKey_example // kotlin.String | 
val nminusMeta : kotlin.String = nminusMeta_example // kotlin.String | 
val acceptMinusLanguage : kotlin.String = acceptMinusLanguage_example // kotlin.String | 
val termVersionId : kotlin.Int = 56 // kotlin.Int | 
val guid : kotlin.String = guid_example // kotlin.String | 
val identifier : kotlin.String = identifier_example // kotlin.String | 
val locale : kotlin.String = locale_example // kotlin.String | 
try {
    apiInstance.storeView(xminusApplicationMinusId, xminusRestMinusApiMinusKey, nminusMeta, acceptMinusLanguage, termVersionId, guid, identifier, locale)
} catch (e: ClientException) {
    println("4xx response calling TermsApi#storeView")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TermsApi#storeView")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **xminusApplicationMinusId** | **kotlin.String**|  |
 **xminusRestMinusApiMinusKey** | **kotlin.String**|  |
 **nminusMeta** | **kotlin.String**|  |
 **acceptMinusLanguage** | **kotlin.String**|  |
 **termVersionId** | **kotlin.Int**|  |
 **guid** | **kotlin.String**|  |
 **identifier** | **kotlin.String**|  |
 **locale** | **kotlin.String**|  |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: Not defined


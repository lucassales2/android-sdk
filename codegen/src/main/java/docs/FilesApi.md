# FilesApi

All URIs are relative to *https://nstack-staging.vapor.cloud*

Method | HTTP request | Description
------------- | ------------- | -------------
[**store**](FilesApi.md#store) | **POST** /api/v2/content/files | Store
[**storewithpath**](FilesApi.md#storewithpath) | **POST** /api/v1/content/files | Storewithpath


<a name="store"></a>
# **store**
> store(xminusApplicationMinusId, xminusRestMinusApiMinusKey, contentMinusType, name, tags, goneAt, file, privacy)

Store

Store a file  #### Request details Method: &#x60;POST&#x60;  URL: &#x60;api/v2/content/files&#x60;  #### Headers &#x60;X-Application-Id&#x60; (string) **required** _Application ID from [NStack](https://nstack.io)_  &#x60;X-Rest-Api-Key&#x60; (string) **required** _Rest API key from [NStack](https://nstack.io)_  #### Post params &#x60;name&#x60; (string) **required**   &#x60;tags&#x60; (string, comma seperated) **optional**   &#x60;gone_at&#x60; (date-time 2019-01-01 00:00:00) **optional**   &#x60;privacy&#x60; (string [public,public-cdn,private,private-password]) **required**   &#x60;file&#x60; (file, max 30mb) **required**   #### Response codes(s) &#x60;200&#x60; OK  &#x60;412&#x60; Validation error  &#x60;500&#x60; Internal server error _Please read response message_

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import dk.nodes.nstack.kotlin.codegen.model.*

val apiInstance = FilesApi()
val xminusApplicationMinusId : kotlin.String = xminusApplicationMinusId_example // kotlin.String | 
val xminusRestMinusApiMinusKey : kotlin.String = xminusRestMinusApiMinusKey_example // kotlin.String | 
val contentMinusType : kotlin.String = contentMinusType_example // kotlin.String | 
val name : kotlin.String = name_example // kotlin.String | 
val tags : kotlin.String = tags_example // kotlin.String | 
val goneAt : kotlin.String = goneAt_example // kotlin.String | 
val file : kotlin.String = file_example // kotlin.String | 
val privacy : kotlin.String = privacy_example // kotlin.String | 
try {
    apiInstance.store(xminusApplicationMinusId, xminusRestMinusApiMinusKey, contentMinusType, name, tags, goneAt, file, privacy)
} catch (e: ClientException) {
    println("4xx response calling FilesApi#store")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling FilesApi#store")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **xminusApplicationMinusId** | **kotlin.String**|  |
 **xminusRestMinusApiMinusKey** | **kotlin.String**|  |
 **contentMinusType** | **kotlin.String**|  |
 **name** | **kotlin.String**|  |
 **tags** | **kotlin.String**|  |
 **goneAt** | **kotlin.String**|  |
 **file** | **kotlin.String**|  |
 **privacy** | **kotlin.String**|  |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: Not defined

<a name="storewithpath"></a>
# **storewithpath**
> storewithpath(xminusApplicationMinusId, xminusRestMinusApiMinusKey, contentMinusType, name, tags, goneAt)

Storewithpath

Store a file with path  #### Request details Method: &#x60;POST&#x60;  URL: &#x60;api/v2/content/files/path&#x60;  #### Headers &#x60;X-Application-Id&#x60; (string) **required** _Application ID from [NStack](https://nstack.io)_  &#x60;X-Rest-Api-Key&#x60; (string) **required** _Rest API key from [NStack](https://nstack.io)_  #### Post params &#x60;name&#x60; (string) **required**   &#x60;tags&#x60; (string, comma seperated) **optional**   &#x60;gone_at&#x60; (date-time 2019-01-01 00:00:00) **optional**   &#x60;privacy&#x60; (string [public,public-cdn,private,private-password]) **required**   &#x60;path&#x60; (string) **required**   &#x60;mime&#x60; (string) **required**   &#x60;size&#x60; (int) **required**   #### Response codes(s) &#x60;200&#x60; OK  &#x60;404&#x60; File in path not found  &#x60;409&#x60; Path should start with applicationId  &#x60;412&#x60; Validation error  &#x60;500&#x60; Internal server error _Please read response message_

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import dk.nodes.nstack.kotlin.codegen.model.*

val apiInstance = FilesApi()
val xminusApplicationMinusId : kotlin.String = xminusApplicationMinusId_example // kotlin.String | 
val xminusRestMinusApiMinusKey : kotlin.String = xminusRestMinusApiMinusKey_example // kotlin.String | 
val contentMinusType : kotlin.String = contentMinusType_example // kotlin.String | 
val name : kotlin.String = name_example // kotlin.String | 
val tags : kotlin.String = tags_example // kotlin.String | 
val goneAt : kotlin.String = goneAt_example // kotlin.String | 
try {
    apiInstance.storewithpath(xminusApplicationMinusId, xminusRestMinusApiMinusKey, contentMinusType, name, tags, goneAt)
} catch (e: ClientException) {
    println("4xx response calling FilesApi#storewithpath")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling FilesApi#storewithpath")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **xminusApplicationMinusId** | **kotlin.String**|  |
 **xminusRestMinusApiMinusKey** | **kotlin.String**|  |
 **contentMinusType** | **kotlin.String**|  |
 **name** | **kotlin.String**|  |
 **tags** | **kotlin.String**|  |
 **goneAt** | **kotlin.String**|  |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: Not defined


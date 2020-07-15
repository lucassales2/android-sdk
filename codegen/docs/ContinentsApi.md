# ContinentsApi

All URIs are relative to *https://nstack.io*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getIndex**](ContinentsApi.md#getIndex) | **GET** /api/v2/geographic/continents | GetIndex
[**getShow123**](ContinentsApi.md#getShow123) | **GET** /api/v2/geographic/continents/1 | GetShow123


<a name="getIndex"></a>
# **getIndex**
> getIndex(xminusApplicationMinusId, xminusRestMinusApiMinusKey)

GetIndex

Retrieve a list of valid continents on Earth  #### Request details Method:    &#x60;GET&#x60;  URL:    &#x60;/api/v2/geographic/continents&#x60;  #### Headers  &#x60;X-Application-Id&#x60; (string) **required** _Application ID from [NStack](https://nstack.io)_  &#x60;X-Rest-Api-Key&#x60; (string) **required** _Rest API key from [NStack](https://nstack.io)_  #### Response codes(s) &#x60;200&#x60; OK

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import dk.nodes.nstack.kotlin.codegen.model.*

val apiInstance = ContinentsApi()
val xminusApplicationMinusId : kotlin.String = xminusApplicationMinusId_example // kotlin.String | 
val xminusRestMinusApiMinusKey : kotlin.String = xminusRestMinusApiMinusKey_example // kotlin.String | 
try {
    apiInstance.getIndex(xminusApplicationMinusId, xminusRestMinusApiMinusKey)
} catch (e: ClientException) {
    println("4xx response calling ContinentsApi#getIndex")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ContinentsApi#getIndex")
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

<a name="getShow123"></a>
# **getShow123**
> getShow123(xminusApplicationMinusId, xminusRestMinusApiMinusKey)

GetShow123

Retrieve a list of valid continents on Earth  #### Request details Method:    &#x60;GET&#x60;  URL:    &#x60;/api/v2/geographic/continents/{id}&#x60;  #### Headers  &#x60;X-Application-Id&#x60; (string) **required** _Application ID from [NStack](https://nstack.io)_  &#x60;X-Rest-Api-Key&#x60; (string) **required** _Rest API key from [NStack](https://nstack.io)_  #### Response codes(s) &#x60;200&#x60; OK  &#x60;404&#x60; Not found

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import dk.nodes.nstack.kotlin.codegen.model.*

val apiInstance = ContinentsApi()
val xminusApplicationMinusId : kotlin.String = xminusApplicationMinusId_example // kotlin.String | 
val xminusRestMinusApiMinusKey : kotlin.String = xminusRestMinusApiMinusKey_example // kotlin.String | 
try {
    apiInstance.getShow123(xminusApplicationMinusId, xminusRestMinusApiMinusKey)
} catch (e: ClientException) {
    println("4xx response calling ContinentsApi#getShow123")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ContinentsApi#getShow123")
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


# LanguagesApi

All URIs are relative to *https://nstack-staging.vapor.cloud*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getIndex112**](LanguagesApi.md#getIndex112) | **GET** /api/v1/geographic/languages | GetIndex112
[**getIndex12**](LanguagesApi.md#getIndex12) | **GET** /api/v2/geographic/languages | GetIndex12


<a name="getIndex112"></a>
# **getIndex112**
> getIndex112(xminusApplicationMinusId, xminusRestMinusApiMinusKey)

GetIndex112

Retrieve a list of valid languages spoken by humans on Earth  #### Request details Method:    &#x60;GET&#x60;  URL:    &#x60;/api/v1/geographic/languages&#x60;  #### Headers  &#x60;X-Application-Id&#x60; (string) **required** _Application ID from [NStack](https://nstack.io)_  &#x60;X-Rest-Api-Key&#x60; (string) **required** _Rest API key from [NStack](https://nstack.io)_  #### Query parameters (filters) &#x60;limit&#x60; (int) _Eg: [/api/geographic/languages?limit&#x3D;1] Default limit is 500_  &#x60;search&#x60; (string) _Eg: [/api/geographic/languages?search&#x3D;en]_  &#x60;fields&#x60; (string) _Eg: [/api/geographic/languages?fields&#x3D;name,locale]_  #### Response codes(s) &#x60;200&#x60; OK  &#x60;412&#x60; Precondition failed _Invalid filters_  

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import dk.nodes.nstack.kotlin.codegen.model.*

val apiInstance = LanguagesApi()
val xminusApplicationMinusId : kotlin.String = xminusApplicationMinusId_example // kotlin.String | 
val xminusRestMinusApiMinusKey : kotlin.String = xminusRestMinusApiMinusKey_example // kotlin.String | 
try {
    apiInstance.getIndex112(xminusApplicationMinusId, xminusRestMinusApiMinusKey)
} catch (e: ClientException) {
    println("4xx response calling LanguagesApi#getIndex112")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling LanguagesApi#getIndex112")
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

<a name="getIndex12"></a>
# **getIndex12**
> getIndex12(xminusApplicationMinusId, xminusRestMinusApiMinusKey)

GetIndex12

Retrieve a list of valid languages spoken by humans on Earth  #### Request details Method:    &#x60;GET&#x60;  URL:    &#x60;/api/v2/geographic/languages&#x60;  #### Headers  &#x60;X-Application-Id&#x60; (string) **required** _Application ID from [NStack](https://nstack.io)_  &#x60;X-Rest-Api-Key&#x60; (string) **required** _Rest API key from [NStack](https://nstack.io)_  #### Query parameters (filters) &#x60;limit&#x60; (int) _Eg: [/api/geographic/languages?limit&#x3D;1] Default limit is 500_  &#x60;search&#x60; (string) _Eg: [/api/geographic/languages?search&#x3D;en]_  &#x60;fields&#x60; (string) _Eg: [/api/geographic/languages?fields&#x3D;name,locale]_  #### Response codes(s) &#x60;200&#x60; OK  &#x60;412&#x60; Precondition failed _Invalid filters_

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import dk.nodes.nstack.kotlin.codegen.model.*

val apiInstance = LanguagesApi()
val xminusApplicationMinusId : kotlin.String = xminusApplicationMinusId_example // kotlin.String | 
val xminusRestMinusApiMinusKey : kotlin.String = xminusRestMinusApiMinusKey_example // kotlin.String | 
try {
    apiInstance.getIndex12(xminusApplicationMinusId, xminusRestMinusApiMinusKey)
} catch (e: ClientException) {
    println("4xx response calling LanguagesApi#getIndex12")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling LanguagesApi#getIndex12")
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


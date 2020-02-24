# AdminAPIApi

All URIs are relative to *https://nstack-staging.vapor.cloud*

Method | HTTP request | Description
------------- | ------------- | -------------
[**search**](AdminAPIApi.md#search) | **GET** /admin/search/company-applications | Search


<a name="search"></a>
# **search**
> AppopenV2 search(q, authorization, contentMinusType)

Search

Retrieve a list of valid continents on Earth  #### Request details Method:    &#x60;GET&#x60;  URL:    &#x60;/admin/search/company-applications&#x60;  #### Headers  &#x60;Authorization&#x60; (string) **required** _Token_  #### Response codes(s) &#x60;200&#x60; OK

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import dk.nodes.nstack.kotlin.codegen.model.*

val apiInstance = AdminAPIApi()
val q : kotlin.String = q_example // kotlin.String | 
val authorization : kotlin.String = authorization_example // kotlin.String | 
val contentMinusType : kotlin.String = contentMinusType_example // kotlin.String | 
try {
    val result : AppopenV2 = apiInstance.search(q, authorization, contentMinusType)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling AdminAPIApi#search")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AdminAPIApi#search")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **q** | **kotlin.String**|  |
 **authorization** | **kotlin.String**|  |
 **contentMinusType** | **kotlin.String**|  |

### Return type

**AppopenV2**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


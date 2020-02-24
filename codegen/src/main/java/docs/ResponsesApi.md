# ResponsesApi

All URIs are relative to *https://nstack-staging.vapor.cloud*

Method | HTTP request | Description
------------- | ------------- | -------------
[**show**](ResponsesApi.md#show) | **GET** /api/v2/content/responses/15 | Show
[**show1**](ResponsesApi.md#show1) | **GET** /api/v1/content/responses/15 | Show1


<a name="show"></a>
# **show**
> show(xminusApplicationMinusId, xminusRestMinusApiMinusKey, contentMinusType)

Show

Get one response  #### Request details Method: &#x60;GET&#x60;  URL: &#x60;api/v2/content/responses/{id_or_slug}&#x60;  #### Headers &#x60;X-Application-Id&#x60; (string) **required** _Application ID from [NStack](https://nstack.io)_  &#x60;X-Rest-Api-Key&#x60; (string) **required** _Rest API key from [NStack](https://nstack.io)_  #### URL Parameters &#x60;id_or_slug&#x60; (string/int) **required** _ID or slug of content type [15, \&quot;terms\&quot;, \&quot;about\&quot;]_  #### Query params &#x60;data&#x60; (bool) **option** _defaul true - should the object be in data_  #### Response codes(s) &#x60;200&#x60; OK  &#x60;404&#x60; Entity not found  &#x60;500&#x60; Internal server error _Please read response message_

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import dk.nodes.nstack.kotlin.codegen.model.*

val apiInstance = ResponsesApi()
val xminusApplicationMinusId : kotlin.String = xminusApplicationMinusId_example // kotlin.String | 
val xminusRestMinusApiMinusKey : kotlin.String = xminusRestMinusApiMinusKey_example // kotlin.String | 
val contentMinusType : kotlin.String = contentMinusType_example // kotlin.String | 
try {
    apiInstance.show(xminusApplicationMinusId, xminusRestMinusApiMinusKey, contentMinusType)
} catch (e: ClientException) {
    println("4xx response calling ResponsesApi#show")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ResponsesApi#show")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **xminusApplicationMinusId** | **kotlin.String**|  |
 **xminusRestMinusApiMinusKey** | **kotlin.String**|  |
 **contentMinusType** | **kotlin.String**|  |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="show1"></a>
# **show1**
> show1(xminusApplicationMinusId, xminusRestMinusApiMinusKey, contentMinusType)

Show1

Get one response  #### Request details Method: &#x60;GET&#x60;  URL: &#x60;api/v1/content/responses/{id_or_slug}&#x60;  #### Headers &#x60;X-Application-Id&#x60; (string) **required** _Application ID from [NStack](https://nstack.io)_  &#x60;X-Rest-Api-Key&#x60; (string) **required** _Rest API key from [NStack](https://nstack.io)_  #### URL Parameters &#x60;id_or_slug&#x60; (string/int) **required** _ID or slug of content type [15, \&quot;terms\&quot;, \&quot;about\&quot;]_  #### Query params &#x60;data&#x60; (bool) **option** _defaul true - should the object be in data_  #### Response codes(s) &#x60;200&#x60; OK  &#x60;445&#x60; Entity not found  &#x60;500&#x60; Internal server error _Please read response message_

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import dk.nodes.nstack.kotlin.codegen.model.*

val apiInstance = ResponsesApi()
val xminusApplicationMinusId : kotlin.String = xminusApplicationMinusId_example // kotlin.String | 
val xminusRestMinusApiMinusKey : kotlin.String = xminusRestMinusApiMinusKey_example // kotlin.String | 
val contentMinusType : kotlin.String = contentMinusType_example // kotlin.String | 
try {
    apiInstance.show1(xminusApplicationMinusId, xminusRestMinusApiMinusKey, contentMinusType)
} catch (e: ClientException) {
    println("4xx response calling ResponsesApi#show1")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ResponsesApi#show1")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **xminusApplicationMinusId** | **kotlin.String**|  |
 **xminusRestMinusApiMinusKey** | **kotlin.String**|  |
 **contentMinusType** | **kotlin.String**|  |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined


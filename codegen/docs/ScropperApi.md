# ScropperApi

All URIs are relative to *https://nstack.io*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getfocalpoint**](ScropperApi.md#getfocalpoint) | **POST** /api/v2/scropper | Getfocalpoint


<a name="getfocalpoint"></a>
# **getfocalpoint**
> Scropper getfocalpoint(xminusApplicationMinusId, xminusRestMinusApiMinusKey, contentMinusType, url, dataMinusCenter)

Getfocalpoint

Get focal point on a image   **Initial response time can be 15sec in case you hit a cold container**   #### Request details Method: &#x60;POST&#x60;  URL: &#x60;api/v2/content/scropper&#x60;  #### Headers &#x60;X-Application-Id&#x60; (string) **required** _Application ID from [NStack](https://nstack.io)_  &#x60;X-Rest-Api-Key&#x60; (string) **required** _Rest API key from [NStack](https://nstack.io)_  #### Post params &#x60;url&#x60; (string) **required if no file, only jpg, png**   &#x60;file&#x60; (file, max 30mb) **required if no url, only jpg, png**   &#x60;data-center&#x60; (string) **optional, default: aws:ireland** **(Options: aws:ireland)**   #### Response codes(s) &#x60;200&#x60; OK  &#x60;412&#x60; Validation error  &#x60;500&#x60; Internal server error _Please read response message_

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import dk.nodes.nstack.kotlin.codegen.model.*

val apiInstance = ScropperApi()
val xminusApplicationMinusId : kotlin.String = xminusApplicationMinusId_example // kotlin.String | 
val xminusRestMinusApiMinusKey : kotlin.String = xminusRestMinusApiMinusKey_example // kotlin.String | 
val contentMinusType : kotlin.String = contentMinusType_example // kotlin.String | 
val url : kotlin.String = url_example // kotlin.String | 
val dataMinusCenter : kotlin.String = dataMinusCenter_example // kotlin.String | 
try {
    val result : Scropper = apiInstance.getfocalpoint(xminusApplicationMinusId, xminusRestMinusApiMinusKey, contentMinusType, url, dataMinusCenter)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ScropperApi#getfocalpoint")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ScropperApi#getfocalpoint")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **xminusApplicationMinusId** | **kotlin.String**|  |
 **xminusRestMinusApiMinusKey** | **kotlin.String**|  |
 **contentMinusType** | **kotlin.String**|  |
 **url** | **kotlin.String**|  |
 **dataMinusCenter** | **kotlin.String**|  |

### Return type

**Scropper**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json


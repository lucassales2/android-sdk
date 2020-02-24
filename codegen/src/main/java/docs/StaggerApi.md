# StaggerApi

All URIs are relative to *https://nstack-staging.vapor.cloud*

Method | HTTP request | Description
------------- | ------------- | -------------
[**gettag**](StaggerApi.md#gettag) | **POST** /api/v2/stagger | Gettag


<a name="gettag"></a>
# **gettag**
> gettag(xminusApplicationMinusId, xminusRestMinusApiMinusKey, contentMinusType, text, dataMinusCenter)

Gettag

Get a tag from a text (Feedback / bug report)   **Initial response time can be 15sec in case you hit a cold container**   #### Request details Method: &#x60;POST&#x60;  URL: &#x60;api/v2/content/stagger&#x60;  #### Headers &#x60;X-Application-Id&#x60; (string) **required** _Application ID from [NStack](https://nstack.io)_  &#x60;X-Rest-Api-Key&#x60; (string) **required** _Rest API key from [NStack](https://nstack.io)_  #### Post params &#x60;text&#x60; (string) **required**  &#x60;data-center&#x60; (string) **optional, default: aws:ireland** **(Options: aws:ireland)**   #### Response codes(s) &#x60;200&#x60; OK  &#x60;412&#x60; Validation error  &#x60;500&#x60; Internal server error _Please read response message_

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import dk.nodes.nstack.kotlin.codegen.model.*

val apiInstance = StaggerApi()
val xminusApplicationMinusId : kotlin.String = xminusApplicationMinusId_example // kotlin.String | 
val xminusRestMinusApiMinusKey : kotlin.String = xminusRestMinusApiMinusKey_example // kotlin.String | 
val contentMinusType : kotlin.String = contentMinusType_example // kotlin.String | 
val text : kotlin.String = text_example // kotlin.String | 
val dataMinusCenter : kotlin.String = dataMinusCenter_example // kotlin.String | 
try {
    apiInstance.gettag(xminusApplicationMinusId, xminusRestMinusApiMinusKey, contentMinusType, text, dataMinusCenter)
} catch (e: ClientException) {
    println("4xx response calling StaggerApi#gettag")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling StaggerApi#gettag")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **xminusApplicationMinusId** | **kotlin.String**|  |
 **xminusRestMinusApiMinusKey** | **kotlin.String**|  |
 **contentMinusType** | **kotlin.String**|  |
 **text** | **kotlin.String**|  |
 **dataMinusCenter** | **kotlin.String**|  |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: Not defined


# MessagesApi

All URIs are relative to *https://nstack.io*

Method | HTTP request | Description
------------- | ------------- | -------------
[**markasseen**](MessagesApi.md#markasseen) | **POST** /api/v2/notify/messages/views | Markasseen
[**messages**](MessagesApi.md#messages) | **GET** /api/v2/notify/messages | Messages


<a name="markasseen"></a>
# **markasseen**
> MarkAsSeenResponse markasseen(xminusApplicationMinusId, xminusRestMinusApiMinusKey, guid, messageId)

Markasseen

Register a view update  #### Request details Method: &#x60;POST&#x60;  URL: &#x60;/api/v2/notify/updates/views&#x60;  #### Headers  &#x60;X-Application-Id&#x60; (string) **required** _Application ID from [NStack](https://nstack.io)_  &#x60;X-Rest-Api-Key&#x60; (string) **required** _Rest API key from [NStack](https://nstack.io)_  #### Parameters &#x60;guid&#x60; (int) **required** _[?]_  &#x60;message_id&#x60; **required** _[?]_  #### Response codes &#x60;200&#x60; OK  &#x60;412&#x60; Precondition failed

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import dk.nodes.nstack.kotlin.codegen.model.*

val apiInstance = MessagesApi()
val xminusApplicationMinusId : kotlin.String = xminusApplicationMinusId_example // kotlin.String | 
val xminusRestMinusApiMinusKey : kotlin.String = xminusRestMinusApiMinusKey_example // kotlin.String | 
val guid : kotlin.Int = 56 // kotlin.Int | 
val messageId : kotlin.Int = 56 // kotlin.Int | 
try {
    val result : MarkAsSeenResponse = apiInstance.markasseen(xminusApplicationMinusId, xminusRestMinusApiMinusKey, guid, messageId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling MessagesApi#markasseen")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling MessagesApi#markasseen")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **xminusApplicationMinusId** | **kotlin.String**|  |
 **xminusRestMinusApiMinusKey** | **kotlin.String**|  |
 **guid** | **kotlin.Int**|  |
 **messageId** | **kotlin.Int**|  |

### Return type

**MarkAsSeenResponse**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

<a name="messages"></a>
# **messages**
> Messages messages(platform, xminusApplicationMinusId, xminusRestMinusApiMinusKey)

Messages

Get message  #### Request details Method:    &#x60;GET&#x60;  URL:    &#x60;/api/v1/notify/messages&#x60;  #### Headers  &#x60;X-Application-Id&#x60; (string) **required** _Application ID from [NStack](https://nstack.io)_  &#x60;X-Rest-Api-Key&#x60; (string) **required** _Rest API key from [NStack](https://nstack.io)_  #### Query parameters &#x60;platform&#x60; (string) **required** _[\&quot;ios\&quot;, \&quot;android\&quot;, \&quot;windows\&quot;, \&quot;web\&quot;]_   #### Response codes &#x60;200&#x60; OK  &#x60;412&#x60; Precondition failed

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import dk.nodes.nstack.kotlin.codegen.model.*

val apiInstance = MessagesApi()
val platform : kotlin.String = platform_example // kotlin.String | 
val xminusApplicationMinusId : kotlin.String = xminusApplicationMinusId_example // kotlin.String | 
val xminusRestMinusApiMinusKey : kotlin.String = xminusRestMinusApiMinusKey_example // kotlin.String | 
try {
    val result : Messages = apiInstance.messages(platform, xminusApplicationMinusId, xminusRestMinusApiMinusKey)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling MessagesApi#messages")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling MessagesApi#messages")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **platform** | **kotlin.String**|  |
 **xminusApplicationMinusId** | **kotlin.String**|  |
 **xminusRestMinusApiMinusKey** | **kotlin.String**|  |

### Return type

**Messages**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


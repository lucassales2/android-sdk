# RateRemindersApi

All URIs are relative to *https://nstack-staging.vapor.cloud*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getShow**](RateRemindersApi.md#getShow) | **GET** /api/v2/notify/rate_reminder | GetShow
[**getShow1**](RateRemindersApi.md#getShow1) | **GET** /api/v1/notify/rate_reminder | GetShow1
[**markasseen1**](RateRemindersApi.md#markasseen1) | **POST** /api/v1/notify/rate_reminder/views | Markasseen1
[**postMarkasseen**](RateRemindersApi.md#postMarkasseen) | **POST** /api/v2/notify/rate_reminder/views | PostMarkasseen


<a name="getShow"></a>
# **getShow**
> getShow(platform, guid, xminusApplicationMinusId, xminusRestMinusApiMinusKey)

GetShow

Get rate reminder  #### Request details Method: &#x60;GET&#x60;  URL: &#x60;/api/v2/notify/rate_reminder&#x60;  #### Headers  &#x60;X-Application-Id&#x60; (string) **required** _Application ID from [NStack](https://nstack.io)_  &#x60;X-Rest-Api-Key&#x60; (string) **required** _Rest API key from [NStack](https://nstack.io)_  #### URL Parameters &#x60;guid&#x60; (int?) **required** _[?]_  &#x60;platform&#x60; (string) **required** _[is this used at all?]_  #### Response codes &#x60;200&#x60; OK  &#x60;412&#x60; Precondition failed  &#x60;445&#x60; Entity not found

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import dk.nodes.nstack.kotlin.codegen.model.*

val apiInstance = RateRemindersApi()
val platform : kotlin.String = platform_example // kotlin.String | 
val guid : kotlin.Int = 56 // kotlin.Int | 
val xminusApplicationMinusId : kotlin.String = xminusApplicationMinusId_example // kotlin.String | 
val xminusRestMinusApiMinusKey : kotlin.String = xminusRestMinusApiMinusKey_example // kotlin.String | 
try {
    apiInstance.getShow(platform, guid, xminusApplicationMinusId, xminusRestMinusApiMinusKey)
} catch (e: ClientException) {
    println("4xx response calling RateRemindersApi#getShow")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling RateRemindersApi#getShow")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **platform** | **kotlin.String**|  |
 **guid** | **kotlin.Int**|  |
 **xminusApplicationMinusId** | **kotlin.String**|  |
 **xminusRestMinusApiMinusKey** | **kotlin.String**|  |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="getShow1"></a>
# **getShow1**
> getShow1(platform, guid, xminusApplicationMinusId, xminusRestMinusApiMinusKey)

GetShow1

Get rate reminder  #### Request details Method: &#x60;GET&#x60;  URL: &#x60;/api/v1/notify/rate_reminder&#x60;  #### Headers  &#x60;X-Application-Id&#x60; (string) **required** _Application ID from [NStack](https://nstack.io)_  &#x60;X-Rest-Api-Key&#x60; (string) **required** _Rest API key from [NStack](https://nstack.io)_  #### URL Parameters &#x60;guid&#x60; (int?) **required** _[?]_  &#x60;platform&#x60; (string) **required** _[is this used at all?]_  #### Response codes &#x60;200&#x60; OK  &#x60;412&#x60; Precondition failed  &#x60;445&#x60; Entity not found

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import dk.nodes.nstack.kotlin.codegen.model.*

val apiInstance = RateRemindersApi()
val platform : kotlin.String = platform_example // kotlin.String | 
val guid : kotlin.Int = 56 // kotlin.Int | 
val xminusApplicationMinusId : kotlin.String = xminusApplicationMinusId_example // kotlin.String | 
val xminusRestMinusApiMinusKey : kotlin.String = xminusRestMinusApiMinusKey_example // kotlin.String | 
try {
    apiInstance.getShow1(platform, guid, xminusApplicationMinusId, xminusRestMinusApiMinusKey)
} catch (e: ClientException) {
    println("4xx response calling RateRemindersApi#getShow1")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling RateRemindersApi#getShow1")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **platform** | **kotlin.String**|  |
 **guid** | **kotlin.Int**|  |
 **xminusApplicationMinusId** | **kotlin.String**|  |
 **xminusRestMinusApiMinusKey** | **kotlin.String**|  |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="markasseen1"></a>
# **markasseen1**
> markasseen1(xminusApplicationMinusId, xminusRestMinusApiMinusKey, guid, platform, answer)

Markasseen1

Post rate reminder  #### Request details Method: &#x60;POST&#x60;  URL: &#x60;/api/v1/notify/rate_reminder/views&#x60;  #### Headers  &#x60;X-Application-Id&#x60; (string) **required** _Application ID from [NStack](https://nstack.io)_  &#x60;X-Rest-Api-Key&#x60; (string) **required** _Rest API key from [NStack](https://nstack.io)_  #### URL Parameters &#x60;guid&#x60; (int?) **required** _[?]_  &#x60;platform&#x60; (string) **required** _[is this used at all?]_  &#x60;answer&#x60; (string) **required** _[\&quot;yes\&quot;, \&quot;no\&quot;, \&quot;later\&quot;]_  #### Response codes &#x60;200&#x60; OK  &#x60;412&#x60; Precondition failed  &#x60;445&#x60; Entity not found

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import dk.nodes.nstack.kotlin.codegen.model.*

val apiInstance = RateRemindersApi()
val xminusApplicationMinusId : kotlin.String = xminusApplicationMinusId_example // kotlin.String | 
val xminusRestMinusApiMinusKey : kotlin.String = xminusRestMinusApiMinusKey_example // kotlin.String | 
val guid : kotlin.Int = 56 // kotlin.Int | 
val platform : kotlin.String = platform_example // kotlin.String | 
val answer : kotlin.String = answer_example // kotlin.String | 
try {
    apiInstance.markasseen1(xminusApplicationMinusId, xminusRestMinusApiMinusKey, guid, platform, answer)
} catch (e: ClientException) {
    println("4xx response calling RateRemindersApi#markasseen1")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling RateRemindersApi#markasseen1")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **xminusApplicationMinusId** | **kotlin.String**|  |
 **xminusRestMinusApiMinusKey** | **kotlin.String**|  |
 **guid** | **kotlin.Int**|  |
 **platform** | **kotlin.String**|  |
 **answer** | **kotlin.String**|  |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: Not defined

<a name="postMarkasseen"></a>
# **postMarkasseen**
> postMarkasseen(xminusApplicationMinusId, xminusRestMinusApiMinusKey, guid, platform, answer)

PostMarkasseen

Post rate reminder  #### Request details Method: &#x60;POST&#x60;  URL: &#x60;/api/v2/notify/rate_reminder/views&#x60;  #### Headers  &#x60;X-Application-Id&#x60; (string) **required** _Application ID from [NStack](https://nstack.io)_  &#x60;X-Rest-Api-Key&#x60; (string) **required** _Rest API key from [NStack](https://nstack.io)_  #### URL Parameters &#x60;guid&#x60; (int?) **required** _[?]_  &#x60;platform&#x60; (string) **required** _[is this used at all?]_  &#x60;answer&#x60; (string) **required** _[\&quot;yes\&quot;, \&quot;no\&quot;, \&quot;later\&quot;]_  #### Response codes &#x60;200&#x60; OK  &#x60;412&#x60; Precondition failed  &#x60;445&#x60; Entity not found

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import dk.nodes.nstack.kotlin.codegen.model.*

val apiInstance = RateRemindersApi()
val xminusApplicationMinusId : kotlin.String = xminusApplicationMinusId_example // kotlin.String | 
val xminusRestMinusApiMinusKey : kotlin.String = xminusRestMinusApiMinusKey_example // kotlin.String | 
val guid : kotlin.Int = 56 // kotlin.Int | 
val platform : kotlin.String = platform_example // kotlin.String | 
val answer : kotlin.String = answer_example // kotlin.String | 
try {
    apiInstance.postMarkasseen(xminusApplicationMinusId, xminusRestMinusApiMinusKey, guid, platform, answer)
} catch (e: ClientException) {
    println("4xx response calling RateRemindersApi#postMarkasseen")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling RateRemindersApi#postMarkasseen")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **xminusApplicationMinusId** | **kotlin.String**|  |
 **xminusRestMinusApiMinusKey** | **kotlin.String**|  |
 **guid** | **kotlin.Int**|  |
 **platform** | **kotlin.String**|  |
 **answer** | **kotlin.String**|  |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: Not defined


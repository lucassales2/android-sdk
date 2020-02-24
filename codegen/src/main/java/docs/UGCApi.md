# UGCApi

All URIs are relative to *https://nstack-staging.vapor.cloud*

Method | HTTP request | Description
------------- | ------------- | -------------
[**feedback**](UGCApi.md#feedback) | **POST** /api/v2/ugc/feedbacks | Feedback
[**postFeedback**](UGCApi.md#postFeedback) | **POST** /api/v1/ugc/feedbacks | PostFeedback
[**pushLogs**](UGCApi.md#pushLogs) | **POST** /api/v2/ugc/push-logs | PushLogs
[**pushLogs1**](UGCApi.md#pushLogs1) | **POST** /api/v1/ugc/push-logs | PushLogs1
[**result**](UGCApi.md#result) | **POST** /api/v2/ugc/results | Result
[**result1**](UGCApi.md#result1) | **POST** /api/v1/ugc/results | Result1


<a name="feedback"></a>
# **feedback**
> feedback(xminusApplicationMinusId, xminusRestMinusApiMinusKey, breadcrumbsLeftSquareBracket0RightSquareBracketLeftSquareBracketMetaRightSquareBracket, os, device, appVersion, name, email, message, image, type, platform, metaLeftSquareBracketKeyRightSquareBracket, breadcrumbsLeftSquareBracket0RightSquareBracketLeftSquareBracketEventRightSquareBracket, breadcrumbsLeftSquareBracket0RightSquareBracketLeftSquareBracketTimestampRightSquareBracket)

Feedback

#### Request details  Method:    &#x60;POST&#x60;  URL:    &#x60;/api/v2/ugc/feedbacks&#x60;  #### Headers   &#x60;X-Application-Id&#x60;  &#x60;X-Rest-Api-Key&#x60;  #### Response codes(s)  &#x60;200&#x60; OK  &#x60;412&#x60; Validation failed  #### Post params  &#x60;type&#x60; (string: feedback, bug) **optional, default is feedback**  &#x60;platform&#x60; (string: web, ios, android, unknown) **optional, default is unknown**  &#x60;os&#x60; (string) **optional**  &#x60;app_version&#x60; (string) **optional**  &#x60;device&#x60; (string) **optional**  &#x60;name&#x60; (string) **optional**  &#x60;email&#x60; (string) **optional**  &#x60;message&#x60; (string) **optional**  &#x60;image&#x60; (jpg,jpeg,png) **optional**  &#x60;meta&#x60; (array/dict, (full flexiable)) **optional**  &#x60;breadcrumbs&#x60; (array, {event (required): string, timestamp (required): Y-m-d H:i:s, meta (optional): array) **optional**

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import dk.nodes.nstack.kotlin.codegen.model.*

val apiInstance = UGCApi()
val xminusApplicationMinusId : kotlin.String = xminusApplicationMinusId_example // kotlin.String | 
val xminusRestMinusApiMinusKey : kotlin.String = xminusRestMinusApiMinusKey_example // kotlin.String | 
val breadcrumbsLeftSquareBracket0RightSquareBracketLeftSquareBracketMetaRightSquareBracket : kotlin.String = breadcrumbsLeftSquareBracket0RightSquareBracketLeftSquareBracketMetaRightSquareBracket_example // kotlin.String | 
val os : kotlin.String = os_example // kotlin.String | 
val device : kotlin.String = device_example // kotlin.String | 
val appVersion : kotlin.String = appVersion_example // kotlin.String | 
val name : kotlin.String = name_example // kotlin.String | 
val email : kotlin.String = email_example // kotlin.String | 
val message : kotlin.String = message_example // kotlin.String | 
val image : kotlin.String = image_example // kotlin.String | 
val type : kotlin.String = type_example // kotlin.String | 
val platform : kotlin.String = platform_example // kotlin.String | 
val metaLeftSquareBracketKeyRightSquareBracket : kotlin.String = metaLeftSquareBracketKeyRightSquareBracket_example // kotlin.String | 
val breadcrumbsLeftSquareBracket0RightSquareBracketLeftSquareBracketEventRightSquareBracket : kotlin.String = breadcrumbsLeftSquareBracket0RightSquareBracketLeftSquareBracketEventRightSquareBracket_example // kotlin.String | 
val breadcrumbsLeftSquareBracket0RightSquareBracketLeftSquareBracketTimestampRightSquareBracket : kotlin.String = breadcrumbsLeftSquareBracket0RightSquareBracketLeftSquareBracketTimestampRightSquareBracket_example // kotlin.String | 
try {
    apiInstance.feedback(xminusApplicationMinusId, xminusRestMinusApiMinusKey, breadcrumbsLeftSquareBracket0RightSquareBracketLeftSquareBracketMetaRightSquareBracket, os, device, appVersion, name, email, message, image, type, platform, metaLeftSquareBracketKeyRightSquareBracket, breadcrumbsLeftSquareBracket0RightSquareBracketLeftSquareBracketEventRightSquareBracket, breadcrumbsLeftSquareBracket0RightSquareBracketLeftSquareBracketTimestampRightSquareBracket)
} catch (e: ClientException) {
    println("4xx response calling UGCApi#feedback")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling UGCApi#feedback")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **xminusApplicationMinusId** | **kotlin.String**|  |
 **xminusRestMinusApiMinusKey** | **kotlin.String**|  |
 **breadcrumbsLeftSquareBracket0RightSquareBracketLeftSquareBracketMetaRightSquareBracket** | **kotlin.String**|  |
 **os** | **kotlin.String**|  |
 **device** | **kotlin.String**|  |
 **appVersion** | **kotlin.String**|  |
 **name** | **kotlin.String**|  |
 **email** | **kotlin.String**|  |
 **message** | **kotlin.String**|  |
 **image** | **kotlin.String**|  |
 **type** | **kotlin.String**|  |
 **platform** | **kotlin.String**|  |
 **metaLeftSquareBracketKeyRightSquareBracket** | **kotlin.String**|  |
 **breadcrumbsLeftSquareBracket0RightSquareBracketLeftSquareBracketEventRightSquareBracket** | **kotlin.String**|  |
 **breadcrumbsLeftSquareBracket0RightSquareBracketLeftSquareBracketTimestampRightSquareBracket** | **kotlin.String**|  |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: Not defined

<a name="postFeedback"></a>
# **postFeedback**
> postFeedback(xminusApplicationMinusId, xminusRestMinusApiMinusKey, os, device, appVersion, name, email, message, image)

PostFeedback

#### Request details  Method:    &#x60;POST&#x60;  URL:    &#x60;/api/v1/ugc/feedbacks&#x60;  #### Headers   &#x60;X-Application-Id&#x60;  &#x60;X-Rest-Api-Key&#x60;  #### Response codes(s)  &#x60;200&#x60; OK  &#x60;412&#x60; Validation failed  #### Post params  &#x60;os&#x60; (string) **optional**  &#x60;app_version&#x60; (string) **optional**  &#x60;device&#x60; (string) **optional**  &#x60;name&#x60; (string) **optional**  &#x60;email&#x60; (string) **optional**  &#x60;message&#x60; (string) **optional**  &#x60;image&#x60; (jpg,jpeg,png) **optional**

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import dk.nodes.nstack.kotlin.codegen.model.*

val apiInstance = UGCApi()
val xminusApplicationMinusId : kotlin.String = xminusApplicationMinusId_example // kotlin.String | 
val xminusRestMinusApiMinusKey : kotlin.String = xminusRestMinusApiMinusKey_example // kotlin.String | 
val os : kotlin.String = os_example // kotlin.String | 
val device : kotlin.String = device_example // kotlin.String | 
val appVersion : kotlin.String = appVersion_example // kotlin.String | 
val name : kotlin.String = name_example // kotlin.String | 
val email : kotlin.String = email_example // kotlin.String | 
val message : kotlin.String = message_example // kotlin.String | 
val image : kotlin.String = image_example // kotlin.String | 
try {
    apiInstance.postFeedback(xminusApplicationMinusId, xminusRestMinusApiMinusKey, os, device, appVersion, name, email, message, image)
} catch (e: ClientException) {
    println("4xx response calling UGCApi#postFeedback")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling UGCApi#postFeedback")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **xminusApplicationMinusId** | **kotlin.String**|  |
 **xminusRestMinusApiMinusKey** | **kotlin.String**|  |
 **os** | **kotlin.String**|  |
 **device** | **kotlin.String**|  |
 **appVersion** | **kotlin.String**|  |
 **name** | **kotlin.String**|  |
 **email** | **kotlin.String**|  |
 **message** | **kotlin.String**|  |
 **image** | **kotlin.String**|  |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: Not defined

<a name="pushLogs"></a>
# **pushLogs**
> pushLogs(xminusApplicationMinusId, xminusRestMinusApiMinusKey, provider, key, type, succeeded, request, response, userId)

PushLogs

#### Request details Method:    &#x60;POST&#x60;  URL:    &#x60;/api/v2/ugc/push-logs&#x60;  #### Headers  &#x60;X-Application-Id&#x60;  &#x60;X-Rest-Api-Key&#x60;  #### Response codes(s) &#x60;201&#x60; Created  &#x60;412&#x60; Validation failed  #### Post params &#x60;provider&#x60; (string) **required** (fx fcm, urban-airship)  &#x60;key&#x60; (string) **required** (App key in fcm / ua)  &#x60;type&#x60; (string) **required** (fx standard, freind-request, taxi-arrived etc)  &#x60;succeeded&#x60; (bool) **required** (Did push get sent?)  &#x60;request&#x60; (json) **optional** (Insert everything passed to provider)  &#x60;response&#x60; (json) **optional** (Insert everything received from provider)  &#x60;user_id&#x60; (int/string) **optional** (User id)  &#x60;relation_type&#x60; (string) **optional** (Fx Booking, Company etc)  &#x60;relation_id&#x60; (int) **optional** (Fx Id of Booking, id of Company etc)

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import dk.nodes.nstack.kotlin.codegen.model.*

val apiInstance = UGCApi()
val xminusApplicationMinusId : kotlin.String = xminusApplicationMinusId_example // kotlin.String | 
val xminusRestMinusApiMinusKey : kotlin.String = xminusRestMinusApiMinusKey_example // kotlin.String | 
val provider : kotlin.String = provider_example // kotlin.String | 
val key : kotlin.String = key_example // kotlin.String | 
val type : kotlin.String = type_example // kotlin.String | 
val succeeded : kotlin.Boolean = true // kotlin.Boolean | 
val request : kotlin.Any = Object // kotlin.Any | 
val response : kotlin.Any = Object // kotlin.Any | 
val userId : kotlin.Int = 56 // kotlin.Int | 
try {
    apiInstance.pushLogs(xminusApplicationMinusId, xminusRestMinusApiMinusKey, provider, key, type, succeeded, request, response, userId)
} catch (e: ClientException) {
    println("4xx response calling UGCApi#pushLogs")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling UGCApi#pushLogs")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **xminusApplicationMinusId** | **kotlin.String**|  |
 **xminusRestMinusApiMinusKey** | **kotlin.String**|  |
 **provider** | **kotlin.String**|  |
 **key** | **kotlin.String**|  |
 **type** | **kotlin.String**|  |
 **succeeded** | **kotlin.Boolean**|  |
 **request** | **kotlin.Any**|  |
 **response** | **kotlin.Any**|  |
 **userId** | **kotlin.Int**|  |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: Not defined

<a name="pushLogs1"></a>
# **pushLogs1**
> pushLogs1(xminusApplicationMinusId, xminusRestMinusApiMinusKey, provider, key, type, succeeded, request, response, userId)

PushLogs1

#### Request details Method:    &#x60;POST&#x60;  URL:    &#x60;/api/v1/ugc/push-logs&#x60;  #### Headers  &#x60;X-Application-Id&#x60;  &#x60;X-Rest-Api-Key&#x60;  #### Response codes(s) &#x60;201&#x60; Created  &#x60;412&#x60; Validation failed  #### Post params &#x60;provider&#x60; (string) **required** (fx fcm, urban-airship)  &#x60;key&#x60; (string) **required** (App key in fcm / ua)  &#x60;type&#x60; (string) **required** (fx standard, freind-request, taxi-arrived etc)  &#x60;succeeded&#x60; (bool) **required** (Did push get sent?)  &#x60;request&#x60; (json) **optional** (Insert everything passed to provider)  &#x60;response&#x60; (json) **optional** (Insert everything received from provider)  &#x60;user_id&#x60; (int/string) **optional** (User id)  &#x60;relation_type&#x60; (string) **optional** (Fx Booking, Company etc)  &#x60;relation_id&#x60; (int) **optional** (Fx Id of Booking, id of Company etc)

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import dk.nodes.nstack.kotlin.codegen.model.*

val apiInstance = UGCApi()
val xminusApplicationMinusId : kotlin.String = xminusApplicationMinusId_example // kotlin.String | 
val xminusRestMinusApiMinusKey : kotlin.String = xminusRestMinusApiMinusKey_example // kotlin.String | 
val provider : kotlin.String = provider_example // kotlin.String | 
val key : kotlin.String = key_example // kotlin.String | 
val type : kotlin.String = type_example // kotlin.String | 
val succeeded : kotlin.Boolean = true // kotlin.Boolean | 
val request : kotlin.Any = Object // kotlin.Any | 
val response : kotlin.Any = Object // kotlin.Any | 
val userId : kotlin.Int = 56 // kotlin.Int | 
try {
    apiInstance.pushLogs1(xminusApplicationMinusId, xminusRestMinusApiMinusKey, provider, key, type, succeeded, request, response, userId)
} catch (e: ClientException) {
    println("4xx response calling UGCApi#pushLogs1")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling UGCApi#pushLogs1")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **xminusApplicationMinusId** | **kotlin.String**|  |
 **xminusRestMinusApiMinusKey** | **kotlin.String**|  |
 **provider** | **kotlin.String**|  |
 **key** | **kotlin.String**|  |
 **type** | **kotlin.String**|  |
 **succeeded** | **kotlin.Boolean**|  |
 **request** | **kotlin.Any**|  |
 **response** | **kotlin.Any**|  |
 **userId** | **kotlin.Int**|  |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: Not defined

<a name="result"></a>
# **result**
> result(xminusApplicationMinusId, xminusRestMinusApiMinusKey, key, user, answer, points, tag)

Result

#### Request details Method:    &#x60;POST&#x60;  URL:    &#x60;/api/v2/ugc/feedbacks&#x60;  #### Headers  &#x60;X-Application-Id&#x60;  &#x60;X-Rest-Api-Key&#x60;  #### Response codes(s) &#x60;200&#x60; OK  &#x60;412&#x60; Validation failed  #### Post params &#x60;key&#x60; (string) **required**  &#x60;user&#x60; (string) **required**  &#x60;answer&#x60; (string) **required**  &#x60;points&#x60; (int) **required**  &#x60;tag&#x60; (string) **required**

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import dk.nodes.nstack.kotlin.codegen.model.*

val apiInstance = UGCApi()
val xminusApplicationMinusId : kotlin.String = xminusApplicationMinusId_example // kotlin.String | 
val xminusRestMinusApiMinusKey : kotlin.String = xminusRestMinusApiMinusKey_example // kotlin.String | 
val key : kotlin.String = key_example // kotlin.String | 
val user : kotlin.String = user_example // kotlin.String | 
val answer : kotlin.Array<kotlin.Int> = 56 // kotlin.Array<kotlin.Int> | 
val points : kotlin.Int = 56 // kotlin.Int | 
val tag : kotlin.String = tag_example // kotlin.String | 
try {
    apiInstance.result(xminusApplicationMinusId, xminusRestMinusApiMinusKey, key, user, answer, points, tag)
} catch (e: ClientException) {
    println("4xx response calling UGCApi#result")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling UGCApi#result")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **xminusApplicationMinusId** | **kotlin.String**|  |
 **xminusRestMinusApiMinusKey** | **kotlin.String**|  |
 **key** | **kotlin.String**|  |
 **user** | **kotlin.String**|  |
 **answer** | **kotlin.Array&lt;kotlin.Int&gt;**|  |
 **points** | **kotlin.Int**|  |
 **tag** | **kotlin.String**|  |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: Not defined

<a name="result1"></a>
# **result1**
> result1(xminusApplicationMinusId, xminusRestMinusApiMinusKey, key, user, answer, points, tag)

Result1

#### Request details Method:    &#x60;POST&#x60;  URL:    &#x60;/api/v1/ugc/feedbacks&#x60;  #### Headers  &#x60;X-Application-Id&#x60;  &#x60;X-Rest-Api-Key&#x60;  #### Response codes(s) &#x60;200&#x60; OK  &#x60;412&#x60; Validation failed  #### Post params &#x60;key&#x60; (string) **required**  &#x60;user&#x60; (string) **required**  &#x60;answer&#x60; (string) **required**  &#x60;points&#x60; (int) **required**  &#x60;tag&#x60; (string) **required** 

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import dk.nodes.nstack.kotlin.codegen.model.*

val apiInstance = UGCApi()
val xminusApplicationMinusId : kotlin.String = xminusApplicationMinusId_example // kotlin.String | 
val xminusRestMinusApiMinusKey : kotlin.String = xminusRestMinusApiMinusKey_example // kotlin.String | 
val key : kotlin.String = key_example // kotlin.String | 
val user : kotlin.String = user_example // kotlin.String | 
val answer : kotlin.Array<kotlin.Int> = 56 // kotlin.Array<kotlin.Int> | 
val points : kotlin.Int = 56 // kotlin.Int | 
val tag : kotlin.String = tag_example // kotlin.String | 
try {
    apiInstance.result1(xminusApplicationMinusId, xminusRestMinusApiMinusKey, key, user, answer, points, tag)
} catch (e: ClientException) {
    println("4xx response calling UGCApi#result1")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling UGCApi#result1")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **xminusApplicationMinusId** | **kotlin.String**|  |
 **xminusRestMinusApiMinusKey** | **kotlin.String**|  |
 **key** | **kotlin.String**|  |
 **user** | **kotlin.String**|  |
 **answer** | **kotlin.Array&lt;kotlin.Int&gt;**|  |
 **points** | **kotlin.Int**|  |
 **tag** | **kotlin.String**|  |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: Not defined


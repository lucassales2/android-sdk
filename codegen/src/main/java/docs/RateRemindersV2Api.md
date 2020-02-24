# RateRemindersV2Api

All URIs are relative to *https://nstack-staging.vapor.cloud*

Method | HTTP request | Description
------------- | ------------- | -------------
[**actionEvents**](RateRemindersV2Api.md#actionEvents) | **POST** /api/v2/notify/rate_reminder_v2/events | ActionEvents
[**actions**](RateRemindersV2Api.md#actions) | **GET** /api/v2/notify/rate_reminder_v2/actions | Actions
[**answer**](RateRemindersV2Api.md#answer) | **POST** /api/v2/notify/rate_reminder_v2/2/answers | Answer
[**getShow12**](RateRemindersV2Api.md#getShow12) | **GET** /api/v2/notify/rate_reminder_v2 | GetShow12


<a name="actionEvents"></a>
# **actionEvents**
> actionEvents(xminusApplicationMinusId, xminusRestMinusApiMinusKey, actionEventsRequest)

ActionEvents

Post rate reminder  #### Request details Method: &#x60;POST&#x60;  URL: &#x60;/api/v2/notify/rate_reminder/views&#x60;  #### Headers  &#x60;X-Application-Id&#x60; (string) **required** _Application ID from [NStack](https://nstack.io)_  &#x60;X-Rest-Api-Key&#x60; (string) **required** _Rest API key from [NStack](https://nstack.io)_  #### URL Parameters &#x60;guid&#x60; (int?) **required** _[?]_  &#x60;platform&#x60; (string) **required** _[is this used at all?]_  &#x60;answer&#x60; (string) **required** _[\&quot;yes\&quot;, \&quot;no\&quot;, \&quot;later\&quot;]_  #### Response codes &#x60;200&#x60; OK  &#x60;412&#x60; Precondition failed  &#x60;445&#x60; Entity not found

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import dk.nodes.nstack.kotlin.codegen.model.*

val apiInstance = RateRemindersV2Api()
val xminusApplicationMinusId : kotlin.String = xminusApplicationMinusId_example // kotlin.String | 
val xminusRestMinusApiMinusKey : kotlin.String = xminusRestMinusApiMinusKey_example // kotlin.String | 
val actionEventsRequest : ActionEventsRequest = {"guid":"hasfdda-safsafad-asdasd-asdas","action":"masiakla-tutaj"} // ActionEventsRequest | 
try {
    apiInstance.actionEvents(xminusApplicationMinusId, xminusRestMinusApiMinusKey, actionEventsRequest)
} catch (e: ClientException) {
    println("4xx response calling RateRemindersV2Api#actionEvents")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling RateRemindersV2Api#actionEvents")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **xminusApplicationMinusId** | **kotlin.String**|  |
 **xminusRestMinusApiMinusKey** | **kotlin.String**|  |
 **actionEventsRequest** | **ActionEventsRequest**|  |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

<a name="actions"></a>
# **actions**
> actions(xminusApplicationMinusId, xminusRestMinusApiMinusKey)

Actions

Get rate reminder  #### Request details Method: &#x60;GET&#x60;  URL: &#x60;/api/v2/notify/rate_reminder/actions&#x60;  #### Headers  &#x60;X-Application-Id&#x60; (string) **required** _Application ID from [NStack](https://nstack.io)_  &#x60;X-Rest-Api-Key&#x60; (string) **required** _Rest API key from [NStack](https://nstack.io)_  #### Response codes &#x60;200&#x60; OK  &#x60;445&#x60; Entity not found

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import dk.nodes.nstack.kotlin.codegen.model.*

val apiInstance = RateRemindersV2Api()
val xminusApplicationMinusId : kotlin.String = xminusApplicationMinusId_example // kotlin.String | 
val xminusRestMinusApiMinusKey : kotlin.String = xminusRestMinusApiMinusKey_example // kotlin.String | 
try {
    apiInstance.actions(xminusApplicationMinusId, xminusRestMinusApiMinusKey)
} catch (e: ClientException) {
    println("4xx response calling RateRemindersV2Api#actions")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling RateRemindersV2Api#actions")
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

<a name="answer"></a>
# **answer**
> answer(xminusApplicationMinusId, xminusRestMinusApiMinusKey, answerRequest)

Answer

Post rate reminder  #### Request details Method: &#x60;POST&#x60;  URL: &#x60;/api/v2/notify/rate_reminder/views&#x60;  #### Headers  &#x60;X-Application-Id&#x60; (string) **required** _Application ID from [NStack](https://nstack.io)_  &#x60;X-Rest-Api-Key&#x60; (string) **required** _Rest API key from [NStack](https://nstack.io)_  #### URL Parameters &#x60;guid&#x60; (int?) **required** _[?]_  &#x60;platform&#x60; (string) **required** _[is this used at all?]_  &#x60;answer&#x60; (string) **required** _[\&quot;yes\&quot;, \&quot;no\&quot;, \&quot;later\&quot;]_  #### Response codes &#x60;200&#x60; OK  &#x60;412&#x60; Precondition failed  &#x60;445&#x60; Entity not found

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import dk.nodes.nstack.kotlin.codegen.model.*

val apiInstance = RateRemindersV2Api()
val xminusApplicationMinusId : kotlin.String = xminusApplicationMinusId_example // kotlin.String | 
val xminusRestMinusApiMinusKey : kotlin.String = xminusRestMinusApiMinusKey_example // kotlin.String | 
val answerRequest : AnswerRequest = {"guid":"hasfdda-safsafad-asdasd-asdas","answer":"negative"} // AnswerRequest | 
try {
    apiInstance.answer(xminusApplicationMinusId, xminusRestMinusApiMinusKey, answerRequest)
} catch (e: ClientException) {
    println("4xx response calling RateRemindersV2Api#answer")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling RateRemindersV2Api#answer")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **xminusApplicationMinusId** | **kotlin.String**|  |
 **xminusRestMinusApiMinusKey** | **kotlin.String**|  |
 **answerRequest** | **AnswerRequest**|  |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

<a name="getShow12"></a>
# **getShow12**
> getShow12(guid, xminusApplicationMinusId, xminusRestMinusApiMinusKey)

GetShow12

Get rate reminder  #### Request details Method: &#x60;GET&#x60;  URL: &#x60;/api/v2/notify/rate_reminder&#x60;  #### Headers  &#x60;X-Application-Id&#x60; (string) **required** _Application ID from [NStack](https://nstack.io)_  &#x60;X-Rest-Api-Key&#x60; (string) **required** _Rest API key from [NStack](https://nstack.io)_  #### URL Parameters &#x60;guid&#x60; (int?) **required** _[?]_  &#x60;platform&#x60; (string) **required** _[is this used at all?]_  #### Response codes &#x60;200&#x60; OK  &#x60;412&#x60; Precondition failed  &#x60;445&#x60; Entity not found

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import dk.nodes.nstack.kotlin.codegen.model.*

val apiInstance = RateRemindersV2Api()
val guid : kotlin.String = guid_example // kotlin.String | 
val xminusApplicationMinusId : kotlin.String = xminusApplicationMinusId_example // kotlin.String | 
val xminusRestMinusApiMinusKey : kotlin.String = xminusRestMinusApiMinusKey_example // kotlin.String | 
try {
    apiInstance.getShow12(guid, xminusApplicationMinusId, xminusRestMinusApiMinusKey)
} catch (e: ClientException) {
    println("4xx response calling RateRemindersV2Api#getShow12")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling RateRemindersV2Api#getShow12")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **guid** | **kotlin.String**|  |
 **xminusApplicationMinusId** | **kotlin.String**|  |
 **xminusRestMinusApiMinusKey** | **kotlin.String**|  |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined


# RateRemindersV2API

All URIs are relative to *https://nstack-staging.vapor.cloud*

Method | HTTP request | Description
------------- | ------------- | -------------
[**actionEvents**](RateRemindersV2API.md#actionevents) | **POST** /api/v2/notify/rate_reminder_v2/events | ActionEvents
[**actions**](RateRemindersV2API.md#actions) | **GET** /api/v2/notify/rate_reminder_v2/actions | Actions
[**answer**](RateRemindersV2API.md#answer) | **POST** /api/v2/notify/rate_reminder_v2/2/answers | Answer
[**getShow12**](RateRemindersV2API.md#getshow12) | **GET** /api/v2/notify/rate_reminder_v2 | GetShow12


# **actionEvents**
```swift
    open class func actionEvents(xApplicationId: String, xRestApiKey: String, actionEventsRequest: ActionEventsRequest, completion: @escaping (_ data: Void?, _ error: Error?) -> Void)
```

ActionEvents

Post rate reminder  #### Request details Method: `POST`  URL: `/api/v2/notify/rate_reminder/views`  #### Headers  `X-Application-Id` (string) **required** _Application ID from [NStack](https://nstack.io)_  `X-Rest-Api-Key` (string) **required** _Rest API key from [NStack](https://nstack.io)_  #### URL Parameters `guid` (int?) **required** _[?]_  `platform` (string) **required** _[is this used at all?]_  `answer` (string) **required** _[\"yes\", \"no\", \"later\"]_  #### Response codes `200` OK  `412` Precondition failed  `445` Entity not found

### Example 
```swift
// The following code samples are still beta. For any issue, please report via http://github.com/OpenAPITools/openapi-generator/issues/new
import OpenAPIClient

let xApplicationId = "xApplicationId_example" // String | 
let xRestApiKey = "xRestApiKey_example" // String | 
let actionEventsRequest = ActionEventsRequest(guid: "guid_example", action: "action_example") // ActionEventsRequest | 

// ActionEvents
RateRemindersV2API.actionEvents(xApplicationId: xApplicationId, xRestApiKey: xRestApiKey, actionEventsRequest: actionEventsRequest) { (response, error) in
    guard error == nil else {
        print(error)
        return
    }

    if (response) {
        dump(response)
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **xApplicationId** | **String** |  | 
 **xRestApiKey** | **String** |  | 
 **actionEventsRequest** | [**ActionEventsRequest**](ActionEventsRequest.md) |  | 

### Return type

Void (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **actions**
```swift
    open class func actions(xApplicationId: String, xRestApiKey: String, completion: @escaping (_ data: Void?, _ error: Error?) -> Void)
```

Actions

Get rate reminder  #### Request details Method: `GET`  URL: `/api/v2/notify/rate_reminder/actions`  #### Headers  `X-Application-Id` (string) **required** _Application ID from [NStack](https://nstack.io)_  `X-Rest-Api-Key` (string) **required** _Rest API key from [NStack](https://nstack.io)_  #### Response codes `200` OK  `445` Entity not found

### Example 
```swift
// The following code samples are still beta. For any issue, please report via http://github.com/OpenAPITools/openapi-generator/issues/new
import OpenAPIClient

let xApplicationId = "xApplicationId_example" // String | 
let xRestApiKey = "xRestApiKey_example" // String | 

// Actions
RateRemindersV2API.actions(xApplicationId: xApplicationId, xRestApiKey: xRestApiKey) { (response, error) in
    guard error == nil else {
        print(error)
        return
    }

    if (response) {
        dump(response)
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **xApplicationId** | **String** |  | 
 **xRestApiKey** | **String** |  | 

### Return type

Void (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **answer**
```swift
    open class func answer(xApplicationId: String, xRestApiKey: String, answerRequest: AnswerRequest, completion: @escaping (_ data: Void?, _ error: Error?) -> Void)
```

Answer

Post rate reminder  #### Request details Method: `POST`  URL: `/api/v2/notify/rate_reminder/views`  #### Headers  `X-Application-Id` (string) **required** _Application ID from [NStack](https://nstack.io)_  `X-Rest-Api-Key` (string) **required** _Rest API key from [NStack](https://nstack.io)_  #### URL Parameters `guid` (int?) **required** _[?]_  `platform` (string) **required** _[is this used at all?]_  `answer` (string) **required** _[\"yes\", \"no\", \"later\"]_  #### Response codes `200` OK  `412` Precondition failed  `445` Entity not found

### Example 
```swift
// The following code samples are still beta. For any issue, please report via http://github.com/OpenAPITools/openapi-generator/issues/new
import OpenAPIClient

let xApplicationId = "xApplicationId_example" // String | 
let xRestApiKey = "xRestApiKey_example" // String | 
let answerRequest = AnswerRequest(guid: "guid_example", answer: "answer_example") // AnswerRequest | 

// Answer
RateRemindersV2API.answer(xApplicationId: xApplicationId, xRestApiKey: xRestApiKey, answerRequest: answerRequest) { (response, error) in
    guard error == nil else {
        print(error)
        return
    }

    if (response) {
        dump(response)
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **xApplicationId** | **String** |  | 
 **xRestApiKey** | **String** |  | 
 **answerRequest** | [**AnswerRequest**](AnswerRequest.md) |  | 

### Return type

Void (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **getShow12**
```swift
    open class func getShow12(guid: String, xApplicationId: String, xRestApiKey: String, completion: @escaping (_ data: Void?, _ error: Error?) -> Void)
```

GetShow12

Get rate reminder  #### Request details Method: `GET`  URL: `/api/v2/notify/rate_reminder`  #### Headers  `X-Application-Id` (string) **required** _Application ID from [NStack](https://nstack.io)_  `X-Rest-Api-Key` (string) **required** _Rest API key from [NStack](https://nstack.io)_  #### URL Parameters `guid` (int?) **required** _[?]_  `platform` (string) **required** _[is this used at all?]_  #### Response codes `200` OK  `412` Precondition failed  `445` Entity not found

### Example 
```swift
// The following code samples are still beta. For any issue, please report via http://github.com/OpenAPITools/openapi-generator/issues/new
import OpenAPIClient

let guid = "guid_example" // String | 
let xApplicationId = "xApplicationId_example" // String | 
let xRestApiKey = "xRestApiKey_example" // String | 

// GetShow12
RateRemindersV2API.getShow12(guid: guid, xApplicationId: xApplicationId, xRestApiKey: xRestApiKey) { (response, error) in
    guard error == nil else {
        print(error)
        return
    }

    if (response) {
        dump(response)
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **guid** | **String** |  | 
 **xApplicationId** | **String** |  | 
 **xRestApiKey** | **String** |  | 

### Return type

Void (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


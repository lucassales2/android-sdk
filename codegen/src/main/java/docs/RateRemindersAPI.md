# RateRemindersAPI

All URIs are relative to *https://nstack-staging.vapor.cloud*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getShow**](RateRemindersAPI.md#getshow) | **GET** /api/v2/notify/rate_reminder | GetShow
[**getShow1**](RateRemindersAPI.md#getshow1) | **GET** /api/v1/notify/rate_reminder | GetShow1
[**markasseen1**](RateRemindersAPI.md#markasseen1) | **POST** /api/v1/notify/rate_reminder/views | Markasseen1
[**postMarkasseen**](RateRemindersAPI.md#postmarkasseen) | **POST** /api/v2/notify/rate_reminder/views | PostMarkasseen


# **getShow**
```swift
    open class func getShow(platform: String, guid: Int, xApplicationId: String, xRestApiKey: String, completion: @escaping (_ data: Void?, _ error: Error?) -> Void)
```

GetShow

Get rate reminder  #### Request details Method: `GET`  URL: `/api/v2/notify/rate_reminder`  #### Headers  `X-Application-Id` (string) **required** _Application ID from [NStack](https://nstack.io)_  `X-Rest-Api-Key` (string) **required** _Rest API key from [NStack](https://nstack.io)_  #### URL Parameters `guid` (int?) **required** _[?]_  `platform` (string) **required** _[is this used at all?]_  #### Response codes `200` OK  `412` Precondition failed  `445` Entity not found

### Example 
```swift
// The following code samples are still beta. For any issue, please report via http://github.com/OpenAPITools/openapi-generator/issues/new
import OpenAPIClient

let platform = "platform_example" // String | 
let guid = 987 // Int | 
let xApplicationId = "xApplicationId_example" // String | 
let xRestApiKey = "xRestApiKey_example" // String | 

// GetShow
RateRemindersAPI.getShow(platform: platform, guid: guid, xApplicationId: xApplicationId, xRestApiKey: xRestApiKey) { (response, error) in
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
 **platform** | **String** |  | 
 **guid** | **Int** |  | 
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

# **getShow1**
```swift
    open class func getShow1(platform: String, guid: Int, xApplicationId: String, xRestApiKey: String, completion: @escaping (_ data: Void?, _ error: Error?) -> Void)
```

GetShow1

Get rate reminder  #### Request details Method: `GET`  URL: `/api/v1/notify/rate_reminder`  #### Headers  `X-Application-Id` (string) **required** _Application ID from [NStack](https://nstack.io)_  `X-Rest-Api-Key` (string) **required** _Rest API key from [NStack](https://nstack.io)_  #### URL Parameters `guid` (int?) **required** _[?]_  `platform` (string) **required** _[is this used at all?]_  #### Response codes `200` OK  `412` Precondition failed  `445` Entity not found

### Example 
```swift
// The following code samples are still beta. For any issue, please report via http://github.com/OpenAPITools/openapi-generator/issues/new
import OpenAPIClient

let platform = "platform_example" // String | 
let guid = 987 // Int | 
let xApplicationId = "xApplicationId_example" // String | 
let xRestApiKey = "xRestApiKey_example" // String | 

// GetShow1
RateRemindersAPI.getShow1(platform: platform, guid: guid, xApplicationId: xApplicationId, xRestApiKey: xRestApiKey) { (response, error) in
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
 **platform** | **String** |  | 
 **guid** | **Int** |  | 
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

# **markasseen1**
```swift
    open class func markasseen1(xApplicationId: String, xRestApiKey: String, guid: Int, platform: String, answer: String, completion: @escaping (_ data: Void?, _ error: Error?) -> Void)
```

Markasseen1

Post rate reminder  #### Request details Method: `POST`  URL: `/api/v1/notify/rate_reminder/views`  #### Headers  `X-Application-Id` (string) **required** _Application ID from [NStack](https://nstack.io)_  `X-Rest-Api-Key` (string) **required** _Rest API key from [NStack](https://nstack.io)_  #### URL Parameters `guid` (int?) **required** _[?]_  `platform` (string) **required** _[is this used at all?]_  `answer` (string) **required** _[\"yes\", \"no\", \"later\"]_  #### Response codes `200` OK  `412` Precondition failed  `445` Entity not found

### Example 
```swift
// The following code samples are still beta. For any issue, please report via http://github.com/OpenAPITools/openapi-generator/issues/new
import OpenAPIClient

let xApplicationId = "xApplicationId_example" // String | 
let xRestApiKey = "xRestApiKey_example" // String | 
let guid = 987 // Int | 
let platform = "platform_example" // String | 
let answer = "answer_example" // String | 

// Markasseen1
RateRemindersAPI.markasseen1(xApplicationId: xApplicationId, xRestApiKey: xRestApiKey, guid: guid, platform: platform, answer: answer) { (response, error) in
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
 **guid** | **Int** |  | 
 **platform** | **String** |  | 
 **answer** | **String** |  | 

### Return type

Void (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **postMarkasseen**
```swift
    open class func postMarkasseen(xApplicationId: String, xRestApiKey: String, guid: Int, platform: String, answer: String, completion: @escaping (_ data: Void?, _ error: Error?) -> Void)
```

PostMarkasseen

Post rate reminder  #### Request details Method: `POST`  URL: `/api/v2/notify/rate_reminder/views`  #### Headers  `X-Application-Id` (string) **required** _Application ID from [NStack](https://nstack.io)_  `X-Rest-Api-Key` (string) **required** _Rest API key from [NStack](https://nstack.io)_  #### URL Parameters `guid` (int?) **required** _[?]_  `platform` (string) **required** _[is this used at all?]_  `answer` (string) **required** _[\"yes\", \"no\", \"later\"]_  #### Response codes `200` OK  `412` Precondition failed  `445` Entity not found

### Example 
```swift
// The following code samples are still beta. For any issue, please report via http://github.com/OpenAPITools/openapi-generator/issues/new
import OpenAPIClient

let xApplicationId = "xApplicationId_example" // String | 
let xRestApiKey = "xRestApiKey_example" // String | 
let guid = 987 // Int | 
let platform = "platform_example" // String | 
let answer = "answer_example" // String | 

// PostMarkasseen
RateRemindersAPI.postMarkasseen(xApplicationId: xApplicationId, xRestApiKey: xRestApiKey, guid: guid, platform: platform, answer: answer) { (response, error) in
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
 **guid** | **Int** |  | 
 **platform** | **String** |  | 
 **answer** | **String** |  | 

### Return type

Void (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


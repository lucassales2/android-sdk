# UGCAPI

All URIs are relative to *https://nstack-staging.vapor.cloud*

Method | HTTP request | Description
------------- | ------------- | -------------
[**feedback**](UGCAPI.md#feedback) | **POST** /api/v2/ugc/feedbacks | Feedback
[**postFeedback**](UGCAPI.md#postfeedback) | **POST** /api/v1/ugc/feedbacks | PostFeedback
[**pushLogs**](UGCAPI.md#pushlogs) | **POST** /api/v2/ugc/push-logs | PushLogs
[**pushLogs1**](UGCAPI.md#pushlogs1) | **POST** /api/v1/ugc/push-logs | PushLogs1
[**result**](UGCAPI.md#result) | **POST** /api/v2/ugc/results | Result
[**result1**](UGCAPI.md#result1) | **POST** /api/v1/ugc/results | Result1


# **feedback**
```swift
    open class func feedback(xApplicationId: String, xRestApiKey: String, breadcrumbs0Meta: String, os: String, device: String, appVersion: String, name: String, email: String, message: String, image: String, type: String, platform: String, metaKey: String, breadcrumbs0Event: String, breadcrumbs0Timestamp: String, completion: @escaping (_ data: Void?, _ error: Error?) -> Void)
```

Feedback

#### Request details  Method:    `POST`  URL:    `/api/v2/ugc/feedbacks`  #### Headers   `X-Application-Id`  `X-Rest-Api-Key`  #### Response codes(s)  `200` OK  `412` Validation failed  #### Post params  `type` (string: feedback, bug) **optional, default is feedback**  `platform` (string: web, ios, android, unknown) **optional, default is unknown**  `os` (string) **optional**  `app_version` (string) **optional**  `device` (string) **optional**  `name` (string) **optional**  `email` (string) **optional**  `message` (string) **optional**  `image` (jpg,jpeg,png) **optional**  `meta` (array/dict, (full flexiable)) **optional**  `breadcrumbs` (array, {event (required): string, timestamp (required): Y-m-d H:i:s, meta (optional): array) **optional**

### Example 
```swift
// The following code samples are still beta. For any issue, please report via http://github.com/OpenAPITools/openapi-generator/issues/new
import OpenAPIClient

let xApplicationId = "xApplicationId_example" // String | 
let xRestApiKey = "xRestApiKey_example" // String | 
let breadcrumbs0Meta = "breadcrumbs0Meta_example" // String | 
let os = "os_example" // String | 
let device = "device_example" // String | 
let appVersion = "appVersion_example" // String | 
let name = "name_example" // String | 
let email = "email_example" // String | 
let message = "message_example" // String | 
let image = "image_example" // String | 
let type = "type_example" // String | 
let platform = "platform_example" // String | 
let metaKey = "metaKey_example" // String | 
let breadcrumbs0Event = "breadcrumbs0Event_example" // String | 
let breadcrumbs0Timestamp = "breadcrumbs0Timestamp_example" // String | 

// Feedback
UGCAPI.feedback(xApplicationId: xApplicationId, xRestApiKey: xRestApiKey, breadcrumbs0Meta: breadcrumbs0Meta, os: os, device: device, appVersion: appVersion, name: name, email: email, message: message, image: image, type: type, platform: platform, metaKey: metaKey, breadcrumbs0Event: breadcrumbs0Event, breadcrumbs0Timestamp: breadcrumbs0Timestamp) { (response, error) in
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
 **breadcrumbs0Meta** | **String** |  | 
 **os** | **String** |  | 
 **device** | **String** |  | 
 **appVersion** | **String** |  | 
 **name** | **String** |  | 
 **email** | **String** |  | 
 **message** | **String** |  | 
 **image** | **String** |  | 
 **type** | **String** |  | 
 **platform** | **String** |  | 
 **metaKey** | **String** |  | 
 **breadcrumbs0Event** | **String** |  | 
 **breadcrumbs0Timestamp** | **String** |  | 

### Return type

Void (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **postFeedback**
```swift
    open class func postFeedback(xApplicationId: String, xRestApiKey: String, os: String, device: String, appVersion: String, name: String, email: String, message: String, image: String, completion: @escaping (_ data: Void?, _ error: Error?) -> Void)
```

PostFeedback

#### Request details  Method:    `POST`  URL:    `/api/v1/ugc/feedbacks`  #### Headers   `X-Application-Id`  `X-Rest-Api-Key`  #### Response codes(s)  `200` OK  `412` Validation failed  #### Post params  `os` (string) **optional**  `app_version` (string) **optional**  `device` (string) **optional**  `name` (string) **optional**  `email` (string) **optional**  `message` (string) **optional**  `image` (jpg,jpeg,png) **optional**

### Example 
```swift
// The following code samples are still beta. For any issue, please report via http://github.com/OpenAPITools/openapi-generator/issues/new
import OpenAPIClient

let xApplicationId = "xApplicationId_example" // String | 
let xRestApiKey = "xRestApiKey_example" // String | 
let os = "os_example" // String | 
let device = "device_example" // String | 
let appVersion = "appVersion_example" // String | 
let name = "name_example" // String | 
let email = "email_example" // String | 
let message = "message_example" // String | 
let image = "image_example" // String | 

// PostFeedback
UGCAPI.postFeedback(xApplicationId: xApplicationId, xRestApiKey: xRestApiKey, os: os, device: device, appVersion: appVersion, name: name, email: email, message: message, image: image) { (response, error) in
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
 **os** | **String** |  | 
 **device** | **String** |  | 
 **appVersion** | **String** |  | 
 **name** | **String** |  | 
 **email** | **String** |  | 
 **message** | **String** |  | 
 **image** | **String** |  | 

### Return type

Void (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **pushLogs**
```swift
    open class func pushLogs(xApplicationId: String, xRestApiKey: String, provider: String, key: String, type: String, succeeded: Bool, request: Any, response: Any, userId: Int, completion: @escaping (_ data: Void?, _ error: Error?) -> Void)
```

PushLogs

#### Request details Method:    `POST`  URL:    `/api/v2/ugc/push-logs`  #### Headers  `X-Application-Id`  `X-Rest-Api-Key`  #### Response codes(s) `201` Created  `412` Validation failed  #### Post params `provider` (string) **required** (fx fcm, urban-airship)  `key` (string) **required** (App key in fcm / ua)  `type` (string) **required** (fx standard, freind-request, taxi-arrived etc)  `succeeded` (bool) **required** (Did push get sent?)  `request` (json) **optional** (Insert everything passed to provider)  `response` (json) **optional** (Insert everything received from provider)  `user_id` (int/string) **optional** (User id)  `relation_type` (string) **optional** (Fx Booking, Company etc)  `relation_id` (int) **optional** (Fx Id of Booking, id of Company etc)

### Example 
```swift
// The following code samples are still beta. For any issue, please report via http://github.com/OpenAPITools/openapi-generator/issues/new
import OpenAPIClient

let xApplicationId = "xApplicationId_example" // String | 
let xRestApiKey = "xRestApiKey_example" // String | 
let provider = "provider_example" // String | 
let key = "key_example" // String | 
let type = "type_example" // String | 
let succeeded = true // Bool | 
let request = 987 // Any | 
let response = 987 // Any | 
let userId = 987 // Int | 

// PushLogs
UGCAPI.pushLogs(xApplicationId: xApplicationId, xRestApiKey: xRestApiKey, provider: provider, key: key, type: type, succeeded: succeeded, request: request, response: response, userId: userId) { (response, error) in
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
 **provider** | **String** |  | 
 **key** | **String** |  | 
 **type** | **String** |  | 
 **succeeded** | **Bool** |  | 
 **request** | [**Any**](Any.md) |  | 
 **response** | [**Any**](Any.md) |  | 
 **userId** | **Int** |  | 

### Return type

Void (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **pushLogs1**
```swift
    open class func pushLogs1(xApplicationId: String, xRestApiKey: String, provider: String, key: String, type: String, succeeded: Bool, request: Any, response: Any, userId: Int, completion: @escaping (_ data: Void?, _ error: Error?) -> Void)
```

PushLogs1

#### Request details Method:    `POST`  URL:    `/api/v1/ugc/push-logs`  #### Headers  `X-Application-Id`  `X-Rest-Api-Key`  #### Response codes(s) `201` Created  `412` Validation failed  #### Post params `provider` (string) **required** (fx fcm, urban-airship)  `key` (string) **required** (App key in fcm / ua)  `type` (string) **required** (fx standard, freind-request, taxi-arrived etc)  `succeeded` (bool) **required** (Did push get sent?)  `request` (json) **optional** (Insert everything passed to provider)  `response` (json) **optional** (Insert everything received from provider)  `user_id` (int/string) **optional** (User id)  `relation_type` (string) **optional** (Fx Booking, Company etc)  `relation_id` (int) **optional** (Fx Id of Booking, id of Company etc)

### Example 
```swift
// The following code samples are still beta. For any issue, please report via http://github.com/OpenAPITools/openapi-generator/issues/new
import OpenAPIClient

let xApplicationId = "xApplicationId_example" // String | 
let xRestApiKey = "xRestApiKey_example" // String | 
let provider = "provider_example" // String | 
let key = "key_example" // String | 
let type = "type_example" // String | 
let succeeded = true // Bool | 
let request = 987 // Any | 
let response = 987 // Any | 
let userId = 987 // Int | 

// PushLogs1
UGCAPI.pushLogs1(xApplicationId: xApplicationId, xRestApiKey: xRestApiKey, provider: provider, key: key, type: type, succeeded: succeeded, request: request, response: response, userId: userId) { (response, error) in
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
 **provider** | **String** |  | 
 **key** | **String** |  | 
 **type** | **String** |  | 
 **succeeded** | **Bool** |  | 
 **request** | [**Any**](Any.md) |  | 
 **response** | [**Any**](Any.md) |  | 
 **userId** | **Int** |  | 

### Return type

Void (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **result**
```swift
    open class func result(xApplicationId: String, xRestApiKey: String, key: String, user: String, answer: [Int], points: Int, tag: String, completion: @escaping (_ data: Void?, _ error: Error?) -> Void)
```

Result

#### Request details Method:    `POST`  URL:    `/api/v2/ugc/feedbacks`  #### Headers  `X-Application-Id`  `X-Rest-Api-Key`  #### Response codes(s) `200` OK  `412` Validation failed  #### Post params `key` (string) **required**  `user` (string) **required**  `answer` (string) **required**  `points` (int) **required**  `tag` (string) **required**

### Example 
```swift
// The following code samples are still beta. For any issue, please report via http://github.com/OpenAPITools/openapi-generator/issues/new
import OpenAPIClient

let xApplicationId = "xApplicationId_example" // String | 
let xRestApiKey = "xRestApiKey_example" // String | 
let key = "key_example" // String | 
let user = "user_example" // String | 
let answer = [123] // [Int] | 
let points = 987 // Int | 
let tag = "tag_example" // String | 

// Result
UGCAPI.result(xApplicationId: xApplicationId, xRestApiKey: xRestApiKey, key: key, user: user, answer: answer, points: points, tag: tag) { (response, error) in
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
 **key** | **String** |  | 
 **user** | **String** |  | 
 **answer** | [**[Int]**](Int.md) |  | 
 **points** | **Int** |  | 
 **tag** | **String** |  | 

### Return type

Void (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **result1**
```swift
    open class func result1(xApplicationId: String, xRestApiKey: String, key: String, user: String, answer: [Int], points: Int, tag: String, completion: @escaping (_ data: Void?, _ error: Error?) -> Void)
```

Result1

#### Request details Method:    `POST`  URL:    `/api/v1/ugc/feedbacks`  #### Headers  `X-Application-Id`  `X-Rest-Api-Key`  #### Response codes(s) `200` OK  `412` Validation failed  #### Post params `key` (string) **required**  `user` (string) **required**  `answer` (string) **required**  `points` (int) **required**  `tag` (string) **required** 

### Example 
```swift
// The following code samples are still beta. For any issue, please report via http://github.com/OpenAPITools/openapi-generator/issues/new
import OpenAPIClient

let xApplicationId = "xApplicationId_example" // String | 
let xRestApiKey = "xRestApiKey_example" // String | 
let key = "key_example" // String | 
let user = "user_example" // String | 
let answer = [123] // [Int] | 
let points = 987 // Int | 
let tag = "tag_example" // String | 

// Result1
UGCAPI.result1(xApplicationId: xApplicationId, xRestApiKey: xRestApiKey, key: key, user: user, answer: answer, points: points, tag: tag) { (response, error) in
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
 **key** | **String** |  | 
 **user** | **String** |  | 
 **answer** | [**[Int]**](Int.md) |  | 
 **points** | **Int** |  | 
 **tag** | **String** |  | 

### Return type

Void (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


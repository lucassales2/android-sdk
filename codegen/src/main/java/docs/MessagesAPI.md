# MessagesAPI

All URIs are relative to *https://nstack-staging.vapor.cloud*

Method | HTTP request | Description
------------- | ------------- | -------------
[**markasseen**](MessagesAPI.md#markasseen) | **POST** /api/v2/notify/messages/views | Markasseen
[**messages**](MessagesAPI.md#messages) | **GET** /api/v2/notify/messages | Messages
[**messages1**](MessagesAPI.md#messages1) | **GET** /api/v1/notify/messages | Messages1
[**viewmessage**](MessagesAPI.md#viewmessage) | **POST** /api/v1/notify/messages/views | Viewmessage


# **markasseen**
```swift
    open class func markasseen(xApplicationId: String, xRestApiKey: String, guid: Int, messageId: Int, completion: @escaping (_ data: MarkAsSeenResponse?, _ error: Error?) -> Void)
```

Markasseen

Register a view update  #### Request details Method: `POST`  URL: `/api/v2/notify/updates/views`  #### Headers  `X-Application-Id` (string) **required** _Application ID from [NStack](https://nstack.io)_  `X-Rest-Api-Key` (string) **required** _Rest API key from [NStack](https://nstack.io)_  #### Parameters `guid` (int) **required** _[?]_  `message_id` **required** _[?]_  #### Response codes `200` OK  `412` Precondition failed

### Example 
```swift
// The following code samples are still beta. For any issue, please report via http://github.com/OpenAPITools/openapi-generator/issues/new
import OpenAPIClient

let xApplicationId = "xApplicationId_example" // String | 
let xRestApiKey = "xRestApiKey_example" // String | 
let guid = 987 // Int | 
let messageId = 987 // Int | 

// Markasseen
MessagesAPI.markasseen(xApplicationId: xApplicationId, xRestApiKey: xRestApiKey, guid: guid, messageId: messageId) { (response, error) in
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
 **messageId** | **Int** |  | 

### Return type

[**MarkAsSeenResponse**](MarkAsSeenResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **messages**
```swift
    open class func messages(platform: String, xApplicationId: String, xRestApiKey: String, completion: @escaping (_ data: Messages?, _ error: Error?) -> Void)
```

Messages

Get message  #### Request details Method:    `GET`  URL:    `/api/v1/notify/messages`  #### Headers  `X-Application-Id` (string) **required** _Application ID from [NStack](https://nstack.io)_  `X-Rest-Api-Key` (string) **required** _Rest API key from [NStack](https://nstack.io)_  #### Query parameters `platform` (string) **required** _[\"ios\", \"android\", \"windows\", \"web\"]_   #### Response codes `200` OK  `412` Precondition failed

### Example 
```swift
// The following code samples are still beta. For any issue, please report via http://github.com/OpenAPITools/openapi-generator/issues/new
import OpenAPIClient

let platform = "platform_example" // String | 
let xApplicationId = "xApplicationId_example" // String | 
let xRestApiKey = "xRestApiKey_example" // String | 

// Messages
MessagesAPI.messages(platform: platform, xApplicationId: xApplicationId, xRestApiKey: xRestApiKey) { (response, error) in
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
 **xApplicationId** | **String** |  | 
 **xRestApiKey** | **String** |  | 

### Return type

[**Messages**](Messages.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **messages1**
```swift
    open class func messages1(platform: String, xApplicationId: String, xRestApiKey: String, completion: @escaping (_ data: Messages?, _ error: Error?) -> Void)
```

Messages1

Get message  #### Request details Method:    `GET`  URL:    `/api/v1/notify/messages`  #### Headers  `X-Application-Id` (string) **required** _Application ID from [NStack](https://nstack.io)_  `X-Rest-Api-Key` (string) **required** _Rest API key from [NStack](https://nstack.io)_  #### Query parameters `platform` (string) **required** _[\"ios\", \"android\", \"windows\", \"web\"]_   #### Response codes `200` OK  `412` Precondition failed

### Example 
```swift
// The following code samples are still beta. For any issue, please report via http://github.com/OpenAPITools/openapi-generator/issues/new
import OpenAPIClient

let platform = "platform_example" // String | 
let xApplicationId = "xApplicationId_example" // String | 
let xRestApiKey = "xRestApiKey_example" // String | 

// Messages1
MessagesAPI.messages1(platform: platform, xApplicationId: xApplicationId, xRestApiKey: xRestApiKey) { (response, error) in
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
 **xApplicationId** | **String** |  | 
 **xRestApiKey** | **String** |  | 

### Return type

[**Messages**](Messages.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **viewmessage**
```swift
    open class func viewmessage(xApplicationId: String, xRestApiKey: String, guid: Int, messageId: Int, completion: @escaping (_ data: Void?, _ error: Error?) -> Void)
```

Viewmessage

Register a view update  #### Request details Method: `POST`  URL: `/api/v1/notify/updates/views`  #### Headers  `X-Application-Id` (string) **required** _Application ID from [NStack](https://nstack.io)_  `X-Rest-Api-Key` (string) **required** _Rest API key from [NStack](https://nstack.io)_  #### Parameters `guid` (int) **required** _[?]_  `message_id` **required** _[?]_  #### Response codes `200` OK  `412` Precondition failed

### Example 
```swift
// The following code samples are still beta. For any issue, please report via http://github.com/OpenAPITools/openapi-generator/issues/new
import OpenAPIClient

let xApplicationId = "xApplicationId_example" // String | 
let xRestApiKey = "xRestApiKey_example" // String | 
let guid = 987 // Int | 
let messageId = 987 // Int | 

// Viewmessage
MessagesAPI.viewmessage(xApplicationId: xApplicationId, xRestApiKey: xRestApiKey, guid: guid, messageId: messageId) { (response, error) in
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
 **messageId** | **Int** |  | 

### Return type

Void (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


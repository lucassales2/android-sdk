# VersionControlAPI

All URIs are relative to *https://nstack-staging.vapor.cloud*

Method | HTTP request | Description
------------- | ------------- | -------------
[**indexupdate**](VersionControlAPI.md#indexupdate) | **GET** /api/v2/notify/updates | Indexupdate
[**indexupdate1**](VersionControlAPI.md#indexupdate1) | **GET** /api/v1/notify/updates | Indexupdate1
[**markupdateasseen**](VersionControlAPI.md#markupdateasseen) | **POST** /api/v2/notify/updates/views | Markupdateasseen
[**markupdateasseen1**](VersionControlAPI.md#markupdateasseen1) | **POST** /api/v1/notify/updates/views | Markupdateasseen1


# **indexupdate**
```swift
    open class func indexupdate(platform: String, currentVersion: Double, lastVersion: Double, xApplicationId: String, xRestApiKey: String, completion: @escaping (_ data: VersionControl?, _ error: Error?) -> Void)
```

Indexupdate

Get app updated  #### Request details Method:    `GET`  URL:    `/api/v2/notify/updates`  #### Headers  `X-Application-Id` (string) **required** _Application ID from [NStack](https://nstack.io)_  `X-Rest-Api-Key` (string) **required** _Rest API key from [NStack](https://nstack.io)_  #### Query parameters `platform` (string) **required** _[\"ios\", \"android\", \"windows\"]_  `current_version` (string) **required** _Current version of app making the request_  `last_version` (string) _[?]_  `test` (bool) _Enable test mode, false equals production_  #### Response codes `200` OK  `412` Precondition failed

### Example 
```swift
// The following code samples are still beta. For any issue, please report via http://github.com/OpenAPITools/openapi-generator/issues/new
import OpenAPIClient

let platform = "platform_example" // String | 
let currentVersion = 987 // Double | 
let lastVersion = 987 // Double | 
let xApplicationId = "xApplicationId_example" // String | 
let xRestApiKey = "xRestApiKey_example" // String | 

// Indexupdate
VersionControlAPI.indexupdate(platform: platform, currentVersion: currentVersion, lastVersion: lastVersion, xApplicationId: xApplicationId, xRestApiKey: xRestApiKey) { (response, error) in
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
 **currentVersion** | **Double** |  | 
 **lastVersion** | **Double** |  | 
 **xApplicationId** | **String** |  | 
 **xRestApiKey** | **String** |  | 

### Return type

[**VersionControl**](VersionControl.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **indexupdate1**
```swift
    open class func indexupdate1(platform: String, currentVersion: Double, lastVersion: Double, xApplicationId: String, xRestApiKey: String, completion: @escaping (_ data: Void?, _ error: Error?) -> Void)
```

Indexupdate1

Get app updated  #### Request details Method:    `GET`  URL:    `/api/v1/notify/updates`  #### Headers  `X-Application-Id` (string) **required** _Application ID from [NStack](https://nstack.io)_  `X-Rest-Api-Key` (string) **required** _Rest API key from [NStack](https://nstack.io)_  #### Query parameters `platform` (string) **required** _[\"ios\", \"android\", \"windows\"]_  `current_version` (string) **required** _Current version of app making the request_  `last_version` (string) _[?]_  `test` (bool) _Enable test mode, false equals production_  #### Response codes `200` OK  `412` Precondition failed

### Example 
```swift
// The following code samples are still beta. For any issue, please report via http://github.com/OpenAPITools/openapi-generator/issues/new
import OpenAPIClient

let platform = "platform_example" // String | 
let currentVersion = 987 // Double | 
let lastVersion = 987 // Double | 
let xApplicationId = "xApplicationId_example" // String | 
let xRestApiKey = "xRestApiKey_example" // String | 

// Indexupdate1
VersionControlAPI.indexupdate1(platform: platform, currentVersion: currentVersion, lastVersion: lastVersion, xApplicationId: xApplicationId, xRestApiKey: xRestApiKey) { (response, error) in
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
 **currentVersion** | **Double** |  | 
 **lastVersion** | **Double** |  | 
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

# **markupdateasseen**
```swift
    open class func markupdateasseen(xApplicationId: String, xRestApiKey: String, guid: Int, updateId: Int, answer: String, type: String, completion: @escaping (_ data: Void?, _ error: Error?) -> Void)
```

Markupdateasseen

Register a view update  #### Request details Method:    `POST`  URL:    `/api/v2/notify/updates/views`  #### Headers  `X-Application-Id` (string) **required** _Application ID from [NStack](https://nstack.io)_  `X-Rest-Api-Key` (string) **required** _Rest API key from [NStack](https://nstack.io)_  #### Parameters `guid` (int) **required** _[?]_  `update_id` (int) **required** _Id of update where view was updated_  `answer` (string) **required** _[\"no\", \"yes\"]_  `type` (string) **required** _[\"newer_version\", \"new_in_version\"]_   #### Response codes `200` OK  `412` Precondition failed

### Example 
```swift
// The following code samples are still beta. For any issue, please report via http://github.com/OpenAPITools/openapi-generator/issues/new
import OpenAPIClient

let xApplicationId = "xApplicationId_example" // String | 
let xRestApiKey = "xRestApiKey_example" // String | 
let guid = 987 // Int | 
let updateId = 987 // Int | 
let answer = "answer_example" // String | 
let type = "type_example" // String | 

// Markupdateasseen
VersionControlAPI.markupdateasseen(xApplicationId: xApplicationId, xRestApiKey: xRestApiKey, guid: guid, updateId: updateId, answer: answer, type: type) { (response, error) in
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
 **updateId** | **Int** |  | 
 **answer** | **String** |  | 
 **type** | **String** |  | 

### Return type

Void (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **markupdateasseen1**
```swift
    open class func markupdateasseen1(xApplicationId: String, xRestApiKey: String, guid: Int, updateId: Int, answer: String, type: String, completion: @escaping (_ data: Void?, _ error: Error?) -> Void)
```

Markupdateasseen1

Register a view update  #### Request details Method:    `POST`  URL:    `/api/v1/notify/updates/views`  #### Headers  `X-Application-Id` (string) **required** _Application ID from [NStack](https://nstack.io)_  `X-Rest-Api-Key` (string) **required** _Rest API key from [NStack](https://nstack.io)_  #### Parameters `guid` (int) **required** _[?]_  `update_id` (int) **required** _Id of update where view was updated_  `answer` (string) **required** _[\"no\", \"yes\"]_  `type` (string) **required** _[\"newer_version\", \"new_in_version\"]_   #### Response codes `200` OK  `412` Precondition failed

### Example 
```swift
// The following code samples are still beta. For any issue, please report via http://github.com/OpenAPITools/openapi-generator/issues/new
import OpenAPIClient

let xApplicationId = "xApplicationId_example" // String | 
let xRestApiKey = "xRestApiKey_example" // String | 
let guid = 987 // Int | 
let updateId = 987 // Int | 
let answer = "answer_example" // String | 
let type = "type_example" // String | 

// Markupdateasseen1
VersionControlAPI.markupdateasseen1(xApplicationId: xApplicationId, xRestApiKey: xRestApiKey, guid: guid, updateId: updateId, answer: answer, type: type) { (response, error) in
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
 **updateId** | **Int** |  | 
 **answer** | **String** |  | 
 **type** | **String** |  | 

### Return type

Void (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


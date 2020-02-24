# FilesAPI

All URIs are relative to *https://nstack-staging.vapor.cloud*

Method | HTTP request | Description
------------- | ------------- | -------------
[**store**](FilesAPI.md#store) | **POST** /api/v2/content/files | Store
[**storewithpath**](FilesAPI.md#storewithpath) | **POST** /api/v1/content/files | Storewithpath


# **store**
```swift
    open class func store(xApplicationId: String, xRestApiKey: String, contentType: String, name: String, tags: String, goneAt: String, file: String, privacy: String, completion: @escaping (_ data: Void?, _ error: Error?) -> Void)
```

Store

Store a file  #### Request details Method: `POST`  URL: `api/v2/content/files`  #### Headers `X-Application-Id` (string) **required** _Application ID from [NStack](https://nstack.io)_  `X-Rest-Api-Key` (string) **required** _Rest API key from [NStack](https://nstack.io)_  #### Post params `name` (string) **required**   `tags` (string, comma seperated) **optional**   `gone_at` (date-time 2019-01-01 00:00:00) **optional**   `privacy` (string [public,public-cdn,private,private-password]) **required**   `file` (file, max 30mb) **required**   #### Response codes(s) `200` OK  `412` Validation error  `500` Internal server error _Please read response message_

### Example 
```swift
// The following code samples are still beta. For any issue, please report via http://github.com/OpenAPITools/openapi-generator/issues/new
import OpenAPIClient

let xApplicationId = "xApplicationId_example" // String | 
let xRestApiKey = "xRestApiKey_example" // String | 
let contentType = "contentType_example" // String | 
let name = "name_example" // String | 
let tags = "tags_example" // String | 
let goneAt = "goneAt_example" // String | 
let file = "file_example" // String | 
let privacy = "privacy_example" // String | 

// Store
FilesAPI.store(xApplicationId: xApplicationId, xRestApiKey: xRestApiKey, contentType: contentType, name: name, tags: tags, goneAt: goneAt, file: file, privacy: privacy) { (response, error) in
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
 **contentType** | **String** |  | 
 **name** | **String** |  | 
 **tags** | **String** |  | 
 **goneAt** | **String** |  | 
 **file** | **String** |  | 
 **privacy** | **String** |  | 

### Return type

Void (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **storewithpath**
```swift
    open class func storewithpath(xApplicationId: String, xRestApiKey: String, contentType: String, name: String, tags: String, goneAt: String, completion: @escaping (_ data: Void?, _ error: Error?) -> Void)
```

Storewithpath

Store a file with path  #### Request details Method: `POST`  URL: `api/v2/content/files/path`  #### Headers `X-Application-Id` (string) **required** _Application ID from [NStack](https://nstack.io)_  `X-Rest-Api-Key` (string) **required** _Rest API key from [NStack](https://nstack.io)_  #### Post params `name` (string) **required**   `tags` (string, comma seperated) **optional**   `gone_at` (date-time 2019-01-01 00:00:00) **optional**   `privacy` (string [public,public-cdn,private,private-password]) **required**   `path` (string) **required**   `mime` (string) **required**   `size` (int) **required**   #### Response codes(s) `200` OK  `404` File in path not found  `409` Path should start with applicationId  `412` Validation error  `500` Internal server error _Please read response message_

### Example 
```swift
// The following code samples are still beta. For any issue, please report via http://github.com/OpenAPITools/openapi-generator/issues/new
import OpenAPIClient

let xApplicationId = "xApplicationId_example" // String | 
let xRestApiKey = "xRestApiKey_example" // String | 
let contentType = "contentType_example" // String | 
let name = "name_example" // String | 
let tags = "tags_example" // String | 
let goneAt = "goneAt_example" // String | 

// Storewithpath
FilesAPI.storewithpath(xApplicationId: xApplicationId, xRestApiKey: xRestApiKey, contentType: contentType, name: name, tags: tags, goneAt: goneAt) { (response, error) in
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
 **contentType** | **String** |  | 
 **name** | **String** |  | 
 **tags** | **String** |  | 
 **goneAt** | **String** |  | 

### Return type

Void (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


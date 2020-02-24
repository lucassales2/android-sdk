# ResponsesAPI

All URIs are relative to *https://nstack-staging.vapor.cloud*

Method | HTTP request | Description
------------- | ------------- | -------------
[**show**](ResponsesAPI.md#show) | **GET** /api/v2/content/responses/15 | Show
[**show1**](ResponsesAPI.md#show1) | **GET** /api/v1/content/responses/15 | Show1


# **show**
```swift
    open class func show(xApplicationId: String, xRestApiKey: String, contentType: String, completion: @escaping (_ data: Void?, _ error: Error?) -> Void)
```

Show

Get one response  #### Request details Method: `GET`  URL: `api/v2/content/responses/{id_or_slug}`  #### Headers `X-Application-Id` (string) **required** _Application ID from [NStack](https://nstack.io)_  `X-Rest-Api-Key` (string) **required** _Rest API key from [NStack](https://nstack.io)_  #### URL Parameters `id_or_slug` (string/int) **required** _ID or slug of content type [15, \"terms\", \"about\"]_  #### Query params `data` (bool) **option** _defaul true - should the object be in data_  #### Response codes(s) `200` OK  `404` Entity not found  `500` Internal server error _Please read response message_

### Example 
```swift
// The following code samples are still beta. For any issue, please report via http://github.com/OpenAPITools/openapi-generator/issues/new
import OpenAPIClient

let xApplicationId = "xApplicationId_example" // String | 
let xRestApiKey = "xRestApiKey_example" // String | 
let contentType = "contentType_example" // String | 

// Show
ResponsesAPI.show(xApplicationId: xApplicationId, xRestApiKey: xRestApiKey, contentType: contentType) { (response, error) in
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

### Return type

Void (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **show1**
```swift
    open class func show1(xApplicationId: String, xRestApiKey: String, contentType: String, completion: @escaping (_ data: Void?, _ error: Error?) -> Void)
```

Show1

Get one response  #### Request details Method: `GET`  URL: `api/v1/content/responses/{id_or_slug}`  #### Headers `X-Application-Id` (string) **required** _Application ID from [NStack](https://nstack.io)_  `X-Rest-Api-Key` (string) **required** _Rest API key from [NStack](https://nstack.io)_  #### URL Parameters `id_or_slug` (string/int) **required** _ID or slug of content type [15, \"terms\", \"about\"]_  #### Query params `data` (bool) **option** _defaul true - should the object be in data_  #### Response codes(s) `200` OK  `445` Entity not found  `500` Internal server error _Please read response message_

### Example 
```swift
// The following code samples are still beta. For any issue, please report via http://github.com/OpenAPITools/openapi-generator/issues/new
import OpenAPIClient

let xApplicationId = "xApplicationId_example" // String | 
let xRestApiKey = "xRestApiKey_example" // String | 
let contentType = "contentType_example" // String | 

// Show1
ResponsesAPI.show1(xApplicationId: xApplicationId, xRestApiKey: xRestApiKey, contentType: contentType) { (response, error) in
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

### Return type

Void (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


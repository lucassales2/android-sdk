# AdminAPIAPI

All URIs are relative to *https://nstack-staging.vapor.cloud*

Method | HTTP request | Description
------------- | ------------- | -------------
[**search**](AdminAPIAPI.md#search) | **GET** /admin/search/company-applications | Search


# **search**
```swift
    open class func search(q: String, authorization: String, contentType: String, completion: @escaping (_ data: AppopenV2?, _ error: Error?) -> Void)
```

Search

Retrieve a list of valid continents on Earth  #### Request details Method:    `GET`  URL:    `/admin/search/company-applications`  #### Headers  `Authorization` (string) **required** _Token_  #### Response codes(s) `200` OK

### Example 
```swift
// The following code samples are still beta. For any issue, please report via http://github.com/OpenAPITools/openapi-generator/issues/new
import OpenAPIClient

let q = "q_example" // String | 
let authorization = "authorization_example" // String | 
let contentType = "contentType_example" // String | 

// Search
AdminAPIAPI.search(q: q, authorization: authorization, contentType: contentType) { (response, error) in
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
 **q** | **String** |  | 
 **authorization** | **String** |  | 
 **contentType** | **String** |  | 

### Return type

[**AppopenV2**](AppopenV2.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


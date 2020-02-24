# LanguagesAPI

All URIs are relative to *https://nstack-staging.vapor.cloud*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getIndex112**](LanguagesAPI.md#getindex112) | **GET** /api/v1/geographic/languages | GetIndex112
[**getIndex12**](LanguagesAPI.md#getindex12) | **GET** /api/v2/geographic/languages | GetIndex12


# **getIndex112**
```swift
    open class func getIndex112(xApplicationId: String, xRestApiKey: String, completion: @escaping (_ data: Void?, _ error: Error?) -> Void)
```

GetIndex112

Retrieve a list of valid languages spoken by humans on Earth  #### Request details Method:    `GET`  URL:    `/api/v1/geographic/languages`  #### Headers  `X-Application-Id` (string) **required** _Application ID from [NStack](https://nstack.io)_  `X-Rest-Api-Key` (string) **required** _Rest API key from [NStack](https://nstack.io)_  #### Query parameters (filters) `limit` (int) _Eg: [/api/geographic/languages?limit=1] Default limit is 500_  `search` (string) _Eg: [/api/geographic/languages?search=en]_  `fields` (string) _Eg: [/api/geographic/languages?fields=name,locale]_  #### Response codes(s) `200` OK  `412` Precondition failed _Invalid filters_  

### Example 
```swift
// The following code samples are still beta. For any issue, please report via http://github.com/OpenAPITools/openapi-generator/issues/new
import OpenAPIClient

let xApplicationId = "xApplicationId_example" // String | 
let xRestApiKey = "xRestApiKey_example" // String | 

// GetIndex112
LanguagesAPI.getIndex112(xApplicationId: xApplicationId, xRestApiKey: xRestApiKey) { (response, error) in
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

# **getIndex12**
```swift
    open class func getIndex12(xApplicationId: String, xRestApiKey: String, completion: @escaping (_ data: Void?, _ error: Error?) -> Void)
```

GetIndex12

Retrieve a list of valid languages spoken by humans on Earth  #### Request details Method:    `GET`  URL:    `/api/v2/geographic/languages`  #### Headers  `X-Application-Id` (string) **required** _Application ID from [NStack](https://nstack.io)_  `X-Rest-Api-Key` (string) **required** _Rest API key from [NStack](https://nstack.io)_  #### Query parameters (filters) `limit` (int) _Eg: [/api/geographic/languages?limit=1] Default limit is 500_  `search` (string) _Eg: [/api/geographic/languages?search=en]_  `fields` (string) _Eg: [/api/geographic/languages?fields=name,locale]_  #### Response codes(s) `200` OK  `412` Precondition failed _Invalid filters_

### Example 
```swift
// The following code samples are still beta. For any issue, please report via http://github.com/OpenAPITools/openapi-generator/issues/new
import OpenAPIClient

let xApplicationId = "xApplicationId_example" // String | 
let xRestApiKey = "xRestApiKey_example" // String | 

// GetIndex12
LanguagesAPI.getIndex12(xApplicationId: xApplicationId, xRestApiKey: xRestApiKey) { (response, error) in
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


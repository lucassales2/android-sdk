# TermsAPI

All URIs are relative to *https://nstack-staging.vapor.cloud*

Method | HTTP request | Description
------------- | ------------- | -------------
[**index**](TermsAPI.md#index) | **GET** /terms | Index
[**indexversions**](TermsAPI.md#indexversions) | **GET** /api/v2/content/terms/some-terms-1/versions | Indexversions
[**newestversion**](TermsAPI.md#newestversion) | **GET** /api/v2/content/terms/some-terms-1/versions/newest | Newestversion
[**showversion**](TermsAPI.md#showversion) | **GET** /api/v2/content/terms/versions/5 | Showversion
[**storeView**](TermsAPI.md#storeview) | **POST** /api/v2/content/terms/versions/views | StoreView


# **index**
```swift
    open class func index(xApplicationId: String, xRestApiKey: String, nMeta: String, acceptLanguage: String, completion: @escaping (_ data: Void?, _ error: Error?) -> Void)
```

Index

List all Terms  #### Request details Method: `GET`  URL: `api/v2/content/terms`  #### Headers `X-Application-Id` (string) **required** _Application ID from [NStack](https://nstack.io)_  `X-Rest-Api-Key` (string) **required** _Rest API key from [NStack](https://nstack.io)_   #### Response codes(s) `200` OK  `404` Entity not found  `500` Internal server error _Please read response message_

### Example 
```swift
// The following code samples are still beta. For any issue, please report via http://github.com/OpenAPITools/openapi-generator/issues/new
import OpenAPIClient

let xApplicationId = "xApplicationId_example" // String | 
let xRestApiKey = "xRestApiKey_example" // String | 
let nMeta = "nMeta_example" // String | 
let acceptLanguage = "acceptLanguage_example" // String | 

// Index
TermsAPI.index(xApplicationId: xApplicationId, xRestApiKey: xRestApiKey, nMeta: nMeta, acceptLanguage: acceptLanguage) { (response, error) in
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
 **nMeta** | **String** |  | 
 **acceptLanguage** | **String** |  | 

### Return type

Void (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **indexversions**
```swift
    open class func indexversions(xApplicationId: String, xRestApiKey: String, nMeta: String, acceptLanguage: String, completion: @escaping (_ data: Void?, _ error: Error?) -> Void)
```

Indexversions

List all Version  #### Request details Method: `GET`  URL: `api/v2/content/terms/{slugOrId}/versions`  #### Headers `X-Application-Id` (string) **required** _Application ID from [NStack](https://nstack.io)_  `X-Rest-Api-Key` (string) **required** _Rest API key from [NStack](https://nstack.io)_  #### Response codes(s) `200` OK  `404` Entity not found  `500` Internal server error _Please read response message_

### Example 
```swift
// The following code samples are still beta. For any issue, please report via http://github.com/OpenAPITools/openapi-generator/issues/new
import OpenAPIClient

let xApplicationId = "xApplicationId_example" // String | 
let xRestApiKey = "xRestApiKey_example" // String | 
let nMeta = "nMeta_example" // String | 
let acceptLanguage = "acceptLanguage_example" // String | 

// Indexversions
TermsAPI.indexversions(xApplicationId: xApplicationId, xRestApiKey: xRestApiKey, nMeta: nMeta, acceptLanguage: acceptLanguage) { (response, error) in
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
 **nMeta** | **String** |  | 
 **acceptLanguage** | **String** |  | 

### Return type

Void (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **newestversion**
```swift
    open class func newestversion(xApplicationId: String, xRestApiKey: String, nMeta: String, acceptLanguage: String, completion: @escaping (_ data: Void?, _ error: Error?) -> Void)
```

Newestversion

List all Version  #### Request details Method: `GET`  URL: `api/v2/content/terms/{slugOrId}/versions/newest`  #### Headers `X-Application-Id` (string) **required** _Application ID from [NStack](https://nstack.io)_  `X-Rest-Api-Key` (string) **required** _Rest API key from [NStack](https://nstack.io)_  #### Response codes(s) `200` OK  `404` Entity not found  `500` Internal server error _Please read response message_

### Example 
```swift
// The following code samples are still beta. For any issue, please report via http://github.com/OpenAPITools/openapi-generator/issues/new
import OpenAPIClient

let xApplicationId = "xApplicationId_example" // String | 
let xRestApiKey = "xRestApiKey_example" // String | 
let nMeta = "nMeta_example" // String | 
let acceptLanguage = "acceptLanguage_example" // String | 

// Newestversion
TermsAPI.newestversion(xApplicationId: xApplicationId, xRestApiKey: xRestApiKey, nMeta: nMeta, acceptLanguage: acceptLanguage) { (response, error) in
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
 **nMeta** | **String** |  | 
 **acceptLanguage** | **String** |  | 

### Return type

Void (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **showversion**
```swift
    open class func showversion(guid: String, xApplicationId: String, xRestApiKey: String, nMeta: String, acceptLanguage: String, completion: @escaping (_ data: Void?, _ error: Error?) -> Void)
```

Showversion

List all Version  #### Request details Method: `GET`  URL: `api/v2/content/terms/versions/{id}`  #### Headers `X-Application-Id` (string) **required** _Application ID from [NStack](https://nstack.io)_  `X-Rest-Api-Key` (string) **required** _Rest API key from [NStack](https://nstack.io)_  `Accept-Language` (string) **optional** _Set this to get best fit locale_  #### Query params `guid` (string) **optional** _If you want `has_viewed` to be calculated_  #### Response codes(s) `200` OK  `404` Entity not found  `500` Internal server error _Please read response message_

### Example 
```swift
// The following code samples are still beta. For any issue, please report via http://github.com/OpenAPITools/openapi-generator/issues/new
import OpenAPIClient

let guid = "guid_example" // String | 
let xApplicationId = "xApplicationId_example" // String | 
let xRestApiKey = "xRestApiKey_example" // String | 
let nMeta = "nMeta_example" // String | 
let acceptLanguage = "acceptLanguage_example" // String | 

// Showversion
TermsAPI.showversion(guid: guid, xApplicationId: xApplicationId, xRestApiKey: xRestApiKey, nMeta: nMeta, acceptLanguage: acceptLanguage) { (response, error) in
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
 **nMeta** | **String** |  | 
 **acceptLanguage** | **String** |  | 

### Return type

Void (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **storeView**
```swift
    open class func storeView(xApplicationId: String, xRestApiKey: String, nMeta: String, acceptLanguage: String, termVersionId: Int, guid: String, identifier: String, locale: String, completion: @escaping (_ data: Void?, _ error: Error?) -> Void)
```

StoreView

Create a new View #### Request details Method: `POST`  URL: `/api/v2/content/terms/versions/{id}/views`  #### Headers `X-Application-Id` (string) **required** _Application ID from [NStack](https://nstack.io)_  `X-Rest-Api-Key` (string) **required** _Rest API key from [NStack](https://nstack.io)_  #### Post params `term_version_id` (int) **required** _ID of Terms Version_  `guid` (string) **required** _GUID_  `identifier` (string) **required**  `locale` (string) **required**  #### Response codes(s) `200` OK  `412` Precondition failed _Please read response message_  `500` Internal server error _Please read response message_

### Example 
```swift
// The following code samples are still beta. For any issue, please report via http://github.com/OpenAPITools/openapi-generator/issues/new
import OpenAPIClient

let xApplicationId = "xApplicationId_example" // String | 
let xRestApiKey = "xRestApiKey_example" // String | 
let nMeta = "nMeta_example" // String | 
let acceptLanguage = "acceptLanguage_example" // String | 
let termVersionId = 987 // Int | 
let guid = "guid_example" // String | 
let identifier = "identifier_example" // String | 
let locale = "locale_example" // String | 

// StoreView
TermsAPI.storeView(xApplicationId: xApplicationId, xRestApiKey: xRestApiKey, nMeta: nMeta, acceptLanguage: acceptLanguage, termVersionId: termVersionId, guid: guid, identifier: identifier, locale: locale) { (response, error) in
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
 **nMeta** | **String** |  | 
 **acceptLanguage** | **String** |  | 
 **termVersionId** | **Int** |  | 
 **guid** | **String** |  | 
 **identifier** | **String** |  | 
 **locale** | **String** |  | 

### Return type

Void (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


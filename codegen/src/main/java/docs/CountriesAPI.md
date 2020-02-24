# CountriesAPI

All URIs are relative to *https://nstack-staging.vapor.cloud*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getIndex1**](CountriesAPI.md#getindex1) | **GET** /api/v2/geographic/countries | GetIndex1
[**getIndex11**](CountriesAPI.md#getindex11) | **GET** /api/v1/geographic/countries | GetIndex11
[**getShow11**](CountriesAPI.md#getshow11) | **GET** /api/v1/geographic/countries/1 | GetShow11
[**getShow1234**](CountriesAPI.md#getshow1234) | **GET** /api/v2/geographic/countries/4 | GetShow1234


# **getIndex1**
```swift
    open class func getIndex1(xApplicationId: String, xRestApiKey: String, completion: @escaping (_ data: Void?, _ error: Error?) -> Void)
```

GetIndex1

Retrieve a list of valid countries on Earth  #### Request details Method:    `GET`  URL:    `/api/v2/geographic/countries`  #### Headers  `X-Application-Id` (string) **required** _Application ID from [NStack](https://nstack.io)_  `X-Rest-Api-Key` (string) **required** _Rest API key from [NStack](https://nstack.io)_  #### Query parameters (filters) `limit` (int) _Eg: [/api/geographic/countries?limit=1] Default limit is 500_  `order_by_column` (string) _Eg; [/api/geographic/countries?order\\_by\\_column=name]_  `order_by_direction` (string) _Eg; [/api/geographic/countries?order\\_by\\_direction=asc]_  `search` (string) _Eg: [/api/geographic/countries?search=Andorra]_  `fields` (string) _Eg: [/api/geographic/countries?fields=name,code]_  `continents` (string) _Eg: [/api/geographic/countries?continents=EU,AF]_  #### Response codes(s) `200` OK  `412` Precondition failed _Invalid filters_

### Example 
```swift
// The following code samples are still beta. For any issue, please report via http://github.com/OpenAPITools/openapi-generator/issues/new
import OpenAPIClient

let xApplicationId = "xApplicationId_example" // String | 
let xRestApiKey = "xRestApiKey_example" // String | 

// GetIndex1
CountriesAPI.getIndex1(xApplicationId: xApplicationId, xRestApiKey: xRestApiKey) { (response, error) in
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

# **getIndex11**
```swift
    open class func getIndex11(xApplicationId: String, xRestApiKey: String, completion: @escaping (_ data: Void?, _ error: Error?) -> Void)
```

GetIndex11

Retrieve a list of valid countries on Earth  #### Request details Method:    `GET`  URL:    `/api/v1/geographic/countries`  #### Headers  `X-Application-Id` (string) **required** _Application ID from [NStack](https://nstack.io)_  `X-Rest-Api-Key` (string) **required** _Rest API key from [NStack](https://nstack.io)_  #### Query parameters (filters) `limit` (int) _Eg: [/api/geographic/countries?limit=1] Default limit is 500_  `order_by_column` (string) _Eg; [/api/geographic/countries?order\\_by\\_column=name]_  `order_by_direction` (string) _Eg; [/api/geographic/countries?order\\_by\\_direction=asc]_  `search` (string) _Eg: [/api/geographic/countries?search=Andorra]_  `fields` (string) _Eg: [/api/geographic/countries?fields=name,code]_  `continents` (string) _Eg: [/api/geographic/countries?continents=EU,AF]_  #### Response codes(s) `200` OK  `412` Precondition failed _Invalid filters_ 

### Example 
```swift
// The following code samples are still beta. For any issue, please report via http://github.com/OpenAPITools/openapi-generator/issues/new
import OpenAPIClient

let xApplicationId = "xApplicationId_example" // String | 
let xRestApiKey = "xRestApiKey_example" // String | 

// GetIndex11
CountriesAPI.getIndex11(xApplicationId: xApplicationId, xRestApiKey: xRestApiKey) { (response, error) in
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

# **getShow11**
```swift
    open class func getShow11(xApplicationId: String, xRestApiKey: String, completion: @escaping (_ data: Void?, _ error: Error?) -> Void)
```

GetShow11

Retrieve details of a specific country on Earth  #### Request details Method:    `GET`  URL:    `/api/v1/geographic/countries/{id}`  #### Headers `X-Application-Id` (string) **required** _Application ID from [NStack](https://nstack.io)_  `X-Rest-Api-Key` (string) **required** _Rest API key from [NStack](https://nstack.io)_  #### URL Parameters `id` (int) **required** _Country id_  #### Response codes(s) `200` OK  `445` Entity not found

### Example 
```swift
// The following code samples are still beta. For any issue, please report via http://github.com/OpenAPITools/openapi-generator/issues/new
import OpenAPIClient

let xApplicationId = "xApplicationId_example" // String | 
let xRestApiKey = "xRestApiKey_example" // String | 

// GetShow11
CountriesAPI.getShow11(xApplicationId: xApplicationId, xRestApiKey: xRestApiKey) { (response, error) in
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

# **getShow1234**
```swift
    open class func getShow1234(xApplicationId: String, xRestApiKey: String, completion: @escaping (_ data: Void?, _ error: Error?) -> Void)
```

GetShow1234

Retrieve details of a specific country on Earth  #### Request details Method:    `GET`  URL:    `/api/v2/geographic/countries/{id}`  #### Headers `X-Application-Id` (string) **required** _Application ID from [NStack](https://nstack.io)_  `X-Rest-Api-Key` (string) **required** _Rest API key from [NStack](https://nstack.io)_  #### URL Parameters `id` (int) **required** _Country id_  #### Response codes(s) `200` OK  `404` Entity not found

### Example 
```swift
// The following code samples are still beta. For any issue, please report via http://github.com/OpenAPITools/openapi-generator/issues/new
import OpenAPIClient

let xApplicationId = "xApplicationId_example" // String | 
let xRestApiKey = "xRestApiKey_example" // String | 

// GetShow1234
CountriesAPI.getShow1234(xApplicationId: xApplicationId, xRestApiKey: xRestApiKey) { (response, error) in
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


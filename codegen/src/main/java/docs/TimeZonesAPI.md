# TimeZonesAPI

All URIs are relative to *https://nstack-staging.vapor.cloud*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getIndex1123**](TimeZonesAPI.md#getindex1123) | **GET** /api/v1/geographic/time_zones | GetIndex1123
[**getIndex123**](TimeZonesAPI.md#getindex123) | **GET** /api/v2/geographic/time_zones | GetIndex123
[**getShow1123**](TimeZonesAPI.md#getshow1123) | **GET** /api/v1/geographic/time_zones/1 | GetShow1123
[**getShow123456**](TimeZonesAPI.md#getshow123456) | **GET** /api/v2/geographic/time_zones/1 | GetShow123456
[**showbylatlng**](TimeZonesAPI.md#showbylatlng) | **GET** /api/v2/geographic/time_zones/by_lat_lng | Showbylatlng
[**showbylatlng1**](TimeZonesAPI.md#showbylatlng1) | **GET** /api/v1/geographic/time_zones/by_lat_lng | Showbylatlng1


# **getIndex1123**
```swift
    open class func getIndex1123(xApplicationId: String, xRestApiKey: String, completion: @escaping (_ data: Void?, _ error: Error?) -> Void)
```

GetIndex1123

Retrieve a list of valid timesones on Earth  #### Request details Method:    `GET`  URL:    `/api/v1/geographic/timezones`  #### Headers  `X-Application-Id` (string) **required** _Application ID from [NStack](https://nstack.io)_  `X-Rest-Api-Key` (string) **required** _Rest API key from [NStack](https://nstack.io)_  #### Query parameters (filters) `limit` (int) _Eg: [/api/geographic/timezones?limit=1] Default limit is 1000_  `order` (string) _Eg: [/api/geographic/timezones?order=name:desc]_  `search` (string) _[Eg: /api/geographic/timezones?search=Europe/Andorra]_  `fields` (string) _[Eg: /api/geographic/timezones?fields=name,abbr]_  #### Response codes(s)  `200` OK  `412` Precondition failed _Invalid filters_ 

### Example 
```swift
// The following code samples are still beta. For any issue, please report via http://github.com/OpenAPITools/openapi-generator/issues/new
import OpenAPIClient

let xApplicationId = "xApplicationId_example" // String | 
let xRestApiKey = "xRestApiKey_example" // String | 

// GetIndex1123
TimeZonesAPI.getIndex1123(xApplicationId: xApplicationId, xRestApiKey: xRestApiKey) { (response, error) in
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

# **getIndex123**
```swift
    open class func getIndex123(xApplicationId: String, xRestApiKey: String, completion: @escaping (_ data: Void?, _ error: Error?) -> Void)
```

GetIndex123

Retrieve a list of valid timesones on Earth  #### Request details Method:    `GET`  URL:    `/api/v2/geographic/timezones`  #### Headers  `X-Application-Id` (string) **required** _Application ID from [NStack](https://nstack.io)_  `X-Rest-Api-Key` (string) **required** _Rest API key from [NStack](https://nstack.io)_  #### Query parameters (filters) `limit` (int) _Eg: [/api/geographic/timezones?limit=1] Default limit is 1000_  `order` (string) _Eg: [/api/geographic/timezones?order=name:desc]_  `search` (string) _[Eg: /api/geographic/timezones?search=Europe/Andorra]_  `fields` (string) _[Eg: /api/geographic/timezones?fields=name,abbr]_  #### Response codes(s)  `200` OK  `412` Precondition failed _Invalid filters_

### Example 
```swift
// The following code samples are still beta. For any issue, please report via http://github.com/OpenAPITools/openapi-generator/issues/new
import OpenAPIClient

let xApplicationId = "xApplicationId_example" // String | 
let xRestApiKey = "xRestApiKey_example" // String | 

// GetIndex123
TimeZonesAPI.getIndex123(xApplicationId: xApplicationId, xRestApiKey: xRestApiKey) { (response, error) in
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

# **getShow1123**
```swift
    open class func getShow1123(xApplicationId: String, xRestApiKey: String, completion: @escaping (_ data: Void?, _ error: Error?) -> Void)
```

GetShow1123

Retrieve details of a timezone  #### Request details Method:    `GET`  URL:    `/api/v1/geographic/timezones/{id}`  #### Headers  `X-Application-Id` (string) **required** _Application ID from [NStack](https://nstack.io)_  `X-Rest-Api-Key` (string) **required** _Rest API key from [NStack](https://nstack.io)_  #### Response codes(s)  `200` OK  `445` Entity not found

### Example 
```swift
// The following code samples are still beta. For any issue, please report via http://github.com/OpenAPITools/openapi-generator/issues/new
import OpenAPIClient

let xApplicationId = "xApplicationId_example" // String | 
let xRestApiKey = "xRestApiKey_example" // String | 

// GetShow1123
TimeZonesAPI.getShow1123(xApplicationId: xApplicationId, xRestApiKey: xRestApiKey) { (response, error) in
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

# **getShow123456**
```swift
    open class func getShow123456(xApplicationId: String, xRestApiKey: String, completion: @escaping (_ data: Void?, _ error: Error?) -> Void)
```

GetShow123456

Retrieve details of a timezone  #### Request details Method:    `GET`  URL:    `/api/v2/geographic/timezones/{id}`  #### Headers  `X-Application-Id` (string) **required** _Application ID from [NStack](https://nstack.io)_  `X-Rest-Api-Key` (string) **required** _Rest API key from [NStack](https://nstack.io)_  #### Response codes(s)  `200` OK  `445` Entity not found

### Example 
```swift
// The following code samples are still beta. For any issue, please report via http://github.com/OpenAPITools/openapi-generator/issues/new
import OpenAPIClient

let xApplicationId = "xApplicationId_example" // String | 
let xRestApiKey = "xRestApiKey_example" // String | 

// GetShow123456
TimeZonesAPI.getShow123456(xApplicationId: xApplicationId, xRestApiKey: xRestApiKey) { (response, error) in
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

# **showbylatlng**
```swift
    open class func showbylatlng(latLng: String, xApplicationId: String, xRestApiKey: String, completion: @escaping (_ data: Void?, _ error: Error?) -> Void)
```

Showbylatlng

Retrieve details of a nearest timezone by lat lng  #### Request details Method:    `GET`  URL:    `/api/v2/geographic/timezones/by_lat_lng`  #### Headers  `X-Application-Id` (string) **required** _Application ID from [NStack](https://nstack.io)_  `X-Rest-Api-Key` (string) **required** _Rest API key from [NStack](https://nstack.io)_  #### Query parameters `lat_lng` (double,double) _Eg: 55.1231,12.1231_  #### Response codes(s)  `200` OK  `412` Preconditions Failed (Missing ?lat_lng=)  `404` Entity not found

### Example 
```swift
// The following code samples are still beta. For any issue, please report via http://github.com/OpenAPITools/openapi-generator/issues/new
import OpenAPIClient

let latLng = "latLng_example" // String | 
let xApplicationId = "xApplicationId_example" // String | 
let xRestApiKey = "xRestApiKey_example" // String | 

// Showbylatlng
TimeZonesAPI.showbylatlng(latLng: latLng, xApplicationId: xApplicationId, xRestApiKey: xRestApiKey) { (response, error) in
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
 **latLng** | **String** |  | 
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

# **showbylatlng1**
```swift
    open class func showbylatlng1(latLng: String, xApplicationId: String, xRestApiKey: String, completion: @escaping (_ data: Void?, _ error: Error?) -> Void)
```

Showbylatlng1

Retrieve details of a nearest timezone by lat lng  #### Request details Method:    `GET`  URL:    `/api/v1/geographic/timezones/by_lat_lng`  #### Headers  `X-Application-Id` (string) **required** _Application ID from [NStack](https://nstack.io)_  `X-Rest-Api-Key` (string) **required** _Rest API key from [NStack](https://nstack.io)_  #### Query parameters `lat_lng` (double,double) _Eg: 55.1231,12.1231_  #### Response codes(s)  `200` OK  `412` Preconditions Failed (Missing ?lat_lng=)  `445` Entity not found

### Example 
```swift
// The following code samples are still beta. For any issue, please report via http://github.com/OpenAPITools/openapi-generator/issues/new
import OpenAPIClient

let latLng = "latLng_example" // String | 
let xApplicationId = "xApplicationId_example" // String | 
let xRestApiKey = "xRestApiKey_example" // String | 

// Showbylatlng1
TimeZonesAPI.showbylatlng1(latLng: latLng, xApplicationId: xApplicationId, xRestApiKey: xRestApiKey) { (response, error) in
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
 **latLng** | **String** |  | 
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


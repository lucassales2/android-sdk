# DashboardsAPI

All URIs are relative to *https://nstack-staging.vapor.cloud*

Method | HTTP request | Description
------------- | ------------- | -------------
[**dashboard**](DashboardsAPI.md#dashboard) | **GET** /api/v2/content/dashboards/DAS-ad21e084-ae03-4486-a5ec-d837dfc56fd2 | Dashboard
[**visualization**](DashboardsAPI.md#visualization) | **GET** /api/v2/content/dashboards/visualizations/visualization-5d0dbc254bc83 | Visualization


# **dashboard**
```swift
    open class func dashboard(xApplicationId: String, xRestApiKey: String, contentType: String, completion: @escaping (_ data: Void?, _ error: Error?) -> Void)
```

Dashboard

Get Dashboard  #### Request details Method: `GET`  URL: `api/v2/content/dashboards/{key}`  #### URL Parameters `key` (string) **required**  `mode` (string) **Optional**   - standard (default), using cache data  - fresh, force using fresh data  - test, fake data  #### Response codes(s) `200` OK  `404` Entity not found

### Example 
```swift
// The following code samples are still beta. For any issue, please report via http://github.com/OpenAPITools/openapi-generator/issues/new
import OpenAPIClient

let xApplicationId = "xApplicationId_example" // String | 
let xRestApiKey = "xRestApiKey_example" // String | 
let contentType = "contentType_example" // String | 

// Dashboard
DashboardsAPI.dashboard(xApplicationId: xApplicationId, xRestApiKey: xRestApiKey, contentType: contentType) { (response, error) in
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

# **visualization**
```swift
    open class func visualization(xApplicationId: String, xRestApiKey: String, contentType: String, completion: @escaping (_ data: Void?, _ error: Error?) -> Void)
```

Visualization

Get visualization  #### Request details Method: `GET`  URL: `api/v2/content/dashboards/visualizations/{key}`  #### URL Parameters `key` (string) **required**  ### Query parameters  `mode` (string) **Optional**   - standard (default), using cache data  - fresh, force using fresh data  - test, fake data  #### Response codes(s) `200` OK  `404` Entity not found

### Example 
```swift
// The following code samples are still beta. For any issue, please report via http://github.com/OpenAPITools/openapi-generator/issues/new
import OpenAPIClient

let xApplicationId = "xApplicationId_example" // String | 
let xRestApiKey = "xRestApiKey_example" // String | 
let contentType = "contentType_example" // String | 

// Visualization
DashboardsAPI.visualization(xApplicationId: xApplicationId, xRestApiKey: xRestApiKey, contentType: contentType) { (response, error) in
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


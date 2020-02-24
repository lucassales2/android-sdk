# StaggerAPI

All URIs are relative to *https://nstack-staging.vapor.cloud*

Method | HTTP request | Description
------------- | ------------- | -------------
[**gettag**](StaggerAPI.md#gettag) | **POST** /api/v2/stagger | Gettag


# **gettag**
```swift
    open class func gettag(xApplicationId: String, xRestApiKey: String, contentType: String, text: String, dataCenter: String, completion: @escaping (_ data: Void?, _ error: Error?) -> Void)
```

Gettag

Get a tag from a text (Feedback / bug report)   **Initial response time can be 15sec in case you hit a cold container**   #### Request details Method: `POST`  URL: `api/v2/content/stagger`  #### Headers `X-Application-Id` (string) **required** _Application ID from [NStack](https://nstack.io)_  `X-Rest-Api-Key` (string) **required** _Rest API key from [NStack](https://nstack.io)_  #### Post params `text` (string) **required**  `data-center` (string) **optional, default: aws:ireland** **(Options: aws:ireland)**   #### Response codes(s) `200` OK  `412` Validation error  `500` Internal server error _Please read response message_

### Example 
```swift
// The following code samples are still beta. For any issue, please report via http://github.com/OpenAPITools/openapi-generator/issues/new
import OpenAPIClient

let xApplicationId = "xApplicationId_example" // String | 
let xRestApiKey = "xRestApiKey_example" // String | 
let contentType = "contentType_example" // String | 
let text = "text_example" // String | 
let dataCenter = "dataCenter_example" // String | 

// Gettag
StaggerAPI.gettag(xApplicationId: xApplicationId, xRestApiKey: xRestApiKey, contentType: contentType, text: text, dataCenter: dataCenter) { (response, error) in
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
 **text** | **String** |  | 
 **dataCenter** | **String** |  | 

### Return type

Void (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


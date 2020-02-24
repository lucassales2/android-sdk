# ScropperAPI

All URIs are relative to *https://nstack-staging.vapor.cloud*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getfocalpoint**](ScropperAPI.md#getfocalpoint) | **POST** /api/v2/scropper | Getfocalpoint


# **getfocalpoint**
```swift
    open class func getfocalpoint(xApplicationId: String, xRestApiKey: String, contentType: String, url: String, dataCenter: String, completion: @escaping (_ data: Scropper?, _ error: Error?) -> Void)
```

Getfocalpoint

Get focal point on a image   **Initial response time can be 15sec in case you hit a cold container**   #### Request details Method: `POST`  URL: `api/v2/content/scropper`  #### Headers `X-Application-Id` (string) **required** _Application ID from [NStack](https://nstack.io)_  `X-Rest-Api-Key` (string) **required** _Rest API key from [NStack](https://nstack.io)_  #### Post params `url` (string) **required if no file, only jpg, png**   `file` (file, max 30mb) **required if no url, only jpg, png**   `data-center` (string) **optional, default: aws:ireland** **(Options: aws:ireland)**   #### Response codes(s) `200` OK  `412` Validation error  `500` Internal server error _Please read response message_

### Example 
```swift
// The following code samples are still beta. For any issue, please report via http://github.com/OpenAPITools/openapi-generator/issues/new
import OpenAPIClient

let xApplicationId = "xApplicationId_example" // String | 
let xRestApiKey = "xRestApiKey_example" // String | 
let contentType = "contentType_example" // String | 
let url = "url_example" // String | 
let dataCenter = "dataCenter_example" // String | 

// Getfocalpoint
ScropperAPI.getfocalpoint(xApplicationId: xApplicationId, xRestApiKey: xRestApiKey, contentType: contentType, url: url, dataCenter: dataCenter) { (response, error) in
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
 **url** | **String** |  | 
 **dataCenter** | **String** |  | 

### Return type

[**Scropper**](Scropper.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


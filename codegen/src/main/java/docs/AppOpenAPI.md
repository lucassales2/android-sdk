# AppOpenAPI

All URIs are relative to *https://nstack-staging.vapor.cloud*

Method | HTTP request | Description
------------- | ------------- | -------------
[**appopen**](AppOpenAPI.md#appopen) | **POST** /api/v2/open | Appopen
[**postAppopen**](AppOpenAPI.md#postappopen) | **POST** /api/v1/open | PostAppopen


# **appopen**
```swift
    open class func appopen(test: Bool, xApplicationId: String, xRestApiKey: String, acceptLanguage: String, nMeta: String, platform: String, guid: String, version: String, lastUpdated: String, dev: Bool, completion: @escaping (_ data: AppopenV2?, _ error: Error?) -> Void)
```

Appopen

Retrieve a list of valid continents on Earth  #### Request details Method:    `GET`  URL:    `/api/v2/open`  #### Headers  `X-Application-Id` (string) **required** _Application ID from [NStack](https://nstack.io)_  `X-Rest-Api-Key` (string) **required** _Rest API key from [NStack](https://nstack.io)_  `N-Meta` (string) **required** _eg: android;production;1.2.3;4.4;Samsung S7_  `Accept-Language` (string) **Optional** _eg: da-DK_  ### Form-data  `platform` (string) **required** eg: ios/android/web  `guid` (string) **required** `unique generated string` *eg: 9bc4b39a-0af5-4b54-a5a5-88ad334dbd4b*  `version` (string) **required if not web** `format: xxx.yyy.zzz` *eg: 2.0.0 / 212.01.1*  - *Current version of application*  `old_version` (string) **required if not web** `format: xxx.yyy.zzz` *eg: 2.0.0 / 212.01.1*  - *Previous version of application (Auto update can have happened)*  `last_updated` (date time, ISO8601) **optional** *eg: 2019-06-15T14:29:50+00:00*  - *Set timestamp from last app open (when localization has been synced), this will calculate which localizations should be updated*  `dev` (bool) **option, default false**  - *if true, bypass publishes and only use newest resource (set of key/values)*   `test` (bool) **option, default false**  - *if true, used the app version from \"test env\"    #### Response codes(s) `200` OK

### Example 
```swift
// The following code samples are still beta. For any issue, please report via http://github.com/OpenAPITools/openapi-generator/issues/new
import OpenAPIClient

let test = true // Bool | 
let xApplicationId = "xApplicationId_example" // String | 
let xRestApiKey = "xRestApiKey_example" // String | 
let acceptLanguage = "acceptLanguage_example" // String | 
let nMeta = "nMeta_example" // String | 
let platform = "platform_example" // String | 
let guid = "guid_example" // String | 
let version = "version_example" // String | 
let lastUpdated = "lastUpdated_example" // String | 
let dev = true // Bool | 

// Appopen
AppOpenAPI.appopen(test: test, xApplicationId: xApplicationId, xRestApiKey: xRestApiKey, acceptLanguage: acceptLanguage, nMeta: nMeta, platform: platform, guid: guid, version: version, lastUpdated: lastUpdated, dev: dev) { (response, error) in
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
 **test** | **Bool** |  | 
 **xApplicationId** | **String** |  | 
 **xRestApiKey** | **String** |  | 
 **acceptLanguage** | **String** |  | 
 **nMeta** | **String** |  | 
 **platform** | **String** |  | 
 **guid** | **String** |  | 
 **version** | **String** |  | 
 **lastUpdated** | **String** |  | 
 **dev** | **Bool** |  | 

### Return type

[**AppopenV2**](AppopenV2.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **postAppopen**
```swift
    open class func postAppopen(xApplicationId: String, xRestApiKey: String, platform: String, guid: String, version: String, oldVersion: String, lastUpdated: String, completion: @escaping (_ data: Void?, _ error: Error?) -> Void)
```

PostAppopen

Registers an app-open.  _Deprecated, please use V2_  #### Request details Method: `POST`  URL: `/api/v1/open`  #### Headers `X-Application-Id` (string) **required** _Application ID from [NStack](https://nstack.io)_  `X-Rest-Api-Key` (string) **required** _Rest API key from [NStack](https://nstack.io)_  `Accept-Language` (string) **Optional** _eg: da-DK_  #### Parameters `platform` (string) **required** _The platform the app was opened from e.g. [\"ios\", \"android\", \"windows\", \"web\"]_  `guid` (string) **required** _[?]_  `version` (string) **required** _[?]_  `old_version` (string) _[?]_  `last_updated` (string) _A string parsable by php's [strtotime()](http://php.net/manual/en/function.strtotime.php)-function_  `test` (bool) _Enable test mode, false equals production (only works for version control)_  #### Response codes(s) `201` Created  `412` Precondition failed  `445` Entity not found  `500` Internal server error _Please read response message_

### Example 
```swift
// The following code samples are still beta. For any issue, please report via http://github.com/OpenAPITools/openapi-generator/issues/new
import OpenAPIClient

let xApplicationId = "xApplicationId_example" // String | 
let xRestApiKey = "xRestApiKey_example" // String | 
let platform = "platform_example" // String | 
let guid = "guid_example" // String | 
let version = "version_example" // String | 
let oldVersion = "oldVersion_example" // String | 
let lastUpdated = "lastUpdated_example" // String | 

// PostAppopen
AppOpenAPI.postAppopen(xApplicationId: xApplicationId, xRestApiKey: xRestApiKey, platform: platform, guid: guid, version: version, oldVersion: oldVersion, lastUpdated: lastUpdated) { (response, error) in
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
 **platform** | **String** |  | 
 **guid** | **String** |  | 
 **version** | **String** |  | 
 **oldVersion** | **String** |  | 
 **lastUpdated** | **String** |  | 

### Return type

Void (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


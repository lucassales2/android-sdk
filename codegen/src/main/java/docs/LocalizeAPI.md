# LocalizeAPI

All URIs are relative to *https://nstack-staging.vapor.cloud*

Method | HTTP request | Description
------------- | ------------- | -------------
[**deleteproposal**](LocalizeAPI.md#deleteproposal) | **DELETE** /api/v2/content/localize/proposals/9 | Deleteproposal
[**indexlanguages**](LocalizeAPI.md#indexlanguages) | **GET** /api/v2/content/localize/mobile/languages | Indexlanguages
[**indexlanguages1**](LocalizeAPI.md#indexlanguages1) | **GET** /api/v1/localize/mobile/languages | Indexlanguages1
[**indexproposal**](LocalizeAPI.md#indexproposal) | **GET** /api/v2/content/localize/proposals | Indexproposal
[**indexresource**](LocalizeAPI.md#indexresource) | **GET** /api/v2/content/localize/resources/platforms/mobile | Indexresource
[**keys**](LocalizeAPI.md#keys) | **GET** /api/v1/localize/mobile/keys | Keys
[**keysvaluesforsection**](LocalizeAPI.md#keysvaluesforsection) | **GET** /api/v1/localize/backend/keys/default | Keys&amp;valuesforsection
[**languagebestfit**](LocalizeAPI.md#languagebestfit) | **GET** /api/v2/content/localize/mobile/languages/best_fit | Languagebestfit
[**languagebestfit1**](LocalizeAPI.md#languagebestfit1) | **GET** /api/v1/localize/mobile/languages/best_fit | Languagebestfit1
[**showresource**](LocalizeAPI.md#showresource) | **GET** /api/v2/content/localize/resources/44 | Showresource
[**storeproposal**](LocalizeAPI.md#storeproposal) | **POST** /api/v2/content/localize/proposals | Storeproposal


# **deleteproposal**
```swift
    open class func deleteproposal(guid: String, xApplicationId: String, xRestApiKey: String, completion: @escaping (_ data: Void?, _ error: Error?) -> Void)
```

Deleteproposal

Delete a specified proposal  #### Request details  Method:    `DELETE`  URL:    `{{nstackUrl}}/api/v2/content/localize/proposals/{{proposalId}}`  #### Headers   `X-Application-Id`  `X-Rest-Api-Key`  #### Query params `guid` (string) **required**  #### URL Parameters `proposalId` (int) **required**  #### Response codes(s)  `200` OK  `404` Entity not found  `401` Invalid guid

### Example 
```swift
// The following code samples are still beta. For any issue, please report via http://github.com/OpenAPITools/openapi-generator/issues/new
import OpenAPIClient

let guid = "guid_example" // String | 
let xApplicationId = "xApplicationId_example" // String | 
let xRestApiKey = "xRestApiKey_example" // String | 

// Deleteproposal
LocalizeAPI.deleteproposal(guid: guid, xApplicationId: xApplicationId, xRestApiKey: xRestApiKey) { (response, error) in
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

### Return type

Void (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **indexlanguages**
```swift
    open class func indexlanguages(xApplicationId: String, xRestApiKey: String, completion: @escaping (_ data: Indexlanguages?, _ error: Error?) -> Void)
```

Indexlanguages

Get available languages for a platfom  #### Request details  Method:    `GET`  URL:    `/api/v1/content/localize/{platform-slug}/languages`  #### Headers   `X-Application-Id`  `X-Rest-Api-Key`  #### Query params `show_inactive_languages` (bool)  #### URL Parameters `platform-slug` (string) **required**  #### Response codes(s)  `200` OK  `404` Entity not found

### Example 
```swift
// The following code samples are still beta. For any issue, please report via http://github.com/OpenAPITools/openapi-generator/issues/new
import OpenAPIClient

let xApplicationId = "xApplicationId_example" // String | 
let xRestApiKey = "xRestApiKey_example" // String | 

// Indexlanguages
LocalizeAPI.indexlanguages(xApplicationId: xApplicationId, xRestApiKey: xRestApiKey) { (response, error) in
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

[**Indexlanguages**](Indexlanguages.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **indexlanguages1**
```swift
    open class func indexlanguages1(xApplicationId: String, xRestApiKey: String, completion: @escaping (_ data: Void?, _ error: Error?) -> Void)
```

Indexlanguages1

Get available languages for a platfom  #### Request details  Method:    `GET`  URL:    `/api/v1/translate/{platform-slug}/languages`  #### Headers   `X-Application-Id`  `X-Rest-Api-Key`  #### Query params `show_inactive_languages` (bool)  #### URL Parameters `platform-slug` (string) **required**  #### Response codes(s)  `200` OK 

### Example 
```swift
// The following code samples are still beta. For any issue, please report via http://github.com/OpenAPITools/openapi-generator/issues/new
import OpenAPIClient

let xApplicationId = "xApplicationId_example" // String | 
let xRestApiKey = "xRestApiKey_example" // String | 

// Indexlanguages1
LocalizeAPI.indexlanguages1(xApplicationId: xApplicationId, xRestApiKey: xRestApiKey) { (response, error) in
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

# **indexproposal**
```swift
    open class func indexproposal(xApplicationId: String, xRestApiKey: String, completion: @escaping (_ data: Void?, _ error: Error?) -> Void)
```

Indexproposal

#### Request details  Method:    `GET`  URL:    `/api/v2/content/localize/proposals`  #### Post params `state` (string) **optional, default unaccepted** *Options: unaccepted, accepted, all*  `guid` (string) **optional** shows if the proposal is deletable or not for the specified guid  #### Response codes(s)  `200` OK

### Example 
```swift
// The following code samples are still beta. For any issue, please report via http://github.com/OpenAPITools/openapi-generator/issues/new
import OpenAPIClient

let xApplicationId = "xApplicationId_example" // String | 
let xRestApiKey = "xRestApiKey_example" // String | 

// Indexproposal
LocalizeAPI.indexproposal(xApplicationId: xApplicationId, xRestApiKey: xRestApiKey) { (response, error) in
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

# **indexresource**
```swift
    open class func indexresource(xApplicationId: String, xRestApiKey: String, completion: @escaping (_ data: Indexresource?, _ error: Error?) -> Void)
```

Indexresource

#### Request details  Method:    `GET`  URL:    `/api/v2/content/localize/resources/platforms/{platformSlug}`  ### Url param  `platformSlug` (string) **required** *eg: mobile, backend, web*  #### Headers  `X-Application-Id` (string) **required** _Application ID from [NStack](https://nstack.io)_  `X-Rest-Api-Key` (string) **required** _Rest API key from [NStack](https://nstack.io)_   ### Query  `last_updated` (date time, ISO8601) **optional** *eg: 2019-06-21T08%3A35%3A24%2B00%3A00*  - *Remember to url encode it*  - *Set timestamp from last app open (when localization has been synced), this will calculate which localizations should be updated*  `dev` (bool) **option, default false**  - *if true, bypass publishes and only use newest resource (set of key/values)*   #### Response codes(s)  `200` OK  `404` platform not found

### Example 
```swift
// The following code samples are still beta. For any issue, please report via http://github.com/OpenAPITools/openapi-generator/issues/new
import OpenAPIClient

let xApplicationId = "xApplicationId_example" // String | 
let xRestApiKey = "xRestApiKey_example" // String | 

// Indexresource
LocalizeAPI.indexresource(xApplicationId: xApplicationId, xRestApiKey: xRestApiKey) { (response, error) in
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

[**Indexresource**](Indexresource.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **keys**
```swift
    open class func keys(all: Bool, xApplicationId: String, xRestApiKey: String, completion: @escaping (_ data: Void?, _ error: Error?) -> Void)
```

Keys

#### Request details  Method:    `GET`  URL:    `/api/translate/{platform-slug}/keys`  #### Headers   `X-Application-Id`  `X-Rest-Api-Key`  `Accept-Language or X-Accept-Language`  #### Query params `section` (int/string) _id or slug_  `all` (bool) _true_  #### URL Params `platform-slug` (string) **required**  #### Response codes(s)  `200` OK 

### Example 
```swift
// The following code samples are still beta. For any issue, please report via http://github.com/OpenAPITools/openapi-generator/issues/new
import OpenAPIClient

let all = true // Bool | 
let xApplicationId = "xApplicationId_example" // String | 
let xRestApiKey = "xRestApiKey_example" // String | 

// Keys
LocalizeAPI.keys(all: all, xApplicationId: xApplicationId, xRestApiKey: xRestApiKey) { (response, error) in
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
 **all** | **Bool** |  | 
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

# **keysvaluesforsection**
```swift
    open class func keysvaluesforsection(acceptLanguage: String, xApplicationId: String, xRestApiKey: String, completion: @escaping (_ data: UntitledExample?, _ error: Error?) -> Void)
```

Keys&valuesforsection

Keys & values for section

### Example 
```swift
// The following code samples are still beta. For any issue, please report via http://github.com/OpenAPITools/openapi-generator/issues/new
import OpenAPIClient

let acceptLanguage = "acceptLanguage_example" // String | 
let xApplicationId = "xApplicationId_example" // String | 
let xRestApiKey = "xRestApiKey_example" // String | 

// Keys&valuesforsection
LocalizeAPI.keysvaluesforsection(acceptLanguage: acceptLanguage, xApplicationId: xApplicationId, xRestApiKey: xRestApiKey) { (response, error) in
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
 **acceptLanguage** | **String** |  | 
 **xApplicationId** | **String** |  | 
 **xRestApiKey** | **String** |  | 

### Return type

[**UntitledExample**](UntitledExample.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **languagebestfit**
```swift
    open class func languagebestfit(xApplicationId: String, xRestApiKey: String, completion: @escaping (_ data: Languagebestfit?, _ error: Error?) -> Void)
```

Languagebestfit

Get best fit language from accept-language header  #### Request details Method:    `GET`  URL:    `/api/v1/content/localize/{platform-slug}/languages/best_fit`  #### Headers  `X-Application-Id`  `X-Rest-Api-Key`  `Accept-Language or X-Accept-Language`  #### URL Parameters `platform-slug` (string) **required**  #### Response codes(s)  `200` OK  `404` Entity not found

### Example 
```swift
// The following code samples are still beta. For any issue, please report via http://github.com/OpenAPITools/openapi-generator/issues/new
import OpenAPIClient

let xApplicationId = "xApplicationId_example" // String | 
let xRestApiKey = "xRestApiKey_example" // String | 

// Languagebestfit
LocalizeAPI.languagebestfit(xApplicationId: xApplicationId, xRestApiKey: xRestApiKey) { (response, error) in
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

[**Languagebestfit**](Languagebestfit.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **languagebestfit1**
```swift
    open class func languagebestfit1(xApplicationId: String, xRestApiKey: String, completion: @escaping (_ data: Void?, _ error: Error?) -> Void)
```

Languagebestfit1

Get best fit language from accept-language header  #### Request details Method:    `GET`  URL:    `/api/v1/translate/{platform-slug}/languages/best_fit`  #### Headers  `X-Application-Id`  `X-Rest-Api-Key`  `Accept-Language or X-Accept-Language`  #### URL Parameters `platform-slug` (string) **required**  #### Response codes(s)  `200` OK 

### Example 
```swift
// The following code samples are still beta. For any issue, please report via http://github.com/OpenAPITools/openapi-generator/issues/new
import OpenAPIClient

let xApplicationId = "xApplicationId_example" // String | 
let xRestApiKey = "xRestApiKey_example" // String | 

// Languagebestfit1
LocalizeAPI.languagebestfit1(xApplicationId: xApplicationId, xRestApiKey: xRestApiKey) { (response, error) in
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

# **showresource**
```swift
    open class func showresource(completion: @escaping (_ data: Showresource?, _ error: Error?) -> Void)
```

Showresource

#### Request details  Method:    `GET`  URL:    `/api/v2/content/localize/resources/{id}`  #### Response codes(s)  `200` OK  `404` Not found

### Example 
```swift
// The following code samples are still beta. For any issue, please report via http://github.com/OpenAPITools/openapi-generator/issues/new
import OpenAPIClient


// Showresource
LocalizeAPI.showresource() { (response, error) in
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
This endpoint does not need any parameter.

### Return type

[**Showresource**](Showresource.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **storeproposal**
```swift
    open class func storeproposal(xApplicationId: String, xRestApiKey: String, key: String, value: String, locale: String, platform: String, guid: String, section: String, completion: @escaping (_ data: Void?, _ error: Error?) -> Void)
```

Storeproposal

#### Request details  Method:    `POST`  URL:    `/api/v2/content/localize/proposals`  #### Post params `key` (string) **required**   `section` (string) **required**   `value` (string) **required**   `locale` (string) **required**  *eg: da-DK, en-GB*  `platform` (string) **required** *eg: mobile, backend, web*  #### Response codes(s)  `201` Created  `412` Preconitions failed

### Example 
```swift
// The following code samples are still beta. For any issue, please report via http://github.com/OpenAPITools/openapi-generator/issues/new
import OpenAPIClient

let xApplicationId = "xApplicationId_example" // String | 
let xRestApiKey = "xRestApiKey_example" // String | 
let key = "key_example" // String | 
let value = "value_example" // String | 
let locale = "locale_example" // String | 
let platform = "platform_example" // String | 
let guid = "guid_example" // String | 
let section = "section_example" // String | 

// Storeproposal
LocalizeAPI.storeproposal(xApplicationId: xApplicationId, xRestApiKey: xRestApiKey, key: key, value: value, locale: locale, platform: platform, guid: guid, section: section) { (response, error) in
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
 **key** | **String** |  | 
 **value** | **String** |  | 
 **locale** | **String** |  | 
 **platform** | **String** |  | 
 **guid** | **String** |  | 
 **section** | **String** |  | 

### Return type

Void (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


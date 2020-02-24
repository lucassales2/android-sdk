# CollectionsAPI

All URIs are relative to *https://nstack-staging.vapor.cloud*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createitem**](CollectionsAPI.md#createitem) | **POST** /api/v2/content/collections/1/items | Createitem
[**createitem1**](CollectionsAPI.md#createitem1) | **POST** /api/v1/content/collections/1/items | Createitem1
[**deleteitem**](CollectionsAPI.md#deleteitem) | **DELETE** /api/v2/content/collections/1/items/13 | Deleteitem
[**deleteitem1**](CollectionsAPI.md#deleteitem1) | **DELETE** /api/v1/content/collections/1/items/13 | Deleteitem1
[**update**](CollectionsAPI.md#update) | **POST** /api/v2/content/collections/1/items/14/update | Update
[**update1**](CollectionsAPI.md#update1) | **POST** /api/v1/content/collections/1/items/14/update | Update1
[**view**](CollectionsAPI.md#view) | **GET** /api/v2/content/collections/1 | View
[**view1**](CollectionsAPI.md#view1) | **GET** /api/v1/content/collections/1 | View1
[**viewitem**](CollectionsAPI.md#viewitem) | **GET** /api/v2/content/collections/1/items/5 | Viewitem
[**viewitem1**](CollectionsAPI.md#viewitem1) | **GET** /api/v1/content/collections/1/items/5 | Viewitem1


# **createitem**
```swift
    open class func createitem(xApplicationId: String, xRestApiKey: String, k0int: Int, key1string: String, key2float: Double, key3wysiwygsim: String, key4asset: String, key5boolean: Bool, key6wysiwygadvanced: String, completion: @escaping (_ data: Void?, _ error: Error?) -> Void)
```

Createitem

Create a new item to a array type collection #### Request details Method: `POST`  URL: `api/v2/content/responses/{collection_id}/items`  #### Headers `X-Application-Id` (string) **required** _Application ID from [NStack](https://nstack.io)_  `X-Rest-Api-Key` (string) **required** _Rest API key from [NStack](https://nstack.io)_  #### URL Parameters `collection_id` (int) **required** _ID of content collection_  #### Post params  `All required keys`  #### Response codes(s) `200` OK  `401` Collectio does not have write access for api  `404` Entity not found  `412` Precondition failed _Please read response message_  `500` Internal server error _Please read response message_

### Example 
```swift
// The following code samples are still beta. For any issue, please report via http://github.com/OpenAPITools/openapi-generator/issues/new
import OpenAPIClient

let xApplicationId = "xApplicationId_example" // String | 
let xRestApiKey = "xRestApiKey_example" // String | 
let k0int = 987 // Int | 
let key1string = "key1string_example" // String | 
let key2float = 987 // Double | 
let key3wysiwygsim = "key3wysiwygsim_example" // String | 
let key4asset = "key4asset_example" // String | 
let key5boolean = true // Bool | 
let key6wysiwygadvanced = "key6wysiwygadvanced_example" // String | 

// Createitem
CollectionsAPI.createitem(xApplicationId: xApplicationId, xRestApiKey: xRestApiKey, k0int: k0int, key1string: key1string, key2float: key2float, key3wysiwygsim: key3wysiwygsim, key4asset: key4asset, key5boolean: key5boolean, key6wysiwygadvanced: key6wysiwygadvanced) { (response, error) in
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
 **k0int** | **Int** |  | 
 **key1string** | **String** |  | 
 **key2float** | **Double** |  | 
 **key3wysiwygsim** | **String** |  | 
 **key4asset** | **String** |  | 
 **key5boolean** | **Bool** |  | 
 **key6wysiwygadvanced** | **String** |  | 

### Return type

Void (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **createitem1**
```swift
    open class func createitem1(xApplicationId: String, xRestApiKey: String, k0int: Int, key1string: String, key2float: Double, key3wysiwygsim: String, key4asset: String, key5boolean: Bool, key6wysiwygadvanced: String, completion: @escaping (_ data: Void?, _ error: Error?) -> Void)
```

Createitem1

Create a new item to a array type collection #### Request details Method: `POST`  URL: `api/v1/content/responses/{collection_id}/items`  #### Headers `X-Application-Id` (string) **required** _Application ID from [NStack](https://nstack.io)_  `X-Rest-Api-Key` (string) **required** _Rest API key from [NStack](https://nstack.io)_  #### URL Parameters `collection_id` (int) **required** _ID of content collection_  #### Post params  `All required keys`  #### Response codes(s) `200` OK  `401` Collectio does not have write access for api   `412` Precondition failed _Please read response message_  `445` Entity not found  `500` Internal server error _Please read response message_

### Example 
```swift
// The following code samples are still beta. For any issue, please report via http://github.com/OpenAPITools/openapi-generator/issues/new
import OpenAPIClient

let xApplicationId = "xApplicationId_example" // String | 
let xRestApiKey = "xRestApiKey_example" // String | 
let k0int = 987 // Int | 
let key1string = "key1string_example" // String | 
let key2float = 987 // Double | 
let key3wysiwygsim = "key3wysiwygsim_example" // String | 
let key4asset = "key4asset_example" // String | 
let key5boolean = true // Bool | 
let key6wysiwygadvanced = "key6wysiwygadvanced_example" // String | 

// Createitem1
CollectionsAPI.createitem1(xApplicationId: xApplicationId, xRestApiKey: xRestApiKey, k0int: k0int, key1string: key1string, key2float: key2float, key3wysiwygsim: key3wysiwygsim, key4asset: key4asset, key5boolean: key5boolean, key6wysiwygadvanced: key6wysiwygadvanced) { (response, error) in
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
 **k0int** | **Int** |  | 
 **key1string** | **String** |  | 
 **key2float** | **Double** |  | 
 **key3wysiwygsim** | **String** |  | 
 **key4asset** | **String** |  | 
 **key5boolean** | **Bool** |  | 
 **key6wysiwygadvanced** | **String** |  | 

### Return type

Void (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **deleteitem**
```swift
    open class func deleteitem(xApplicationId: String, xRestApiKey: String, completion: @escaping (_ data: Void?, _ error: Error?) -> Void)
```

Deleteitem

Create a new item to a array type collection #### Request details Method: `DELETE`  URL: `api/v2/content/responses/{collection_id}/items{item_id}`  #### Headers `X-Application-Id` (string) **required** _Application ID from [NStack](https://nstack.io)_  `X-Rest-Api-Key` (string) **required** _Rest API key from [NStack](https://nstack.io)_  #### URL Parameters `collection_id` (int) **required** _ID of content collection_  `item_id` (int) **required** _ID of content collection item_  #### Response codes(s) `200` OK  `401` Collection does not have write access for api   `404` Entity not found  `500` Internal server error _Please read response message_

### Example 
```swift
// The following code samples are still beta. For any issue, please report via http://github.com/OpenAPITools/openapi-generator/issues/new
import OpenAPIClient

let xApplicationId = "xApplicationId_example" // String | 
let xRestApiKey = "xRestApiKey_example" // String | 

// Deleteitem
CollectionsAPI.deleteitem(xApplicationId: xApplicationId, xRestApiKey: xRestApiKey) { (response, error) in
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

# **deleteitem1**
```swift
    open class func deleteitem1(xApplicationId: String, xRestApiKey: String, completion: @escaping (_ data: Void?, _ error: Error?) -> Void)
```

Deleteitem1

Create a new item to a array type collection #### Request details Method: `DELETE`  URL: `api/v1/content/responses/{collection_id}/items{item_id}`  #### Headers `X-Application-Id` (string) **required** _Application ID from [NStack](https://nstack.io)_  `X-Rest-Api-Key` (string) **required** _Rest API key from [NStack](https://nstack.io)_  #### URL Parameters `collection_id` (int) **required** _ID of content collection_  `item_id` (int) **required** _ID of content collection item_  #### Response codes(s) `200` OK  `401` Collection does not have write access for api  `445` Entity not found  `500` Internal server error _Please read response message_

### Example 
```swift
// The following code samples are still beta. For any issue, please report via http://github.com/OpenAPITools/openapi-generator/issues/new
import OpenAPIClient

let xApplicationId = "xApplicationId_example" // String | 
let xRestApiKey = "xRestApiKey_example" // String | 

// Deleteitem1
CollectionsAPI.deleteitem1(xApplicationId: xApplicationId, xRestApiKey: xRestApiKey) { (response, error) in
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

# **update**
```swift
    open class func update(xApplicationId: String, xRestApiKey: String, contentType: String, k0int: Int, key1string: String, key2float: Double, key3wysiwygsim: String, key4asset: String, key5boolean: Bool, key6wysiwygadvanced: String, completion: @escaping (_ data: Void?, _ error: Error?) -> Void)
```

Update

Create a new item to a array type collection #### Request details Method: `POST`  URL: `api/v2/content/responses/{collection_id}/items`  #### Headers `X-Application-Id` (string) **required** _Application ID from [NStack](https://nstack.io)_  `X-Rest-Api-Key` (string) **required** _Rest API key from [NStack](https://nstack.io)_  #### URL Parameters `collection_id` (int) **required** _ID of content collection_  #### Post params  `All required keys`  #### Response codes(s) `200` OK  `401` Collectio does not have write access for api   `404` Entity not found  `412` Precondition failed _Please read response message_  `500` Internal server error _Please read response message_

### Example 
```swift
// The following code samples are still beta. For any issue, please report via http://github.com/OpenAPITools/openapi-generator/issues/new
import OpenAPIClient

let xApplicationId = "xApplicationId_example" // String | 
let xRestApiKey = "xRestApiKey_example" // String | 
let contentType = "contentType_example" // String | 
let k0int = 987 // Int | 
let key1string = "key1string_example" // String | 
let key2float = 987 // Double | 
let key3wysiwygsim = "key3wysiwygsim_example" // String | 
let key4asset = "key4asset_example" // String | 
let key5boolean = true // Bool | 
let key6wysiwygadvanced = "key6wysiwygadvanced_example" // String | 

// Update
CollectionsAPI.update(xApplicationId: xApplicationId, xRestApiKey: xRestApiKey, contentType: contentType, k0int: k0int, key1string: key1string, key2float: key2float, key3wysiwygsim: key3wysiwygsim, key4asset: key4asset, key5boolean: key5boolean, key6wysiwygadvanced: key6wysiwygadvanced) { (response, error) in
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
 **k0int** | **Int** |  | 
 **key1string** | **String** |  | 
 **key2float** | **Double** |  | 
 **key3wysiwygsim** | **String** |  | 
 **key4asset** | **String** |  | 
 **key5boolean** | **Bool** |  | 
 **key6wysiwygadvanced** | **String** |  | 

### Return type

Void (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **update1**
```swift
    open class func update1(xApplicationId: String, xRestApiKey: String, contentType: String, k0int: Int, key1string: String, key2float: Double, key3wysiwygsim: String, key4asset: String, key5boolean: Bool, key6wysiwygadvanced: String, completion: @escaping (_ data: Void?, _ error: Error?) -> Void)
```

Update1

Create a new item to a array type collection #### Request details Method: `POST`  URL: `api/v1/content/responses/{collection_id}/items`  #### Headers `X-Application-Id` (string) **required** _Application ID from [NStack](https://nstack.io)_  `X-Rest-Api-Key` (string) **required** _Rest API key from [NStack](https://nstack.io)_  #### URL Parameters `collection_id` (int) **required** _ID of content collection_  #### Post params  `All required keys`  #### Response codes(s) `200` OK  `401` Collectio does not have write access for api   `412` Precondition failed _Please read response message_  `445` Entity not found  `500` Internal server error _Please read response message_

### Example 
```swift
// The following code samples are still beta. For any issue, please report via http://github.com/OpenAPITools/openapi-generator/issues/new
import OpenAPIClient

let xApplicationId = "xApplicationId_example" // String | 
let xRestApiKey = "xRestApiKey_example" // String | 
let contentType = "contentType_example" // String | 
let k0int = 987 // Int | 
let key1string = "key1string_example" // String | 
let key2float = 987 // Double | 
let key3wysiwygsim = "key3wysiwygsim_example" // String | 
let key4asset = "key4asset_example" // String | 
let key5boolean = true // Bool | 
let key6wysiwygadvanced = "key6wysiwygadvanced_example" // String | 

// Update1
CollectionsAPI.update1(xApplicationId: xApplicationId, xRestApiKey: xRestApiKey, contentType: contentType, k0int: k0int, key1string: key1string, key2float: key2float, key3wysiwygsim: key3wysiwygsim, key4asset: key4asset, key5boolean: key5boolean, key6wysiwygadvanced: key6wysiwygadvanced) { (response, error) in
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
 **k0int** | **Int** |  | 
 **key1string** | **String** |  | 
 **key2float** | **Double** |  | 
 **key3wysiwygsim** | **String** |  | 
 **key4asset** | **String** |  | 
 **key5boolean** | **Bool** |  | 
 **key6wysiwygadvanced** | **String** |  | 

### Return type

Void (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **view**
```swift
    open class func view(xApplicationId: String, xRestApiKey: String, completion: @escaping (_ data: Void?, _ error: Error?) -> Void)
```

View

Get a default type of content collection  #### Request details Method: `GET`  URL: `api/v2/content/responses/{collection_id}`  #### Headers `X-Application-Id` (string) **required** _Application ID from [NStack](https://nstack.io)_  `X-Rest-Api-Key` (string) **required** _Rest API key from [NStack](https://nstack.io)_  #### URL Parameters `collection_id` (int) **required** _ID of content collection_  #### Response codes(s) `200` OK  `404` Entity not found  `500` Internal server error _Please read response message_

### Example 
```swift
// The following code samples are still beta. For any issue, please report via http://github.com/OpenAPITools/openapi-generator/issues/new
import OpenAPIClient

let xApplicationId = "xApplicationId_example" // String | 
let xRestApiKey = "xRestApiKey_example" // String | 

// View
CollectionsAPI.view(xApplicationId: xApplicationId, xRestApiKey: xRestApiKey) { (response, error) in
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

# **view1**
```swift
    open class func view1(xApplicationId: String, xRestApiKey: String, completion: @escaping (_ data: Void?, _ error: Error?) -> Void)
```

View1

Get a default type of content collection  #### Request details Method: `GET`  URL: `api/v1/content/responses/{collection_id}`  #### Headers `X-Application-Id` (string) **required** _Application ID from [NStack](https://nstack.io)_  `X-Rest-Api-Key` (string) **required** _Rest API key from [NStack](https://nstack.io)_  #### URL Parameters `collection_id` (int) **required** _ID of content collection_  #### Response codes(s) `200` OK  `445` Entity not found  `500` Internal server error _Please read response message_

### Example 
```swift
// The following code samples are still beta. For any issue, please report via http://github.com/OpenAPITools/openapi-generator/issues/new
import OpenAPIClient

let xApplicationId = "xApplicationId_example" // String | 
let xRestApiKey = "xRestApiKey_example" // String | 

// View1
CollectionsAPI.view1(xApplicationId: xApplicationId, xRestApiKey: xRestApiKey) { (response, error) in
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

# **viewitem**
```swift
    open class func viewitem(xApplicationId: String, xRestApiKey: String, completion: @escaping (_ data: Void?, _ error: Error?) -> Void)
```

Viewitem

Create a new item to a array type collection #### Request details Method: `GET`  URL: `api/v2/content/responses/{collection_id}/items{item_id}`  #### Headers `X-Application-Id` (string) **required** _Application ID from [NStack](https://nstack.io)_  `X-Rest-Api-Key` (string) **required** _Rest API key from [NStack](https://nstack.io)_  #### URL Parameters `collection_id` (int) **required** _ID of content collection_  `item_id` (int) **required** _ID of content collection item_  #### Response codes(s) `200` OK  `401` Collection does not have write access for api  `445` Entity not found

### Example 
```swift
// The following code samples are still beta. For any issue, please report via http://github.com/OpenAPITools/openapi-generator/issues/new
import OpenAPIClient

let xApplicationId = "xApplicationId_example" // String | 
let xRestApiKey = "xRestApiKey_example" // String | 

// Viewitem
CollectionsAPI.viewitem(xApplicationId: xApplicationId, xRestApiKey: xRestApiKey) { (response, error) in
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

# **viewitem1**
```swift
    open class func viewitem1(xApplicationId: String, xRestApiKey: String, completion: @escaping (_ data: Void?, _ error: Error?) -> Void)
```

Viewitem1

Create a new item to a array type collection #### Request details Method: `GET`  URL: `api/v1/content/responses/{collection_id}/items{item_id}`  #### Headers `X-Application-Id` (string) **required** _Application ID from [NStack](https://nstack.io)_  `X-Rest-Api-Key` (string) **required** _Rest API key from [NStack](https://nstack.io)_  #### URL Parameters `collection_id` (int) **required** _ID of content collection_  `item_id` (int) **required** _ID of content collection item_  #### Response codes(s) `200` OK  `401` Collection does not have write access for api  `445` Entity not found 

### Example 
```swift
// The following code samples are still beta. For any issue, please report via http://github.com/OpenAPITools/openapi-generator/issues/new
import OpenAPIClient

let xApplicationId = "xApplicationId_example" // String | 
let xRestApiKey = "xRestApiKey_example" // String | 

// Viewitem1
CollectionsAPI.viewitem1(xApplicationId: xApplicationId, xRestApiKey: xRestApiKey) { (response, error) in
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


# CollectionsApi

All URIs are relative to *https://nstack-staging.vapor.cloud*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createitem**](CollectionsApi.md#createitem) | **POST** /api/v2/content/collections/1/items | Createitem
[**createitem1**](CollectionsApi.md#createitem1) | **POST** /api/v1/content/collections/1/items | Createitem1
[**deleteitem**](CollectionsApi.md#deleteitem) | **DELETE** /api/v2/content/collections/1/items/13 | Deleteitem
[**deleteitem1**](CollectionsApi.md#deleteitem1) | **DELETE** /api/v1/content/collections/1/items/13 | Deleteitem1
[**update**](CollectionsApi.md#update) | **POST** /api/v2/content/collections/1/items/14/update | Update
[**update1**](CollectionsApi.md#update1) | **POST** /api/v1/content/collections/1/items/14/update | Update1
[**view**](CollectionsApi.md#view) | **GET** /api/v2/content/collections/1 | View
[**view1**](CollectionsApi.md#view1) | **GET** /api/v1/content/collections/1 | View1
[**viewitem**](CollectionsApi.md#viewitem) | **GET** /api/v2/content/collections/1/items/5 | Viewitem
[**viewitem1**](CollectionsApi.md#viewitem1) | **GET** /api/v1/content/collections/1/items/5 | Viewitem1


<a name="createitem"></a>
# **createitem**
> createitem(xminusApplicationMinusId, xminusRestMinusApiMinusKey, k0int, key1string, key2float, key3wysiwygsim, key4asset, key5boolean, key6wysiwygadvanced)

Createitem

Create a new item to a array type collection #### Request details Method: &#x60;POST&#x60;  URL: &#x60;api/v2/content/responses/{collection_id}/items&#x60;  #### Headers &#x60;X-Application-Id&#x60; (string) **required** _Application ID from [NStack](https://nstack.io)_  &#x60;X-Rest-Api-Key&#x60; (string) **required** _Rest API key from [NStack](https://nstack.io)_  #### URL Parameters &#x60;collection_id&#x60; (int) **required** _ID of content collection_  #### Post params  &#x60;All required keys&#x60;  #### Response codes(s) &#x60;200&#x60; OK  &#x60;401&#x60; Collectio does not have write access for api  &#x60;404&#x60; Entity not found  &#x60;412&#x60; Precondition failed _Please read response message_  &#x60;500&#x60; Internal server error _Please read response message_

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import dk.nodes.nstack.kotlin.codegen.model.*

val apiInstance = CollectionsApi()
val xminusApplicationMinusId : kotlin.String = xminusApplicationMinusId_example // kotlin.String | 
val xminusRestMinusApiMinusKey : kotlin.String = xminusRestMinusApiMinusKey_example // kotlin.String | 
val k0int : kotlin.Int = 56 // kotlin.Int | 
val key1string : kotlin.String = key1string_example // kotlin.String | 
val key2float : kotlin.Double = 1.2 // kotlin.Double | 
val key3wysiwygsim : kotlin.String = key3wysiwygsim_example // kotlin.String | 
val key4asset : kotlin.String = key4asset_example // kotlin.String | 
val key5boolean : kotlin.Boolean = true // kotlin.Boolean | 
val key6wysiwygadvanced : kotlin.String = key6wysiwygadvanced_example // kotlin.String | 
try {
    apiInstance.createitem(xminusApplicationMinusId, xminusRestMinusApiMinusKey, k0int, key1string, key2float, key3wysiwygsim, key4asset, key5boolean, key6wysiwygadvanced)
} catch (e: ClientException) {
    println("4xx response calling CollectionsApi#createitem")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CollectionsApi#createitem")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **xminusApplicationMinusId** | **kotlin.String**|  |
 **xminusRestMinusApiMinusKey** | **kotlin.String**|  |
 **k0int** | **kotlin.Int**|  |
 **key1string** | **kotlin.String**|  |
 **key2float** | **kotlin.Double**|  |
 **key3wysiwygsim** | **kotlin.String**|  |
 **key4asset** | **kotlin.String**|  |
 **key5boolean** | **kotlin.Boolean**|  |
 **key6wysiwygadvanced** | **kotlin.String**|  |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: Not defined

<a name="createitem1"></a>
# **createitem1**
> createitem1(xminusApplicationMinusId, xminusRestMinusApiMinusKey, k0int, key1string, key2float, key3wysiwygsim, key4asset, key5boolean, key6wysiwygadvanced)

Createitem1

Create a new item to a array type collection #### Request details Method: &#x60;POST&#x60;  URL: &#x60;api/v1/content/responses/{collection_id}/items&#x60;  #### Headers &#x60;X-Application-Id&#x60; (string) **required** _Application ID from [NStack](https://nstack.io)_  &#x60;X-Rest-Api-Key&#x60; (string) **required** _Rest API key from [NStack](https://nstack.io)_  #### URL Parameters &#x60;collection_id&#x60; (int) **required** _ID of content collection_  #### Post params  &#x60;All required keys&#x60;  #### Response codes(s) &#x60;200&#x60; OK  &#x60;401&#x60; Collectio does not have write access for api   &#x60;412&#x60; Precondition failed _Please read response message_  &#x60;445&#x60; Entity not found  &#x60;500&#x60; Internal server error _Please read response message_

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import dk.nodes.nstack.kotlin.codegen.model.*

val apiInstance = CollectionsApi()
val xminusApplicationMinusId : kotlin.String = xminusApplicationMinusId_example // kotlin.String | 
val xminusRestMinusApiMinusKey : kotlin.String = xminusRestMinusApiMinusKey_example // kotlin.String | 
val k0int : kotlin.Int = 56 // kotlin.Int | 
val key1string : kotlin.String = key1string_example // kotlin.String | 
val key2float : kotlin.Double = 1.2 // kotlin.Double | 
val key3wysiwygsim : kotlin.String = key3wysiwygsim_example // kotlin.String | 
val key4asset : kotlin.String = key4asset_example // kotlin.String | 
val key5boolean : kotlin.Boolean = true // kotlin.Boolean | 
val key6wysiwygadvanced : kotlin.String = key6wysiwygadvanced_example // kotlin.String | 
try {
    apiInstance.createitem1(xminusApplicationMinusId, xminusRestMinusApiMinusKey, k0int, key1string, key2float, key3wysiwygsim, key4asset, key5boolean, key6wysiwygadvanced)
} catch (e: ClientException) {
    println("4xx response calling CollectionsApi#createitem1")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CollectionsApi#createitem1")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **xminusApplicationMinusId** | **kotlin.String**|  |
 **xminusRestMinusApiMinusKey** | **kotlin.String**|  |
 **k0int** | **kotlin.Int**|  |
 **key1string** | **kotlin.String**|  |
 **key2float** | **kotlin.Double**|  |
 **key3wysiwygsim** | **kotlin.String**|  |
 **key4asset** | **kotlin.String**|  |
 **key5boolean** | **kotlin.Boolean**|  |
 **key6wysiwygadvanced** | **kotlin.String**|  |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: Not defined

<a name="deleteitem"></a>
# **deleteitem**
> deleteitem(xminusApplicationMinusId, xminusRestMinusApiMinusKey)

Deleteitem

Create a new item to a array type collection #### Request details Method: &#x60;DELETE&#x60;  URL: &#x60;api/v2/content/responses/{collection_id}/items{item_id}&#x60;  #### Headers &#x60;X-Application-Id&#x60; (string) **required** _Application ID from [NStack](https://nstack.io)_  &#x60;X-Rest-Api-Key&#x60; (string) **required** _Rest API key from [NStack](https://nstack.io)_  #### URL Parameters &#x60;collection_id&#x60; (int) **required** _ID of content collection_  &#x60;item_id&#x60; (int) **required** _ID of content collection item_  #### Response codes(s) &#x60;200&#x60; OK  &#x60;401&#x60; Collection does not have write access for api   &#x60;404&#x60; Entity not found  &#x60;500&#x60; Internal server error _Please read response message_

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import dk.nodes.nstack.kotlin.codegen.model.*

val apiInstance = CollectionsApi()
val xminusApplicationMinusId : kotlin.String = xminusApplicationMinusId_example // kotlin.String | 
val xminusRestMinusApiMinusKey : kotlin.String = xminusRestMinusApiMinusKey_example // kotlin.String | 
try {
    apiInstance.deleteitem(xminusApplicationMinusId, xminusRestMinusApiMinusKey)
} catch (e: ClientException) {
    println("4xx response calling CollectionsApi#deleteitem")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CollectionsApi#deleteitem")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **xminusApplicationMinusId** | **kotlin.String**|  |
 **xminusRestMinusApiMinusKey** | **kotlin.String**|  |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="deleteitem1"></a>
# **deleteitem1**
> deleteitem1(xminusApplicationMinusId, xminusRestMinusApiMinusKey)

Deleteitem1

Create a new item to a array type collection #### Request details Method: &#x60;DELETE&#x60;  URL: &#x60;api/v1/content/responses/{collection_id}/items{item_id}&#x60;  #### Headers &#x60;X-Application-Id&#x60; (string) **required** _Application ID from [NStack](https://nstack.io)_  &#x60;X-Rest-Api-Key&#x60; (string) **required** _Rest API key from [NStack](https://nstack.io)_  #### URL Parameters &#x60;collection_id&#x60; (int) **required** _ID of content collection_  &#x60;item_id&#x60; (int) **required** _ID of content collection item_  #### Response codes(s) &#x60;200&#x60; OK  &#x60;401&#x60; Collection does not have write access for api  &#x60;445&#x60; Entity not found  &#x60;500&#x60; Internal server error _Please read response message_

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import dk.nodes.nstack.kotlin.codegen.model.*

val apiInstance = CollectionsApi()
val xminusApplicationMinusId : kotlin.String = xminusApplicationMinusId_example // kotlin.String | 
val xminusRestMinusApiMinusKey : kotlin.String = xminusRestMinusApiMinusKey_example // kotlin.String | 
try {
    apiInstance.deleteitem1(xminusApplicationMinusId, xminusRestMinusApiMinusKey)
} catch (e: ClientException) {
    println("4xx response calling CollectionsApi#deleteitem1")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CollectionsApi#deleteitem1")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **xminusApplicationMinusId** | **kotlin.String**|  |
 **xminusRestMinusApiMinusKey** | **kotlin.String**|  |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="update"></a>
# **update**
> update(xminusApplicationMinusId, xminusRestMinusApiMinusKey, contentMinusType, k0int, key1string, key2float, key3wysiwygsim, key4asset, key5boolean, key6wysiwygadvanced)

Update

Create a new item to a array type collection #### Request details Method: &#x60;POST&#x60;  URL: &#x60;api/v2/content/responses/{collection_id}/items&#x60;  #### Headers &#x60;X-Application-Id&#x60; (string) **required** _Application ID from [NStack](https://nstack.io)_  &#x60;X-Rest-Api-Key&#x60; (string) **required** _Rest API key from [NStack](https://nstack.io)_  #### URL Parameters &#x60;collection_id&#x60; (int) **required** _ID of content collection_  #### Post params  &#x60;All required keys&#x60;  #### Response codes(s) &#x60;200&#x60; OK  &#x60;401&#x60; Collectio does not have write access for api   &#x60;404&#x60; Entity not found  &#x60;412&#x60; Precondition failed _Please read response message_  &#x60;500&#x60; Internal server error _Please read response message_

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import dk.nodes.nstack.kotlin.codegen.model.*

val apiInstance = CollectionsApi()
val xminusApplicationMinusId : kotlin.String = xminusApplicationMinusId_example // kotlin.String | 
val xminusRestMinusApiMinusKey : kotlin.String = xminusRestMinusApiMinusKey_example // kotlin.String | 
val contentMinusType : kotlin.String = contentMinusType_example // kotlin.String | 
val k0int : kotlin.Int = 56 // kotlin.Int | 
val key1string : kotlin.String = key1string_example // kotlin.String | 
val key2float : kotlin.Double = 1.2 // kotlin.Double | 
val key3wysiwygsim : kotlin.String = key3wysiwygsim_example // kotlin.String | 
val key4asset : kotlin.String = key4asset_example // kotlin.String | 
val key5boolean : kotlin.Boolean = true // kotlin.Boolean | 
val key6wysiwygadvanced : kotlin.String = key6wysiwygadvanced_example // kotlin.String | 
try {
    apiInstance.update(xminusApplicationMinusId, xminusRestMinusApiMinusKey, contentMinusType, k0int, key1string, key2float, key3wysiwygsim, key4asset, key5boolean, key6wysiwygadvanced)
} catch (e: ClientException) {
    println("4xx response calling CollectionsApi#update")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CollectionsApi#update")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **xminusApplicationMinusId** | **kotlin.String**|  |
 **xminusRestMinusApiMinusKey** | **kotlin.String**|  |
 **contentMinusType** | **kotlin.String**|  |
 **k0int** | **kotlin.Int**|  |
 **key1string** | **kotlin.String**|  |
 **key2float** | **kotlin.Double**|  |
 **key3wysiwygsim** | **kotlin.String**|  |
 **key4asset** | **kotlin.String**|  |
 **key5boolean** | **kotlin.Boolean**|  |
 **key6wysiwygadvanced** | **kotlin.String**|  |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: Not defined

<a name="update1"></a>
# **update1**
> update1(xminusApplicationMinusId, xminusRestMinusApiMinusKey, contentMinusType, k0int, key1string, key2float, key3wysiwygsim, key4asset, key5boolean, key6wysiwygadvanced)

Update1

Create a new item to a array type collection #### Request details Method: &#x60;POST&#x60;  URL: &#x60;api/v1/content/responses/{collection_id}/items&#x60;  #### Headers &#x60;X-Application-Id&#x60; (string) **required** _Application ID from [NStack](https://nstack.io)_  &#x60;X-Rest-Api-Key&#x60; (string) **required** _Rest API key from [NStack](https://nstack.io)_  #### URL Parameters &#x60;collection_id&#x60; (int) **required** _ID of content collection_  #### Post params  &#x60;All required keys&#x60;  #### Response codes(s) &#x60;200&#x60; OK  &#x60;401&#x60; Collectio does not have write access for api   &#x60;412&#x60; Precondition failed _Please read response message_  &#x60;445&#x60; Entity not found  &#x60;500&#x60; Internal server error _Please read response message_

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import dk.nodes.nstack.kotlin.codegen.model.*

val apiInstance = CollectionsApi()
val xminusApplicationMinusId : kotlin.String = xminusApplicationMinusId_example // kotlin.String | 
val xminusRestMinusApiMinusKey : kotlin.String = xminusRestMinusApiMinusKey_example // kotlin.String | 
val contentMinusType : kotlin.String = contentMinusType_example // kotlin.String | 
val k0int : kotlin.Int = 56 // kotlin.Int | 
val key1string : kotlin.String = key1string_example // kotlin.String | 
val key2float : kotlin.Double = 1.2 // kotlin.Double | 
val key3wysiwygsim : kotlin.String = key3wysiwygsim_example // kotlin.String | 
val key4asset : kotlin.String = key4asset_example // kotlin.String | 
val key5boolean : kotlin.Boolean = true // kotlin.Boolean | 
val key6wysiwygadvanced : kotlin.String = key6wysiwygadvanced_example // kotlin.String | 
try {
    apiInstance.update1(xminusApplicationMinusId, xminusRestMinusApiMinusKey, contentMinusType, k0int, key1string, key2float, key3wysiwygsim, key4asset, key5boolean, key6wysiwygadvanced)
} catch (e: ClientException) {
    println("4xx response calling CollectionsApi#update1")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CollectionsApi#update1")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **xminusApplicationMinusId** | **kotlin.String**|  |
 **xminusRestMinusApiMinusKey** | **kotlin.String**|  |
 **contentMinusType** | **kotlin.String**|  |
 **k0int** | **kotlin.Int**|  |
 **key1string** | **kotlin.String**|  |
 **key2float** | **kotlin.Double**|  |
 **key3wysiwygsim** | **kotlin.String**|  |
 **key4asset** | **kotlin.String**|  |
 **key5boolean** | **kotlin.Boolean**|  |
 **key6wysiwygadvanced** | **kotlin.String**|  |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: Not defined

<a name="view"></a>
# **view**
> view(xminusApplicationMinusId, xminusRestMinusApiMinusKey)

View

Get a default type of content collection  #### Request details Method: &#x60;GET&#x60;  URL: &#x60;api/v2/content/responses/{collection_id}&#x60;  #### Headers &#x60;X-Application-Id&#x60; (string) **required** _Application ID from [NStack](https://nstack.io)_  &#x60;X-Rest-Api-Key&#x60; (string) **required** _Rest API key from [NStack](https://nstack.io)_  #### URL Parameters &#x60;collection_id&#x60; (int) **required** _ID of content collection_  #### Response codes(s) &#x60;200&#x60; OK  &#x60;404&#x60; Entity not found  &#x60;500&#x60; Internal server error _Please read response message_

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import dk.nodes.nstack.kotlin.codegen.model.*

val apiInstance = CollectionsApi()
val xminusApplicationMinusId : kotlin.String = xminusApplicationMinusId_example // kotlin.String | 
val xminusRestMinusApiMinusKey : kotlin.String = xminusRestMinusApiMinusKey_example // kotlin.String | 
try {
    apiInstance.view(xminusApplicationMinusId, xminusRestMinusApiMinusKey)
} catch (e: ClientException) {
    println("4xx response calling CollectionsApi#view")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CollectionsApi#view")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **xminusApplicationMinusId** | **kotlin.String**|  |
 **xminusRestMinusApiMinusKey** | **kotlin.String**|  |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="view1"></a>
# **view1**
> view1(xminusApplicationMinusId, xminusRestMinusApiMinusKey)

View1

Get a default type of content collection  #### Request details Method: &#x60;GET&#x60;  URL: &#x60;api/v1/content/responses/{collection_id}&#x60;  #### Headers &#x60;X-Application-Id&#x60; (string) **required** _Application ID from [NStack](https://nstack.io)_  &#x60;X-Rest-Api-Key&#x60; (string) **required** _Rest API key from [NStack](https://nstack.io)_  #### URL Parameters &#x60;collection_id&#x60; (int) **required** _ID of content collection_  #### Response codes(s) &#x60;200&#x60; OK  &#x60;445&#x60; Entity not found  &#x60;500&#x60; Internal server error _Please read response message_

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import dk.nodes.nstack.kotlin.codegen.model.*

val apiInstance = CollectionsApi()
val xminusApplicationMinusId : kotlin.String = xminusApplicationMinusId_example // kotlin.String | 
val xminusRestMinusApiMinusKey : kotlin.String = xminusRestMinusApiMinusKey_example // kotlin.String | 
try {
    apiInstance.view1(xminusApplicationMinusId, xminusRestMinusApiMinusKey)
} catch (e: ClientException) {
    println("4xx response calling CollectionsApi#view1")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CollectionsApi#view1")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **xminusApplicationMinusId** | **kotlin.String**|  |
 **xminusRestMinusApiMinusKey** | **kotlin.String**|  |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="viewitem"></a>
# **viewitem**
> viewitem(xminusApplicationMinusId, xminusRestMinusApiMinusKey)

Viewitem

Create a new item to a array type collection #### Request details Method: &#x60;GET&#x60;  URL: &#x60;api/v2/content/responses/{collection_id}/items{item_id}&#x60;  #### Headers &#x60;X-Application-Id&#x60; (string) **required** _Application ID from [NStack](https://nstack.io)_  &#x60;X-Rest-Api-Key&#x60; (string) **required** _Rest API key from [NStack](https://nstack.io)_  #### URL Parameters &#x60;collection_id&#x60; (int) **required** _ID of content collection_  &#x60;item_id&#x60; (int) **required** _ID of content collection item_  #### Response codes(s) &#x60;200&#x60; OK  &#x60;401&#x60; Collection does not have write access for api  &#x60;445&#x60; Entity not found

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import dk.nodes.nstack.kotlin.codegen.model.*

val apiInstance = CollectionsApi()
val xminusApplicationMinusId : kotlin.String = xminusApplicationMinusId_example // kotlin.String | 
val xminusRestMinusApiMinusKey : kotlin.String = xminusRestMinusApiMinusKey_example // kotlin.String | 
try {
    apiInstance.viewitem(xminusApplicationMinusId, xminusRestMinusApiMinusKey)
} catch (e: ClientException) {
    println("4xx response calling CollectionsApi#viewitem")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CollectionsApi#viewitem")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **xminusApplicationMinusId** | **kotlin.String**|  |
 **xminusRestMinusApiMinusKey** | **kotlin.String**|  |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="viewitem1"></a>
# **viewitem1**
> viewitem1(xminusApplicationMinusId, xminusRestMinusApiMinusKey)

Viewitem1

Create a new item to a array type collection #### Request details Method: &#x60;GET&#x60;  URL: &#x60;api/v1/content/responses/{collection_id}/items{item_id}&#x60;  #### Headers &#x60;X-Application-Id&#x60; (string) **required** _Application ID from [NStack](https://nstack.io)_  &#x60;X-Rest-Api-Key&#x60; (string) **required** _Rest API key from [NStack](https://nstack.io)_  #### URL Parameters &#x60;collection_id&#x60; (int) **required** _ID of content collection_  &#x60;item_id&#x60; (int) **required** _ID of content collection item_  #### Response codes(s) &#x60;200&#x60; OK  &#x60;401&#x60; Collection does not have write access for api  &#x60;445&#x60; Entity not found 

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import dk.nodes.nstack.kotlin.codegen.model.*

val apiInstance = CollectionsApi()
val xminusApplicationMinusId : kotlin.String = xminusApplicationMinusId_example // kotlin.String | 
val xminusRestMinusApiMinusKey : kotlin.String = xminusRestMinusApiMinusKey_example // kotlin.String | 
try {
    apiInstance.viewitem1(xminusApplicationMinusId, xminusRestMinusApiMinusKey)
} catch (e: ClientException) {
    println("4xx response calling CollectionsApi#viewitem1")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CollectionsApi#viewitem1")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **xminusApplicationMinusId** | **kotlin.String**|  |
 **xminusRestMinusApiMinusKey** | **kotlin.String**|  |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined


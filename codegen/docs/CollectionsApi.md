# CollectionsApi

All URIs are relative to *https://nstack.io*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createitem**](CollectionsApi.md#createitem) | **POST** /api/v2/content/collections/{collectionId}/items | Createitem
[**deleteitem**](CollectionsApi.md#deleteitem) | **DELETE** /api/v2/content/collections/{collectionId/items/{itemId} | Deleteitem
[**update**](CollectionsApi.md#update) | **POST** /api/v2/content/collections/{collectionId}/items/{itemId}/update | Update
[**view**](CollectionsApi.md#view) | **GET** /api/v2/content/collections/{collectionId} | View
[**viewitem**](CollectionsApi.md#viewitem) | **GET** /api/v2/content/collections/{collectionId}/items/{itemId} | Viewitem


<a name="createitem"></a>
# **createitem**
> createitem(collectionId, xminusApplicationMinusId, xminusRestMinusApiMinusKey, collectionId2, k0int, key1string, key2float, key3wysiwygsim, key4asset, key5boolean, key6wysiwygadvanced)

Createitem

Create a new item to a array type collection #### Request details Method: &#x60;POST&#x60;  URL: &#x60;api/v2/content/responses/{collection_id}/items&#x60;  #### Headers &#x60;X-Application-Id&#x60; (string) **required** _Application ID from [NStack](https://nstack.io)_  &#x60;X-Rest-Api-Key&#x60; (string) **required** _Rest API key from [NStack](https://nstack.io)_  #### URL Parameters &#x60;collection_id&#x60; (int) **required** _ID of content collection_  #### Post params  &#x60;All required keys&#x60;

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import dk.nodes.nstack.kotlin.codegen.model.*

val apiInstance = CollectionsApi()
val collectionId : kotlin.Long = 789 // kotlin.Long | Parameter description in CommonMark or HTML.
val xminusApplicationMinusId : kotlin.String = xminusApplicationMinusId_example // kotlin.String | 
val xminusRestMinusApiMinusKey : kotlin.String = xminusRestMinusApiMinusKey_example // kotlin.String | 
val collectionId2 : kotlin.Int = 56 // kotlin.Int | Collection Id
val k0int : kotlin.Int = 56 // kotlin.Int | 
val key1string : kotlin.String = key1string_example // kotlin.String | 
val key2float : kotlin.Double = 1.2 // kotlin.Double | 
val key3wysiwygsim : kotlin.String = key3wysiwygsim_example // kotlin.String | 
val key4asset : kotlin.String = key4asset_example // kotlin.String | 
val key5boolean : kotlin.Boolean = true // kotlin.Boolean | 
val key6wysiwygadvanced : kotlin.String = key6wysiwygadvanced_example // kotlin.String | 
try {
    apiInstance.createitem(collectionId, xminusApplicationMinusId, xminusRestMinusApiMinusKey, collectionId2, k0int, key1string, key2float, key3wysiwygsim, key4asset, key5boolean, key6wysiwygadvanced)
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
 **collectionId** | **kotlin.Long**| Parameter description in CommonMark or HTML. |
 **xminusApplicationMinusId** | **kotlin.String**|  |
 **xminusRestMinusApiMinusKey** | **kotlin.String**|  |
 **collectionId2** | **kotlin.Int**| Collection Id |
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
> deleteitem(collectionId, itemId, xminusApplicationMinusId, xminusRestMinusApiMinusKey, collectionId2, itemId2)

Deleteitem

Create a new item to a array type collection #### Request details Method: &#x60;DELETE&#x60;  URL: &#x60;api/v2/content/responses/{collection_id}/items{item_id}&#x60;  #### Headers &#x60;X-Application-Id&#x60; (string) **required** _Application ID from [NStack](https://nstack.io)_  &#x60;X-Rest-Api-Key&#x60; (string) **required** _Rest API key from [NStack](https://nstack.io)_  #### URL Parameters &#x60;collection_id&#x60; (int) **required** _ID of content collection_  &#x60;item_id&#x60; (int) **required** _ID of content collection item_  #### Response codes(s) &#x60;200&#x60; OK  &#x60;401&#x60; Collection does not have write access for api   &#x60;404&#x60; Entity not found  &#x60;500&#x60; Internal server error _Please read response message_

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import dk.nodes.nstack.kotlin.codegen.model.*

val apiInstance = CollectionsApi()
val collectionId : kotlin.Long = 789 // kotlin.Long | collectionId
val itemId : kotlin.Long = 789 // kotlin.Long | itemId
val xminusApplicationMinusId : kotlin.String = xminusApplicationMinusId_example // kotlin.String | 
val xminusRestMinusApiMinusKey : kotlin.String = xminusRestMinusApiMinusKey_example // kotlin.String | 
val collectionId2 : kotlin.Int = 56 // kotlin.Int | 
val itemId2 : kotlin.Int = 56 // kotlin.Int | 
try {
    apiInstance.deleteitem(collectionId, itemId, xminusApplicationMinusId, xminusRestMinusApiMinusKey, collectionId2, itemId2)
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
 **collectionId** | **kotlin.Long**| collectionId |
 **itemId** | **kotlin.Long**| itemId |
 **xminusApplicationMinusId** | **kotlin.String**|  |
 **xminusRestMinusApiMinusKey** | **kotlin.String**|  |
 **collectionId2** | **kotlin.Int**|  |
 **itemId2** | **kotlin.Int**|  |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="update"></a>
# **update**
> update(collectionId, itemId, xminusApplicationMinusId, xminusRestMinusApiMinusKey, contentMinusType, collectionId2, itemId2, k0int, key1string, key2float, key3wysiwygsim, key4asset, key5boolean, key6wysiwygadvanced)

Update

Create a new item to a array type collection #### Request details Method: &#x60;POST&#x60;  URL: &#x60;api/v2/content/responses/{collection_id}/items&#x60;  #### Headers &#x60;X-Application-Id&#x60; (string) **required** _Application ID from [NStack](https://nstack.io)_  &#x60;X-Rest-Api-Key&#x60; (string) **required** _Rest API key from [NStack](https://nstack.io)_  #### URL Parameters &#x60;collection_id&#x60; (int) **required** _ID of content collection_  #### Post params  &#x60;All required keys&#x60;  #### Response codes(s) &#x60;200&#x60; OK  &#x60;401&#x60; Collectio does not have write access for api   &#x60;404&#x60; Entity not found  &#x60;412&#x60; Precondition failed _Please read response message_  &#x60;500&#x60; Internal server error _Please read response message_

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import dk.nodes.nstack.kotlin.codegen.model.*

val apiInstance = CollectionsApi()
val collectionId : kotlin.Long = 789 // kotlin.Long | collectionId
val itemId : kotlin.Long = 789 // kotlin.Long | itemId
val xminusApplicationMinusId : kotlin.String = xminusApplicationMinusId_example // kotlin.String | 
val xminusRestMinusApiMinusKey : kotlin.String = xminusRestMinusApiMinusKey_example // kotlin.String | 
val contentMinusType : kotlin.String = contentMinusType_example // kotlin.String | 
val collectionId2 : kotlin.Int = 56 // kotlin.Int | 
val itemId2 : kotlin.Int = 56 // kotlin.Int | 
val k0int : kotlin.Int = 56 // kotlin.Int | 
val key1string : kotlin.String = key1string_example // kotlin.String | 
val key2float : kotlin.Double = 1.2 // kotlin.Double | 
val key3wysiwygsim : kotlin.String = key3wysiwygsim_example // kotlin.String | 
val key4asset : kotlin.String = key4asset_example // kotlin.String | 
val key5boolean : kotlin.Boolean = true // kotlin.Boolean | 
val key6wysiwygadvanced : kotlin.String = key6wysiwygadvanced_example // kotlin.String | 
try {
    apiInstance.update(collectionId, itemId, xminusApplicationMinusId, xminusRestMinusApiMinusKey, contentMinusType, collectionId2, itemId2, k0int, key1string, key2float, key3wysiwygsim, key4asset, key5boolean, key6wysiwygadvanced)
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
 **collectionId** | **kotlin.Long**| collectionId |
 **itemId** | **kotlin.Long**| itemId |
 **xminusApplicationMinusId** | **kotlin.String**|  |
 **xminusRestMinusApiMinusKey** | **kotlin.String**|  |
 **contentMinusType** | **kotlin.String**|  |
 **collectionId2** | **kotlin.Int**|  |
 **itemId2** | **kotlin.Int**|  |
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
> view(collectionId, xminusApplicationMinusId, xminusRestMinusApiMinusKey, collectionId2)

View

Get a default type of content collection  #### Request details Method: &#x60;GET&#x60;  URL: &#x60;api/v2/content/responses/{collection_id}&#x60;  #### Headers &#x60;X-Application-Id&#x60; (string) **required** _Application ID from [NStack](https://nstack.io)_  &#x60;X-Rest-Api-Key&#x60; (string) **required** _Rest API key from [NStack](https://nstack.io)_  #### URL Parameters &#x60;collection_id&#x60; (int) **required** _ID of content collection_

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import dk.nodes.nstack.kotlin.codegen.model.*

val apiInstance = CollectionsApi()
val collectionId : kotlin.Long = 789 // kotlin.Long | Parameter description in CommonMark or HTML.
val xminusApplicationMinusId : kotlin.String = xminusApplicationMinusId_example // kotlin.String | 
val xminusRestMinusApiMinusKey : kotlin.String = xminusRestMinusApiMinusKey_example // kotlin.String | 
val collectionId2 : kotlin.Int = 56 // kotlin.Int | Collection ID
try {
    apiInstance.view(collectionId, xminusApplicationMinusId, xminusRestMinusApiMinusKey, collectionId2)
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
 **collectionId** | **kotlin.Long**| Parameter description in CommonMark or HTML. |
 **xminusApplicationMinusId** | **kotlin.String**|  |
 **xminusRestMinusApiMinusKey** | **kotlin.String**|  |
 **collectionId2** | **kotlin.Int**| Collection ID |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="viewitem"></a>
# **viewitem**
> viewitem(collectionId, itemId, xminusApplicationMinusId, xminusRestMinusApiMinusKey, collectionId2, itemId2)

Viewitem

Create a new item to a array type collection #### Request details Method: &#x60;GET&#x60;  URL: &#x60;api/v2/content/responses/{collection_id}/items{item_id}&#x60;  #### Headers &#x60;X-Application-Id&#x60; (string) **required** _Application ID from [NStack](https://nstack.io)_  &#x60;X-Rest-Api-Key&#x60; (string) **required** _Rest API key from [NStack](https://nstack.io)_  #### URL Parameters &#x60;collection_id&#x60; (int) **required** _ID of content collection_  &#x60;item_id&#x60; (int) **required** _ID of content collection item_  #### Response codes(s) &#x60;200&#x60; OK  &#x60;401&#x60; Collection does not have write access for api  &#x60;445&#x60; Entity not found

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import dk.nodes.nstack.kotlin.codegen.model.*

val apiInstance = CollectionsApi()
val collectionId : kotlin.Long = 789 // kotlin.Long | collectionId
val itemId : kotlin.Long = 789 // kotlin.Long | itemId
val xminusApplicationMinusId : kotlin.String = xminusApplicationMinusId_example // kotlin.String | 
val xminusRestMinusApiMinusKey : kotlin.String = xminusRestMinusApiMinusKey_example // kotlin.String | 
val collectionId2 : kotlin.Int = 56 // kotlin.Int | 
val itemId2 : kotlin.Int = 56 // kotlin.Int | 
try {
    apiInstance.viewitem(collectionId, itemId, xminusApplicationMinusId, xminusRestMinusApiMinusKey, collectionId2, itemId2)
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
 **collectionId** | **kotlin.Long**| collectionId |
 **itemId** | **kotlin.Long**| itemId |
 **xminusApplicationMinusId** | **kotlin.String**|  |
 **xminusRestMinusApiMinusKey** | **kotlin.String**|  |
 **collectionId2** | **kotlin.Int**|  |
 **itemId2** | **kotlin.Int**|  |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined


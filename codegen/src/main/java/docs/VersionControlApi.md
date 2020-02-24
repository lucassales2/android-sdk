# VersionControlApi

All URIs are relative to *https://nstack-staging.vapor.cloud*

Method | HTTP request | Description
------------- | ------------- | -------------
[**indexupdate**](VersionControlApi.md#indexupdate) | **GET** /api/v2/notify/updates | Indexupdate
[**indexupdate1**](VersionControlApi.md#indexupdate1) | **GET** /api/v1/notify/updates | Indexupdate1
[**markupdateasseen**](VersionControlApi.md#markupdateasseen) | **POST** /api/v2/notify/updates/views | Markupdateasseen
[**markupdateasseen1**](VersionControlApi.md#markupdateasseen1) | **POST** /api/v1/notify/updates/views | Markupdateasseen1


<a name="indexupdate"></a>
# **indexupdate**
> VersionControl indexupdate(platform, currentVersion, lastVersion, xminusApplicationMinusId, xminusRestMinusApiMinusKey)

Indexupdate

Get app updated  #### Request details Method:    &#x60;GET&#x60;  URL:    &#x60;/api/v2/notify/updates&#x60;  #### Headers  &#x60;X-Application-Id&#x60; (string) **required** _Application ID from [NStack](https://nstack.io)_  &#x60;X-Rest-Api-Key&#x60; (string) **required** _Rest API key from [NStack](https://nstack.io)_  #### Query parameters &#x60;platform&#x60; (string) **required** _[\&quot;ios\&quot;, \&quot;android\&quot;, \&quot;windows\&quot;]_  &#x60;current_version&#x60; (string) **required** _Current version of app making the request_  &#x60;last_version&#x60; (string) _[?]_  &#x60;test&#x60; (bool) _Enable test mode, false equals production_  #### Response codes &#x60;200&#x60; OK  &#x60;412&#x60; Precondition failed

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import dk.nodes.nstack.kotlin.codegen.model.*

val apiInstance = VersionControlApi()
val platform : kotlin.String = platform_example // kotlin.String | 
val currentVersion : kotlin.Double = 1.2 // kotlin.Double | 
val lastVersion : kotlin.Double = 1.2 // kotlin.Double | 
val xminusApplicationMinusId : kotlin.String = xminusApplicationMinusId_example // kotlin.String | 
val xminusRestMinusApiMinusKey : kotlin.String = xminusRestMinusApiMinusKey_example // kotlin.String | 
try {
    val result : VersionControl = apiInstance.indexupdate(platform, currentVersion, lastVersion, xminusApplicationMinusId, xminusRestMinusApiMinusKey)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling VersionControlApi#indexupdate")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling VersionControlApi#indexupdate")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **platform** | **kotlin.String**|  |
 **currentVersion** | **kotlin.Double**|  |
 **lastVersion** | **kotlin.Double**|  |
 **xminusApplicationMinusId** | **kotlin.String**|  |
 **xminusRestMinusApiMinusKey** | **kotlin.String**|  |

### Return type

**VersionControl**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="indexupdate1"></a>
# **indexupdate1**
> indexupdate1(platform, currentVersion, lastVersion, xminusApplicationMinusId, xminusRestMinusApiMinusKey)

Indexupdate1

Get app updated  #### Request details Method:    &#x60;GET&#x60;  URL:    &#x60;/api/v1/notify/updates&#x60;  #### Headers  &#x60;X-Application-Id&#x60; (string) **required** _Application ID from [NStack](https://nstack.io)_  &#x60;X-Rest-Api-Key&#x60; (string) **required** _Rest API key from [NStack](https://nstack.io)_  #### Query parameters &#x60;platform&#x60; (string) **required** _[\&quot;ios\&quot;, \&quot;android\&quot;, \&quot;windows\&quot;]_  &#x60;current_version&#x60; (string) **required** _Current version of app making the request_  &#x60;last_version&#x60; (string) _[?]_  &#x60;test&#x60; (bool) _Enable test mode, false equals production_  #### Response codes &#x60;200&#x60; OK  &#x60;412&#x60; Precondition failed

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import dk.nodes.nstack.kotlin.codegen.model.*

val apiInstance = VersionControlApi()
val platform : kotlin.String = platform_example // kotlin.String | 
val currentVersion : kotlin.Double = 1.2 // kotlin.Double | 
val lastVersion : kotlin.Double = 1.2 // kotlin.Double | 
val xminusApplicationMinusId : kotlin.String = xminusApplicationMinusId_example // kotlin.String | 
val xminusRestMinusApiMinusKey : kotlin.String = xminusRestMinusApiMinusKey_example // kotlin.String | 
try {
    apiInstance.indexupdate1(platform, currentVersion, lastVersion, xminusApplicationMinusId, xminusRestMinusApiMinusKey)
} catch (e: ClientException) {
    println("4xx response calling VersionControlApi#indexupdate1")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling VersionControlApi#indexupdate1")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **platform** | **kotlin.String**|  |
 **currentVersion** | **kotlin.Double**|  |
 **lastVersion** | **kotlin.Double**|  |
 **xminusApplicationMinusId** | **kotlin.String**|  |
 **xminusRestMinusApiMinusKey** | **kotlin.String**|  |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="markupdateasseen"></a>
# **markupdateasseen**
> markupdateasseen(xminusApplicationMinusId, xminusRestMinusApiMinusKey, guid, updateId, answer, type)

Markupdateasseen

Register a view update  #### Request details Method:    &#x60;POST&#x60;  URL:    &#x60;/api/v2/notify/updates/views&#x60;  #### Headers  &#x60;X-Application-Id&#x60; (string) **required** _Application ID from [NStack](https://nstack.io)_  &#x60;X-Rest-Api-Key&#x60; (string) **required** _Rest API key from [NStack](https://nstack.io)_  #### Parameters &#x60;guid&#x60; (int) **required** _[?]_  &#x60;update_id&#x60; (int) **required** _Id of update where view was updated_  &#x60;answer&#x60; (string) **required** _[\&quot;no\&quot;, \&quot;yes\&quot;]_  &#x60;type&#x60; (string) **required** _[\&quot;newer_version\&quot;, \&quot;new_in_version\&quot;]_   #### Response codes &#x60;200&#x60; OK  &#x60;412&#x60; Precondition failed

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import dk.nodes.nstack.kotlin.codegen.model.*

val apiInstance = VersionControlApi()
val xminusApplicationMinusId : kotlin.String = xminusApplicationMinusId_example // kotlin.String | 
val xminusRestMinusApiMinusKey : kotlin.String = xminusRestMinusApiMinusKey_example // kotlin.String | 
val guid : kotlin.Int = 56 // kotlin.Int | 
val updateId : kotlin.Int = 56 // kotlin.Int | 
val answer : kotlin.String = answer_example // kotlin.String | 
val type : kotlin.String = type_example // kotlin.String | 
try {
    apiInstance.markupdateasseen(xminusApplicationMinusId, xminusRestMinusApiMinusKey, guid, updateId, answer, type)
} catch (e: ClientException) {
    println("4xx response calling VersionControlApi#markupdateasseen")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling VersionControlApi#markupdateasseen")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **xminusApplicationMinusId** | **kotlin.String**|  |
 **xminusRestMinusApiMinusKey** | **kotlin.String**|  |
 **guid** | **kotlin.Int**|  |
 **updateId** | **kotlin.Int**|  |
 **answer** | **kotlin.String**|  |
 **type** | **kotlin.String**|  |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: Not defined

<a name="markupdateasseen1"></a>
# **markupdateasseen1**
> markupdateasseen1(xminusApplicationMinusId, xminusRestMinusApiMinusKey, guid, updateId, answer, type)

Markupdateasseen1

Register a view update  #### Request details Method:    &#x60;POST&#x60;  URL:    &#x60;/api/v1/notify/updates/views&#x60;  #### Headers  &#x60;X-Application-Id&#x60; (string) **required** _Application ID from [NStack](https://nstack.io)_  &#x60;X-Rest-Api-Key&#x60; (string) **required** _Rest API key from [NStack](https://nstack.io)_  #### Parameters &#x60;guid&#x60; (int) **required** _[?]_  &#x60;update_id&#x60; (int) **required** _Id of update where view was updated_  &#x60;answer&#x60; (string) **required** _[\&quot;no\&quot;, \&quot;yes\&quot;]_  &#x60;type&#x60; (string) **required** _[\&quot;newer_version\&quot;, \&quot;new_in_version\&quot;]_   #### Response codes &#x60;200&#x60; OK  &#x60;412&#x60; Precondition failed

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import dk.nodes.nstack.kotlin.codegen.model.*

val apiInstance = VersionControlApi()
val xminusApplicationMinusId : kotlin.String = xminusApplicationMinusId_example // kotlin.String | 
val xminusRestMinusApiMinusKey : kotlin.String = xminusRestMinusApiMinusKey_example // kotlin.String | 
val guid : kotlin.Int = 56 // kotlin.Int | 
val updateId : kotlin.Int = 56 // kotlin.Int | 
val answer : kotlin.String = answer_example // kotlin.String | 
val type : kotlin.String = type_example // kotlin.String | 
try {
    apiInstance.markupdateasseen1(xminusApplicationMinusId, xminusRestMinusApiMinusKey, guid, updateId, answer, type)
} catch (e: ClientException) {
    println("4xx response calling VersionControlApi#markupdateasseen1")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling VersionControlApi#markupdateasseen1")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **xminusApplicationMinusId** | **kotlin.String**|  |
 **xminusRestMinusApiMinusKey** | **kotlin.String**|  |
 **guid** | **kotlin.Int**|  |
 **updateId** | **kotlin.Int**|  |
 **answer** | **kotlin.String**|  |
 **type** | **kotlin.String**|  |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: Not defined


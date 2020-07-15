# TimeZonesApi

All URIs are relative to *https://nstack.io*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getIndex123**](TimeZonesApi.md#getIndex123) | **GET** /api/v2/geographic/time_zones | GetIndex123
[**getShow123456**](TimeZonesApi.md#getShow123456) | **GET** /api/v2/geographic/time_zones/1 | GetShow123456
[**showbylatlng**](TimeZonesApi.md#showbylatlng) | **GET** /api/v2/geographic/time_zones/by_lat_lng | Showbylatlng


<a name="getIndex123"></a>
# **getIndex123**
> getIndex123(xminusApplicationMinusId, xminusRestMinusApiMinusKey)

GetIndex123

Retrieve a list of valid timesones on Earth  #### Request details Method:    &#x60;GET&#x60;  URL:    &#x60;/api/v2/geographic/timezones&#x60;  #### Headers  &#x60;X-Application-Id&#x60; (string) **required** _Application ID from [NStack](https://nstack.io)_  &#x60;X-Rest-Api-Key&#x60; (string) **required** _Rest API key from [NStack](https://nstack.io)_  #### Query parameters (filters) &#x60;limit&#x60; (int) _Eg: [/api/geographic/timezones?limit&#x3D;1] Default limit is 1000_  &#x60;order&#x60; (string) _Eg: [/api/geographic/timezones?order&#x3D;name:desc]_  &#x60;search&#x60; (string) _[Eg: /api/geographic/timezones?search&#x3D;Europe/Andorra]_  &#x60;fields&#x60; (string) _[Eg: /api/geographic/timezones?fields&#x3D;name,abbr]_  #### Response codes(s)  &#x60;200&#x60; OK  &#x60;412&#x60; Precondition failed _Invalid filters_

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import dk.nodes.nstack.kotlin.codegen.model.*

val apiInstance = TimeZonesApi()
val xminusApplicationMinusId : kotlin.String = xminusApplicationMinusId_example // kotlin.String | 
val xminusRestMinusApiMinusKey : kotlin.String = xminusRestMinusApiMinusKey_example // kotlin.String | 
try {
    apiInstance.getIndex123(xminusApplicationMinusId, xminusRestMinusApiMinusKey)
} catch (e: ClientException) {
    println("4xx response calling TimeZonesApi#getIndex123")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TimeZonesApi#getIndex123")
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

<a name="getShow123456"></a>
# **getShow123456**
> getShow123456(xminusApplicationMinusId, xminusRestMinusApiMinusKey)

GetShow123456

Retrieve details of a timezone  #### Request details Method:    &#x60;GET&#x60;  URL:    &#x60;/api/v2/geographic/timezones/{id}&#x60;  #### Headers  &#x60;X-Application-Id&#x60; (string) **required** _Application ID from [NStack](https://nstack.io)_  &#x60;X-Rest-Api-Key&#x60; (string) **required** _Rest API key from [NStack](https://nstack.io)_  #### Response codes(s)  &#x60;200&#x60; OK  &#x60;445&#x60; Entity not found

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import dk.nodes.nstack.kotlin.codegen.model.*

val apiInstance = TimeZonesApi()
val xminusApplicationMinusId : kotlin.String = xminusApplicationMinusId_example // kotlin.String | 
val xminusRestMinusApiMinusKey : kotlin.String = xminusRestMinusApiMinusKey_example // kotlin.String | 
try {
    apiInstance.getShow123456(xminusApplicationMinusId, xminusRestMinusApiMinusKey)
} catch (e: ClientException) {
    println("4xx response calling TimeZonesApi#getShow123456")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TimeZonesApi#getShow123456")
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

<a name="showbylatlng"></a>
# **showbylatlng**
> showbylatlng(latLng, xminusApplicationMinusId, xminusRestMinusApiMinusKey)

Showbylatlng

Retrieve details of a nearest timezone by lat lng  #### Request details Method:    &#x60;GET&#x60;  URL:    &#x60;/api/v2/geographic/timezones/by_lat_lng&#x60;  #### Headers  &#x60;X-Application-Id&#x60; (string) **required** _Application ID from [NStack](https://nstack.io)_  &#x60;X-Rest-Api-Key&#x60; (string) **required** _Rest API key from [NStack](https://nstack.io)_  #### Query parameters &#x60;lat_lng&#x60; (double,double) _Eg: 55.1231,12.1231_  #### Response codes(s)  &#x60;200&#x60; OK  &#x60;412&#x60; Preconditions Failed (Missing ?lat_lng&#x3D;)  &#x60;404&#x60; Entity not found

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import dk.nodes.nstack.kotlin.codegen.model.*

val apiInstance = TimeZonesApi()
val latLng : kotlin.String = latLng_example // kotlin.String | 
val xminusApplicationMinusId : kotlin.String = xminusApplicationMinusId_example // kotlin.String | 
val xminusRestMinusApiMinusKey : kotlin.String = xminusRestMinusApiMinusKey_example // kotlin.String | 
try {
    apiInstance.showbylatlng(latLng, xminusApplicationMinusId, xminusRestMinusApiMinusKey)
} catch (e: ClientException) {
    println("4xx response calling TimeZonesApi#showbylatlng")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TimeZonesApi#showbylatlng")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **latLng** | **kotlin.String**|  |
 **xminusApplicationMinusId** | **kotlin.String**|  |
 **xminusRestMinusApiMinusKey** | **kotlin.String**|  |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined


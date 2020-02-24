# IPAddressesApi

All URIs are relative to *https://nstack-staging.vapor.cloud*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getShow112**](IPAddressesApi.md#getShow112) | **GET** /api/v1/geographic/ip-address | GetShow112
[**getShow12345**](IPAddressesApi.md#getShow12345) | **GET** /api/v2/geographic/ip-address | GetShow12345


<a name="getShow112"></a>
# **getShow112**
> getShow112(ip, xminusApplicationMinusId, xminusRestMinusApiMinusKey)

GetShow112

Retrieve details based on the requestee&#39;s ip address  #### Request details Method:    &#x60;GET&#x60;  URL:    &#x60;/api/v1/geographic/ip-address&#x60;  #### Headers  &#x60;X-Application-Id&#x60; (string) **required** _Application ID from [NStack](https://nstack.io)_  &#x60;X-Rest-Api-Key&#x60; (string) **required** _Rest API key from [NStack](https://nstack.io)_  #### Query parameters (filters) &#x60;ip&#x60; (string) _Eg: [1.2.3.4] Default is your own_  #### Response codes(s) &#x60;200&#x60; OK  &#x60;445&#x60; Entity not found

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import dk.nodes.nstack.kotlin.codegen.model.*

val apiInstance = IPAddressesApi()
val ip : kotlin.String = ip_example // kotlin.String | 
val xminusApplicationMinusId : kotlin.String = xminusApplicationMinusId_example // kotlin.String | 
val xminusRestMinusApiMinusKey : kotlin.String = xminusRestMinusApiMinusKey_example // kotlin.String | 
try {
    apiInstance.getShow112(ip, xminusApplicationMinusId, xminusRestMinusApiMinusKey)
} catch (e: ClientException) {
    println("4xx response calling IPAddressesApi#getShow112")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling IPAddressesApi#getShow112")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ip** | **kotlin.String**|  |
 **xminusApplicationMinusId** | **kotlin.String**|  |
 **xminusRestMinusApiMinusKey** | **kotlin.String**|  |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="getShow12345"></a>
# **getShow12345**
> getShow12345(ip, xminusApplicationMinusId, xminusRestMinusApiMinusKey)

GetShow12345

Retrieve details based on the requestee&#39;s ip address  #### Request details Method:    &#x60;GET&#x60;  URL:    &#x60;/api/v2/geographic/ip-address&#x60;  #### Headers  &#x60;X-Application-Id&#x60; (string) **required** _Application ID from [NStack](https://nstack.io)_  &#x60;X-Rest-Api-Key&#x60; (string) **required** _Rest API key from [NStack](https://nstack.io)_  #### Query parameters (filters) &#x60;ip&#x60; (string) _Eg: [1.2.3.4] Default is your own_  #### Response codes(s) &#x60;200&#x60; OK  &#x60;404&#x60; Entity not found

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import dk.nodes.nstack.kotlin.codegen.model.*

val apiInstance = IPAddressesApi()
val ip : kotlin.String = ip_example // kotlin.String | 
val xminusApplicationMinusId : kotlin.String = xminusApplicationMinusId_example // kotlin.String | 
val xminusRestMinusApiMinusKey : kotlin.String = xminusRestMinusApiMinusKey_example // kotlin.String | 
try {
    apiInstance.getShow12345(ip, xminusApplicationMinusId, xminusRestMinusApiMinusKey)
} catch (e: ClientException) {
    println("4xx response calling IPAddressesApi#getShow12345")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling IPAddressesApi#getShow12345")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ip** | **kotlin.String**|  |
 **xminusApplicationMinusId** | **kotlin.String**|  |
 **xminusRestMinusApiMinusKey** | **kotlin.String**|  |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined


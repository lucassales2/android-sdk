# CountriesApi

All URIs are relative to *https://nstack-staging.vapor.cloud*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getIndex1**](CountriesApi.md#getIndex1) | **GET** /api/v2/geographic/countries | GetIndex1
[**getIndex11**](CountriesApi.md#getIndex11) | **GET** /api/v1/geographic/countries | GetIndex11
[**getShow11**](CountriesApi.md#getShow11) | **GET** /api/v1/geographic/countries/1 | GetShow11
[**getShow1234**](CountriesApi.md#getShow1234) | **GET** /api/v2/geographic/countries/4 | GetShow1234


<a name="getIndex1"></a>
# **getIndex1**
> getIndex1(xminusApplicationMinusId, xminusRestMinusApiMinusKey)

GetIndex1

Retrieve a list of valid countries on Earth  #### Request details Method:    &#x60;GET&#x60;  URL:    &#x60;/api/v2/geographic/countries&#x60;  #### Headers  &#x60;X-Application-Id&#x60; (string) **required** _Application ID from [NStack](https://nstack.io)_  &#x60;X-Rest-Api-Key&#x60; (string) **required** _Rest API key from [NStack](https://nstack.io)_  #### Query parameters (filters) &#x60;limit&#x60; (int) _Eg: [/api/geographic/countries?limit&#x3D;1] Default limit is 500_  &#x60;order_by_column&#x60; (string) _Eg; [/api/geographic/countries?order\\_by\\_column&#x3D;name]_  &#x60;order_by_direction&#x60; (string) _Eg; [/api/geographic/countries?order\\_by\\_direction&#x3D;asc]_  &#x60;search&#x60; (string) _Eg: [/api/geographic/countries?search&#x3D;Andorra]_  &#x60;fields&#x60; (string) _Eg: [/api/geographic/countries?fields&#x3D;name,code]_  &#x60;continents&#x60; (string) _Eg: [/api/geographic/countries?continents&#x3D;EU,AF]_  #### Response codes(s) &#x60;200&#x60; OK  &#x60;412&#x60; Precondition failed _Invalid filters_

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import dk.nodes.nstack.kotlin.codegen.model.*

val apiInstance = CountriesApi()
val xminusApplicationMinusId : kotlin.String = xminusApplicationMinusId_example // kotlin.String | 
val xminusRestMinusApiMinusKey : kotlin.String = xminusRestMinusApiMinusKey_example // kotlin.String | 
try {
    apiInstance.getIndex1(xminusApplicationMinusId, xminusRestMinusApiMinusKey)
} catch (e: ClientException) {
    println("4xx response calling CountriesApi#getIndex1")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CountriesApi#getIndex1")
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

<a name="getIndex11"></a>
# **getIndex11**
> getIndex11(xminusApplicationMinusId, xminusRestMinusApiMinusKey)

GetIndex11

Retrieve a list of valid countries on Earth  #### Request details Method:    &#x60;GET&#x60;  URL:    &#x60;/api/v1/geographic/countries&#x60;  #### Headers  &#x60;X-Application-Id&#x60; (string) **required** _Application ID from [NStack](https://nstack.io)_  &#x60;X-Rest-Api-Key&#x60; (string) **required** _Rest API key from [NStack](https://nstack.io)_  #### Query parameters (filters) &#x60;limit&#x60; (int) _Eg: [/api/geographic/countries?limit&#x3D;1] Default limit is 500_  &#x60;order_by_column&#x60; (string) _Eg; [/api/geographic/countries?order\\_by\\_column&#x3D;name]_  &#x60;order_by_direction&#x60; (string) _Eg; [/api/geographic/countries?order\\_by\\_direction&#x3D;asc]_  &#x60;search&#x60; (string) _Eg: [/api/geographic/countries?search&#x3D;Andorra]_  &#x60;fields&#x60; (string) _Eg: [/api/geographic/countries?fields&#x3D;name,code]_  &#x60;continents&#x60; (string) _Eg: [/api/geographic/countries?continents&#x3D;EU,AF]_  #### Response codes(s) &#x60;200&#x60; OK  &#x60;412&#x60; Precondition failed _Invalid filters_ 

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import dk.nodes.nstack.kotlin.codegen.model.*

val apiInstance = CountriesApi()
val xminusApplicationMinusId : kotlin.String = xminusApplicationMinusId_example // kotlin.String | 
val xminusRestMinusApiMinusKey : kotlin.String = xminusRestMinusApiMinusKey_example // kotlin.String | 
try {
    apiInstance.getIndex11(xminusApplicationMinusId, xminusRestMinusApiMinusKey)
} catch (e: ClientException) {
    println("4xx response calling CountriesApi#getIndex11")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CountriesApi#getIndex11")
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

<a name="getShow11"></a>
# **getShow11**
> getShow11(xminusApplicationMinusId, xminusRestMinusApiMinusKey)

GetShow11

Retrieve details of a specific country on Earth  #### Request details Method:    &#x60;GET&#x60;  URL:    &#x60;/api/v1/geographic/countries/{id}&#x60;  #### Headers &#x60;X-Application-Id&#x60; (string) **required** _Application ID from [NStack](https://nstack.io)_  &#x60;X-Rest-Api-Key&#x60; (string) **required** _Rest API key from [NStack](https://nstack.io)_  #### URL Parameters &#x60;id&#x60; (int) **required** _Country id_  #### Response codes(s) &#x60;200&#x60; OK  &#x60;445&#x60; Entity not found

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import dk.nodes.nstack.kotlin.codegen.model.*

val apiInstance = CountriesApi()
val xminusApplicationMinusId : kotlin.String = xminusApplicationMinusId_example // kotlin.String | 
val xminusRestMinusApiMinusKey : kotlin.String = xminusRestMinusApiMinusKey_example // kotlin.String | 
try {
    apiInstance.getShow11(xminusApplicationMinusId, xminusRestMinusApiMinusKey)
} catch (e: ClientException) {
    println("4xx response calling CountriesApi#getShow11")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CountriesApi#getShow11")
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

<a name="getShow1234"></a>
# **getShow1234**
> getShow1234(xminusApplicationMinusId, xminusRestMinusApiMinusKey)

GetShow1234

Retrieve details of a specific country on Earth  #### Request details Method:    &#x60;GET&#x60;  URL:    &#x60;/api/v2/geographic/countries/{id}&#x60;  #### Headers &#x60;X-Application-Id&#x60; (string) **required** _Application ID from [NStack](https://nstack.io)_  &#x60;X-Rest-Api-Key&#x60; (string) **required** _Rest API key from [NStack](https://nstack.io)_  #### URL Parameters &#x60;id&#x60; (int) **required** _Country id_  #### Response codes(s) &#x60;200&#x60; OK  &#x60;404&#x60; Entity not found

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import dk.nodes.nstack.kotlin.codegen.model.*

val apiInstance = CountriesApi()
val xminusApplicationMinusId : kotlin.String = xminusApplicationMinusId_example // kotlin.String | 
val xminusRestMinusApiMinusKey : kotlin.String = xminusRestMinusApiMinusKey_example // kotlin.String | 
try {
    apiInstance.getShow1234(xminusApplicationMinusId, xminusRestMinusApiMinusKey)
} catch (e: ClientException) {
    println("4xx response calling CountriesApi#getShow1234")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CountriesApi#getShow1234")
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


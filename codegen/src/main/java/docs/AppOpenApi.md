# AppOpenApi

All URIs are relative to *https://nstack-staging.vapor.cloud*

Method | HTTP request | Description
------------- | ------------- | -------------
[**appopen**](AppOpenApi.md#appopen) | **POST** /api/v2/open | Appopen
[**postAppopen**](AppOpenApi.md#postAppopen) | **POST** /api/v1/open | PostAppopen


<a name="appopen"></a>
# **appopen**
> AppopenV2 appopen(test, xminusApplicationMinusId, xminusRestMinusApiMinusKey, acceptMinusLanguage, nminusMeta, platform, guid, version, lastUpdated, dev)

Appopen

Retrieve a list of valid continents on Earth  #### Request details Method:    &#x60;GET&#x60;  URL:    &#x60;/api/v2/open&#x60;  #### Headers  &#x60;X-Application-Id&#x60; (string) **required** _Application ID from [NStack](https://nstack.io)_  &#x60;X-Rest-Api-Key&#x60; (string) **required** _Rest API key from [NStack](https://nstack.io)_  &#x60;N-Meta&#x60; (string) **required** _eg: android;production;1.2.3;4.4;Samsung S7_  &#x60;Accept-Language&#x60; (string) **Optional** _eg: da-DK_  ### Form-data  &#x60;platform&#x60; (string) **required** eg: ios/android/web  &#x60;guid&#x60; (string) **required** &#x60;unique generated string&#x60; *eg: 9bc4b39a-0af5-4b54-a5a5-88ad334dbd4b*  &#x60;version&#x60; (string) **required if not web** &#x60;format: xxx.yyy.zzz&#x60; *eg: 2.0.0 / 212.01.1*  - *Current version of application*  &#x60;old_version&#x60; (string) **required if not web** &#x60;format: xxx.yyy.zzz&#x60; *eg: 2.0.0 / 212.01.1*  - *Previous version of application (Auto update can have happened)*  &#x60;last_updated&#x60; (date time, ISO8601) **optional** *eg: 2019-06-15T14:29:50+00:00*  - *Set timestamp from last app open (when localization has been synced), this will calculate which localizations should be updated*  &#x60;dev&#x60; (bool) **option, default false**  - *if true, bypass publishes and only use newest resource (set of key/values)*   &#x60;test&#x60; (bool) **option, default false**  - *if true, used the app version from \&quot;test env\&quot;    #### Response codes(s) &#x60;200&#x60; OK

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import dk.nodes.nstack.kotlin.codegen.model.*

val apiInstance = AppOpenApi()
val test : kotlin.Boolean = true // kotlin.Boolean | 
val xminusApplicationMinusId : kotlin.String = xminusApplicationMinusId_example // kotlin.String | 
val xminusRestMinusApiMinusKey : kotlin.String = xminusRestMinusApiMinusKey_example // kotlin.String | 
val acceptMinusLanguage : kotlin.String = acceptMinusLanguage_example // kotlin.String | 
val nminusMeta : kotlin.String = nminusMeta_example // kotlin.String | 
val platform : kotlin.String = platform_example // kotlin.String | 
val guid : kotlin.String = guid_example // kotlin.String | 
val version : kotlin.String = version_example // kotlin.String | 
val lastUpdated : kotlin.String = lastUpdated_example // kotlin.String | 
val dev : kotlin.Boolean = true // kotlin.Boolean | 
try {
    val result : AppopenV2 = apiInstance.appopen(test, xminusApplicationMinusId, xminusRestMinusApiMinusKey, acceptMinusLanguage, nminusMeta, platform, guid, version, lastUpdated, dev)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling AppOpenApi#appopen")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AppOpenApi#appopen")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **test** | **kotlin.Boolean**|  |
 **xminusApplicationMinusId** | **kotlin.String**|  |
 **xminusRestMinusApiMinusKey** | **kotlin.String**|  |
 **acceptMinusLanguage** | **kotlin.String**|  |
 **nminusMeta** | **kotlin.String**|  |
 **platform** | **kotlin.String**|  |
 **guid** | **kotlin.String**|  |
 **version** | **kotlin.String**|  |
 **lastUpdated** | **kotlin.String**|  |
 **dev** | **kotlin.Boolean**|  |

### Return type

**AppopenV2**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

<a name="postAppopen"></a>
# **postAppopen**
> postAppopen(xminusApplicationMinusId, xminusRestMinusApiMinusKey, platform, guid, version, oldVersion, lastUpdated)

PostAppopen

Registers an app-open.  _Deprecated, please use V2_  #### Request details Method: &#x60;POST&#x60;  URL: &#x60;/api/v1/open&#x60;  #### Headers &#x60;X-Application-Id&#x60; (string) **required** _Application ID from [NStack](https://nstack.io)_  &#x60;X-Rest-Api-Key&#x60; (string) **required** _Rest API key from [NStack](https://nstack.io)_  &#x60;Accept-Language&#x60; (string) **Optional** _eg: da-DK_  #### Parameters &#x60;platform&#x60; (string) **required** _The platform the app was opened from e.g. [\&quot;ios\&quot;, \&quot;android\&quot;, \&quot;windows\&quot;, \&quot;web\&quot;]_  &#x60;guid&#x60; (string) **required** _[?]_  &#x60;version&#x60; (string) **required** _[?]_  &#x60;old_version&#x60; (string) _[?]_  &#x60;last_updated&#x60; (string) _A string parsable by php&#39;s [strtotime()](http://php.net/manual/en/function.strtotime.php)-function_  &#x60;test&#x60; (bool) _Enable test mode, false equals production (only works for version control)_  #### Response codes(s) &#x60;201&#x60; Created  &#x60;412&#x60; Precondition failed  &#x60;445&#x60; Entity not found  &#x60;500&#x60; Internal server error _Please read response message_

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import dk.nodes.nstack.kotlin.codegen.model.*

val apiInstance = AppOpenApi()
val xminusApplicationMinusId : kotlin.String = xminusApplicationMinusId_example // kotlin.String | 
val xminusRestMinusApiMinusKey : kotlin.String = xminusRestMinusApiMinusKey_example // kotlin.String | 
val platform : kotlin.String = platform_example // kotlin.String | 
val guid : kotlin.String = guid_example // kotlin.String | 
val version : kotlin.String = version_example // kotlin.String | 
val oldVersion : kotlin.String = oldVersion_example // kotlin.String | 
val lastUpdated : kotlin.String = lastUpdated_example // kotlin.String | 
try {
    apiInstance.postAppopen(xminusApplicationMinusId, xminusRestMinusApiMinusKey, platform, guid, version, oldVersion, lastUpdated)
} catch (e: ClientException) {
    println("4xx response calling AppOpenApi#postAppopen")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AppOpenApi#postAppopen")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **xminusApplicationMinusId** | **kotlin.String**|  |
 **xminusRestMinusApiMinusKey** | **kotlin.String**|  |
 **platform** | **kotlin.String**|  |
 **guid** | **kotlin.String**|  |
 **version** | **kotlin.String**|  |
 **oldVersion** | **kotlin.String**|  |
 **lastUpdated** | **kotlin.String**|  |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: Not defined


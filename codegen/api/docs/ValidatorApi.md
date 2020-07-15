# ValidatorApi

All URIs are relative to *https://nstack.io*

Method | HTTP request | Description
------------- | ------------- | -------------
[**email**](ValidatorApi.md#email) | **GET** /api/v2/validator/email | Email
[**phone**](ValidatorApi.md#phone) | **GET** /api/v2/validator/phone | Phone


<a name="email"></a>
# **email**
> email(email, xminusApplicationMinusId, xminusRestMinusApiMinusKey)

Email

Validate email syntax On top of a simple syntax validation, there is DNS check also   #### Request details Method: &#x60;GET&#x60;  URL: &#x60;/api/v2/validator/email&#x60;  #### Headers &#x60;X-Application-Id&#x60; (string) **required** _Application ID from [NStack](https://nstack.io)_  &#x60;X-Rest-Api-Key&#x60; (string) **required** _Rest API key from [NStack](https://nstack.io)_  #### Query params &#x60;email&#x60; (string) **required** _email to validate_  #### Response codes &#x60;200&#x60; OK  &#x60;412&#x60; Precondition failed (missing or invalid email)

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import dk.nodes.nstack.kotlin.codegen.model.*

val apiInstance = ValidatorApi()
val email : kotlin.String = email_example // kotlin.String | 
val xminusApplicationMinusId : kotlin.String = xminusApplicationMinusId_example // kotlin.String | 
val xminusRestMinusApiMinusKey : kotlin.String = xminusRestMinusApiMinusKey_example // kotlin.String | 
try {
    apiInstance.email(email, xminusApplicationMinusId, xminusRestMinusApiMinusKey)
} catch (e: ClientException) {
    println("4xx response calling ValidatorApi#email")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ValidatorApi#email")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **email** | **kotlin.String**|  |
 **xminusApplicationMinusId** | **kotlin.String**|  |
 **xminusRestMinusApiMinusKey** | **kotlin.String**|  |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="phone"></a>
# **phone**
> phone(phone, xminusApplicationMinusId, xminusRestMinusApiMinusKey)

Phone

Validate phone number  #### Request details Method: &#x60;GET&#x60;  URL: &#x60;/api/v2/validator/phone&#x60;  #### Headers &#x60;X-Application-Id&#x60; (string) **required** _Application ID from [NStack](https://nstack.io)_  &#x60;X-Rest-Api-Key&#x60; (string) **required** _Rest API key from [NStack](https://nstack.io)_  #### Query params &#x60;phone&#x60; (string) **required** _email to validate_  &#x60;fallback_country_code&#x60; (string) _Eg: [\&quot;dk\&quot;, \&quot;gb\&quot;, ...] - default is dk_  &#x60;twilio&#x60; (bool) _Validate against Twilio - Paid service!_  &#x60;twilio_type&#x60; (string) _Eg: [\&quot;all\&quot;, \&quot;mobile\&quot;, \&quot;landline\&quot;]_  #### Response codes &#x60;200&#x60; OK  &#x60;412&#x60; Precondition failed (missing or invalid email)

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import dk.nodes.nstack.kotlin.codegen.model.*

val apiInstance = ValidatorApi()
val phone : kotlin.Int = 56 // kotlin.Int | 
val xminusApplicationMinusId : kotlin.String = xminusApplicationMinusId_example // kotlin.String | 
val xminusRestMinusApiMinusKey : kotlin.String = xminusRestMinusApiMinusKey_example // kotlin.String | 
try {
    apiInstance.phone(phone, xminusApplicationMinusId, xminusRestMinusApiMinusKey)
} catch (e: ClientException) {
    println("4xx response calling ValidatorApi#phone")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ValidatorApi#phone")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **phone** | **kotlin.Int**|  |
 **xminusApplicationMinusId** | **kotlin.String**|  |
 **xminusRestMinusApiMinusKey** | **kotlin.String**|  |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined


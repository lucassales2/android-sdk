# ValidatorAPI

All URIs are relative to *https://nstack-staging.vapor.cloud*

Method | HTTP request | Description
------------- | ------------- | -------------
[**email**](ValidatorAPI.md#email) | **GET** /api/v2/validator/email | Email
[**email1**](ValidatorAPI.md#email1) | **GET** /api/v1/validator/email | Email1
[**phone**](ValidatorAPI.md#phone) | **GET** /api/v2/validator/phone | Phone
[**phone1**](ValidatorAPI.md#phone1) | **GET** /api/v1/validator/phone | Phone1


# **email**
```swift
    open class func email(email: String, xApplicationId: String, xRestApiKey: String, completion: @escaping (_ data: Void?, _ error: Error?) -> Void)
```

Email

Validate email syntax On top of a simple syntax validation, there is DNS check also   #### Request details Method: `GET`  URL: `/api/v2/validator/email`  #### Headers `X-Application-Id` (string) **required** _Application ID from [NStack](https://nstack.io)_  `X-Rest-Api-Key` (string) **required** _Rest API key from [NStack](https://nstack.io)_  #### Query params `email` (string) **required** _email to validate_  #### Response codes `200` OK  `412` Precondition failed (missing or invalid email)

### Example 
```swift
// The following code samples are still beta. For any issue, please report via http://github.com/OpenAPITools/openapi-generator/issues/new
import OpenAPIClient

let email = "email_example" // String | 
let xApplicationId = "xApplicationId_example" // String | 
let xRestApiKey = "xRestApiKey_example" // String | 

// Email
ValidatorAPI.email(email: email, xApplicationId: xApplicationId, xRestApiKey: xRestApiKey) { (response, error) in
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
 **email** | **String** |  | 
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

# **email1**
```swift
    open class func email1(email: String, xApplicationId: String, xRestApiKey: String, completion: @escaping (_ data: Void?, _ error: Error?) -> Void)
```

Email1

Validate email syntax On top of a simple syntax validation, there is DNS check also   #### Request details Method: `GET`  URL: `/api/v1/validator/email`  #### Headers `X-Application-Id` (string) **required** _Application ID from [NStack](https://nstack.io)_  `X-Rest-Api-Key` (string) **required** _Rest API key from [NStack](https://nstack.io)_  #### Query params `email` (string) **required** _email to validate_  #### Response codes `200` OK  `412` Precondition failed (missing or invalid email)

### Example 
```swift
// The following code samples are still beta. For any issue, please report via http://github.com/OpenAPITools/openapi-generator/issues/new
import OpenAPIClient

let email = "email_example" // String | 
let xApplicationId = "xApplicationId_example" // String | 
let xRestApiKey = "xRestApiKey_example" // String | 

// Email1
ValidatorAPI.email1(email: email, xApplicationId: xApplicationId, xRestApiKey: xRestApiKey) { (response, error) in
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
 **email** | **String** |  | 
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

# **phone**
```swift
    open class func phone(phone: Int, xApplicationId: String, xRestApiKey: String, completion: @escaping (_ data: Void?, _ error: Error?) -> Void)
```

Phone

Validate phone number  #### Request details Method: `GET`  URL: `/api/v2/validator/phone`  #### Headers `X-Application-Id` (string) **required** _Application ID from [NStack](https://nstack.io)_  `X-Rest-Api-Key` (string) **required** _Rest API key from [NStack](https://nstack.io)_  #### Query params `phone` (string) **required** _email to validate_  `fallback_country_code` (string) _Eg: [\"dk\", \"gb\", ...] - default is dk_  `twilio` (bool) _Validate against Twilio - Paid service!_  `twilio_type` (string) _Eg: [\"all\", \"mobile\", \"landline\"]_  #### Response codes `200` OK  `412` Precondition failed (missing or invalid email)

### Example 
```swift
// The following code samples are still beta. For any issue, please report via http://github.com/OpenAPITools/openapi-generator/issues/new
import OpenAPIClient

let phone = 987 // Int | 
let xApplicationId = "xApplicationId_example" // String | 
let xRestApiKey = "xRestApiKey_example" // String | 

// Phone
ValidatorAPI.phone(phone: phone, xApplicationId: xApplicationId, xRestApiKey: xRestApiKey) { (response, error) in
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
 **phone** | **Int** |  | 
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

# **phone1**
```swift
    open class func phone1(phone: Int, xApplicationId: String, xRestApiKey: String, completion: @escaping (_ data: Void?, _ error: Error?) -> Void)
```

Phone1

Validate phone number  #### Request details Method: `GET`  URL: `/api/v1/validator/phone`  #### Headers `X-Application-Id` (string) **required** _Application ID from [NStack](https://nstack.io)_  `X-Rest-Api-Key` (string) **required** _Rest API key from [NStack](https://nstack.io)_  #### Query params `phone` (string) **required** _email to validate_  `fallback_country_code` (string) _Eg: [\"dk\", \"gb\", ...] - default is dk_  `twilio` (bool) _Validate against Twilio - Paid service!_  `twilio_type` (string) _Eg: [\"all\", \"mobile\", \"landline\"]_  #### Response codes `200` OK  `412` Precondition failed (missing or invalid email)

### Example 
```swift
// The following code samples are still beta. For any issue, please report via http://github.com/OpenAPITools/openapi-generator/issues/new
import OpenAPIClient

let phone = 987 // Int | 
let xApplicationId = "xApplicationId_example" // String | 
let xRestApiKey = "xRestApiKey_example" // String | 

// Phone1
ValidatorAPI.phone1(phone: phone, xApplicationId: xApplicationId, xRestApiKey: xRestApiKey) { (response, error) in
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
 **phone** | **Int** |  | 
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


# DashboardsApi

All URIs are relative to *https://nstack-staging.vapor.cloud*

Method | HTTP request | Description
------------- | ------------- | -------------
[**dashboard**](DashboardsApi.md#dashboard) | **GET** /api/v2/content/dashboards/DAS-ad21e084-ae03-4486-a5ec-d837dfc56fd2 | Dashboard
[**visualization**](DashboardsApi.md#visualization) | **GET** /api/v2/content/dashboards/visualizations/visualization-5d0dbc254bc83 | Visualization


<a name="dashboard"></a>
# **dashboard**
> dashboard(xminusApplicationMinusId, xminusRestMinusApiMinusKey, contentMinusType)

Dashboard

Get Dashboard  #### Request details Method: &#x60;GET&#x60;  URL: &#x60;api/v2/content/dashboards/{key}&#x60;  #### URL Parameters &#x60;key&#x60; (string) **required**  &#x60;mode&#x60; (string) **Optional**   - standard (default), using cache data  - fresh, force using fresh data  - test, fake data  #### Response codes(s) &#x60;200&#x60; OK  &#x60;404&#x60; Entity not found

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import dk.nodes.nstack.kotlin.codegen.model.*

val apiInstance = DashboardsApi()
val xminusApplicationMinusId : kotlin.String = xminusApplicationMinusId_example // kotlin.String | 
val xminusRestMinusApiMinusKey : kotlin.String = xminusRestMinusApiMinusKey_example // kotlin.String | 
val contentMinusType : kotlin.String = contentMinusType_example // kotlin.String | 
try {
    apiInstance.dashboard(xminusApplicationMinusId, xminusRestMinusApiMinusKey, contentMinusType)
} catch (e: ClientException) {
    println("4xx response calling DashboardsApi#dashboard")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DashboardsApi#dashboard")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **xminusApplicationMinusId** | **kotlin.String**|  |
 **xminusRestMinusApiMinusKey** | **kotlin.String**|  |
 **contentMinusType** | **kotlin.String**|  |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="visualization"></a>
# **visualization**
> visualization(xminusApplicationMinusId, xminusRestMinusApiMinusKey, contentMinusType)

Visualization

Get visualization  #### Request details Method: &#x60;GET&#x60;  URL: &#x60;api/v2/content/dashboards/visualizations/{key}&#x60;  #### URL Parameters &#x60;key&#x60; (string) **required**  ### Query parameters  &#x60;mode&#x60; (string) **Optional**   - standard (default), using cache data  - fresh, force using fresh data  - test, fake data  #### Response codes(s) &#x60;200&#x60; OK  &#x60;404&#x60; Entity not found

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import dk.nodes.nstack.kotlin.codegen.model.*

val apiInstance = DashboardsApi()
val xminusApplicationMinusId : kotlin.String = xminusApplicationMinusId_example // kotlin.String | 
val xminusRestMinusApiMinusKey : kotlin.String = xminusRestMinusApiMinusKey_example // kotlin.String | 
val contentMinusType : kotlin.String = contentMinusType_example // kotlin.String | 
try {
    apiInstance.visualization(xminusApplicationMinusId, xminusRestMinusApiMinusKey, contentMinusType)
} catch (e: ClientException) {
    println("4xx response calling DashboardsApi#visualization")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DashboardsApi#visualization")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **xminusApplicationMinusId** | **kotlin.String**|  |
 **xminusRestMinusApiMinusKey** | **kotlin.String**|  |
 **contentMinusType** | **kotlin.String**|  |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined


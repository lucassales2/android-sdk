# org.openapitools.client - Kotlin client library for API

## Requires

* Kotlin 1.3.41
* Gradle 4.9

## Build

First, create the gradle wrapper script:

```
gradle wrapper
```

Then, run:

```
./gradlew check assemble
```

This runs all tests and packages the library.

## Features/Implementation Notes

* Supports JSON inputs/outputs, File inputs, and Form inputs.
* Supports collection formats for query parameters: csv, tsv, ssv, pipes.
* Some Kotlin and Java types are fully qualified to avoid conflicts with types defined in OpenAPI definitions.
* Implementation of ApiClient is intended to reduce method counts, specifically to benefit Android targets.

<a name="documentation-for-api-endpoints"></a>
## Documentation for API Endpoints

All URIs are relative to *https://nstack-staging.vapor.cloud*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*AdminAPIApi* | [**search**](docs/AdminAPIApi.md#search) | **GET** /admin/search/company-applications | Search
*AppOpenApi* | [**appopen**](docs/AppOpenApi.md#appopen) | **POST** /api/v2/open | Appopen
*AppOpenApi* | [**postAppopen**](docs/AppOpenApi.md#postappopen) | **POST** /api/v1/open | PostAppopen
*CollectionsApi* | [**createitem**](docs/CollectionsApi.md#createitem) | **POST** /api/v2/content/collections/1/items | Createitem
*CollectionsApi* | [**createitem1**](docs/CollectionsApi.md#createitem1) | **POST** /api/v1/content/collections/1/items | Createitem1
*CollectionsApi* | [**deleteitem**](docs/CollectionsApi.md#deleteitem) | **DELETE** /api/v2/content/collections/1/items/13 | Deleteitem
*CollectionsApi* | [**deleteitem1**](docs/CollectionsApi.md#deleteitem1) | **DELETE** /api/v1/content/collections/1/items/13 | Deleteitem1
*CollectionsApi* | [**update**](docs/CollectionsApi.md#update) | **POST** /api/v2/content/collections/1/items/14/update | Update
*CollectionsApi* | [**update1**](docs/CollectionsApi.md#update1) | **POST** /api/v1/content/collections/1/items/14/update | Update1
*CollectionsApi* | [**view**](docs/CollectionsApi.md#view) | **GET** /api/v2/content/collections/1 | View
*CollectionsApi* | [**view1**](docs/CollectionsApi.md#view1) | **GET** /api/v1/content/collections/1 | View1
*CollectionsApi* | [**viewitem**](docs/CollectionsApi.md#viewitem) | **GET** /api/v2/content/collections/1/items/5 | Viewitem
*CollectionsApi* | [**viewitem1**](docs/CollectionsApi.md#viewitem1) | **GET** /api/v1/content/collections/1/items/5 | Viewitem1
*ContinentsApi* | [**getIndex**](docs/ContinentsApi.md#getindex) | **GET** /api/v2/geographic/continents | GetIndex
*ContinentsApi* | [**getShow123**](docs/ContinentsApi.md#getshow123) | **GET** /api/v2/geographic/continents/1 | GetShow123
*ContinentsApi* | [**index1**](docs/ContinentsApi.md#index1) | **GET** /api/v1/geographic/continents | Index1
*CountriesApi* | [**getIndex1**](docs/CountriesApi.md#getindex1) | **GET** /api/v2/geographic/countries | GetIndex1
*CountriesApi* | [**getIndex11**](docs/CountriesApi.md#getindex11) | **GET** /api/v1/geographic/countries | GetIndex11
*CountriesApi* | [**getShow11**](docs/CountriesApi.md#getshow11) | **GET** /api/v1/geographic/countries/1 | GetShow11
*CountriesApi* | [**getShow1234**](docs/CountriesApi.md#getshow1234) | **GET** /api/v2/geographic/countries/4 | GetShow1234
*DashboardsApi* | [**dashboard**](docs/DashboardsApi.md#dashboard) | **GET** /api/v2/content/dashboards/DAS-ad21e084-ae03-4486-a5ec-d837dfc56fd2 | Dashboard
*DashboardsApi* | [**visualization**](docs/DashboardsApi.md#visualization) | **GET** /api/v2/content/dashboards/visualizations/visualization-5d0dbc254bc83 | Visualization
*FilesApi* | [**store**](docs/FilesApi.md#store) | **POST** /api/v2/content/files | Store
*FilesApi* | [**storewithpath**](docs/FilesApi.md#storewithpath) | **POST** /api/v1/content/files | Storewithpath
*IPAddressesApi* | [**getShow112**](docs/IPAddressesApi.md#getshow112) | **GET** /api/v1/geographic/ip-address | GetShow112
*IPAddressesApi* | [**getShow12345**](docs/IPAddressesApi.md#getshow12345) | **GET** /api/v2/geographic/ip-address | GetShow12345
*LanguagesApi* | [**getIndex112**](docs/LanguagesApi.md#getindex112) | **GET** /api/v1/geographic/languages | GetIndex112
*LanguagesApi* | [**getIndex12**](docs/LanguagesApi.md#getindex12) | **GET** /api/v2/geographic/languages | GetIndex12
*LocalizeApi* | [**deleteproposal**](docs/LocalizeApi.md#deleteproposal) | **DELETE** /api/v2/content/localize/proposals/9 | Deleteproposal
*LocalizeApi* | [**indexlanguages**](docs/LocalizeApi.md#indexlanguages) | **GET** /api/v2/content/localize/mobile/languages | Indexlanguages
*LocalizeApi* | [**indexlanguages1**](docs/LocalizeApi.md#indexlanguages1) | **GET** /api/v1/localize/mobile/languages | Indexlanguages1
*LocalizeApi* | [**indexproposal**](docs/LocalizeApi.md#indexproposal) | **GET** /api/v2/content/localize/proposals | Indexproposal
*LocalizeApi* | [**indexresource**](docs/LocalizeApi.md#indexresource) | **GET** /api/v2/content/localize/resources/platforms/mobile | Indexresource
*LocalizeApi* | [**keys**](docs/LocalizeApi.md#keys) | **GET** /api/v1/localize/mobile/keys | Keys
*LocalizeApi* | [**keysvaluesforsection**](docs/LocalizeApi.md#keysvaluesforsection) | **GET** /api/v1/localize/backend/keys/default | Keys&valuesforsection
*LocalizeApi* | [**languagebestfit**](docs/LocalizeApi.md#languagebestfit) | **GET** /api/v2/content/localize/mobile/languages/best_fit | Languagebestfit
*LocalizeApi* | [**languagebestfit1**](docs/LocalizeApi.md#languagebestfit1) | **GET** /api/v1/localize/mobile/languages/best_fit | Languagebestfit1
*LocalizeApi* | [**showresource**](docs/LocalizeApi.md#showresource) | **GET** /api/v2/content/localize/resources/44 | Showresource
*LocalizeApi* | [**storeproposal**](docs/LocalizeApi.md#storeproposal) | **POST** /api/v2/content/localize/proposals | Storeproposal
*MessagesApi* | [**markasseen**](docs/MessagesApi.md#markasseen) | **POST** /api/v2/notify/messages/views | Markasseen
*MessagesApi* | [**messages**](docs/MessagesApi.md#messages) | **GET** /api/v2/notify/messages | Messages
*MessagesApi* | [**messages1**](docs/MessagesApi.md#messages1) | **GET** /api/v1/notify/messages | Messages1
*MessagesApi* | [**viewmessage**](docs/MessagesApi.md#viewmessage) | **POST** /api/v1/notify/messages/views | Viewmessage
*RateRemindersApi* | [**getShow**](docs/RateRemindersApi.md#getshow) | **GET** /api/v2/notify/rate_reminder | GetShow
*RateRemindersApi* | [**getShow1**](docs/RateRemindersApi.md#getshow1) | **GET** /api/v1/notify/rate_reminder | GetShow1
*RateRemindersApi* | [**markasseen1**](docs/RateRemindersApi.md#markasseen1) | **POST** /api/v1/notify/rate_reminder/views | Markasseen1
*RateRemindersApi* | [**postMarkasseen**](docs/RateRemindersApi.md#postmarkasseen) | **POST** /api/v2/notify/rate_reminder/views | PostMarkasseen
*RateRemindersV2Api* | [**actionEvents**](docs/RateRemindersV2Api.md#actionevents) | **POST** /api/v2/notify/rate_reminder_v2/events | ActionEvents
*RateRemindersV2Api* | [**actions**](docs/RateRemindersV2Api.md#actions) | **GET** /api/v2/notify/rate_reminder_v2/actions | Actions
*RateRemindersV2Api* | [**answer**](docs/RateRemindersV2Api.md#answer) | **POST** /api/v2/notify/rate_reminder_v2/2/answers | Answer
*RateRemindersV2Api* | [**getShow12**](docs/RateRemindersV2Api.md#getshow12) | **GET** /api/v2/notify/rate_reminder_v2 | GetShow12
*ResponsesApi* | [**show**](docs/ResponsesApi.md#show) | **GET** /api/v2/content/responses/15 | Show
*ResponsesApi* | [**show1**](docs/ResponsesApi.md#show1) | **GET** /api/v1/content/responses/15 | Show1
*ScropperApi* | [**getfocalpoint**](docs/ScropperApi.md#getfocalpoint) | **POST** /api/v2/scropper | Getfocalpoint
*StaggerApi* | [**gettag**](docs/StaggerApi.md#gettag) | **POST** /api/v2/stagger | Gettag
*TermsApi* | [**index**](docs/TermsApi.md#index) | **GET** /terms | Index
*TermsApi* | [**indexversions**](docs/TermsApi.md#indexversions) | **GET** /api/v2/content/terms/some-terms-1/versions | Indexversions
*TermsApi* | [**newestversion**](docs/TermsApi.md#newestversion) | **GET** /api/v2/content/terms/some-terms-1/versions/newest | Newestversion
*TermsApi* | [**showversion**](docs/TermsApi.md#showversion) | **GET** /api/v2/content/terms/versions/5 | Showversion
*TermsApi* | [**storeView**](docs/TermsApi.md#storeview) | **POST** /api/v2/content/terms/versions/views | StoreView
*TimeZonesApi* | [**getIndex1123**](docs/TimeZonesApi.md#getindex1123) | **GET** /api/v1/geographic/time_zones | GetIndex1123
*TimeZonesApi* | [**getIndex123**](docs/TimeZonesApi.md#getindex123) | **GET** /api/v2/geographic/time_zones | GetIndex123
*TimeZonesApi* | [**getShow1123**](docs/TimeZonesApi.md#getshow1123) | **GET** /api/v1/geographic/time_zones/1 | GetShow1123
*TimeZonesApi* | [**getShow123456**](docs/TimeZonesApi.md#getshow123456) | **GET** /api/v2/geographic/time_zones/1 | GetShow123456
*TimeZonesApi* | [**showbylatlng**](docs/TimeZonesApi.md#showbylatlng) | **GET** /api/v2/geographic/time_zones/by_lat_lng | Showbylatlng
*TimeZonesApi* | [**showbylatlng1**](docs/TimeZonesApi.md#showbylatlng1) | **GET** /api/v1/geographic/time_zones/by_lat_lng | Showbylatlng1
*UGCApi* | [**feedback**](docs/UGCApi.md#feedback) | **POST** /api/v2/ugc/feedbacks | Feedback
*UGCApi* | [**postFeedback**](docs/UGCApi.md#postfeedback) | **POST** /api/v1/ugc/feedbacks | PostFeedback
*UGCApi* | [**pushLogs**](docs/UGCApi.md#pushlogs) | **POST** /api/v2/ugc/push-logs | PushLogs
*UGCApi* | [**pushLogs1**](docs/UGCApi.md#pushlogs1) | **POST** /api/v1/ugc/push-logs | PushLogs1
*UGCApi* | [**result**](docs/UGCApi.md#result) | **POST** /api/v2/ugc/results | Result
*UGCApi* | [**result1**](docs/UGCApi.md#result1) | **POST** /api/v1/ugc/results | Result1
*ValidatorApi* | [**email**](docs/ValidatorApi.md#email) | **GET** /api/v2/validator/email | Email
*ValidatorApi* | [**email1**](docs/ValidatorApi.md#email1) | **GET** /api/v1/validator/email | Email1
*ValidatorApi* | [**phone**](docs/ValidatorApi.md#phone) | **GET** /api/v2/validator/phone | Phone
*ValidatorApi* | [**phone1**](docs/ValidatorApi.md#phone1) | **GET** /api/v1/validator/phone | Phone1
*VersionControlApi* | [**indexupdate**](docs/VersionControlApi.md#indexupdate) | **GET** /api/v2/notify/updates | Indexupdate
*VersionControlApi* | [**indexupdate1**](docs/VersionControlApi.md#indexupdate1) | **GET** /api/v1/notify/updates | Indexupdate1
*VersionControlApi* | [**markupdateasseen**](docs/VersionControlApi.md#markupdateasseen) | **POST** /api/v2/notify/updates/views | Markupdateasseen
*VersionControlApi* | [**markupdateasseen1**](docs/VersionControlApi.md#markupdateasseen1) | **POST** /api/v1/notify/updates/views | Markupdateasseen1



<a name="documentation-for-authorization"></a>
## Documentation for Authorization

All endpoints do not require authorization.

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

All URIs are relative to *https://nstack.io*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*AppOpenApi* | [**appopen**](docs/AppOpenApi.md#appopen) | **POST** /api/v2/open | Appopen
*CollectionsApi* | [**createitem**](docs/CollectionsApi.md#createitem) | **POST** /api/v2/content/collections/{collectionId}/items | Createitem
*CollectionsApi* | [**deleteitem**](docs/CollectionsApi.md#deleteitem) | **DELETE** /api/v2/content/collections/{collectionId/items/{itemId} | Deleteitem
*CollectionsApi* | [**update**](docs/CollectionsApi.md#update) | **POST** /api/v2/content/collections/{collectionId}/items/{itemId}/update | Update
*CollectionsApi* | [**view**](docs/CollectionsApi.md#view) | **GET** /api/v2/content/collections/{collectionId} | View
*CollectionsApi* | [**viewitem**](docs/CollectionsApi.md#viewitem) | **GET** /api/v2/content/collections/{collectionId}/items/{itemId} | Viewitem
*ContinentsApi* | [**getIndex**](docs/ContinentsApi.md#getindex) | **GET** /api/v2/geographic/continents | GetIndex
*ContinentsApi* | [**getShow123**](docs/ContinentsApi.md#getshow123) | **GET** /api/v2/geographic/continents/1 | GetShow123
*CountriesApi* | [**getIndex1**](docs/CountriesApi.md#getindex1) | **GET** /api/v2/geographic/countries | GetIndex1
*CountriesApi* | [**getShow1234**](docs/CountriesApi.md#getshow1234) | **GET** /api/v2/geographic/countries/4 | GetShow1234
*DashboardsApi* | [**dashboard**](docs/DashboardsApi.md#dashboard) | **GET** /api/v2/content/dashboards/DAS-ad21e084-ae03-4486-a5ec-d837dfc56fd2 | Dashboard
*DashboardsApi* | [**visualization**](docs/DashboardsApi.md#visualization) | **GET** /api/v2/content/dashboards/visualizations/visualization-5d0dbc254bc83 | Visualization
*FilesApi* | [**store**](docs/FilesApi.md#store) | **POST** /api/v2/content/files | Store
*IPAddressesApi* | [**getShow12345**](docs/IPAddressesApi.md#getshow12345) | **GET** /api/v2/geographic/ip-address | GetShow12345
*LanguagesApi* | [**getIndex12**](docs/LanguagesApi.md#getindex12) | **GET** /api/v2/geographic/languages | GetIndex12
*LocalizeApi* | [**deleteproposal**](docs/LocalizeApi.md#deleteproposal) | **DELETE** /api/v2/content/localize/proposals/9 | Deleteproposal
*LocalizeApi* | [**indexlanguages**](docs/LocalizeApi.md#indexlanguages) | **GET** /api/v2/content/localize/mobile/languages | Indexlanguages
*LocalizeApi* | [**indexproposal**](docs/LocalizeApi.md#indexproposal) | **GET** /api/v2/content/localize/proposals | Indexproposal
*LocalizeApi* | [**indexresource**](docs/LocalizeApi.md#indexresource) | **GET** /api/v2/content/localize/resources/platforms/mobile | Indexresource
*LocalizeApi* | [**languagebestfit**](docs/LocalizeApi.md#languagebestfit) | **GET** /api/v2/content/localize/mobile/languages/best_fit | Languagebestfit
*LocalizeApi* | [**showresource**](docs/LocalizeApi.md#showresource) | **GET** /api/v2/content/localize/resources/44 | Showresource
*LocalizeApi* | [**storeproposal**](docs/LocalizeApi.md#storeproposal) | **POST** /api/v2/content/localize/proposals | Storeproposal
*MessagesApi* | [**markasseen**](docs/MessagesApi.md#markasseen) | **POST** /api/v2/notify/messages/views | Markasseen
*MessagesApi* | [**messages**](docs/MessagesApi.md#messages) | **GET** /api/v2/notify/messages | Messages
*RateRemindersApi* | [**getShow**](docs/RateRemindersApi.md#getshow) | **GET** /api/v2/notify/rate_reminder | GetShow
*RateRemindersApi* | [**postMarkasseen**](docs/RateRemindersApi.md#postmarkasseen) | **POST** /api/v2/notify/rate_reminder/views | PostMarkasseen
*RateRemindersV2Api* | [**actionEvents**](docs/RateRemindersV2Api.md#actionevents) | **POST** /api/v2/notify/rate_reminder_v2/events | ActionEvents
*RateRemindersV2Api* | [**actions**](docs/RateRemindersV2Api.md#actions) | **GET** /api/v2/notify/rate_reminder_v2/actions | Actions
*RateRemindersV2Api* | [**answer**](docs/RateRemindersV2Api.md#answer) | **POST** /api/v2/notify/rate_reminder_v2/2/answers | Answer
*RateRemindersV2Api* | [**getShow12**](docs/RateRemindersV2Api.md#getshow12) | **GET** /api/v2/notify/rate_reminder_v2 | GetShow12
*ResponsesApi* | [**show**](docs/ResponsesApi.md#show) | **GET** /api/v2/content/responses/15 | Show
*ScropperApi* | [**getfocalpoint**](docs/ScropperApi.md#getfocalpoint) | **POST** /api/v2/scropper | Getfocalpoint
*StaggerApi* | [**gettag**](docs/StaggerApi.md#gettag) | **POST** /api/v2/stagger | Gettag
*TermsApi* | [**index**](docs/TermsApi.md#index) | **GET** /api/v2/content/terms | Index
*TermsApi* | [**indexversions**](docs/TermsApi.md#indexversions) | **GET** /api/v2/content/terms/some-terms-1/versions | Indexversions
*TermsApi* | [**newestversion**](docs/TermsApi.md#newestversion) | **GET** /api/v2/content/terms/some-terms-1/versions/newest | Newestversion
*TermsApi* | [**showversion**](docs/TermsApi.md#showversion) | **GET** /api/v2/content/terms/versions/5 | Showversion
*TermsApi* | [**storeView**](docs/TermsApi.md#storeview) | **POST** /api/v2/content/terms/versions/views | StoreView
*TimeZonesApi* | [**getIndex123**](docs/TimeZonesApi.md#getindex123) | **GET** /api/v2/geographic/time_zones | GetIndex123
*TimeZonesApi* | [**getShow123456**](docs/TimeZonesApi.md#getshow123456) | **GET** /api/v2/geographic/time_zones/1 | GetShow123456
*TimeZonesApi* | [**showbylatlng**](docs/TimeZonesApi.md#showbylatlng) | **GET** /api/v2/geographic/time_zones/by_lat_lng | Showbylatlng
*UGCApi* | [**feedback**](docs/UGCApi.md#feedback) | **POST** /api/v2/ugc/feedbacks | Feedback
*UGCApi* | [**pushLogs**](docs/UGCApi.md#pushlogs) | **POST** /api/v2/ugc/push-logs | PushLogs
*UGCApi* | [**result**](docs/UGCApi.md#result) | **POST** /api/v2/ugc/results | Result
*ValidatorApi* | [**email**](docs/ValidatorApi.md#email) | **GET** /api/v2/validator/email | Email
*ValidatorApi* | [**phone**](docs/ValidatorApi.md#phone) | **GET** /api/v2/validator/phone | Phone
*VersionControlApi* | [**indexupdate**](docs/VersionControlApi.md#indexupdate) | **GET** /api/v2/notify/updates | Indexupdate
*VersionControlApi* | [**markupdateasseen**](docs/VersionControlApi.md#markupdateasseen) | **POST** /api/v2/notify/updates/views | Markupdateasseen



<a name="documentation-for-authorization"></a>
## Documentation for Authorization

All endpoints do not require authorization.

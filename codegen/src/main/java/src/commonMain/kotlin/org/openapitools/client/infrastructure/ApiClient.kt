package org.openapitools.client.infrastructure

import io.ktor.client.HttpClient
import io.ktor.client.HttpClientConfig
import io.ktor.client.call.call
import io.ktor.client.engine.HttpClientEngine
import io.ktor.client.features.json.JsonFeature
import io.ktor.client.features.json.JsonSerializer
import io.ktor.client.features.json.serializer.KotlinxSerializer
import io.ktor.client.request.accept
import io.ktor.client.request.forms.FormDataContent
import io.ktor.client.request.forms.MultiPartFormDataContent
import io.ktor.client.request.header
import io.ktor.client.request.parameter
import io.ktor.client.response.HttpResponse
import io.ktor.client.utils.EmptyContent
import io.ktor.http.*
import io.ktor.http.content.OutgoingContent
import io.ktor.http.content.PartData
import kotlinx.serialization.UnstableDefault
import kotlinx.serialization.json.Json
import kotlinx.serialization.json.JsonConfiguration

import dk.nodes.nstack.kotlin.codegen.api.*
import dk.nodes.nstack.kotlin.codegen.model.*
import org.openapitools.client.auth.*

open class ApiClient(
        private val baseUrl: String,
        httpClientEngine: HttpClientEngine?,
        serializer: KotlinxSerializer) {

    @UseExperimental(UnstableDefault::class)
    constructor(
            baseUrl: String,
            httpClientEngine: HttpClientEngine?,
            jsonConfiguration: JsonConfiguration) :
            this(baseUrl, httpClientEngine, KotlinxSerializer(Json(jsonConfiguration)))

    private val serializer: JsonSerializer by lazy {
        serializer.apply { setMappers(this) }.ignoreOutgoingContent()
    }

    private val client: HttpClient by lazy {
        val jsonConfig: JsonFeature.Config.() -> Unit = { this.serializer = this@ApiClient.serializer }
        val clientConfig: (HttpClientConfig<*>) -> Unit = { it.install(JsonFeature, jsonConfig) }
        httpClientEngine?.let { HttpClient(it, clientConfig) } ?: HttpClient(clientConfig)
    }

    private val authentications: kotlin.collections.Map<String, Authentication> by lazy {
        mapOf()
    }

    companion object {
        protected val UNSAFE_HEADERS = listOf(HttpHeaders.ContentType)

        private fun setMappers(serializer: KotlinxSerializer) {
            
            AdminAPIApi.setMappers(serializer)
            
            AppOpenApi.setMappers(serializer)
            
            CollectionsApi.setMappers(serializer)
            
            ContinentsApi.setMappers(serializer)
            
            CountriesApi.setMappers(serializer)
            
            DashboardsApi.setMappers(serializer)
            
            FilesApi.setMappers(serializer)
            
            IPAddressesApi.setMappers(serializer)
            
            LanguagesApi.setMappers(serializer)
            
            LocalizeApi.setMappers(serializer)
            
            MessagesApi.setMappers(serializer)
            
            RateRemindersApi.setMappers(serializer)
            
            RateRemindersV2Api.setMappers(serializer)
            
            ResponsesApi.setMappers(serializer)
            
            ScropperApi.setMappers(serializer)
            
            StaggerApi.setMappers(serializer)
            
            TermsApi.setMappers(serializer)
            
            TimeZonesApi.setMappers(serializer)
            
            UGCApi.setMappers(serializer)
            
            ValidatorApi.setMappers(serializer)
            
            VersionControlApi.setMappers(serializer)
            
            serializer.setMapper(dk.nodes.nstack.kotlin.codegen.model.AccessCode::class, dk.nodes.nstack.kotlin.codegen.model.AccessCode.serializer())
            serializer.setMapper(dk.nodes.nstack.kotlin.codegen.model.ActionEventsRequest::class, dk.nodes.nstack.kotlin.codegen.model.ActionEventsRequest.serializer())
            serializer.setMapper(dk.nodes.nstack.kotlin.codegen.model.Activity::class, dk.nodes.nstack.kotlin.codegen.model.Activity.serializer())
            serializer.setMapper(dk.nodes.nstack.kotlin.codegen.model.AnswerRequest::class, dk.nodes.nstack.kotlin.codegen.model.AnswerRequest.serializer())
            serializer.setMapper(dk.nodes.nstack.kotlin.codegen.model.AppOpenData::class, dk.nodes.nstack.kotlin.codegen.model.AppOpenData.serializer())
            serializer.setMapper(dk.nodes.nstack.kotlin.codegen.model.AppOpenMeta::class, dk.nodes.nstack.kotlin.codegen.model.AppOpenMeta.serializer())
            serializer.setMapper(dk.nodes.nstack.kotlin.codegen.model.AppopenV2::class, dk.nodes.nstack.kotlin.codegen.model.AppopenV2.serializer())
            serializer.setMapper(dk.nodes.nstack.kotlin.codegen.model.Article::class, dk.nodes.nstack.kotlin.codegen.model.Article.serializer())
            serializer.setMapper(dk.nodes.nstack.kotlin.codegen.model.Artist::class, dk.nodes.nstack.kotlin.codegen.model.Artist.serializer())
            serializer.setMapper(dk.nodes.nstack.kotlin.codegen.model.BodyPart::class, dk.nodes.nstack.kotlin.codegen.model.BodyPart.serializer())
            serializer.setMapper(dk.nodes.nstack.kotlin.codegen.model.Booking::class, dk.nodes.nstack.kotlin.codegen.model.Booking.serializer())
            serializer.setMapper(dk.nodes.nstack.kotlin.codegen.model.ChangePassword::class, dk.nodes.nstack.kotlin.codegen.model.ChangePassword.serializer())
            serializer.setMapper(dk.nodes.nstack.kotlin.codegen.model.Comments::class, dk.nodes.nstack.kotlin.codegen.model.Comments.serializer())
            serializer.setMapper(dk.nodes.nstack.kotlin.codegen.model.Communication::class, dk.nodes.nstack.kotlin.codegen.model.Communication.serializer())
            serializer.setMapper(dk.nodes.nstack.kotlin.codegen.model.CreateNewPost::class, dk.nodes.nstack.kotlin.codegen.model.CreateNewPost.serializer())
            serializer.setMapper(dk.nodes.nstack.kotlin.codegen.model.CreateNewPostDescription::class, dk.nodes.nstack.kotlin.codegen.model.CreateNewPostDescription.serializer())
            serializer.setMapper(dk.nodes.nstack.kotlin.codegen.model.CreateUser1::class, dk.nodes.nstack.kotlin.codegen.model.CreateUser1.serializer())
            serializer.setMapper(dk.nodes.nstack.kotlin.codegen.model.CreateUser2::class, dk.nodes.nstack.kotlin.codegen.model.CreateUser2.serializer())
            serializer.setMapper(dk.nodes.nstack.kotlin.codegen.model.CreateUser3::class, dk.nodes.nstack.kotlin.codegen.model.CreateUser3.serializer())
            serializer.setMapper(dk.nodes.nstack.kotlin.codegen.model.Data::class, dk.nodes.nstack.kotlin.codegen.model.Data.serializer())
            serializer.setMapper(dk.nodes.nstack.kotlin.codegen.model.Data1::class, dk.nodes.nstack.kotlin.codegen.model.Data1.serializer())
            serializer.setMapper(dk.nodes.nstack.kotlin.codegen.model.Data2::class, dk.nodes.nstack.kotlin.codegen.model.Data2.serializer())
            serializer.setMapper(dk.nodes.nstack.kotlin.codegen.model.Data3::class, dk.nodes.nstack.kotlin.codegen.model.Data3.serializer())
            serializer.setMapper(dk.nodes.nstack.kotlin.codegen.model.Data6::class, dk.nodes.nstack.kotlin.codegen.model.Data6.serializer())
            serializer.setMapper(dk.nodes.nstack.kotlin.codegen.model.Datum::class, dk.nodes.nstack.kotlin.codegen.model.Datum.serializer())
            serializer.setMapper(dk.nodes.nstack.kotlin.codegen.model.Default::class, dk.nodes.nstack.kotlin.codegen.model.Default.serializer())
            serializer.setMapper(dk.nodes.nstack.kotlin.codegen.model.Default1::class, dk.nodes.nstack.kotlin.codegen.model.Default1.serializer())
            serializer.setMapper(dk.nodes.nstack.kotlin.codegen.model.Discover::class, dk.nodes.nstack.kotlin.codegen.model.Discover.serializer())
            serializer.setMapper(dk.nodes.nstack.kotlin.codegen.model.EditImage::class, dk.nodes.nstack.kotlin.codegen.model.EditImage.serializer())
            serializer.setMapper(dk.nodes.nstack.kotlin.codegen.model.EditProfile::class, dk.nodes.nstack.kotlin.codegen.model.EditProfile.serializer())
            serializer.setMapper(dk.nodes.nstack.kotlin.codegen.model.EndOfFeed::class, dk.nodes.nstack.kotlin.codegen.model.EndOfFeed.serializer())
            serializer.setMapper(dk.nodes.nstack.kotlin.codegen.model.Error::class, dk.nodes.nstack.kotlin.codegen.model.Error.serializer())
            serializer.setMapper(dk.nodes.nstack.kotlin.codegen.model.Errors::class, dk.nodes.nstack.kotlin.codegen.model.Errors.serializer())
            serializer.setMapper(dk.nodes.nstack.kotlin.codegen.model.Errors1::class, dk.nodes.nstack.kotlin.codegen.model.Errors1.serializer())
            serializer.setMapper(dk.nodes.nstack.kotlin.codegen.model.FaceBb::class, dk.nodes.nstack.kotlin.codegen.model.FaceBb.serializer())
            serializer.setMapper(dk.nodes.nstack.kotlin.codegen.model.Feed::class, dk.nodes.nstack.kotlin.codegen.model.Feed.serializer())
            serializer.setMapper(dk.nodes.nstack.kotlin.codegen.model.Filters::class, dk.nodes.nstack.kotlin.codegen.model.Filters.serializer())
            serializer.setMapper(dk.nodes.nstack.kotlin.codegen.model.ForgotPassword::class, dk.nodes.nstack.kotlin.codegen.model.ForgotPassword.serializer())
            serializer.setMapper(dk.nodes.nstack.kotlin.codegen.model.Indexlanguages::class, dk.nodes.nstack.kotlin.codegen.model.Indexlanguages.serializer())
            serializer.setMapper(dk.nodes.nstack.kotlin.codegen.model.Indexresource::class, dk.nodes.nstack.kotlin.codegen.model.Indexresource.serializer())
            serializer.setMapper(dk.nodes.nstack.kotlin.codegen.model.InlineObject::class, dk.nodes.nstack.kotlin.codegen.model.InlineObject.serializer())
            serializer.setMapper(dk.nodes.nstack.kotlin.codegen.model.InlineObject1::class, dk.nodes.nstack.kotlin.codegen.model.InlineObject1.serializer())
            serializer.setMapper(dk.nodes.nstack.kotlin.codegen.model.InlineObject10::class, dk.nodes.nstack.kotlin.codegen.model.InlineObject10.serializer())
            serializer.setMapper(dk.nodes.nstack.kotlin.codegen.model.InlineObject11::class, dk.nodes.nstack.kotlin.codegen.model.InlineObject11.serializer())
            serializer.setMapper(dk.nodes.nstack.kotlin.codegen.model.InlineObject12::class, dk.nodes.nstack.kotlin.codegen.model.InlineObject12.serializer())
            serializer.setMapper(dk.nodes.nstack.kotlin.codegen.model.InlineObject13::class, dk.nodes.nstack.kotlin.codegen.model.InlineObject13.serializer())
            serializer.setMapper(dk.nodes.nstack.kotlin.codegen.model.InlineObject14::class, dk.nodes.nstack.kotlin.codegen.model.InlineObject14.serializer())
            serializer.setMapper(dk.nodes.nstack.kotlin.codegen.model.InlineObject15::class, dk.nodes.nstack.kotlin.codegen.model.InlineObject15.serializer())
            serializer.setMapper(dk.nodes.nstack.kotlin.codegen.model.InlineObject16::class, dk.nodes.nstack.kotlin.codegen.model.InlineObject16.serializer())
            serializer.setMapper(dk.nodes.nstack.kotlin.codegen.model.InlineObject17::class, dk.nodes.nstack.kotlin.codegen.model.InlineObject17.serializer())
            serializer.setMapper(dk.nodes.nstack.kotlin.codegen.model.InlineObject18::class, dk.nodes.nstack.kotlin.codegen.model.InlineObject18.serializer())
            serializer.setMapper(dk.nodes.nstack.kotlin.codegen.model.InlineObject19::class, dk.nodes.nstack.kotlin.codegen.model.InlineObject19.serializer())
            serializer.setMapper(dk.nodes.nstack.kotlin.codegen.model.InlineObject2::class, dk.nodes.nstack.kotlin.codegen.model.InlineObject2.serializer())
            serializer.setMapper(dk.nodes.nstack.kotlin.codegen.model.InlineObject20::class, dk.nodes.nstack.kotlin.codegen.model.InlineObject20.serializer())
            serializer.setMapper(dk.nodes.nstack.kotlin.codegen.model.InlineObject21::class, dk.nodes.nstack.kotlin.codegen.model.InlineObject21.serializer())
            serializer.setMapper(dk.nodes.nstack.kotlin.codegen.model.InlineObject3::class, dk.nodes.nstack.kotlin.codegen.model.InlineObject3.serializer())
            serializer.setMapper(dk.nodes.nstack.kotlin.codegen.model.InlineObject4::class, dk.nodes.nstack.kotlin.codegen.model.InlineObject4.serializer())
            serializer.setMapper(dk.nodes.nstack.kotlin.codegen.model.InlineObject5::class, dk.nodes.nstack.kotlin.codegen.model.InlineObject5.serializer())
            serializer.setMapper(dk.nodes.nstack.kotlin.codegen.model.InlineObject6::class, dk.nodes.nstack.kotlin.codegen.model.InlineObject6.serializer())
            serializer.setMapper(dk.nodes.nstack.kotlin.codegen.model.InlineObject7::class, dk.nodes.nstack.kotlin.codegen.model.InlineObject7.serializer())
            serializer.setMapper(dk.nodes.nstack.kotlin.codegen.model.InlineObject8::class, dk.nodes.nstack.kotlin.codegen.model.InlineObject8.serializer())
            serializer.setMapper(dk.nodes.nstack.kotlin.codegen.model.InlineObject9::class, dk.nodes.nstack.kotlin.codegen.model.InlineObject9.serializer())
            serializer.setMapper(dk.nodes.nstack.kotlin.codegen.model.Introtour::class, dk.nodes.nstack.kotlin.codegen.model.Introtour.serializer())
            serializer.setMapper(dk.nodes.nstack.kotlin.codegen.model.Landing::class, dk.nodes.nstack.kotlin.codegen.model.Landing.serializer())
            serializer.setMapper(dk.nodes.nstack.kotlin.codegen.model.Language::class, dk.nodes.nstack.kotlin.codegen.model.Language.serializer())
            serializer.setMapper(dk.nodes.nstack.kotlin.codegen.model.Language1::class, dk.nodes.nstack.kotlin.codegen.model.Language1.serializer())
            serializer.setMapper(dk.nodes.nstack.kotlin.codegen.model.Languagebestfit::class, dk.nodes.nstack.kotlin.codegen.model.Languagebestfit.serializer())
            serializer.setMapper(dk.nodes.nstack.kotlin.codegen.model.Localize::class, dk.nodes.nstack.kotlin.codegen.model.Localize.serializer())
            serializer.setMapper(dk.nodes.nstack.kotlin.codegen.model.Login::class, dk.nodes.nstack.kotlin.codegen.model.Login.serializer())
            serializer.setMapper(dk.nodes.nstack.kotlin.codegen.model.MarkAsSeenResponse::class, dk.nodes.nstack.kotlin.codegen.model.MarkAsSeenResponse.serializer())
            serializer.setMapper(dk.nodes.nstack.kotlin.codegen.model.MarkAsSeenResponseData::class, dk.nodes.nstack.kotlin.codegen.model.MarkAsSeenResponseData.serializer())
            serializer.setMapper(dk.nodes.nstack.kotlin.codegen.model.Messages::class, dk.nodes.nstack.kotlin.codegen.model.Messages.serializer())
            serializer.setMapper(dk.nodes.nstack.kotlin.codegen.model.Meta::class, dk.nodes.nstack.kotlin.codegen.model.Meta.serializer())
            serializer.setMapper(dk.nodes.nstack.kotlin.codegen.model.Meta1::class, dk.nodes.nstack.kotlin.codegen.model.Meta1.serializer())
            serializer.setMapper(dk.nodes.nstack.kotlin.codegen.model.Meta2::class, dk.nodes.nstack.kotlin.codegen.model.Meta2.serializer())
            serializer.setMapper(dk.nodes.nstack.kotlin.codegen.model.NewerVersion::class, dk.nodes.nstack.kotlin.codegen.model.NewerVersion.serializer())
            serializer.setMapper(dk.nodes.nstack.kotlin.codegen.model.News::class, dk.nodes.nstack.kotlin.codegen.model.News.serializer())
            serializer.setMapper(dk.nodes.nstack.kotlin.codegen.model.People::class, dk.nodes.nstack.kotlin.codegen.model.People.serializer())
            serializer.setMapper(dk.nodes.nstack.kotlin.codegen.model.Pin::class, dk.nodes.nstack.kotlin.codegen.model.Pin.serializer())
            serializer.setMapper(dk.nodes.nstack.kotlin.codegen.model.Platform::class, dk.nodes.nstack.kotlin.codegen.model.Platform.serializer())
            serializer.setMapper(dk.nodes.nstack.kotlin.codegen.model.Post::class, dk.nodes.nstack.kotlin.codegen.model.Post.serializer())
            serializer.setMapper(dk.nodes.nstack.kotlin.codegen.model.PushLogsRequest::class, dk.nodes.nstack.kotlin.codegen.model.PushLogsRequest.serializer())
            serializer.setMapper(dk.nodes.nstack.kotlin.codegen.model.PushNotifications::class, dk.nodes.nstack.kotlin.codegen.model.PushNotifications.serializer())
            serializer.setMapper(dk.nodes.nstack.kotlin.codegen.model.RateReminder::class, dk.nodes.nstack.kotlin.codegen.model.RateReminder.serializer())
            serializer.setMapper(dk.nodes.nstack.kotlin.codegen.model.RatingPrompt::class, dk.nodes.nstack.kotlin.codegen.model.RatingPrompt.serializer())
            serializer.setMapper(dk.nodes.nstack.kotlin.codegen.model.Reports::class, dk.nodes.nstack.kotlin.codegen.model.Reports.serializer())
            serializer.setMapper(dk.nodes.nstack.kotlin.codegen.model.Scropper::class, dk.nodes.nstack.kotlin.codegen.model.Scropper.serializer())
            serializer.setMapper(dk.nodes.nstack.kotlin.codegen.model.Search::class, dk.nodes.nstack.kotlin.codegen.model.Search.serializer())
            serializer.setMapper(dk.nodes.nstack.kotlin.codegen.model.Settings::class, dk.nodes.nstack.kotlin.codegen.model.Settings.serializer())
            serializer.setMapper(dk.nodes.nstack.kotlin.codegen.model.Shop::class, dk.nodes.nstack.kotlin.codegen.model.Shop.serializer())
            serializer.setMapper(dk.nodes.nstack.kotlin.codegen.model.ShortcutMenu::class, dk.nodes.nstack.kotlin.codegen.model.ShortcutMenu.serializer())
            serializer.setMapper(dk.nodes.nstack.kotlin.codegen.model.Showresource::class, dk.nodes.nstack.kotlin.codegen.model.Showresource.serializer())
            serializer.setMapper(dk.nodes.nstack.kotlin.codegen.model.SignUp::class, dk.nodes.nstack.kotlin.codegen.model.SignUp.serializer())
            serializer.setMapper(dk.nodes.nstack.kotlin.codegen.model.SuggestUsers::class, dk.nodes.nstack.kotlin.codegen.model.SuggestUsers.serializer())
            serializer.setMapper(dk.nodes.nstack.kotlin.codegen.model.Tattoos::class, dk.nodes.nstack.kotlin.codegen.model.Tattoos.serializer())
            serializer.setMapper(dk.nodes.nstack.kotlin.codegen.model.Translate::class, dk.nodes.nstack.kotlin.codegen.model.Translate.serializer())
            serializer.setMapper(dk.nodes.nstack.kotlin.codegen.model.TranslateDefault::class, dk.nodes.nstack.kotlin.codegen.model.TranslateDefault.serializer())
            serializer.setMapper(dk.nodes.nstack.kotlin.codegen.model.TranslateErrors::class, dk.nodes.nstack.kotlin.codegen.model.TranslateErrors.serializer())
            serializer.setMapper(dk.nodes.nstack.kotlin.codegen.model.TranslateImport::class, dk.nodes.nstack.kotlin.codegen.model.TranslateImport.serializer())
            serializer.setMapper(dk.nodes.nstack.kotlin.codegen.model.TranslateLanguages::class, dk.nodes.nstack.kotlin.codegen.model.TranslateLanguages.serializer())
            serializer.setMapper(dk.nodes.nstack.kotlin.codegen.model.TranslateMain::class, dk.nodes.nstack.kotlin.codegen.model.TranslateMain.serializer())
            serializer.setMapper(dk.nodes.nstack.kotlin.codegen.model.TranslatePlatformLanguages::class, dk.nodes.nstack.kotlin.codegen.model.TranslatePlatformLanguages.serializer())
            serializer.setMapper(dk.nodes.nstack.kotlin.codegen.model.TranslatePlatforms::class, dk.nodes.nstack.kotlin.codegen.model.TranslatePlatforms.serializer())
            serializer.setMapper(dk.nodes.nstack.kotlin.codegen.model.UntitledExample::class, dk.nodes.nstack.kotlin.codegen.model.UntitledExample.serializer())
            serializer.setMapper(dk.nodes.nstack.kotlin.codegen.model.Update::class, dk.nodes.nstack.kotlin.codegen.model.Update.serializer())
            serializer.setMapper(dk.nodes.nstack.kotlin.codegen.model.UpdateVersion::class, dk.nodes.nstack.kotlin.codegen.model.UpdateVersion.serializer())
            serializer.setMapper(dk.nodes.nstack.kotlin.codegen.model.User::class, dk.nodes.nstack.kotlin.codegen.model.User.serializer())
            serializer.setMapper(dk.nodes.nstack.kotlin.codegen.model.User1::class, dk.nodes.nstack.kotlin.codegen.model.User1.serializer())
            serializer.setMapper(dk.nodes.nstack.kotlin.codegen.model.UserList::class, dk.nodes.nstack.kotlin.codegen.model.UserList.serializer())
            serializer.setMapper(dk.nodes.nstack.kotlin.codegen.model.VersionControl::class, dk.nodes.nstack.kotlin.codegen.model.VersionControl.serializer())
            serializer.setMapper(dk.nodes.nstack.kotlin.codegen.model.Welcome::class, dk.nodes.nstack.kotlin.codegen.model.Welcome.serializer())
        }
    }

    /**
     * Set the username for the first HTTP basic authentication.
     *
     * @param username Username
     */
    fun setUsername(username: String) {
        val auth = authentications.values.firstOrNull { it is HttpBasicAuth } as HttpBasicAuth?
                ?: throw Exception("No HTTP basic authentication configured")
        auth.username = username
    }

    /**
     * Set the password for the first HTTP basic authentication.
     *
     * @param password Password
     */
    fun setPassword(password: String) {
        val auth = authentications.values.firstOrNull { it is HttpBasicAuth } as HttpBasicAuth?
                ?: throw Exception("No HTTP basic authentication configured")
        auth.password = password
    }

    /**
     * Set the API key value for the first API key authentication.
     *
     * @param apiKey API key
     * @param paramName The name of the API key parameter, or null or set the first key.
     */
    fun setApiKey(apiKey: String, paramName: String? = null) {
        val auth = authentications.values.firstOrNull { it is ApiKeyAuth && (paramName == null || paramName == it.paramName)} as ApiKeyAuth?
                ?: throw Exception("No API key authentication configured")
        auth.apiKey = apiKey
    }

    /**
     * Set the API key prefix for the first API key authentication.
     *
     * @param apiKeyPrefix API key prefix
     * @param paramName The name of the API key parameter, or null or set the first key.
     */
    fun setApiKeyPrefix(apiKeyPrefix: String, paramName: String? = null) {
        val auth = authentications.values.firstOrNull { it is ApiKeyAuth && (paramName == null || paramName == it.paramName) } as ApiKeyAuth?
                ?: throw Exception("No API key authentication configured")
        auth.apiKeyPrefix = apiKeyPrefix
    }

    /**
     * Set the access token for the first OAuth2 authentication.
     *
     * @param accessToken Access token
     */
    fun setAccessToken(accessToken: String) {
        val auth = authentications.values.firstOrNull { it is OAuth } as OAuth?
                ?: throw Exception("No OAuth2 authentication configured")
        auth.accessToken = accessToken
    }

    /**
     * Set the access token for the first Bearer authentication.
     *
     * @param bearerToken The bearer token.
     */
    fun setBearerToken(bearerToken: String) {
        val auth = authentications.values.firstOrNull { it is HttpBearerAuth } as HttpBearerAuth?
                ?: throw Exception("No Bearer authentication configured")
        auth.bearerToken = bearerToken
    }

    protected suspend fun multipartFormRequest(requestConfig: RequestConfig, body: kotlin.collections.List<PartData>?, authNames: kotlin.collections.List<String>): HttpResponse {
        return request(requestConfig, MultiPartFormDataContent(body ?: listOf()), authNames)
    }

    protected suspend fun urlEncodedFormRequest(requestConfig: RequestConfig, body: Parameters?, authNames: kotlin.collections.List<String>): HttpResponse {
        return request(requestConfig, FormDataContent(body ?: Parameters.Empty), authNames)
    }

    protected suspend fun jsonRequest(requestConfig: RequestConfig, body: Any? = null, authNames: kotlin.collections.List<String>): HttpResponse {
        val contentType = (requestConfig.headers[HttpHeaders.ContentType]?.let { ContentType.parse(it) }
                ?: ContentType.Application.Json)
        return if (body != null) request(requestConfig, serializer.write(body, contentType), authNames)
        else request(requestConfig, authNames = authNames)
    }

    protected suspend fun request(requestConfig: RequestConfig, body: OutgoingContent = EmptyContent, authNames: kotlin.collections.List<String>): HttpResponse {
        requestConfig.updateForAuth(authNames)
        val headers = requestConfig.headers

        return client.call {
            this.url {
                this.takeFrom(URLBuilder(baseUrl))
                appendPath(requestConfig.path.trimStart('/').split('/'))
                requestConfig.query.forEach { query ->
                    query.value.forEach { value ->
                        parameter(query.key, value)
                    }
                }
            }
            this.method = requestConfig.method.httpMethod
            headers.filter { header -> !UNSAFE_HEADERS.contains(header.key) }.forEach { header -> this.header(header.key, header.value) }
            if (requestConfig.method in listOf(RequestMethod.PUT, RequestMethod.POST, RequestMethod.PATCH))
                this.body = body

        }.response
    }

    private fun RequestConfig.updateForAuth(authNames: kotlin.collections.List<String>) {
        for (authName in authNames) {
            val auth = authentications[authName] ?: throw Exception("Authentication undefined: $authName")
            auth.apply(query, headers)
        }
    }

    private fun URLBuilder.appendPath(components: kotlin.collections.List<String>): URLBuilder = apply {
        encodedPath = encodedPath.trimEnd('/') + components.joinToString("/", prefix = "/") { it.encodeURLQueryComponent() }
    }

    private val RequestMethod.httpMethod: HttpMethod
        get() = when (this) {
            RequestMethod.DELETE -> HttpMethod.Delete
            RequestMethod.GET -> HttpMethod.Get
            RequestMethod.HEAD -> HttpMethod.Head
            RequestMethod.PATCH -> HttpMethod.Patch
            RequestMethod.PUT -> HttpMethod.Put
            RequestMethod.POST -> HttpMethod.Post
            RequestMethod.OPTIONS -> HttpMethod.Options
        }
}

// https://github.com/ktorio/ktor/issues/851
private fun JsonSerializer.ignoreOutgoingContent() = IgnoreOutgoingContentJsonSerializer(this)

private class IgnoreOutgoingContentJsonSerializer(private val delegate: JsonSerializer) : JsonSerializer by delegate {
    override fun write(data: Any): OutgoingContent {
        if (data is OutgoingContent) return data
        return delegate.write(data)
    }
}

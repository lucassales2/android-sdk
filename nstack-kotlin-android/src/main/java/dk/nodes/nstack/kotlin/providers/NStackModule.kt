package dk.nodes.nstack.kotlin.providers

import android.content.Context
import android.os.Build
import dk.nodes.nstack.BuildConfig
import dk.nodes.nstack.kotlin.NStack
import dk.nodes.nstack.kotlin.managers.AppOpenSettingsManager
import dk.nodes.nstack.kotlin.managers.ClassTranslationManager
import dk.nodes.nstack.kotlin.managers.ConnectionManager
import dk.nodes.nstack.kotlin.managers.NetworkManager
import dk.nodes.nstack.kotlin.managers.PrefManager
import dk.nodes.nstack.kotlin.managers.ViewTranslationManager
import dk.nodes.nstack.kotlin.models.ClientAppInfo
import dk.nodes.nstack.kotlin.models.NStackMeta
import dk.nodes.nstack.kotlin.provider.HttpClientProvider
import dk.nodes.nstack.kotlin.provider.TranslationHolder
import dk.nodes.nstack.kotlin.util.Preferences
import dk.nodes.nstack.kotlin.util.PreferencesImpl
import dk.nodes.nstack.kotlin.util.extensions.ContextWrapper
import kotlin.reflect.KClass

/**
 * Provides dependencies for NStack
 */
internal class NStackModule(
    private val context: Context,
    private val translationHolder: TranslationHolder
) {

    /**
     * Creates new AppOpenSettingsManager
     */
    fun provideAppOpenSettingsManager(): AppOpenSettingsManager {
        return getLazyDependency(AppOpenSettingsManager::class) {
            AppOpenSettingsManager(
                NStack.appClientInfo,
                providePreferences()
            )
        }
    }

    /**
     * Creates new PrefManager
     */
    fun providePrefManager(): PrefManager {
        return getLazyDependency(PrefManager::class) { PrefManager(providePreferences()) }
    }

    /**
     * Creates Network Manager
     */
    fun provideNetworkManager(): NetworkManager {
        return getLazyDependency(NetworkManager::class) {
            NetworkManager(
                HttpClientProvider.getHttpClient(
                    appIdKey = NStack.appIdKey,
                    appApiKey = NStack.appApiKey,
                    sdkVersion = BuildConfig.SDK_VERSION,
                    environment = NStack.env,
                    versionName = NStack.appClientInfo.versionName,
                    versionRelease = Build.VERSION.RELEASE,
                    model = Build.MODEL,
                    debugMode = NStack.debugMode
                ),
                NStack.baseUrl,
                NStack.debugMode
            )
        }
    }

    fun providePreferences(): Preferences {
        return getLazyDependency(PreferencesImpl::class) { PreferencesImpl(context) }
    }

    fun provideViewTranslationManager(): ViewTranslationManager {
        return getLazyDependency(ViewTranslationManager::class) {
            ViewTranslationManager(translationHolder)
        }
    }

    fun provideClientAppInfo(): ClientAppInfo {
        return getLazyDependency(ClientAppInfo::class) { ClientAppInfo(context) }
    }

    fun provideNStackMeta(): NStackMeta {
        return getLazyDependency(NStackMeta::class) { NStackMeta(context) }
    }

    fun provideConnectionManager(): ConnectionManager {
        return getLazyDependency(ConnectionManager::class) { ConnectionManager(context) }
    }

    fun provideClassTranslationManager(): ClassTranslationManager {
        return getLazyDependency(ClassTranslationManager::class) { ClassTranslationManager() }
    }

    fun provideContextWrapper(): ContextWrapper {
        return getLazyDependency(ContextWrapper::class) { ContextWrapper(context) }
    }

    @Suppress("UNCHECKED_CAST")
    private inline fun <T : Any> getLazyDependency(
        clazz: KClass<T>,
        crossinline block: () -> T
    ): T {
        if (!dependenciesMap.containsKey(clazz)) {
            dependenciesMap[clazz] = block()
        }
        return dependenciesMap[clazz] as T
    }

    companion object {
        private val dependenciesMap = mutableMapOf<KClass<*>, Any>()
    }
}

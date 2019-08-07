package dk.nodes.nstack.kotlin.providers

import android.content.Context
import dk.nodes.nstack.kotlin.managers.ClassTranslationManager
import dk.nodes.nstack.kotlin.managers.ConnectionManager
import dk.nodes.nstack.kotlin.managers.NetworkManager
import dk.nodes.nstack.kotlin.managers.ViewTranslationManager
import dk.nodes.nstack.kotlin.models.ClientAppInfo
import dk.nodes.nstack.kotlin.models.NStackMeta
import dk.nodes.nstack.kotlin.util.ContextWrapper
import dk.nodes.nstack.kotlin.util.Preferences
import dk.nodes.nstack.kotlin.util.PreferencesImpl


internal class NStackModule(private val context: Context) {

    fun provideClientAppInfo(): ClientAppInfo {
        return ClientAppInfo(context)
    }

    fun provideNStackMeta(): NStackMeta {
        return NStackMeta(context)
    }

    fun provideNetworkManager(): NetworkManager {
        return NetworkManager(context)
    }

    fun provideConnectionManager(): ConnectionManager {
        return ConnectionManager(context)
    }

    fun provideViewTranslationManager(): ViewTranslationManager {
        return ViewTranslationManager()
    }

    fun provideClassTranslationManager(): ClassTranslationManager {
        return ClassTranslationManager()
    }

    fun provideContextWrapper(): ContextWrapper {
        return ContextWrapper(context)
    }

    fun providePreferences(): Preferences {
        return PreferencesImpl(context)
    }
}
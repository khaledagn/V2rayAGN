package com.agn.v2ray.util

import android.content.Context
import android.content.res.Configuration
import java.util.Locale

object LanguageHelper {
    fun updateContextLocale(context: Context, language: String): Context {
        val locale = Locale(language)
        Locale.setDefault(locale)
        val config = Configuration(context.resources.configuration)
        config.setLocale(locale)
        return context.createConfigurationContext(config)
    }
}

package com.agn.v2ray.util

import android.content.Context
import java.util.Locale

object MyContextWrapper {
    fun wrap(context: Context): Context {
        val languagePrefs = LanguagePrefs(context)
        val language = languagePrefs.getSelectedLanguage()
        val locale = when (language) {
            "auto" -> Utils.getSysLocale()
            "en" -> Locale("en")
            "zh-rCN" -> Locale("zh", "CN")
            "zh-rTW" -> Locale("zh", "TW")
            "vi" -> Locale("vi")
            "ru" -> Locale("ru")
            "fa" -> Locale("fa")
            "ar" -> Locale("ar")
            "es" -> Locale("es")
            "de" -> Locale("de")
            "th" -> Locale("th")
            "fr" -> Locale("fr")
            "pt" -> Locale("pt")
            "lt" -> Locale("lt")

            else -> Utils.getSysLocale()

        }
        val configuration = context.resources.configuration
        configuration.setLocale(locale)
        return context.createConfigurationContext(configuration)
    }
}

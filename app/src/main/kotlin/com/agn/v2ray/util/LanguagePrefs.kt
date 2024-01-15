package com.agn.v2ray.util

import android.content.Context

class LanguagePrefs(context: Context) {
    private val prefs = context.getSharedPreferences("MyAppPrefs", Context.MODE_PRIVATE)

    fun getSelectedLanguage(): String {
        return prefs.getString("selected_language", "auto") ?: "auto"
    }

    fun setSelectedLanguage(language: String) {
        prefs.edit().putString("selected_language", language).apply()
    }
}

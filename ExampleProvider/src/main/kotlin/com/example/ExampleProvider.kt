package com.example

import com.lagradost.cloudstream3.plugins.CloudstreamPlugin
import com.lagradost.cloudstream3.plugins.Plugin
import android.content.Context

@CloudstreamPlugin
class ExampleProvider: Plugin() {
    override fun load(context: Context) {
        registerMainAPI(pornxp())
    }
}

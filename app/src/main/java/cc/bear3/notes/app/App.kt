package cc.bear3.notes.app

import android.app.Application
import android.content.Context

/**
 *
 * @author TT
 * @since 2020-10-25
 */
class App : Application() {
    override fun onCreate() {
        super.onCreate()
        sContext = this
    }

    companion object {
        lateinit var sContext : Context
    }
}
package cc.bear3.notes.db

import androidx.room.Room
import cc.bear3.notes.app.App

/**
 *
 * @author TT
 * @since 2020-10-25
 */
object DbHelper {
    val db by lazy {
        Room.databaseBuilder(App.sContext, AppDatabase::class.java, "app_db")
            .allowMainThreadQueries().build()
    }
}
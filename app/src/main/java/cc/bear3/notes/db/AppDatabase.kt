package cc.bear3.notes.db

import androidx.room.Database
import androidx.room.RoomDatabase
import cc.bear3.notes.db.dao.AppDao
import cc.bear3.notes.db.data.ComponentData
import cc.bear3.notes.db.data.GroupData
import cc.bear3.notes.db.data.OperationData
import cc.bear3.notes.db.data.ProductData

/**
 *
 * @author TT
 * @since 2020-10-25
 */
@Database(
    entities = [GroupData::class, ProductData::class, ComponentData::class, OperationData::class],
    version = 1
)
abstract class AppDatabase : RoomDatabase() {
    abstract fun appDap(): AppDao
}
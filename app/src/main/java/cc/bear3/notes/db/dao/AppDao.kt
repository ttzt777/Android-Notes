package cc.bear3.notes.db.dao

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import cc.bear3.notes.db.data.GroupData

/**
 *
 * @author TT
 * @since 2020-10-25
 */
@Dao
interface AppDao {
    @Query("SELECT * FROM GroupData")
    fun getAllGroup() : List<GroupData>

    @Insert
    fun insertGroup(data: GroupData)
}
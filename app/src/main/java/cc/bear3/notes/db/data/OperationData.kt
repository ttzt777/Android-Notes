package cc.bear3.notes.db.data

import androidx.room.Entity
import androidx.room.PrimaryKey

/**
 * 组件操作
 * @author TT
 * @since 2020-10-25
 */
@Entity
data class OperationData(
    var componentId: Long,
    var time: Long,
    var desc: String
) {
    @PrimaryKey(autoGenerate = true)
    var id: Long = 0
}
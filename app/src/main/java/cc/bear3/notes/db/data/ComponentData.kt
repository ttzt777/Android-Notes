package cc.bear3.notes.db.data

import androidx.room.Entity
import androidx.room.PrimaryKey

/**
 * 产品组件
 * @author TT
 * @since 2020-10-25
 */
@Entity
data class ComponentData(
    var productId: Long,
    var name: String,
    var desc: String,
    var image: String
) {
    @PrimaryKey(autoGenerate = true)
    var id: Long = 0
}
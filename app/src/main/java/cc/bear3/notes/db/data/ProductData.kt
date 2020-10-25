package cc.bear3.notes.db.data

import androidx.room.Entity
import androidx.room.PrimaryKey

/**
 * 产品
 * @author TT
 * @since 2020-10-25
 */
@Entity
data class ProductData(
    var name: String,
    var desc: String,
    var image: String,
    var startTime: Long,
    var suggestPeriod: Long,
    var targetPeriod: Long
) {
    @PrimaryKey(autoGenerate = true)
    var id: Long = 0
}
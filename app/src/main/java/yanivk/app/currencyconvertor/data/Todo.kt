package yanivk.app.currencyconvertor.data

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "todo_tbl")
data class Todo(
    val title: String,
    val description: String?,
    val isDone: Boolean,
    @PrimaryKey(autoGenerate = true) val id: Int? = null
)

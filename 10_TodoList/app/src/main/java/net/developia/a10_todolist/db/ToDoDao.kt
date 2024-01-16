package net.developia.a10_todolist.db

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query

@Dao
interface ToDoDao {
    @Query("SELECT id, title, importance FROM ToDoEntity")
    fun getAll(): List<ToDoEntity>

    @Insert
    fun insertTodo(todo: ToDoEntity)

    @Delete
    fun deleteTodo(todo: ToDoEntity)
}
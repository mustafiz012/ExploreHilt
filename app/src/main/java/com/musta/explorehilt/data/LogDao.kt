package com.musta.explorehilt.data

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import com.musta.explorehilt.data.Log

/**
 * Data access object to query the database.
 */
@Dao
interface LogDao {

    @Query("SELECT * FROM logs ORDER BY id DESC")
    fun getAll(): List<Log>

    @Insert
    fun insertAll(vararg logs: Log)

    @Query("DELETE FROM logs")
    fun nukeTable()
}

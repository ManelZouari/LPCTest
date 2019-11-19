package com.lakooz.lpctest.database

import androidx.room.*
import androidx.room.OnConflictStrategy.REPLACE
import com.lakooz.lpctest.model.Pot


@Dao
abstract class PotDao {

    //TODO
    fun createOrUpdate(pot: Pot) {

    }

    // TODO : add missing methods

    @Query("SELECT * FROM pot")
    abstract fun getAll(): List<Pot>

    @Insert(onConflict = REPLACE)
    abstract fun insert(pot : Pot)

    @Delete
    abstract fun delete(pot: Pot)



}
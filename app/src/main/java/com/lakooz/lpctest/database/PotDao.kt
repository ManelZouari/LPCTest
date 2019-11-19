package com.lakooz.lpctest.database

import androidx.room.*
import androidx.room.OnConflictStrategy.REPLACE
import com.lakooz.lpctest.model.Pot


@Dao
abstract class PotDao {

    //TODO

    @Insert(onConflict = REPLACE)
    abstract fun createOrUpdate(pot : Pot)

    // TODO : add missing methods

    @Query("SELECT * FROM pot")
    abstract fun getAll(): List<Pot>


    @Delete
    abstract fun delete(pot: Pot)

    @Insert(onConflict = REPLACE)
    abstract fun insertAllAndSynchronize(pots: List<Pot>)

    @Query("SELECT * FROM pot WHERE category = :category ")
    abstract fun getPots(category: Int): List<Pot>


}
package com.lakooz.lpctest.model

import androidx.room.Entity
import androidx.room.PrimaryKey
import java.util.*

@Entity
data class Pot(
    @PrimaryKey val identifier: String,
    val name: String,
    // TODO : add missing fields
    val creationDate : Date,
    val category : Int,
    val contributorsCount : Int,
    val amount : Double,
    val imageUrl : String

) {


    companion object {
        const val CATEGORY_BIRTHDAY = 0
        const val CATEGORY_FAREWELL = 1
        const val CATEGORY_SOLIDARITY = 2
    }
}
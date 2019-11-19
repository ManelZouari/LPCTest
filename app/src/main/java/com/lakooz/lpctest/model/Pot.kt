package com.lakooz.lpctest.model

import androidx.room.Entity
import androidx.room.PrimaryKey
import com.google.gson.annotations.SerializedName
import java.time.LocalDateTime
import java.util.*

@Entity
data class Pot(

    //this annotation to tell that this attribute correspandate to the attribute id in JSON format
    @SerializedName("id")
    @PrimaryKey val identifier: String,
    val name: String,
    // TODO : add missing fields
    val creationDate : String,
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
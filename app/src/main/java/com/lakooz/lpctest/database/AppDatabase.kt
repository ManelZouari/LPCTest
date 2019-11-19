package com.lakooz.lpctest.database

import android.content.Context
import androidx.room.*
import com.lakooz.lpctest.model.Pot

// TODO

@TypeConverters(DateConverter::class)


@Database(entities = arrayOf(Pot::class), version = 1)

abstract class AppDatabase : RoomDatabase() {

    //TODO
    abstract fun potdao():PotDao

    companion object {

        private const val DATABASE_NAME = "db_lpc_test"
        private var instance: AppDatabase? = null


        // TODO : implement
        fun buildDatabase(context: Context) : AppDatabase {
            return Room.databaseBuilder(context, AppDatabase::class.java ,DATABASE_NAME)
                .allowMainThreadQueries()
                .fallbackToDestructiveMigration()
                .build()


        }

        fun getInstance(context: Context): AppDatabase {
            if (instance == null) {
                synchronized(AppDatabase::class.java) {
                    if (instance == null) {
                        instance =
                            buildDatabase(context.applicationContext)
                    }
                }
            }
            return instance!!
        }

    }


}
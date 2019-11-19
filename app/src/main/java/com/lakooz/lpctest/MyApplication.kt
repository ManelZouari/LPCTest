package com.lakooz.lpctest

import android.app.Application
import com.facebook.stetho.Stetho
import com.lakooz.lpctest.database.AppDatabase
import com.lakooz.lpctest.model.Pot
import java.sql.Date

class MyApplication : Application() {

    override fun onCreate() {
        super.onCreate()

        // TODO: initialize database
        Stetho.initializeWithDefaults(this)
        database = AppDatabase.getInstance(applicationContext)


       /*

       ----this code is to make sure that the database is working perfectly ( inspection with Stetho )
        val pot = Pot("Manel","Mannou", Date.valueOf("1997-03-10"),1,8,23.45,"bkjkjug")
        database.potdao().insert(pot)


        */








    }

    companion object {

        lateinit var database: AppDatabase
        private set

    }
}
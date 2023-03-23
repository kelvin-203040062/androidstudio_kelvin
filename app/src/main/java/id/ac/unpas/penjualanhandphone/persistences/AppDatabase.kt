package id.ac.unpas.penjualanhandphone.persistences

import androidx.room.Database
import androidx.room.RoomDatabase
import id.ac.unpas.penjualanhandphone.model.DataHandphone

@Database(entities = [DataHandphone::class], version = 1)
abstract class AppDatabase : RoomDatabase() {
    abstract fun DataHandphoneDao(): DataHandphoneDao
}
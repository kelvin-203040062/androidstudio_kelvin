package id.ac.unpas.penjualanhandphone.persistences

import androidx.lifecycle.LiveData
import androidx.room.*
import id.ac.unpas.penjualanhandphone.model.DataHandphone


@Dao
interface DataHandphoneDao {
    @Query("SELECT * FROM DataHandphone")
    fun loadAll(): LiveData<List<DataHandphone>>

    @Query("SELECT * FROM DataHandphone WHERE id = :id")
    fun find(id: String): DataHandphone?

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertAll(vararg items: DataHandphone)

    @Delete
    fun delete(item: DataHandphone)
}
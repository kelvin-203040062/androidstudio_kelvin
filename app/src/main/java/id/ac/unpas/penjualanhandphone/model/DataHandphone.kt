package id.ac.unpas.penjualanhandphone.model

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class DataHandphone(
    @PrimaryKey val id: String,
    val tanggal: String,
    val merk: String,
    val penjualan: String,
    val harga: String,
)
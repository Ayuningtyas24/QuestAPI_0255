package com.example.questapi.modeldata

import kotlinx.serialization.Serializable

class DataSiswa {
    @Serializable
    data class DataSiswa(
        val id : Int,
        val nama : String,
        val alamat : String,
        val telpon : String
    )
}
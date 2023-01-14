package com.example.belajarsqlite.repository

import androidx.lifecycle.LiveData
import com.example.belajarsqlite.data.JadwalDAO
import com.example.belajarsqlite.model.Jadwal

class JadwalRepo(private val JadwalDAO: JadwalDAO) {

    val bacaSemuaData: LiveData<List<Jadwal>> = JadwalDAO.bacaSemuaData()

    suspend fun tambahJadwal(jadwal: Jadwal) {
        JadwalDAO.tambahJadwal(jadwal)
    }

    suspend fun updateJadwal(jadwal: Jadwal) {
        JadwalDAO.updateJadwal(jadwal)
    }

    suspend fun hapusJadwal(jadwal: Jadwal) {
        JadwalDAO.hapusJadwal(jadwal)
    }

    suspend fun hapusSemuaJadwal() {
        JadwalDAO.hapusSemua()
    }
}
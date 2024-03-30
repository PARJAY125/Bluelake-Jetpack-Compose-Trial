package com.example.jetpackcomposebluelake.data

import com.example.jetpackcomposebluelake.logic.DompetTipe
import com.example.jetpackcomposebluelake.logic.EmployeeStatus
import com.example.jetpackcomposebluelake.model.TbWallets
import com.example.jetpackcomposebluelake.model.Transaction
import com.example.jetpackcomposebluelake.model.User
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flowOf

class DummyData {

    companion object {
        val transaction1 = Transaction(1, "2024-03-30", "Gaji bulan ini", 5000.0)
        val transaction2 = Transaction(2, "2024-03-28", "Pembelian perlengkapan kerja", -200.0)
        val wallet1 = TbWallets(1, 4800.0, listOf(transaction1, transaction2), DompetTipe.DOMPET_UTAMA)
        val user1 = User(1, "John Doe", "john.doe@example.com", "ABC123", EmployeeStatus.PERMANENT, 20, wallet1, 2000.0)

        val transaction3 = Transaction(3, "2024-03-30", "Gaji bulan ini", 5500.0)
        val transaction4 = Transaction(4, "2024-03-29", "Pengeluaran belanja bulanan", -300.0)
        val wallet2 = TbWallets(2, 5200.0, listOf(transaction3, transaction4), DompetTipe.DOMPET_UTAMA)
        val user2 = User(2, "Jane Smith", "jane.smith@example.com", "XYZ789", EmployeeStatus.PERCOBAAN, 18, wallet2, 1500.0)

        // Dummy data tambahan untuk keperluan transaksi
        val transaction5 = Transaction(5, "2024-03-30", "Bonus kinerja", 1000.0)
        val transaction6 = Transaction(6, "2024-03-25", "Pengeluaran makan siang", -50.0)
        val wallet3 = TbWallets(3, 3000.0, listOf(transaction5, transaction6), DompetTipe.DOMPET_TAMBAHAN)
        val user3 = User(3, "Michael Johnson", "michael.johnson@example.com", "DEF456", EmployeeStatus.KONTRAK, 22, wallet3, 1800.0)

        val dummyUsersFlow: List<User> = listOf(user1, user2, user3)
    }
}
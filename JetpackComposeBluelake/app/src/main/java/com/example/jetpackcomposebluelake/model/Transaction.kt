package com.example.jetpackcomposebluelake.model

data class Transaction(
    val id: Int, // ID transaksi
    val date: String, // Tanggal transaksi
    val description: String, // Deskripsi transaksi
    val amount: Double, // Jumlah transaksi (positif untuk pemasukan, negatif untuk pengeluaran)
)

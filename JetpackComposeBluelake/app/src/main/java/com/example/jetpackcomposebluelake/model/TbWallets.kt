package com.example.jetpackcomposebluelake.model

import com.example.jetpackcomposebluelake.logic.DompetTipe

data class TbWallets (
    val id: Int, // ID dompet (opsional, jika tidak ada, hapus)
    val balance: Double,
    val transactions: List<Transaction>,
    val tipeDompet : DompetTipe
)
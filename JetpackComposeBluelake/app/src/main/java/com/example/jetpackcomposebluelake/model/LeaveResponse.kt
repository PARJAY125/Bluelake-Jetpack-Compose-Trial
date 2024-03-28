package com.example.jetpackcomposebluelake.model

import com.example.jetpackcomposebluelake.logic.LeaveStatus

data class LeaveResponse (
    val requestId: Int, // Reference to the leave request ID
    val respondStatus: LeaveStatus,
    val respondNote: String? = null // Optional response note
)
package com.example.jetpackcomposebluelake.model

import com.example.jetpackcomposebluelake.logic.LeaveStatus


data class TbLeaveRequest(
    val id: Int,
    val employeeId: Int,
    val status: LeaveStatus, // Use an enum for different leave statuses
    val reason: String,
    val leaveDate: String,
    val proofDocument: String
)



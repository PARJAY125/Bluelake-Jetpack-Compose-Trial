package com.example.jetpackcomposebluelake.model

import com.example.jetpackcomposebluelake.logic.EmployeeStatus

data class Break(
    var employeId : String,
    var employeName : String,
    var note : String,
    var proofImage : String,
    var status : EmployeeStatus
)

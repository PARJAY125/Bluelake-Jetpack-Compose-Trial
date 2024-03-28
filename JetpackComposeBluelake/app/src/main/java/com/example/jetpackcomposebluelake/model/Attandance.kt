package com.example.jetpackcomposebluelake.model

import com.example.jetpackcomposebluelake.logic.EmployeeStatus

data class Attandance(
    var employeeId : String,
    var employeeName : String,
    var timeIn : Long,
    var timeOut : Long,
    var coordinate : String,
    var note : String,
    var proofImage : String,
    var status : EmployeeStatus
)

package com.example.jetpackcomposebluelake.model

import com.example.jetpackcomposebluelake.logic.EmployeeStatus

data class User(
    var id : Int,
    var name : String,
    var email : String,
    var companyId : String,
    var status : EmployeeStatus,
    var totalDaysWorks : Int,
    var wallets : TbWallets,
    var depositeBalance : Double
) {
    fun MakeAttandance(){

    }
    fun LeaveRequest(){

    }
    fun MakeBreak(){

    }

}
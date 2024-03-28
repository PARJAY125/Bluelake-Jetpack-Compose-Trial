package com.example.jetpackcomposebluelake

import com.example.jetpackcomposebluelake.presentation.user.UserRepository

interface AppModule {
//    val database: RoomDatabase
//    val salesNameDataStore : SalesNameDataStoreManager
//    val sellingKitProductListDataStore : SellingKitProductListDataStore
//    val outletRepository : OutletRepository
//    val productRepository : ProductRepository
    val userRepository : UserRepository
}
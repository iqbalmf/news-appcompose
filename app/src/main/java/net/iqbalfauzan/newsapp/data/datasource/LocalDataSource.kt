package net.iqbalfauzan.newsapp.data.datasource

import kotlinx.coroutines.flow.Flow

interface LocalDataSource {
    suspend fun saveOnBoardingState(isComplete: Boolean)
    suspend fun readOnBoardingState(): Flow<Boolean>
}
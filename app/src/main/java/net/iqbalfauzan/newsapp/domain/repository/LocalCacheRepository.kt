package net.iqbalfauzan.newsapp.domain.repository

import kotlinx.coroutines.flow.Flow

interface LocalCacheRepository {
    suspend fun saveOnBoardingState(completed: Boolean)
    suspend fun readOnBoardingState(): Flow<Boolean>
}
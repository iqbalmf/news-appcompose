package net.iqbalfauzan.newsapp.data.repository

import kotlinx.coroutines.flow.Flow
import net.iqbalfauzan.newsapp.data.datasource.LocalDataSource
import net.iqbalfauzan.newsapp.domain.repository.LocalCacheRepository
import javax.inject.Inject

class LocalCacheRepositoryImpl @Inject constructor(
    private val localDataSource: LocalDataSource
) : LocalCacheRepository {
    override suspend fun saveOnBoardingState(completed: Boolean) {
        localDataSource.saveOnBoardingState(completed)
    }

    override suspend fun readOnBoardingState(): Flow<Boolean> {
        return localDataSource.readOnBoardingState()
    }
}
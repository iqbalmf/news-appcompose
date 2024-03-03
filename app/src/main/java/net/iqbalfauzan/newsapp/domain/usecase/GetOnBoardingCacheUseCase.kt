package net.iqbalfauzan.newsapp.domain.usecase

import kotlinx.coroutines.flow.Flow
import net.iqbalfauzan.newsapp.domain.repository.LocalCacheRepository
import javax.inject.Inject

class GetOnBoardingCacheUseCase @Inject constructor(private val localCacheRepository: LocalCacheRepository) {
    suspend fun saveOnBoardingState(completed: Boolean){
        return localCacheRepository.saveOnBoardingState(completed)
    }

    suspend fun getOnBoradingState(): Flow<Boolean> {
        return localCacheRepository.readOnBoardingState()
    }
}
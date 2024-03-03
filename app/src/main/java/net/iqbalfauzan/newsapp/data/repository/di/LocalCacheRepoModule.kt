package net.iqbalfauzan.newsapp.data.repository.di

import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ViewModelComponent
import dagger.hilt.components.SingletonComponent
import net.iqbalfauzan.newsapp.data.repository.LocalCacheRepositoryImpl
import net.iqbalfauzan.newsapp.domain.repository.LocalCacheRepository

@Module
@InstallIn(SingletonComponent::class)
abstract class LocalCacheRepoModule {
    @Binds
    abstract fun provideLocalCacheRepository(localCacheRepositoryImpl: LocalCacheRepositoryImpl): LocalCacheRepository
}
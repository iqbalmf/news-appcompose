package net.iqbalfauzan.newsapp.di

import android.content.Context
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import net.iqbalfauzan.newsapp.data.DataStoreRepository
import javax.inject.Singleton

/**
 * Created by IqbalMF on 2024.
 * Package net.iqbalfauzan.newsapp.di
 */
@Module
@InstallIn(SingletonComponent::class)
object MainModule {
    @Provides
    @Singleton
    fun providesDataStoreRepository(@ApplicationContext context: Context) =
        DataStoreRepository(context = context)
}
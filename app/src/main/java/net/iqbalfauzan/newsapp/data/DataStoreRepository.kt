package net.iqbalfauzan.newsapp.data

import android.content.Context
import androidx.datastore.core.DataStore
import androidx.datastore.preferences.core.Preferences
import androidx.datastore.preferences.core.booleanPreferencesKey
import androidx.datastore.preferences.core.edit
import androidx.datastore.preferences.core.emptyPreferences
import androidx.datastore.preferences.preferencesDataStore
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.catch
import kotlinx.coroutines.flow.map
import net.iqbalfauzan.utilities.Constants
import java.io.IOException

/**
 * Created by IqbalMF on 2024.
 * Package net.iqbalfauzan.newsapp.data
 */
val Context.dataStore: DataStore<Preferences> by preferencesDataStore(name = Constants.ON_BOARDING_PREFS)

class DataStoreRepository(context: Context) {
    private val onBoardingKey = booleanPreferencesKey(name = Constants.ON_BOARDING_COMPLETED)
    private val dataStore = context.dataStore
    suspend fun saveOnBoardingState(completed: Boolean) {
        dataStore.edit {
            it[onBoardingKey] = completed
        }
    }
    fun readOnBoardingState(): Flow<Boolean>{
        return dataStore.data.catch {
            if (it is IOException){
                emit(emptyPreferences())
            } else {
                throw it
            }
        }.map {
            val onBoardingProcess = it[onBoardingKey] ?: false
            onBoardingProcess
        }
    }
}
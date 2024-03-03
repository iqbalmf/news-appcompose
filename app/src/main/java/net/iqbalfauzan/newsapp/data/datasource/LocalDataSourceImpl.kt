package net.iqbalfauzan.newsapp.data.datasource

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
import net.iqbalfauzan.newsapp.data.repository.dataStore
import net.iqbalfauzan.utilities.Constants
import java.io.IOException

val Context.dataStore: DataStore<Preferences> by preferencesDataStore(name = Constants.ON_BOARDING_PREFS)
class LocalDataSourceImpl (private val context: Context): LocalDataSource {
    private val onBoardingKey = booleanPreferencesKey(name = Constants.ON_BOARDING_COMPLETED)
    override suspend fun saveOnBoardingState(isComplete: Boolean) {
        context.dataStore.edit {
            it[onBoardingKey] = isComplete
        }
    }

    override suspend fun readOnBoardingState(): Flow<Boolean> {
        return context.dataStore.data.catch {
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
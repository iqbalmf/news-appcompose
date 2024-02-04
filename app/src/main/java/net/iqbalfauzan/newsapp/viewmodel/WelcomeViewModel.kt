package net.iqbalfauzan.newsapp.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import net.iqbalfauzan.newsapp.data.DataStoreRepository
import javax.inject.Inject

/**
 * Created by IqbalMF on 2024.
 * Package net.iqbalfauzan.newsapp.viewmodel
 */
@HiltViewModel
class WelcomeViewModel @Inject constructor(
    private val dataStoreRepository: DataStoreRepository
) : ViewModel() {
    fun saveOnBoardingState(complete: Boolean) {
        viewModelScope.launch(Dispatchers.IO) {
            dataStoreRepository.saveOnBoardingState(completed = complete)
        }
    }
}
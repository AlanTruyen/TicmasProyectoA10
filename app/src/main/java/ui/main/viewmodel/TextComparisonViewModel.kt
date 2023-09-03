// En TextComparisonViewModel.kt

package com.ticmasproyecto10.ui.main.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.ticmasproyecto10.data.model.TextComparison

class TextComparisonViewModel : ViewModel() {
    private val _textComparisonResult = MutableLiveData<String>()
    val textComparisonResult: LiveData<String> = _textComparisonResult

    fun compareTexts(textComparison: TextComparison) {
        if (textComparison.text1 == textComparison.text2) {
            _textComparisonResult.value = "Las cadenas son iguales"
        } else {
            _textComparisonResult.value = "Las cadenas no son iguales"
        }
    }
}

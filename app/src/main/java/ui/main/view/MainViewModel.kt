import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainViewModel : ViewModel() {
    private val _result = MutableLiveData<String>()
    val result: LiveData<String> = _result

    fun compareTexts(text1: String, text2: String) {
        // Aquí puedes realizar la lógica de comparación que desees y actualizar _result con el resultado.
        val comparisonResult = if (text1 == text2) "Los textos son iguales" else "Los textos son diferentes"
        _result.value = comparisonResult
    }
}

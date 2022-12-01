package gerard.g.suarez.webap.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import gerard.g.suarez.webap.model.QuoteModel
import gerard.g.suarez.webap.model.QuoteProvider
//es una forma de solicitar los datos y o acceder a ellos
class QuoteViewModel : ViewModel() {
    val quoteModel = MutableLiveData<QuoteModel>()
    fun randomQuote() {
        val currentQuote = QuoteProvider.random()
        quoteModel.postValue(currentQuote)
    }
}
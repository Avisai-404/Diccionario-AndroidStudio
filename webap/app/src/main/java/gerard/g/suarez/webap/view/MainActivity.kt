package gerard.g.suarez.webap.view

import android.os.Bundle
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.Observer
import gerard.g.suarez.webap.databinding.ActivityMainBinding
import gerard.g.suarez.webap.viewmodel.QuoteViewModel

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    private val quoteViewModel: QuoteViewModel by viewModels()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
    //construye la vista de la ventana 
        quoteViewModel.quoteModel.observe(this, Observer { currentQuote->
            binding.tvQuote.text=currentQuote.quote
            binding.tvAuthor.text=currentQuote.Author
        })
        //nos muestra una oracion en el dialecto y su traduccion al español
        binding.viewContainer.setOnClickListener{ quoteViewModel.randomQuote() }
    }
}
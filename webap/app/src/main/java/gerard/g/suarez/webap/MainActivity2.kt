package gerard.g.suarez.webap

import android.os.Bundle
import android.webkit.WebChromeClient
import android.webkit.WebView
import android.webkit.WebViewClient
import androidx.appcompat.app.AppCompatActivity
import gerard.g.suarez.webap.databinding.ActivityMain2Binding

class MainActivity2 : AppCompatActivity() {

    private lateinit var binding: ActivityMain2Binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMain2Binding.inflate(layoutInflater)
        setContentView(binding.root)
        setContentView(R.layout.activity_main2)
//vista al diccionario web
        val myWebView: WebView = findViewById(R.id.myurl2)
        myWebView.webChromeClient=object : WebChromeClient(){
        //esto nos ayuda a que el webview tenga las funciones de un navegador y no abandone la app
        }
        myWebView.webViewClient= object : WebViewClient() {
        }
        //este codigo "activa" las funciones de java script
        val settings = myWebView.settings
        settings.javaScriptEnabled=true
        //este codigo es el que carga la pagina web en el webview
        myWebView.loadUrl("https://diccionariodedialecto.000webhostapp.com/")
        }
    }

   


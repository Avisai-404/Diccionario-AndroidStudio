package gerard.g.suarez.webap

import android.content.Intent
import android.os.Bundle
import android.webkit.WebChromeClient
import android.webkit.WebView
import android.webkit.WebViewClient
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main6.*

class MainActivity6 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main6)

        //vista a las lecciones
        //carga la pag web al webview
        val myWebView: WebView = findViewById(R.id.myurl7)
        myWebView.webChromeClient=object : WebChromeClient(){

        }
        myWebView.webViewClient= object : WebViewClient() {
        }
        //este codigo "activa" las funciones de java script
        val settings = myWebView.settings
        settings.javaScriptEnabled=true
        myWebView.loadUrl("https://diccionariodedialecto.000webhostapp.com/Ejercicios/Leccion3/index.html")

        buttona.setOnClickListener{
            val activity7 = Intent(this, MainActivity7::class.java)
            startActivity(activity7)
            finish();
        }
    }
}
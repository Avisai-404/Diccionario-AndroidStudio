package gerard.g.suarez.webap

import android.content.Intent
import android.os.Bundle
import android.webkit.WebChromeClient
import android.webkit.WebView
import android.webkit.WebViewClient
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main7.*

class MainActivity7 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main7)
        //vista a las lecciones
        //carga la pag web al webview
        val myWebView: WebView = findViewById(R.id.myurl8)
        myWebView.webChromeClient=object : WebChromeClient(){

        }
        myWebView.webViewClient= object : WebViewClient() {
        }
        //este codigo "activa" las funciones de java script
        val settings = myWebView.settings
        settings.javaScriptEnabled=true
        myWebView.loadUrl("https://diccionariodedialecto.000webhostapp.com/Ejercicios/Leccion4/index.html")
//nos manda a ala siguiente actividad
        buttonb.setOnClickListener{
            val activity8 = Intent(this, gerard.g.suarez.webap.MainActivity::class.java)
            startActivity(activity8)
            finish();
        }
    }
}
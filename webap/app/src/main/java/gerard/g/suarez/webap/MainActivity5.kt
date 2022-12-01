package gerard.g.suarez.webap

import android.content.Intent
import android.os.Bundle
import android.webkit.WebChromeClient
import android.webkit.WebView
import android.webkit.WebViewClient
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main5.*

class MainActivity5 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main5)

        //vista a la leccion 2
        val myWebView: WebView = findViewById(R.id.myurl6)
        myWebView.webChromeClient=object : WebChromeClient(){

        }
        myWebView.webViewClient= object : WebViewClient() {
        }
        //este codigo "activa" las funciones de java script
        val settings = myWebView.settings
        settings.javaScriptEnabled=true
        myWebView.loadUrl("https://diccionariodedialecto.000webhostapp.com/Ejercicios/Leccion2/index.html")

        button2.setOnClickListener{
            val activity6 = Intent(this, MainActivity6::class.java)
            startActivity(activity6)
            finish();
        }



    }
}
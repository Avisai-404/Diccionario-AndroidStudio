package gerard.g.suarez.webap

import android.content.Intent
import android.os.Bundle
import android.webkit.WebChromeClient
import android.webkit.WebView
import android.webkit.WebViewClient
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main4.*

class MainActivity4 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main4)
        //vista a las leccion 1

        val myWebView: WebView = findViewById(R.id.myurl4)
        myWebView.webChromeClient=object :WebChromeClient(){

        }
        myWebView.webViewClient= object : WebViewClient() {
        }
        val settings = myWebView.settings
        settings.javaScriptEnabled=true
        myWebView.loadUrl("https://diccionariodedialecto.000webhostapp.com/Ejercicios/Leccion1/index.html")

        button1.setOnClickListener{
            val activity5 = Intent(this, MainActivity5::class.java)
            startActivity(activity5)
            finish();
        }

    }
}
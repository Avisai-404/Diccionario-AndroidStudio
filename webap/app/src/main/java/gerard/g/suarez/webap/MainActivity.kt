package gerard.g.suarez.webap

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import gerard.g.suarez.webap.view.MainActivity
import kotlinx.android.synthetic.main.activity_main8.*

class MainActivity : AppCompatActivity() {
    @SuppressLint("SetJavaScriptEnabled")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main8)
    //diccionario
       boton1Act1.setOnClickListener{
    val activity2 = Intent(this, MainActivity2::class.java)
           startActivity(activity2)

       }
    //oraciones
        boton1Act2.setOnClickListener{
            val activity3 = Intent(this, MainActivity::class.java)
            startActivity(activity3)

        }

        //lecciones
        button3.setOnClickListener{
            val activity4 = Intent(this, MainActivity4::class.java)
            startActivity(activity4)
            finish(); //esta instruccion hace que la actividad finalize para que no se nos almacenen en la memoria
        }

    }
}
package toastkotlin.ejemplo.com.examplebuttononclicktoast

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val button:Button = findViewById(R.id.button) as Button
        button.setOnClickListener {
            Toast.makeText(this,"Hello Toast",Toast.LENGTH_SHORT).show()
        }
    }
}

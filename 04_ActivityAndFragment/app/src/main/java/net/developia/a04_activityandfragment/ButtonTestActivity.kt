package net.developia.a04_activityandfragment

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.Toast

class ButtonTestActivity : AppCompatActivity(), View.OnClickListener {
    lateinit var button1: Button
    lateinit var button2: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_button_test)

        button1 = findViewById<Button>(R.id.button1)
        button2 = findViewById<Button>(R.id.button2)
        button1.setOnClickListener(this)
        button2.setOnClickListener(this) // 여기서 정의되었다는 의미
//            button1.setOnClickListener {
//            Toast.makeText(applicationContext, "Button 1이 클릭됨", Toast.LENGTH_SHORT).show()
//        }
    }

    override fun onClick(v: View?) {
        Log.d("buttonClick", "clicked~!!")
        when (v?.id) {
            R.id.button1 -> {
                Toast.makeText(applicationContext, "Button 1이 클릭됨", Toast.LENGTH_SHORT).show()
            }
            R.id.button2 -> {
                Toast.makeText(applicationContext, "Button 2이 클릭됨", Toast.LENGTH_SHORT).show()
            }
        }
    }
}
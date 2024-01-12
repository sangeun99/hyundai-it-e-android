package net.developia.a04_activityandfragment

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        settingButton()
        Log.d("mylifecycle MAIN", "onCreate() 수행")
    }

    override fun onStart() {
        super.onStart()
        Log.d("mylifecycle MAIN", "onStart() 수행")
    }

    override fun onRestart() {
        super.onRestart()
        Log.d("mylifecycle MAIN", "onRestart() 수행")
    }

    override fun onResume() {
        super.onResume()
        Log.d("mylifecycle MAIN", "onResume() 수행")
    }

    override fun onPause() {
        super.onPause()
        Log.d("mylifecycle MAIN", "onPause() 수행")
    }

    override fun onStop() {
        super.onStop()
        Log.d("mylifecycle MAIN", "onStop() 수행")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("mylifecycle MAIN", "onDestroy() 수행")
    }

    private fun settingButton() {
        val button = findViewById<Button>(R.id.button)
        button.setOnClickListener {
            val intent = Intent(this, SubActivity::class.java)
            startActivity(intent)
        }

        val buttonExit = findViewById<Button>(R.id.button_exit)
        buttonExit.setOnClickListener {
            Toast.makeText(applicationContext, "앱이 종료됩니다.", Toast.LENGTH_SHORT).show()
            finishAffinity()
        }
    }
}
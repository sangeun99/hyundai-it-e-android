package net.developia.a04_activityandfragment

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.Toast

class SubActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sub)
        settingButton()
        Log.d("mylifecycle SUB", "onCreate() 수행")
    }

    override fun onStart() {
        super.onStart()
        Log.d("mylifecycle SUB", "onStart() 수행")
    }

    override fun onRestart() {
        super.onRestart()
        Log.d("mylifecycle SUB", "onRestart() 수행")
    }

    override fun onResume() {
        super.onResume()
        Log.d("mylifecycle SUB", "onResume() 수행")
    }

    override fun onPause() {
        super.onPause()
        Log.d("mylifecycle SUB", "onPause() 수행")
    }

    override fun onStop() {
        super.onStop()
        Log.d("mylifecycle SUB", "onStop() 수행")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("mylifecycle SUB", "onDestroy() 수행")
    }


    private fun settingButton() {
        val buttonClose = findViewById<Button>(R.id.buttonClose)
        buttonClose.setOnClickListener {
            finish()
        }

        val buttonExit = findViewById<Button>(R.id.buttonExit)
        buttonExit.setOnClickListener {
            Toast.makeText(applicationContext, "앱이 종료됩니다.", Toast.LENGTH_SHORT).show()
            finishAffinity()
        }
    }
}
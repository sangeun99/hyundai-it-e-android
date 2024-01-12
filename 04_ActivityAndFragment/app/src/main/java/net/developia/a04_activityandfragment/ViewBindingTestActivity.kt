package net.developia.a04_activityandfragment

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import net.developia.a04_activityandfragment.databinding.ActivityViewbindingTestBinding

class ViewBindingTestActivity : AppCompatActivity() {

    lateinit var binding: ActivityViewbindingTestBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_viewbinding_test)
        binding = ActivityViewbindingTestBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.button1.setOnClickListener {
            Log.d("view binding", "clicked~ button1")
            Toast.makeText(applicationContext, "clicked~ button1", Toast.LENGTH_SHORT).show()
        }

        binding.button2.setOnClickListener {
            Log.d("view binding", "clicked~ button2")
            Toast.makeText(applicationContext, "clicked~ button2", Toast.LENGTH_SHORT).show()
        }
    }
}
package com.example.recview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.recview.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        binding= ActivityMainBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        val adapter=Adapter(this, Items.values())
        binding.rv.adapter = adapter
    }
}
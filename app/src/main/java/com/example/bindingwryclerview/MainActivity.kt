package com.example.bindingwryclerview

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.bindingwryclerview.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    var binding: ActivityMainBinding? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
      //setContentView(R.layout.activity_main)  Using findViewById, old way

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding?.root) // Using binding, new way to use our MainActivity
        val adapter = MainAdapter(TaskList.taskList)
        binding?.taskRv?.adapter = adapter
    }

    override fun onDestroy() {
        super.onDestroy()
        binding = null
    }
}
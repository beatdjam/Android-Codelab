package com.beatdjam.androidfundamentals

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.beatdjam.androidfundamentals.databinding.ActivityUnit1Binding

class Unit1Activity : AppCompatActivity() {
    private lateinit var binding : ActivityUnit1Binding
    private var count : Int = 0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityUnit1Binding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.buttonCount.setOnClickListener{countUp()}
        binding.buttonToast.setOnClickListener{showToast()}
    }

    private fun showToast() =
            Toast.makeText(this, R.string.toast_message, Toast.LENGTH_SHORT).show()

    private fun countUp() {
        count++
        binding.showCount.text = count.toString()
    }
}
package com.mehmetfatihkose.kotlinogreniyorum2

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    
    private lateinit var tvCounter: TextView
    private lateinit var btnIncrement: Button
    private lateinit var btnDecrement: Button
    private lateinit var btnReset: Button
    
    private var counter = 0
    
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        
        // Window insets setup
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        
        // Initialize views
        initializeViews()
        
        // Setup click listeners
        setupClickListeners()
        
        // Update counter display
        updateCounterDisplay()
    }
    
    private fun initializeViews() {
        tvCounter = findViewById(R.id.tvCounter)
        btnIncrement = findViewById(R.id.btnIncrement)
        btnDecrement = findViewById(R.id.btnDecrement)
        btnReset = findViewById(R.id.btnReset)
    }
    
    private fun setupClickListeners() {
        btnIncrement.setOnClickListener {
            counter++
            updateCounterDisplay()
        }
        
        btnDecrement.setOnClickListener {
            counter--
            updateCounterDisplay()
        }
        
        btnReset.setOnClickListener {
            counter = 0
            updateCounterDisplay()
        }
    }
    
    private fun updateCounterDisplay() {
        tvCounter.text = counter.toString()
    }
}
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
    private lateinit var btnAuto: Button
    private var isAutoRunning = false
    private val handler = android.os.Handler()
    private val autoRunnable = object : Runnable {
        override fun run() {
            counter++
            updateCounterDisplay()
            handler.postDelayed(this, 1000)
        }
    }
    
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
        btnAuto = findViewById(R.id.btnAuto)
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

        btnAuto.setOnClickListener {
            if (isAutoRunning) {
                stopAutoCounter()
            } else {
                startAutoCounter()
            }
        }
    }
    
    private fun updateCounterDisplay() {
        tvCounter.text = counter.toString()
    }

    private fun startAutoCounter() {
        isAutoRunning = true
        btnAuto.text = "Durdur"
        handler.post(autoRunnable)
    }

    private fun stopAutoCounter() {
        isAutoRunning = false
        btnAuto.text = "Başlat"
        handler.removeCallbacks(autoRunnable)
    }

    override fun onDestroy() {
        super.onDestroy()
        handler.removeCallbacks(autoRunnable)
    }
}
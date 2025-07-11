package com.mehmetfatihkose.kotlinogreniyorum2

import android.animation.ObjectAnimator
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import android.os.Handler
import android.os.Looper
import androidx.appcompat.app.AppCompatDelegate

class MainActivity : AppCompatActivity() {
    private lateinit var tvCounter: TextView
    private lateinit var btnIncrement: Button
    private lateinit var btnDecrement: Button
    private lateinit var btnReset: Button
    private lateinit var btnAuto: Button
    private lateinit var btnThemeToggle: Button
    private var counter = 0
    private var isAutoRunning = false
    private val handler = Handler(Looper.getMainLooper())
    private val autoRunnable = object : Runnable {
        override fun run() {
            counter++
            updateCounterDisplay()
            animateIfNeeded()
            handler.postDelayed(this, 1000)
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        initializeViews()
        setupClickListeners()
        updateCounterDisplay()
    }

    private fun initializeViews() {
        tvCounter = findViewById(R.id.tvCounter)
        btnIncrement = findViewById(R.id.btnIncrement)
        btnDecrement = findViewById(R.id.btnDecrement)
        btnReset = findViewById(R.id.btnReset)
        btnAuto = findViewById(R.id.btnAuto)
        btnThemeToggle = findViewById(R.id.btnThemeToggle)
    }

    private fun setupClickListeners() {
        btnIncrement.setOnClickListener {
            counter++
            updateCounterDisplay()
            animateIfNeeded()
        }
        btnDecrement.setOnClickListener {
            counter--
            updateCounterDisplay()
            animateIfNeeded()
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
        btnThemeToggle.setOnClickListener {
            toggleTheme()
        }
        updateThemeButtonIcon()
    }

    private fun updateCounterDisplay() {
        tvCounter.text = counter.toString()
    }

    private fun animateIfNeeded() {
        if (counter >= 100) {
            val scaleUpX = ObjectAnimator.ofFloat(tvCounter, "scaleX", 1f, 1.3f, 1f)
            val scaleUpY = ObjectAnimator.ofFloat(tvCounter, "scaleY", 1f, 1.3f, 1f)
            scaleUpX.duration = 300
            scaleUpY.duration = 300
            scaleUpX.start()
            scaleUpY.start()
        }
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

    private fun toggleTheme() {
        val currentNightMode = resources.configuration.uiMode and android.content.res.Configuration.UI_MODE_NIGHT_MASK
        if (currentNightMode == android.content.res.Configuration.UI_MODE_NIGHT_YES) {
            AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO)
        } else {
            AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_YES)
        }
        // Buton ikonunu hemen güncelle (bazı cihazlarda anında değişmeyebilir)
        updateThemeButtonIcon()
    }
    private fun updateThemeButtonIcon() {
        val currentNightMode = resources.configuration.uiMode and android.content.res.Configuration.UI_MODE_NIGHT_MASK
        if (currentNightMode == android.content.res.Configuration.UI_MODE_NIGHT_YES) {
            btnThemeToggle.text = "☀️"
        } else {
            btnThemeToggle.text = "🌙"
        }
    }
}
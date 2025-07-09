package com.mehmetfatihkose.kotlinogreniyorum

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        println("merhaba dünya")
        println("merhaba dünya")
       // kotlin'de veri tipleri ve değişkenler

        // var sabit değişken tutamat değiştirile billir
        var x = 5
        println(x)

        x=25
        var y = 30
        println(x+y)

        //val sabit değer tutar değiştirilemez
//        val z = 50
//        z = 60      olursa ('val' cannot be reassigned.) hatası alınır doğrusu
        val z =50
        println(z)
        println(z+y) // z farkılı değer tamadığın sürece çalışır
    }
}

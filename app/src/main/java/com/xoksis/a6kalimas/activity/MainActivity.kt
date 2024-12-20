package com.xoksis.a6kalimas.activity

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.xoksis.a6kalimas.R
import com.xoksis.a6kalimas.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private val binding: ActivityMainBinding by lazy {
        ActivityMainBinding.inflate(layoutInflater)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(binding.root)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        binding.apply {

            cardViewFirstKalma.setOnClickListener {
                val intent = Intent(this@MainActivity, KalimaActivity::class.java)
                intent.putExtra("kalima", "first")
                startActivity(intent)
            }
            cardViewSecondKalma.setOnClickListener {
                val intent = Intent(this@MainActivity, KalimaActivity::class.java)
                intent.putExtra("kalima", "second")
                startActivity(intent)
            }
            cardViewThirdKalma.setOnClickListener {
                val intent = Intent(this@MainActivity, KalimaActivity::class.java)
                intent.putExtra("kalima", "third")
                startActivity(intent)
            }
            cardViewFourthKalma.setOnClickListener {
                val intent = Intent(this@MainActivity, KalimaActivity::class.java)
                intent.putExtra("kalima", "fourth")
                startActivity(intent)
            }
            cardViewFifthKalma.setOnClickListener {
                val intent = Intent(this@MainActivity, KalimaActivity::class.java)
                intent.putExtra("kalima", "fifth")
                startActivity(intent)
            }
            cardViewSixthKalma.setOnClickListener {
                val intent = Intent(this@MainActivity, KalimaActivity::class.java)
                intent.putExtra("kalima", "sixth")
                startActivity(intent)
            }
        }
    }
}
package com.example.ledcontrol

import android.os.Bundle
import android.widget.SeekBar
import android.widget.Toast
import com.google.android.material.bottomnavigation.BottomNavigationView
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.setupActionBarWithNavController
import androidx.navigation.ui.setupWithNavController
import com.example.ledcontrol.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val navView: BottomNavigationView = binding.navView
        val brightnessSeekBar = findViewById<SeekBar>(R.id.seekBar_brightness)

        brightnessSeekBar.setOnSeekBarChangeListener(object: SeekBar.OnSeekBarChangeListener{
            override fun onProgressChanged(p0: SeekBar?, p1: Int, p2: Boolean) {
//
            }

            override fun onStartTrackingTouch(p0: SeekBar?) {
//
            }

            override fun onStopTrackingTouch(p0: SeekBar?) {
                //Toast.makeText(applicationContext, "Selected value: ${p0?.progress?.times(10)}", Toast.LENGTH_SHORT).show()

            }

        })

        val navController = findNavController(R.id.nav_host_fragment_activity_main)
        // Passing each menu ID as a set of Ids because each
        // menu should be considered as top level destinations.
        val appBarConfiguration = AppBarConfiguration(setOf(
                R.id.navigation_solid, R.id.navigation_palette, R.id.navigation_rainbow))
        setupActionBarWithNavController(navController, appBarConfiguration)
        navView.setupWithNavController(navController)
    }
}
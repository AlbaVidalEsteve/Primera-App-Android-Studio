package com.albavidal.androidmaster

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.albavidal.androidmaster.firstapp.FirstAppActivity
import com.albavidal.androidmaster.imccalculator.ImcCalculatorActivity
import com.albavidal.androidmaster.settings.SettingsActivity
import com.albavidal.androidmaster.superheroapp.SuperHeroListActivity
import com.albavidal.androidmaster.todoapp.TodoActivity

class MenuActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu)
        val btnHelloApp = findViewById<Button>(R.id.btnHelloApp)
        btnHelloApp.setOnClickListener { navigateToHelloApp() }
        val btnIMCApp = findViewById<Button>(R.id.btnIMCApp)
        btnIMCApp.setOnClickListener { navigateToIMCApp() }
        val btnTODOApp = findViewById<Button>(R.id.btnTODOApp)
        btnTODOApp.setOnClickListener { navigateToTODOApp() }
        val btnSuperHeroApp = findViewById<Button>(R.id.btnSuperHeroApp)
        btnSuperHeroApp.setOnClickListener { navigateToSuperHeroApp() }
        val btnSettings = findViewById<Button>(R.id.btnSettings)
        btnSettings.setOnClickListener { navigateToSettings() }
    }

    private fun navigateToSettings() {
        val intent = Intent(this, SettingsActivity::class.java)
        startActivity(intent)
    }

    private fun navigateToSuperHeroApp() {
        val intent = Intent(this,SuperHeroListActivity::class.java)
        startActivity(intent)
    }

    private fun navigateToTODOApp() {
        val intent = Intent(this,TodoActivity::class.java)
        startActivity(intent)
    }

    private fun navigateToHelloApp() {
        val intent= Intent(this, FirstAppActivity::class.java)
        startActivity(intent)
    }
    private fun navigateToIMCApp() {
        val intent = Intent(this, ImcCalculatorActivity::class.java)
        startActivity(intent)
    }
}
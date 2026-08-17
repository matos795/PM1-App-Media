package com.example.appmedia

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {

    private lateinit var etNota1 : EditText
    private lateinit var etNota2 : EditText
    private lateinit var etFaltas : EditText
    private lateinit var btnCalcular : Button
    private lateinit var btnLimpar : Button
    private lateinit var btnSair : Button
    private lateinit var tvNotaFinal : TextView
    private lateinit var tvSituacao : TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        etNota1 = findViewById(R.id.etNota1)
        etNota2 = findViewById(R.id.etNota2)
        etFaltas = findViewById(R.id.etFaltas)

        btnCalcular = findViewById(R.id.btnCalcular)
        btnLimpar = findViewById(R.id.btnLimpar)
        btnSair = findViewById(R.id.btnSair)

        tvNotaFinal = findViewById(R.id.tvNotaFinal)
        tvSituacao = findViewById(R.id.tvSituacao)

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}
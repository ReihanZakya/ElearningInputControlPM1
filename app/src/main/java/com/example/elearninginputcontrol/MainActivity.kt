package com.example.elearninginputcontrol

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

//        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
//            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
//            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
//            insets
//        }

        val phoneNumber = findViewById<EditText>(R.id.phoneNumber)
        val buttonSubmit = findViewById<Button>(R.id.buttonSubmit)
        val name = findViewById<EditText>(R.id.name)

        buttonSubmit.setOnClickListener{
            val name = name.text.toString().trim()
            val phoneNumber = phoneNumber.text.toString().trim()


            if (name.isNotEmpty() && phoneNumber.isNotEmpty()){
                showToast("Terimakasih $name Sudah Mengisi Formulir")
                showToast("Nomor Telepon : $phoneNumber")
            }else{
                showToast("Isi Formulir!")
            }
        }
    }

    private fun showToast(s: String) {
        Toast.makeText(this,s, Toast.LENGTH_SHORT).show()
    }
}
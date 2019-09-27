package com.example.belajaraksarajawa

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_aksara_jawa.*
import kotlinx.android.synthetic.main.activity_pasangan.*
import kotlinx.android.synthetic.main.activity_pasangan.kmbl

class PasanganActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pasangan)
        cp.setOnClickListener{startActivity(Intent(this,PasanganCP::class.java))}
        kmbl.setOnClickListener{startActivity(Intent(this,PilihActivity::class.java))}
    }
}

package com.example.belajaraksarajawa

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_aksara_jawa.*

class PasanganCP : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pasangan_cp)
        kmbl.setOnClickListener{startActivity(Intent(this,PilihActivity::class.java))}
    }
}

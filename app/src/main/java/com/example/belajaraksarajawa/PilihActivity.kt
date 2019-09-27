package com.example.belajaraksarajawa

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_pilih.*

class PilihActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pilih)
        btnAJ.setOnClickListener{startActivity(Intent(this,AksaraJawaActivity::class.java))}
        btnS.setOnClickListener{startActivity(Intent(this,SandhanganActivity::class.java))}
        btnP.setOnClickListener{startActivity(Intent(this,PasanganActivity::class.java))}
    }
}

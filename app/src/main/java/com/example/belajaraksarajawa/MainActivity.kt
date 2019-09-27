package com.example.belajaraksarajawa

import android.app.Dialog
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.widget.Button
import androidx.appcompat.app.AlertDialog
import kotlinx.android.synthetic.main.activity_aksara_jawa.*
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_ha.view.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btnMulai.setOnClickListener{startActivity(Intent(this, PilihActivity::class.java))}
        btnSejarah.setOnClickListener{startActivity(Intent(this, SejarahActivity::class.java))}
        btnAbout.setOnClickListener{startActivity(Intent(this,AboutActivity::class.java))}
    }
}
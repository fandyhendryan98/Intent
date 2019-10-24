package com.example.intentfandy

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_output.*

class Activity_output : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_output)

        val bundle = intent.extras
        val nim = bundle?.get("Nim")
        val nama = bundle?.get("Nama")
        val nilai = bundle?.get("Nilai")
        val keterangan = bundle?.get("Keterangan")

        tv_nim.text = ("Nim : " + (nim))
        tv_nama.text = ("Nama : " + (nama))
        tv_nilai.text = ("Nilai : " + (nilai))
        tv_keterangan.text = ("Keterangan Nilai : " + (keterangan))

        btn_kembali.setOnClickListener(){
            intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }
    }
}

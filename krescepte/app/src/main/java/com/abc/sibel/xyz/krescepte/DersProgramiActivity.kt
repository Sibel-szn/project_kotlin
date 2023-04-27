package com.abc.sibel.xyz.krescepte

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.abc.sibel.xyz.krescepte.databinding.ActivityDersProgramiBinding
import com.abc.sibel.xyz.krescepte.databinding.ActivityYemekListesiBinding

class DersProgramiActivity : AppCompatActivity() {

    private lateinit var binding:ActivityDersProgramiBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDersProgramiBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.toolbarDersprogrami.title = "Ders Programı"
        setSupportActionBar(binding.toolbarDersprogrami)

    }
}
package com.abc.sibel.xyz.krescepte

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.abc.sibel.xyz.krescepte.databinding.ActivityAktivitelerBinding

class AktivitelerActivity : AppCompatActivity() {

    private lateinit var binding:ActivityAktivitelerBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityAktivitelerBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.toolbarAktiviteler.title = "Aktiviteler"
        setSupportActionBar(binding.toolbarAktiviteler)

    }
}
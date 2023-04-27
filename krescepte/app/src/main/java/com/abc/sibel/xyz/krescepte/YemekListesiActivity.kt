package com.abc.sibel.xyz.krescepte

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.abc.sibel.xyz.krescepte.databinding.ActivityYemekListesiBinding

class YemekListesiActivity : AppCompatActivity() {

    private lateinit var binding:ActivityYemekListesiBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityYemekListesiBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.toolbarYemekListesi.title = "Yemek Listesi"
        setSupportActionBar(binding.toolbarYemekListesi)

    }

}
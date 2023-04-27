package com.abc.sibel.xyz.krescepte

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.abc.sibel.xyz.krescepte.databinding.ActivityNotlarBinding

class NotlarActivity : AppCompatActivity() {

    private lateinit var binding:ActivityNotlarBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityNotlarBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.toolbarNotlar.title = "Notlar"
        setSupportActionBar(binding.toolbarNotlar)

    }
}
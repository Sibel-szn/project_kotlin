package com.abc.sibel.xyz.krescepte

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.abc.sibel.xyz.krescepte.databinding.ActivityCalismaPlaniBinding

class CalismaPlaniActivity : AppCompatActivity() {

    private lateinit var binding:ActivityCalismaPlaniBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityCalismaPlaniBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.toolbarCalismaplani.title = "Çalışma Planı"
        setSupportActionBar(binding.toolbarCalismaplani)
    }
}
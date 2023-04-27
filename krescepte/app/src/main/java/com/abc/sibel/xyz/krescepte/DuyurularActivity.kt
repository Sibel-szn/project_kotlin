package com.abc.sibel.xyz.krescepte

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.abc.sibel.xyz.krescepte.databinding.ActivityDuyurularBinding

class DuyurularActivity : AppCompatActivity() {

    private lateinit var binding:ActivityDuyurularBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDuyurularBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.toolbarDuyurular.title = "Duyurular"
        setSupportActionBar(binding.toolbarDuyurular)

    }
}
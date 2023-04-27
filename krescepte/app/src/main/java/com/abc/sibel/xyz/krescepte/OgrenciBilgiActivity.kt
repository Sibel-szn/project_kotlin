package com.abc.sibel.xyz.krescepte

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.abc.sibel.xyz.krescepte.databinding.ActivityOgrenciBilgiBinding

class OgrenciBilgiActivity : AppCompatActivity() {

    private lateinit var binding:ActivityOgrenciBilgiBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityOgrenciBilgiBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val ogr1 = 1
        val ogr2 = 2
        val ogr3 = 3
        val ogr4 = 4
        val ogr5 = 5


        val ogrNo = intent.getStringExtra("ogrNo")

        if (ogrNo == ogr1.toString()){
            binding.textViewOgrenciAdi.text = "Ayşe Yılmaz"
            binding.imageViewOgrenci.setImageResource(R.drawable.kiz_resim1)
        }
        else if(ogrNo == ogr2.toString()){
            binding.textViewOgrenciAdi.text = "Ahmet Orkun"
            binding.imageViewOgrenci.setImageResource(R.drawable.erkek_resim1)
        }else if(ogrNo == ogr3.toString()){
            binding.textViewOgrenciAdi.text = "Yasin Ünlü"
            binding.imageViewOgrenci.setImageResource(R.drawable.erkek_resim2)
        }else if(ogrNo == ogr4.toString()){
            binding.textViewOgrenciAdi.text = "Eda Çakır"
            binding.imageViewOgrenci.setImageResource(R.drawable.kiz_resim2)
        }else if(ogrNo == ogr5.toString()){
            binding.textViewOgrenciAdi.text = "Meltem Yalçın"
            binding.imageViewOgrenci.setImageResource(R.drawable.kiz_resim3)
        }


        binding.buttonDuyuru.setOnClickListener {
            val intent = Intent(this@OgrenciBilgiActivity,DuyurularActivity::class.java)
            startActivity(intent)
        }
        binding.buttonYemek.setOnClickListener {
            val intent = Intent(this@OgrenciBilgiActivity,YemekListesiActivity::class.java)
            startActivity(intent)
        }

        binding.buttonDersPrpgram.setOnClickListener {
            val intent = Intent(this@OgrenciBilgiActivity,DersProgramiActivity::class.java)
            startActivity(intent)
        }

        binding.buttonAktiviteler.setOnClickListener {
            val intent = Intent(this@OgrenciBilgiActivity,AktivitelerActivity::class.java)
            startActivity(intent)
        }

        binding.buttonCalismaPlani.setOnClickListener {
            val intent = Intent(this@OgrenciBilgiActivity,CalismaPlaniActivity::class.java)
            startActivity(intent)
        }

        binding.buttonDersNotu.setOnClickListener {
            val intent = Intent(this@OgrenciBilgiActivity,NotlarActivity::class.java)
            startActivity(intent)
        }


    }

}
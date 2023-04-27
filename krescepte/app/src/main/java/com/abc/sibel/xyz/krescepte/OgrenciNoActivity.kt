package com.abc.sibel.xyz.krescepte

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.abc.sibel.xyz.krescepte.databinding.ActivityOgrenciNoBinding

class OgrenciNoActivity : AppCompatActivity() {

    private lateinit var binding:ActivityOgrenciNoBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityOgrenciNoBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val ogr1 = 1
        val ogr2 = 2
        val ogr3 = 3
        val ogr4 = 4
        val ogr5 = 5


        binding.buttonGirisOgrNo.setOnClickListener {

            var ogrNo = binding.editTextOgrenciNo.text.toString().trim()

            if (ogrNo == ogr1.toString()){
                val intent = Intent(this@OgrenciNoActivity,OgrenciBilgiActivity::class.java)
                intent.putExtra("ogrNo",ogrNo)
                startActivity(intent)
            }
            else if (ogrNo == ogr2.toString()){
                val intent = Intent(this@OgrenciNoActivity,OgrenciBilgiActivity::class.java)
                intent.putExtra("ogrNo",ogrNo)
                startActivity(intent)
            }
            else if (ogrNo == ogr3.toString()){
                val intent = Intent(this@OgrenciNoActivity,OgrenciBilgiActivity::class.java)
                intent.putExtra("ogrNo",ogrNo)
                startActivity(intent)
            }
            else if (ogrNo == ogr4.toString()){
                val intent = Intent(this@OgrenciNoActivity,OgrenciBilgiActivity::class.java)
                intent.putExtra("ogrNo",ogrNo)
                startActivity(intent)
            }
            else if (ogrNo == ogr5.toString()){
                val intent = Intent(this@OgrenciNoActivity,OgrenciBilgiActivity::class.java)
                intent.putExtra("ogrNo",ogrNo)
                startActivity(intent)
            }
            else {
                Toast.makeText(applicationContext,"Lütfen kayıtlı bir öğrenci numarası girin",Toast.LENGTH_LONG).show()
            }



        }

    }
}
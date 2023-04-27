package com.abc.sibel.xyz.krescepte

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.abc.sibel.xyz.krescepte.databinding.ActivityMainBinding
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.auth.FirebaseAuthException
import com.google.firebase.auth.FirebaseAuthMultiFactorException
import com.google.firebase.auth.ktx.auth
import com.google.firebase.ktx.Firebase

class MainActivity : AppCompatActivity() {

    private lateinit var binding:ActivityMainBinding
    private lateinit var auth: FirebaseAuth

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        auth = Firebase.auth

        binding.buttonKayTOl.setOnClickListener {

            auth.createUserWithEmailAndPassword(binding.editTextKullaniciAdi.text.toString(),binding.editTextPassword.text.toString()).addOnSuccessListener {
                //kullanıcı oluşturuldu
                val intent = Intent(this@MainActivity,OgrenciNoActivity::class.java)
                startActivity(intent)
            }.addOnFailureListener {  exception ->
                //hata alınırsa
                Toast.makeText(applicationContext,exception.localizedMessage,Toast.LENGTH_LONG).show()
            }

        }

        binding.buttonGiris.setOnClickListener {

            auth.signInWithEmailAndPassword(binding.editTextKullaniciAdi.text.toString(),binding.editTextPassword.text.toString()).addOnSuccessListener {
                //başarılı
                val intent = Intent(this@MainActivity,OgrenciNoActivity::class.java)
                startActivity(intent)
            }.addOnFailureListener {
                //hata
                Toast.makeText(applicationContext,it.localizedMessage,Toast.LENGTH_LONG).show()
            }

        }

    }
}
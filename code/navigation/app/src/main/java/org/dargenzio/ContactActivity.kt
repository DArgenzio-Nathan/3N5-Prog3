package org.dargenzio

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import org.dargenzio.databinding.ActivityContactBinding
import org.dargenzio.databinding.ActivityMainBinding

class ContactActivity : AppCompatActivity() {
    private lateinit var binding : ActivityContactBinding;

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityContactBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)
        title ="Contact"

        binding.btnAccueil.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }
    }
}
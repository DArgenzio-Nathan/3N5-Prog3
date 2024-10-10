package org.dargenzio

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import org.dargenzio.databinding.ActivityAlbumDetailsBinding

class AlbumDetailsActivity : AppCompatActivity() {

    private lateinit var binding: ActivityAlbumDetailsBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityAlbumDetailsBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val albumName = intent.getStringExtra("albumName")
        val artisteName = intent.getStringExtra("artisteName")

        binding.tvname.text = albumName
        binding.tvArtiste.text = artisteName
    }
}
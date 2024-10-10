package org.dargenzio

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.DividerItemDecoration
import org.dargenzio.adapters.AlbumAdapter
import org.dargenzio.databinding.ActivityMainBinding
import org.dargenzio.models.Album

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private lateinit var adapter: AlbumAdapter // L'adapteur est accessible partout dans notre classe

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        setupRecycler()
        fillRecycler()
    }

    private fun setupRecycler() {
        adapter = AlbumAdapter() // Créer l'adapteur
        binding.rvAlbumAdapter.adapter = adapter
        binding.rvAlbumAdapter.setHasFixedSize(true)
        binding.rvAlbumAdapter.addItemDecoration(
            DividerItemDecoration(
                binding.rvAlbumAdapter.context, DividerItemDecoration.VERTICAL
            )
        )
    }

    private fun fillRecycler() {
        val items: MutableList<Album> = mutableListOf()
        items.add(Album(1,"Antigéographiquement", "Jérôme 50"))
        items.add(Album(2,"J'ai Bu", "Québec Redmeck Bluegrass Projct"))
        items.add(Album(3,"Comment Debord", "Comment Debord"))
        items.add(Album(4,"Darlène", "Hubert Lenoir"))
        items.add(Album(5,"La Nuit Est Une Panthère", "Les Louanges"))
        items.add(Album(6,"Jaune", "Jean-Pierre Ferland"))
        items.add(Album(7,"American Dream", "21 savage"))
        items.add(Album(8,"A Matter of Time", "Shed Seven"))

        adapter.submitList(items) // Pour changer le contenu de la liste, utiliser submitList de l'adapteur
    }

}

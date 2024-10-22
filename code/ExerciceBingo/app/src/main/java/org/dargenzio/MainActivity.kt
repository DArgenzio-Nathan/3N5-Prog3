package org.dargenzio

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.DividerItemDecoration
import org.dargenzio.adapters.TirageAdapter
import org.dargenzio.databinding.ActivityMainBinding
import org.dargenzio.models.Tirage

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private lateinit var adapter: TirageAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        setupRecycler()
        fillRecycler()
    }

    private fun setupRecycler() {
        adapter = TirageAdapter()
        binding.rvTirageAdapter.adapter = adapter
        binding.rvTirageAdapter.setHasFixedSize(true)
        binding.rvTirageAdapter.addItemDecoration(
            DividerItemDecoration(
                binding.rvTirageAdapter.context, DividerItemDecoration.VERTICAL
            )
        )
    }

    private fun fillRecycler() {
        val items: MutableList<Tirage> = mutableListOf()
        items.add(Tirage(1, 43, 'N'))
        items.add(Tirage(2, 6, 'B'))
        items.add(Tirage(3, 38, 'N'))
        items.add(Tirage(4, 18, 'I'))
        items.add(Tirage(5, 51, 'G'))
        items.add(Tirage(6, 14, 'B'))
        items.add(Tirage(7, 74, 'O'))
        items.add(Tirage(8, 18, 'I'))

        adapter.submitList(items)
    }
}
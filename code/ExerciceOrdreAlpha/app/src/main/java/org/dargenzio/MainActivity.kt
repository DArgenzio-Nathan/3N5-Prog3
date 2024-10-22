package org.dargenzio

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.DividerItemDecoration
import org.dargenzio.adapters.MonAdapter
import org.dargenzio.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private lateinit var adapter: MonAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        setupRecycler()
        fillRecycler()
    }

    private fun setupRecycler() {
        adapter = MonAdapter()
        binding.rvMonAdapter.adapter = adapter
        binding.rvMonAdapter.setHasFixedSize(true)
        binding.rvMonAdapter.addItemDecoration(
            DividerItemDecoration(
                binding.rvMonAdapter.context, DividerItemDecoration.VERTICAL
            )
        )
    }

    private fun fillRecycler(){
        val items: MutableList<String> = mutableListOf("Ringo", "Paul", "John", "George")
        items.shuffle()

        adapter.submitList(items)
    }
}
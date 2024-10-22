package org.dargenzio.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import org.dargenzio.databinding.MonItemBinding

class MonAdapter : ListAdapter<String, MonAdapter.MonItemViewHolder>(MonDiffCallback) {

    private var items: MutableList<String> = mutableListOf()

    inner class MonItemViewHolder(private val binding: MonItemBinding) : RecyclerView.ViewHolder(binding.root) {
        fun bind(item: String) {
            binding.tvprenom.text = item

            binding.btnMonter.setOnClickListener {
                moveItemUp(adapterPosition)
            }

            binding.btnDescendre.setOnClickListener {
                moveItemDown(adapterPosition)
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MonItemViewHolder {
        val binding: MonItemBinding = MonItemBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return MonItemViewHolder(binding)
    }

    override fun onBindViewHolder(holder: MonItemViewHolder, position: Int) {
        val item: String = getItem(position)
        holder.bind(item)
    }

    override fun submitList(list: MutableList<String>?) {
        super.submitList(list?.let { ArrayList(it) })
        items = list ?: mutableListOf()
    }

    private fun moveItemUp(position: Int) {
        if (position > 0) {
            val item = items.removeAt(position)
            items.add(position - 1, item)
            notifyItemMoved(position, position - 1)
        }
    }

    private fun moveItemDown(position: Int) {
        if (position < items.size - 1) {
            val item = items.removeAt(position)
            items.add(position + 1, item)
            notifyItemMoved(position, position + 1)
        }
    }

    object MonDiffCallback : DiffUtil.ItemCallback<String>() {
        override fun areItemsTheSame(oldItem: String, newItem: String): Boolean {
            return oldItem == newItem
        }

        override fun areContentsTheSame(oldItem: String, newItem: String): Boolean {
            return oldItem == newItem
        }
    }
}
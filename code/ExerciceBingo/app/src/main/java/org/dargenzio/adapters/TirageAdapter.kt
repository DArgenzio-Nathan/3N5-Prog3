package org.dargenzio.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import org.dargenzio.databinding.TirageItemBinding
import org.dargenzio.models.Tirage

class TirageAdapter : ListAdapter<Tirage, TirageAdapter.TirageItemViewHolder>(TirageDiffCallback) {

    inner class TirageItemViewHolder(private val binding: TirageItemBinding) : RecyclerView.ViewHolder(binding.root) {
        fun bind(tirage: Tirage) {
            binding.tvNoTirage.text = "Tirage #" + tirage.noTirage.toString()
            binding.NumTire.text = "Numéro tiré : " + tirage.numTire.toString()
            binding.tvLettre.text = tirage.Lettre.toString()
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TirageItemViewHolder {
        val binding: TirageItemBinding = TirageItemBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return TirageItemViewHolder(binding)
    }

    override fun onBindViewHolder(holder: TirageItemViewHolder, position: Int) {
        holder.bind(getItem(position))
    }

    object TirageDiffCallback : DiffUtil.ItemCallback<Tirage>() {
        override fun areItemsTheSame(oldItem: Tirage, newItem: Tirage): Boolean {
            return oldItem.noTirage == newItem.noTirage
        }

        override fun areContentsTheSame(oldItem: Tirage, newItem: Tirage): Boolean {
            return oldItem.numTire == newItem.numTire && oldItem.Lettre == newItem.Lettre
        }
    }


}
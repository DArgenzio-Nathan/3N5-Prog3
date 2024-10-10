package org.dargenzio.adapters

import android.content.Intent
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import org.dargenzio.AlbumDetailsActivity
import org.dargenzio.databinding.AlbumItemBinding
import org.dargenzio.models.Album

class AlbumAdapter : ListAdapter<Album, AlbumAdapter.AlbumViewHolder>(AlbumDiffCallback) {

    inner class AlbumViewHolder(private val binding: AlbumItemBinding) : RecyclerView.ViewHolder(binding.root) {
        fun bind(album: Album) {
            binding.tvname.text = album.name
            binding.tvArtiste.text = album.artisteName

            binding.root.setOnClickListener {
                val intent = Intent(binding.root.context, AlbumDetailsActivity::class.java)
                intent.putExtra("albumName", album.name)
                intent.putExtra("artisteName", album.artisteName)
                binding.root.context.startActivity(intent)
            }
            binding.btnSupprimer.setOnClickListener {
                removeAlbum(adapterPosition)
            }
        }
    }

    fun removeAlbum(position: Int) {
        val currentList = currentList.toMutableList()
        currentList.removeAt(position)
        submitList(currentList)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): AlbumViewHolder {
        val binding: AlbumItemBinding = AlbumItemBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return AlbumViewHolder(binding)
    }

    override fun onBindViewHolder(holder: AlbumViewHolder, position: Int) {
        holder.bind(getItem(position))
    }

}
object AlbumDiffCallback : DiffUtil.ItemCallback<Album>() {
    override fun areItemsTheSame(oldItem: Album, newItem: Album): Boolean {
        return oldItem.id == newItem.id
    }

    override fun areContentsTheSame(oldItem: Album, newItem: Album): Boolean {
        return oldItem.name == newItem.name && oldItem.artisteName == newItem.artisteName
    }
}
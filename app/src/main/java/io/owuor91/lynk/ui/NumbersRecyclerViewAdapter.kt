package io.owuor91.lynk.uiimport

import android.view.LayoutInflater

import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import io.owuor91.lynk.R
import kotlinx.android.extensions.LayoutContainer
import kotlinx.android.synthetic.main.number_list_item.view.tvNumberItem

class NumbersRecyclerViewAdapter() : RecyclerView.Adapter<NumbersRecyclerViewAdapter
.LongViewholder>() {
  var data: List<Long> = emptyList()
    set(newList) {
      field = newList
    }
  
  override fun getItemCount(): Int = data.size
  
  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): LongViewholder {
    return LongViewholder(
      LayoutInflater.from(parent.context)
        .inflate(R.layout.number_list_item, parent, false)
    )
  }
  
  override fun onBindViewHolder(holder: NumbersRecyclerViewAdapter.LongViewholder, position: Int) {
    holder.bind(data[position])
  }
  
  inner class LongViewholder(override val containerView: View) : RecyclerView.ViewHolder(containerView),
    LayoutContainer {
    fun bind(item: Long) = with(itemView) {
      tvNumberItem.text = item.toString()
    }
  }
}

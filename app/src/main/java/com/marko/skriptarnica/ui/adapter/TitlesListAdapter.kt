package com.marko.skriptarnica.ui.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.marko.skriptarnica.R
import com.marko.skriptarnica.common.TitlesClickedListener
import kotlinx.android.synthetic.main.item_university_data.view.*

class TitlesListAdapter(
    private val titlesClickedListener: TitlesClickedListener
): RecyclerView.Adapter<TitlesListHolder>() {

    private val dataList: MutableList<String> = mutableListOf()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TitlesListHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_university_data, parent, false)
        return TitlesListHolder(view)
    }

    override fun getItemCount(): Int = dataList.size

    override fun onBindViewHolder(holder: TitlesListHolder, position: Int) {
        holder.bindData(dataList[position], titlesClickedListener)
    }

    fun setData(data: List<String>) {
        this.dataList.clear()
        this.dataList.addAll(data)
        notifyDataSetChanged()
    }
}

class TitlesListHolder(itemView: View): RecyclerView.ViewHolder(itemView){
    fun bindData(data: String, titlesClickedListener: TitlesClickedListener){
        itemView.setOnClickListener { titlesClickedListener(data) }
        itemView.dataValue.text = data
    }
}
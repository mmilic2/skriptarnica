package com.marko.skriptarnica.ui.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.marko.skriptarnica.R
import com.marko.skriptarnica.common.DownloadClickedListener
import com.marko.skriptarnica.model.BackendTask
import kotlinx.android.synthetic.main.item_university_data.view.*

class DataListAdapter(
    private val downloadClickedListener: DownloadClickedListener
): RecyclerView.Adapter<DataListHolder>() {

    private val dataList: MutableList<BackendTask> = mutableListOf()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): DataListHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_university_data, parent, false)
        return DataListHolder(view)
    }

    override fun getItemCount(): Int = dataList.size

    override fun onBindViewHolder(holder: DataListHolder, position: Int) {
        holder.bindData(dataList[position], downloadClickedListener)
    }

    fun setData(data: List<BackendTask>) {
        this.dataList.clear()
        this.dataList.addAll(data)
        notifyDataSetChanged()
    }
}

class DataListHolder(itemView: View): RecyclerView.ViewHolder(itemView){
    fun bindData(data: BackendTask, downloadClickedListener: DownloadClickedListener){
        itemView.setOnClickListener{ downloadClickedListener(data.id) }
        itemView.dataValue.text = data.fileName
        itemView.commentValue.text = data.comment
    }
}
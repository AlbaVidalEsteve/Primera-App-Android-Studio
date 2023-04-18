package com.albavidal.androidmaster.todoapp

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.albavidal.androidmaster.R
// Un adaptador coge una lista del codigo y la adapta para que la pueda leer el recycler view (devuelve un recycler view)
class CategoriesAdapter(private val categories: List<TaskCategory>, private val onItempSelected:(Int) -> Unit) :
    RecyclerView.Adapter<CategoriesViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CategoriesViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_task_category,parent,false)
        return CategoriesViewHolder(view)
    }

    override fun getItemCount() = categories.size


    override fun onBindViewHolder(holder: CategoriesViewHolder, position: Int) {
        holder.render(categories[position], onItempSelected )

    }
}
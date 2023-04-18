package com.albavidal.androidmaster.todoapp

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.albavidal.androidmaster.R
// Un adaptador coge una lista del código y la adapta para que la pueda leer el recycler view (devuelve un recycler view)
class TasksAdapter(var tasks: List<Task>, private val onTaskSelected: (Int) -> Unit): RecyclerView.Adapter<TasksViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TasksViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_todo_task,parent,false)
        return TasksViewHolder(view)
    }

    override fun onBindViewHolder(holder: TasksViewHolder, position: Int) {
        holder.render(tasks[position])
        holder.itemView.setOnClickListener { onTaskSelected(position) }

    }

    override fun getItemCount() = tasks.size
    }

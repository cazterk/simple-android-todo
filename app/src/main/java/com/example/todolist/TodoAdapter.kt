package com.example.todolist

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView


class TodoAdapter (
    private val todos: MutableList<Todo>
    ): RecyclerView.Adapter<TodoAdapter.TodoViewHolder>(){

class TodoViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TodoViewHolder {
       return  TodoViewHolder(
           LayoutInflater.from(parent.context).inflate(
               R.layout.item_todo,
               parent,
               false
           )
       )
    }

    override fun onBindViewHolder(holder: TodoViewHolder, position: Int) {
        val currentTodo= todos[position]
//        holder.title.text = data[position].title

    }

    override fun getItemCount(): Int {
        return todos.size
    }
}
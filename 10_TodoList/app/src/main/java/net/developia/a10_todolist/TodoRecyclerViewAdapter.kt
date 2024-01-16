package net.developia.a10_todolist

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import net.developia.a10_todolist.databinding.ItemTodoBinding
import net.developia.a10_todolist.db.ToDoEntity

class TodoRecyclerViewAdapter(private val todoList: ArrayList<ToDoEntity>,
    private val listner: OnItemLongClickListener)
: RecyclerView.Adapter<TodoRecyclerViewAdapter.MyViewHolder>() {

    inner class MyViewHolder(binding: ItemTodoBinding):
    RecyclerView.ViewHolder(binding.root) {
        val tv_importance = binding.tvImportance
        val tv_title = binding.tvTitle

        val root = binding.root
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val binding: ItemTodoBinding =
            ItemTodoBinding.inflate(LayoutInflater.from(parent.context),
                parent, false)
        return MyViewHolder(binding)
    }

    override fun getItemCount(): Int {
        return todoList.size
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        val todoData = todoList[position]
        when (todoData.importance) {
            1 -> {
                holder.tv_importance.setBackgroundResource(R.color.red)
            }
            2 -> {
                holder.tv_importance.setBackgroundResource(R.color.yellow)
            }
            3 -> {
                holder.tv_importance.setBackgroundResource(R.color.green)
            }
        }
        holder.tv_importance.text = todoData.importance.toString()
        holder.tv_title.text = todoData.title

        holder.root.setOnClickListener{
            listner.onLongClick(position)
            false
        }
    }
}
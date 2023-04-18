package com.albavidal.androidmaster.todoapp

import android.app.Dialog
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.RadioButton
import android.widget.RadioGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.albavidal.androidmaster.R
import com.albavidal.androidmaster.todoapp.TaskCategory.*
import com.google.android.material.floatingactionbutton.FloatingActionButton

class TodoActivity : AppCompatActivity() {

    private val categories = listOf(
        Business,
        Other,
        Personal
    )

    private val tasks = mutableListOf(
        Task("PruevaBusiness", Business),
        Task("PruevaPersonal", Personal),
        Task("PruevaOther", Other)
    )
    private lateinit var rvCategories: RecyclerView
    private lateinit var categoriesAdapter: CategoriesAdapter

    private lateinit var rvTasks:RecyclerView
    private lateinit var tasksAdapter: TasksAdapter

    private lateinit var fabAddTask:FloatingActionButton


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_todo)
       initComponent()
        initUI()
        initListeners()

    }

    private fun initListeners() {
        fabAddTask.setOnClickListener { showDialog() }
    }

    private fun showDialog() {
        val dialog = Dialog(this)
        dialog.setContentView(R.layout.dialog_task)// enganchamos xml

        val btnAddTask: Button = dialog.findViewById(R.id.btnAddTask)// poner dialog para que no se muestre por defecto en la principal
        val etTask: EditText = dialog.findViewById(R.id.etTask)
        val rgCategories: RadioGroup = dialog.findViewById(R.id.rgCategories)

        btnAddTask.setOnClickListener {
            val currentTask = etTask.text.toString()
            if(currentTask.isNotEmpty()) {
                val selectedId =
                    rgCategories.checkedRadioButtonId //Creamos variable que nos da el ID SELECCIONADO
                val selectedRadioButton: RadioButton =
                    rgCategories.findViewById(selectedId) //Creamos variable que nos da el BOTON SELECCIONADO
                val currentCategory: TaskCategory =
                    when (selectedRadioButton.text) { // Creamos variable que nos da la CATEGORIA SELECCIONADA
                        getString(R.string.todo_dialog_category_business) -> Business
                        getString(R.string.todo_dialog_category_personal) -> Personal
                        else -> Other

                    }
                tasks.add(Task(currentTask, currentCategory)) //añada una Task a la lista de tasks
                updateTasks()
                dialog.hide()
            }

        }

        dialog.show()
    }

    private fun initComponent() {
        rvCategories = findViewById(R.id.rvCategories)
        rvTasks = findViewById(R.id.rvTasks)
        fabAddTask = findViewById(R.id.fabAddTask)
    }

    private fun initUI() {
        categoriesAdapter = CategoriesAdapter(categories) {position -> updateCategories(position)}
        rvCategories.layoutManager =LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL,false)
        rvCategories.adapter = categoriesAdapter

        tasksAdapter = TasksAdapter(tasks) { position -> onItemSelected(position) }
        rvTasks.layoutManager = LinearLayoutManager(this)
        rvTasks.adapter = tasksAdapter

    }

    private fun onItemSelected(position:Int) {
        tasks[position].isSelected = !tasks[position].isSelected
        updateTasks()
    }

    private fun updateCategories(position:Int){
        categories[position].isSelected = !categories[position].isSelected
        categoriesAdapter.notifyItemChanged(position)
        updateTasks()
    }

    private fun updateTasks(){
        /*
       Qué hace:
       Informa al adaptador de que hay una nueva Task en la lista de tasks para
       que actualice las tasks el recycler view
       tasksAdapter.notifyDataSetChanged() // -> se puede hacer asi pero no es el óptimo (comprueba uno a uno todos los items)
       tasksAdapter.notifyItemInserted()
       tasksAdapter.notifyItemRemoved()
         */
        val selectedCategories: List<TaskCategory> = categories.filter{it.isSelected}
        val newTask= tasks.filter { selectedCategories.contains(it.category) }
        tasksAdapter.tasks = newTask
        tasksAdapter.notifyDataSetChanged()




    }
}
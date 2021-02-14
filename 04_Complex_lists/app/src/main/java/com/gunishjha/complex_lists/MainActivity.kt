package com.gunishjha.complex_lists

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.BaseAdapter
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.list_item_course.view.*
import java.util.*

class MainActivity : AppCompatActivity() {
    private val courses = listOf<Course>(
            Course("Android","Avinash",5,52000),
            Course("ReactJS","Avinash",51,5000),
            Course("Angular","Pratibha",15,5000),
            Course("Scala","Pratibha",53,25000),
            Course("python","Ajay",5,52000),
            Course("java","Ajay",51,5000),
            Course("c++","Praveen",15,5000),
            Course("SQL","Praveen",53,25000)
    )
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)



        ListCourses.adapter = object : BaseAdapter() {
            override fun getCount() = courses.size
            override fun getItem(position: Int): Course = courses[position]

            override fun getItemId(position: Int): Long = getItem(position).hashCode().toLong()

            override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
                val itemView = layoutInflater.inflate(R.layout.list_item_course, parent, false)
                val course = getItem(position)
                itemView.tvCourseName.text = course.name
                itemView.tvTeacherName.text = course.teacher
                itemView.tvCourseDetails.text = "Lectures ${course.lectures} | Fees: INR ${course.fees}"
                return itemView
            }

        }

        ListCourses.setOnItemClickListener { _, _, position, _ ->
            Toast.makeText(this,"clicked on ${courses[position]}", Toast.LENGTH_SHORT).show()
        }
    }
}
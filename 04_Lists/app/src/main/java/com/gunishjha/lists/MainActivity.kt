package com.gunishjha.lists

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    private val courses = listOf(
        "android","kotlin", "NodeJS", "Django", "Competitive Programming",
        "Dynamic Programming", "Java", "C++", "React", "Vue JS", "Machine Learning",
        "Neural Networks", "Deep Learning", "Web Devlopment", "Redux", "AWS", "GCP",
        "Azure"
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        ListCourses.adapter = ArrayAdapter<String>(
            this,
            android.R.layout.simple_list_item_1,
            android.R.id.text1,
            courses
            )
        ListCourses.setOnItemClickListener { _, _, position, _ ->
            Toast.makeText(this,"clicked on ${courses[position]}", Toast.LENGTH_SHORT).show()
        }
    }
}
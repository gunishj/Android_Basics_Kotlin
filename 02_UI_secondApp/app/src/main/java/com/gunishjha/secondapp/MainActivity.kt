package com.gunishjha.secondapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import kotlinx.android.synthetic.main.activity_main.*
import java.lang.NumberFormatException

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnAdd.setOnClickListener{
            val var1:Int
            val var2:Int

            try {
            var1=etVar1.text.toString().toInt()
            var2=etVar2.text.toString().toInt()
            } catch (e: NumberFormatException)
            {
                AlertDialog.Builder(this)
                    .setTitle("Invalid Operation")
                    .setMessage("Please enter both number to calculate")
                    .setPositiveButton("OK"){dialog, _ -> dialog.dismiss() }
                    .setCancelable(false)
                    .show()

                return@setOnClickListener
            }
//            val var1 = try {etVar1.text.toString().toInt() } catch ( e: NumberFormatException) {0}
//            val var2 = try {etVar2.text.toString().toInt() } catch (e:NumberFormatException) {0}

            val result = (var1+var2).toString()
            tvResult.text = result
            Toast.makeText(this, "add button was clicked", Toast.LENGTH_SHORT).show()
        }
    }
}
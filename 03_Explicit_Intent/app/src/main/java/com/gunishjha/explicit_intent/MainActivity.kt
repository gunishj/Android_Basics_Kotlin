package com.gunishjha.explicit_intent

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnDial.setOnClickListener{
            val phNo: String = etPhNo.text.toString()
            val intent = Intent(Intent.ACTION_DIAL, Uri.parse("tel:$phNo" ) )
            startActivity(intent)
        }

        btnBrowse.setOnClickListener {
            val url:String = etUrl.text.toString()
            if(url.isEmpty()){
//                dialog to tell user to enter url
            } else if (!url.startsWith("http")){
                //either prefix http:// or ask user to enter full URL
            }
            val intent = Intent(Intent.ACTION_VIEW, Uri.parse(url))
            startActivity(intent)

        }

    }
}
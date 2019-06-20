package com.srlo.androidsamplelibrary

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btn_success.setOnClickListener{
            Toast.makeText(this,"Success toast",Toast.LENGTH_LONG).show()
        }
        btn_fail.setOnClickListener{
            Toast.makeText(this,"Fail toast",Toast.LENGTH_LONG).show()
        }
    }

}

package com.example.travailafairepopupmenu

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import android.widget.Button
import android.widget.PopupMenu
import android.widget.Toast
import androidx.constraintlayout.widget.ConstraintLayout

class MainActivity : AppCompatActivity() {
    lateinit var btn : Button
    lateinit var layout : ConstraintLayout
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        layout = findViewById(R.id.layout)
        btn = findViewById(R.id.btn)
        btn.setOnClickListener {
            ShowPopUpMenu()
        }
    }

    private fun ShowPopUpMenu(){
     val  popup = PopupMenu(this,btn).apply {
         menuInflater.inflate(R.menu.popupmenu, menu) }
            popup.setOnMenuItemClickListener(PopupMenu.OnMenuItemClickListener { item: MenuItem? ->
                when (item!!.itemId) {
                    R.id.red -> {
                        Toast.makeText(this, "Color Red Selected", Toast.LENGTH_SHORT).show()
                        layout.setBackgroundColor(Color.RED)
                    }
                    R.id.bleu -> {
                        Toast.makeText(this, "Color Blue Selected", Toast.LENGTH_SHORT).show()
                        layout.setBackgroundColor(Color.BLUE)
                    }
                }
                true
            })
            popup.show()
        }
    }



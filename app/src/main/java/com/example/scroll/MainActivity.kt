package com.example.scroll

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Html
import android.view.View
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.scroll.MainActivity2

class MainActivity : AppCompatActivity() {
    lateinit var contacts: ArrayList<Contact>


    lateinit var re : String
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Lookup the recyclerview in activity layout
        val rvContacts = findViewById<View>(R.id.recyclerView) as RecyclerView
        // Initialize contacts
        contacts = Contact.createContactsList(20)
        // Create adapter passing in the sample user data
        val adapter = ContactsAdapter(contacts)
        // Attach the adapter to the recyclerview to populate items
        rvContacts.adapter = adapter
        // Set layout manager to position the items
        rvContacts.layoutManager = LinearLayoutManager(this)
        // That's all!

    }

    public fun intenti(){
        val i = Intent(this@MainActivity, MainActivity2::class.java)
        startActivity(i)
    }




    }

package com.example.scroll

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.scroll.MainActivity2


class ContactsAdapter(private val mContacts: List<Contact>) : RecyclerView.Adapter<ContactsAdapter.ViewHolder>()
{

        val mActivity = MainActivity()

        // Provide a direct reference to each of the views within a data item
        // Used to cache the views within the item layout for fast access
        inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
                // Your holder should contain and initialize a member variable
                // for any view that will be set as you render a row
                val nameTextView = itemView.findViewById<TextView>(R.id.contact_name)
                val nameTextView1 = itemView.findViewById<TextView>(R.id.contact_surname)
                val nameTextView2 = itemView.findViewById<TextView>(R.id.contact_email)

                val messageButton = itemView.findViewById<Button>(R.id.message_button)
        }

        // ... constructor and member variables
        // Usually involves inflating a layout from XML and returning the holder
        override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ContactsAdapter.ViewHolder {
                val context = parent.context
                val inflater = LayoutInflater.from(context)
                // Inflate the custom layout
                val contactView = inflater.inflate(R.layout.singlelay, parent, false)
                // Return a new holder instance
                return ViewHolder(contactView)
        }

        // Involves populating data into the item through holder
        override fun onBindViewHolder(viewHolder: ContactsAdapter.ViewHolder, position: Int) {
                // Get the data model based on position
                val contact: Contact = mContacts.get(position)
                // Set item views based on your views and data model
                val textView = viewHolder.nameTextView
                textView.setText(contact.name)
                val button = viewHolder.messageButton
                button.text =  "update"

                button.setOnClickListener {
                        val intent = Intent(it.getContext(), MainActivity2::class.java)
                        it.context.startActivity(intent)

                       }


                val textView1= viewHolder.nameTextView1
                textView1.setText(contact.surname)

                val textView2= viewHolder.nameTextView2
                textView2.setText(contact.emaili)

        }

        // Returns the total count of items in the list
        override fun getItemCount(): Int {
                return mContacts.size
        }
}
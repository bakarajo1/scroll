package com.example.scroll


class Contact(val name: String,val surname: String,val emaili: String ) {

    companion object {
        private var lastContactId = 0
        fun createContactsList(numContacts: Int): ArrayList<Contact> {
            val contacts = ArrayList<Contact>()
            for (i in 1..numContacts) {
                contacts.add(Contact("name " + ++lastContactId, "surname " + lastContactId,"emaili " + lastContactId))
            }
            return contacts
        }
    }
}
package com.example.database_projek.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.database_projek.data.entity.User
import com.example.database_projek.R

class UserAdapter(var list: List<User>) : RecyclerView.Adapter<UserAdapter.ViewHolder>() {

    class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        var fullName : TextView
        var email : TextView
        var password : TextView
        init {
            fullName = view.findViewById(R.id.full_name)
            email = view.findViewById(R.id.email)
            password = view.findViewById(R.id.password)
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.row_user, parent, false)
        return ViewHolder(view)
    }

    override fun getItemCount(): Int {
        return list.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.fullName.text = list[position].fullName
        holder.email.text = list[position].email
        holder.password.text = list[position].password
    }
}
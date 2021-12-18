package com.example.a19447201_nguyenanhtoan_ad_todoapp

interface UpdateAndDelete{
    fun modifyItem(itemUID : String , isDone : Boolean)
    fun onItemDelete(itemUID : String)
    fun editTask(itemUID: String, isDone : Boolean)
}
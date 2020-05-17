package com.yanzhikai.yrecyclerviewdemo

object Test {

    fun run(){
        val a: String? = "2"
        val b = a?.apply {
            println(this)
            3
        }

        println(b)
    }
}
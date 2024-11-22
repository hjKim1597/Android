package com.example.kotlinbasic.day04

abstract class Anonymous {
    abstract fun example()
}

interface IAnonymous {
    fun example()
}

fun main() {
    // 익명객체로 생성할 때 object : 객체 {}
    val a = object : Anonymous() {
        override fun example() {
        }
    }

    val b = object : IAnonymous {
        override fun example() {
        }

    }


}
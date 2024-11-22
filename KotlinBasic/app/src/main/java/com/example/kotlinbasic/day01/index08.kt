package com.example.kotlinbasic.day01

fun main () {
    func1(1, "이순신")
    func1()
    func1(b = "홍길자")
    func1(a = 10)
    func1(b = "홍길자", a = 200)
}

// 매개변수의 기본값
fun func1(a : Int = 100, b : String = "홍길동") {
    println("$a, $b")
}
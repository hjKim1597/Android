package com.example.kotlinbasic.day02

class ConstructEx02 {

    var name : String? = null
    var age : Int? = null

    constructor(name : String, age : Int) {
        this.name = name
        this.age = age
    }
    constructor(name : String) : this(name, 1) {
        // this(name, 1) 가 코틀린에는 없음
        // this.name = name
        // this.age = 1
    }
}

fun main() {
    
    var a = ConstructEx02("홍길동")
    println("${a.name}, ${a.age}")
}

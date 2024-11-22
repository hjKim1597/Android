package com.example.kotlinbasic.day01

fun main() {
    val num = 10 // 불변 변수
//    num = 20

    var a = 10 // 변경이 가능한 변수
    var b = 20 
    
    a = 100
    
    //변수의 타입
    var a1 : Int = 10
    var a2 : String = "홍길동"
    var a3 : Long = 10L
    var a4 : Double = 3.14
    var a5 : Boolean = true
    var a6 : Any = "숫자나 문자 아무거나 넣을 수 있습니다"
    
    // a1 = "홍길동" // err

    var x = "홍길동" // String 타입으로 자동 타입 추론이 들어갑니다

    // 출력문
    println(a2 + "님의 나이는" + a1 + "입니다")
    println("$a2 님의 나이는 ${a1}입니다")
}
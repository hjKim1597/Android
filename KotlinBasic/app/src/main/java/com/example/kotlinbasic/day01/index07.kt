package com.example.kotlinbasic.day01

fun main () {

}

//함수
fun func() {
    println("func실행됨")
}

// : 반환유형
fun func2() : Int {
    return 100
}

//매개변수 - 코틀린에서 매개변수는 val 타입이 됩니다
fun func3 (a : Int, b : String) : Unit {
    // a = 100 // err
}

//메서드의 향상된 표현식 - 실행시킬 코드가 한줄이면 {} 생략하고 = 으로 나타낼 수 있음
fun func4(a : Int) = println("매개변수는 $a 입니다")


//fun func5(a : Int, b : Int) : Int {
//
//    return if(a > b) {
//        a
//    } else {
//        b
//    }
//
//}

fun func6 (a : Int, b : Int) : Int = if(a > b) a else b
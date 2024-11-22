package com.example.kotlinbasic.day01

fun main() {
    
    // 자바 null pointer exception은 런타임 시에 발생됨
    // 코틀린에서는 null safety 컴파일 시점에 에러를 잡을 수 있도록 도와 주는 구문
    
    //? -> null일수도 있음을 나타냄
    var a : String? = null
    var name : String? = "hong"

    // ?. -> null이 아니면 실행해라
    println(name?.uppercase() )

    //?: 대체값 -> null 인 경우에 대체값으로 바꿔라 , 그리고 우선순위 지정 위해 ()도 사용
    var age : Int? = null
    var result = age ?: 0
    println(result)


    // !! -> 내가 null값이 아닌 것을 보장한다 / 에러발생하면 안드로이드에서는 앱이 종료됨 그래서 사용
    var k : String? = "null일 수도 있는 값"
    var result2 = k!!.uppercase()
    
    // let{} -> null이 아니면 실행해라
    var data : String? = null
    
    // if (data != null) { //사용가능함
    // }
    
    data?.let{
        println(it)
        println(it + "은 null이 아닙니다")
    }

//    if else 같은 구문
    data?.let {
        println("null이 아니면 실행해라")
        println()
    }  ?: run {
        println("null이면 이거 실행해라")
    }
    
}
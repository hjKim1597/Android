package com.example.kotlinbasic.day04

import android.view.View

// 최상위 함수 -> 클래스 바깥에 함수나 변수의 정의가 가능함
//fun some(a : Int) {
//    println(a)
//}

//익명함수
//var some = fun(a : Int) {
//    println(a)
//}

//람다식 = {매개변수: 타입 -> 실행문}
//var some = {a: Int ->
//    println(a)
//}

//한줄코드로 작성하면 자동으로 리턴하게 됩니다
//var some = { a: Int -> a * 10 }

//람다식 안에서 마지막에 쓰이는 값은 리턴으로 표현됩니다
var some = { a: Int ->
    println(a)
    a * 10
}

//타입추론
//변수명 : 람다타입 = {람다식}
var some2: (Int) -> Int = { a ->
    a * 10
}

//it 키워드 사용 - 람다의 매개변수가 하나일 떄는 -> 를 지우고 it키워드로 값을 참조할 수 있음
var some3: (Int) -> Int = {
    it * 10
}


fun main() {
    println(some(10))
    println(some2(10))
    println(some3(10))

    // 람다식은 이런식으로 쓰임
    var func = { v: View ->
        print(v)
    }

    View.OnClickListener(func)

    // 위 코드를 줄여서 2nd
    View.OnClickListener({ v: View ->
        print(v)
    })

    // 마지막 매개변수가 1개이고 람다식이라면, ()를 생략하고 밖으로 뺄 수 있음
    View.OnClickListener {
        println(it)
    }

    //매개변수에서 람다식
    example({ a: Int -> true })
    example { a: Int ->
        true
    }

}

// 매개변수로 함수를 받을 때는
fun example(a: (Int) -> Boolean) {
    var bool = a(10)
}



















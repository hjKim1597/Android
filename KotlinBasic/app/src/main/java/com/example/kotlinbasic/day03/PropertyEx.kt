package com.example.kotlinbasic.day03.property

// getter, setter를 자동으로 생성합니다.
class Person {
    var id: Int = 0
        //getter 메서드 오버라이드
        get() {
            println("getter메서드 호출")
            return field ?: 10
        }

    var name: String? = null
        //setter메서드 오버라이드
        //set(value) = if (name != null) field = "홍길동" else field = "이순신"
        set(value) {
            println("setter 메서드 실행됨")
            if (value != null) {
                field = "홍길동"
            } else {
                field = "이순신"
            }
        }

    var addr: String = "서울시"
        get() = field
        set(value) {
            field = value
        }
}

fun main() {

    var p = Person()
    println(p.id) //getter 메서드를 사용하는 문법
    p.name = "홍길동" // setter 메서드를 사용하는 문법 

}
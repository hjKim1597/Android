package com.example.kotlinbasic.day03.inter

interface InterfaceEx {

    // 추상변수, 추상메서드, 일반메서드
    var data: String

    fun some() //abstract를 생략해도 자동으로 추상이 됨

    fun some2() {

    }
}

interface InterfaceEx02 {}

class Person : InterfaceEx, InterfaceEx02 { // 인터페이스 상속할 때는 ()가 없음
    override var data: String = "홍길동"
    override fun some() {
        //...........
    }
}

fun main() {
    val p = Person()
    
    // 자식이 부모타입에 저장될 수 있음
    val a: InterfaceEx = p
    
    // 클래스 캐스팅 (형변환)
    val b : Person = a as Person
}

package com.example.kotlinbasic.day01

fun main() {
    // 형변환
    var a : Int = 10
    var y = 3.14

    // var k : Double = a // 자바에서는 가능한 자동형변환이 안됨 (스마트 캐스팅 불가)

    // 형변환을 진행할 때는 toInt, toDouble, toString, toBoolean.. 등등

    var a1 : Double = a.toDouble()
    var a2 : String = a.toString()
    var a3 : Float = a.toFloat()
    var a4 : Int = y.toInt()
    var a5 : Boolean = "true".toBoolean()

}
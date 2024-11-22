package com.example.kotlinbasic.day03

// 문제: nullable 타입의 문자열 `name`을 선언하세요.
// - name 변수가 null이 아닐 때만, "Hello, {name}"을 출력하세요.
// - name 변수가 null이면 아무 출력도 하지 마세요.
// - let 함수를 사용하여 이 문제를 해결하세요.

fun main() {
    var name : String? = "Alice"
    if (name != null) {
        println("Hello, $name ")
    } else {

    }
}
package com.example.kotlinbasic.day03

// 문제: 두 개의 정수 `a`와 `b`가 주어졌을 때, 더 큰 값을 반환하는 함수를 작성하세요.
// 조건:
// - 함수 이름은 `maxNumber`로 하세요.
// - 함수는 두 개의 정수를 입력받고, 더 큰 값을 반환합니다.
// - `if-else` 문을 사용하세요.

fun main() {
    val a = 10
    val b = 20

    // maxNumber 함수 호출 후 결과를 출력하세요.
    val result = maxNumber(a, b)
    println("The larger number is: $result")

}

fun  maxNumber(a: Int, b: Int):Int {

    var c = if (a>b) {
        a
    } else {
        b
    }

    return c

    // 여기에 if-else 문을 사용하여 더 큰 값을 반환하세요.
}
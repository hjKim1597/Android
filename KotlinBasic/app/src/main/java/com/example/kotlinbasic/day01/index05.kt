package com.example.kotlinbasic.day01

fun main() {

    // 1...10 - 10이하
    // until - 미만
    // step - 점핑
    // downTo - 감소

    for(i in 1 .. 10) {
        print("$i ")
    }
    println()

    for(i in 1 until 10) {
        print("$i ")
    }

    println()

    for(i in 1 .. 10 step 2) {
        print("$i ")
    }

    println()

    for (i in 10 downTo 1 step 3) {
        print("$i ")
    }

    println()

    // 배열을 반복으로
    val arr = arrayOf<Int>(1,2,3,4,5,6,7,8,9,10)

    for (i in arr) {
        print("$i ")
    }

    println()

    // 문자열을 반복으로
    for (i in "hello") {
        print("$i ")
    }

    println()

    // 배열의 인덱스도 얻고 싶다면
    for( (i, v) in arr.withIndex() ) {
        print(" ($i,$v) ")
    }






}
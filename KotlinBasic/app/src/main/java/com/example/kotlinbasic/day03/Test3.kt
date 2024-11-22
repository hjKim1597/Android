package com.example.kotlinbasic.day03

//val words = listOf("apple", "cat", "banana", "dog")
//각 문자열을 반복하여 출력한다.
//문자열의 길이가 4글자 이상이면 대문자로 변환한 후 출력한다.

fun main() {

    val words = listOf("apple", "cat", "banana", "dog")

    for (i in words) {

        if (i.length >= 4) {
            print("${i.uppercase()} ")
        } else {
            print("$i ")
        }


    }
}
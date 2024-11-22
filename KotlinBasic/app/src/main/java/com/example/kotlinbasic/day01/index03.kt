package com.example.kotlinbasic.day01

import java.util.Arrays

fun main() {
    
    // 3가지의 유형의 배열
    // Array
    // 불변 list
    // ArrayList
    
    // Array
    var arr1 = arrayOf(1,2,3)
    var arr2 = arrayOf(1, "홍길동", "이순신") // 다른타입 저장 가능
    var arr3 = arrayOf<Int>(1,2,3) // 숫자타입 배열선언은 제네릭을 붙여주면 됨 // 다른 타입 X
    arr1[0] = 100 // 배열의 사용

    // Array 2번쨰 방법
    val arr4 = Array(10, {i -> i + 1} ) // 크기, 초기값 // i가 1부터 10까지 증가함

    println(Arrays.toString(arr1))
    println(Arrays.toString(arr2))
    println(Arrays.toString(arr3))
    println(Arrays.toString(arr4))

    println("--------------------------------------------------------------------")

    // 불변리스트 listOf -> 값의 변경은 불가능하고, 사용만 가능한 리스트

    val arr5 = listOf(1,2,3)
    var arr6 = listOf<String>("a", "b", "c")
    // arr5[0] = 100 //err

    println("--------------------------------------------------------------------")

    // arrayListOf - 자바의 ArrayList와 같음
    val list = arrayListOf<Int>()
    val list2 = arrayListOf(1,2,3)

    list.add(1) // 값의 추가
    list.add(2)

    val x = list[0] // 값의 조회
    val y = list.get(0)












}
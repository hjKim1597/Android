package com.example.kotlinbasic.day02

// 주생성자, 보조생성자 동시에 사용이됩니다
class ConstructEx03(val name : String) {
    var age : Int = 1

    // 주 생성자, 보조 생성자를 같이 쓰게 되면, 반드시 주생성자를 호출
    constructor(name : String, age : Int) : this(name) {
        this.age = age
    }
}
package com.example.kotlinbasic.day03

class ModifierEx {

    var a : Int = 0 // 기본으로 public 선언이 들어갑니다 - 어디서나 호출 가능함
    private var b : Int = 0 // 이 클래스 안에서만 사용이 가능함
    protected var c : Int = 0 // 이 클래스 안에서와 자식클래스에서는 접근이 가능함
    internal var d : Int = 0 // 같은 모듈 안에서만 접근이 됨
}
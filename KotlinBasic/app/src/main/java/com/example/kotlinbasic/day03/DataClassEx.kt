package com.example.kotlinbasic.day03

// data class는 VO(DTO)의 역할을 대신하는 클래스입니다.
// 이 클래스에서 제공되는 기능
// equals()
// toString()
data class User(
    val id: String,
    val age: Int
)

fun main() {
    
    val user = User("abc123", 20)
    val user2 = User("abc123", 20)
    
    println(user.equals(user2) ) // 주소의 비교가 아니라, 데이터 값만 일치하면 true를 반환
    println(user.toString() ) // 객체가 가지고 있는 값을 문자열로 보여줍니다.
    var (a, b) = user // 구조분해할당
    var x = user.component1() // 첫번째 멤버변수를 반환
    var y = user.component2() // 두번쨰 멤버변수를 반환

    var id = user.id
    var age = user.age

}
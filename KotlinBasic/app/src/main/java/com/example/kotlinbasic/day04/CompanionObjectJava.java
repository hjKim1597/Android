package com.example.kotlinbasic.day04;

public class CompanionObjectJava {
    //자바의 내부클래스는 2종류 static 클래스, 일반 클래스
    String name = "홍길동";

    public class Inner1 {
        String a = "a";
        public String example() {
            return name; // 외부클래스에 멤버에 접근이 가능하다
        }
    }

    public static class Inner2 {
        String a = "a";
//        public String example() {
//            return name; // 외부클래스에 멤버에 접근 불가능
//        }
    }

    // static 메서드
    public static void method() {

    }

    public static void main(String[] args) {

        //inner1 객체 생성 - 일반 내부클래스
        Inner1 inner1 = new CompanionObjectJava().new Inner1();

        //inner2 객체 생성 - 스태틱 내부클래스
        Inner2 inner2 = new CompanionObjectJava.Inner2();
    }
}

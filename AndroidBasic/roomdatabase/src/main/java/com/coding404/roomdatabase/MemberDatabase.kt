package com.coding404.roomdatabase

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase

@Database(
    entities = [MemberEntity::class/**/],
    version = 1
) // 실행 시킬 엔티티를 정의하고, 만약 초기 데이터 베이스 버전을 선언(엔티티가 만약 변경된다면 version이 되야 됩니다)
abstract class MemberDatabase : RoomDatabase() { // 실행시에 자바파일로 구현체를 자동 생성합니다

    //사용할 repository를 추상메서드로 선언합니다
    abstract fun memberRepository(): MemberRepository // 실행시에 자바파일로 구현체를 자동 생성합니다

    //싱글 톤 패턴의 데이터베이스 생성
    companion object {

        @Volatile // kotlin.jvm 타입 - 멀티 쓰례뜨 환경에서, 한스레드에 의해서 값이 지정되면 다른 스레드에 즉시 보이도록 처리
        private var instance: MemberDatabase? = null

        fun getInstance(context: Context): MemberDatabase {

            //여러 스레드가 동시에 한 시점에 접근할 때 , 하나의 스레드만 접근이 가능하도록 동기화를 보장합니다.
            synchronized(this) {
                if (instance === null) {
                    instance = Room.databaseBuilder(
                        context,
                        MemberDatabase::class.java, // 실행시킬 데이터 베이스
                        "member-database"
                    ) // 데이터 베이스명
                        .fallbackToDestructiveMigration()
                        .build()
                }
                return instance!!
            }

        }
    }
}
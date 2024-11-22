package com.coding404.roomdatabase

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query
import androidx.room.Update
import kotlinx.coroutines.flow.Flow


@Dao //인터페이스에 정의할 메서드를 작성합니다. JPA와 같음
interface MemberRepository {

    @Insert
    suspend fun insertMember(entity: MemberEntity)

    @Query("select * from 'member' ") // 테이블명에는 ''를 붙입니다
    fun getMember(): Flow<List<MemberEntity>>

    //아이디에 해당하는 멤버 조회
    @Query("select * from 'member' where id = :id ")
    suspend fun getMemberOne(id: Int): MemberEntity

    //엔티티로 업데이트 -> 만약 쿼리 구문을 작성하고 싶다면 @Query로 변경
    @Update
    suspend fun updateMember(entity: MemberEntity)

    //멤버 삭제
    @Delete
    suspend fun deleteMember(entity: MemberEntity)

}
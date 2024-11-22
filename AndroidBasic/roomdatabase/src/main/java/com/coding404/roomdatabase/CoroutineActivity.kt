package com.coding404.roomdatabase

import android.os.Bundle
import android.util.Log
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.lifecycle.lifecycleScope
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.async
import kotlinx.coroutines.cancel
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlin.system.measureTimeMillis
import kotlin.time.measureTime

const val TAG = "myLog"

class CoroutineActivity : AppCompatActivity() {

    suspend fun example1(): String {
        delay(2000)
        return "result 1"
    }

    suspend fun example2(): String {
        delay(1000)
        return "result 2"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_coroutine)

        //코루틴 - 비동기 라이크 , 협동 루틴
        // suspend 는 일시 중단 가능한 함수이고, 비동기적인 코드에서 사용합니다
        // suspend 를 호출하려면 , suspend 함수이거나 or 코루틴 스코프 여야 함

//        lifecycleScope.launch {
//
//            val time = measureTimeMillis { // 시간이 얼마나 걸리는지
//
//                Log.d(TAG, "onCreate: 1. 코루틴을 실행")
//
//                var result1 = example1()
//                var result2 = example2()
//                Log.d(TAG, "onCreate: $result1")
//                Log.d(TAG, "onCreate: $result2")
//            }
//            Log.d(TAG, "onCreate: 2. 실행시간: $time")
//        }
//        Log.d(TAG, "onCreate: 3. 코루틴 블럭을 탈출")

//        ////////////////////////////////////////////////////////////
        //스코프와 작업쓰레드
        // 쓰레드
        //main - ui화면을 업데이트 할 때 사용, 짧은 시간의 처리
        //IO - 네트워크 작업 , 지연시간이 오래걸리는 네트워크 작업
        // default - cpu 사용량이 많은 연산 작업

//        lifecycleScope.launch {Dispatchers.IO//안적으면 메인쓰레드

//        lifecycleScope.launch {Dispatchers.Default
//        lifecycleScope.launch {Dispatchers.Main
//
//            Log.d(TAG, "onCreate: ${Thread.currentThread().name}")
//
//            var time = measureTimeMillis {
//                val result = example1()
//            }
//            Toast.makeText(this@CoroutineActivity, "알림창은 메인쓰레드에서 사용가능함", Toast.LENGTH_SHORT).show()
//
//
//        }

        //스코프의 종류
        //글로벌 스코프 - 코루틴의 생명주기가 앱이 종료 시점전까지
//        GlobalScope.launch {
//            repeat(5) {
//                Log.d(TAG, "onCreate: $it")
//                delay(1000)
//            }
//        }
//        Log.d(TAG, "onCreate: 앱이 종료 전까지 살아있는 코루틴")

//        var scope = CoroutineScope(Dispatchers.Main) 
//        scope.launch { 
//            repeat(5) {
//                Log.d(TAG, "onCreate: $it")
//                delay(1)
//            }
//        }
//        scope.cancel() // 코루틴의 중단
//        Log.d(TAG, "onCreate: 코루틴의 스코프 종료")
//    라이프사이클 스코프 - activity 


        //코루틴 스코프 안에서, 비동기 or 또따른 코루틴 쓰코프를 열쑤 있음
        //async await
        lifecycleScope.launch(Dispatchers.IO) {
            val time = measureTimeMillis {
                val result1 = async { example1() }
                val result2 = async { example2() }


            }

        }

    }
}

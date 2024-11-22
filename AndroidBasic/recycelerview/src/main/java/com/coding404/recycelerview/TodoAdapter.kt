package com.coding404.recycelerview

import android.util.Log
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.coding404.recycelerview.databinding.RecyclerviewItemBinding
import com.coding404.recyclerview.Todo

//리사이클러뷰 어댑터를 상속받음
class TodoAdapter(val list : ArrayList<Todo>) : RecyclerView.Adapter<TodoAdapter.TodoViewHolder>() {

    //1. 내부 클래스 뷰홀더 생성
    //생성자의 매개변수는 리사이클러뷰 아이템을 받는다. 뷰홀더를 상속받는다
    class TodoViewHolder(val binding: RecyclerviewItemBinding) :
        RecyclerView.ViewHolder(binding.root) {

        //멤버변수 or 함수
        //데이터를 받아서 화면에 연결하는 코드
        fun setItem(todo: Todo) {
            binding.reTitle.text = todo.title
            binding.reContent.text = todo.content
        }
    }

    // 뷰 홀더가 새로 만들어질 때 호출됨 - 레이아웃을 인플레이트해서 뷰 객체 생성
    // (현재 연결할 뷰 객체, 붐의 뷰그룹의미함, 이뷰를 부모뷰에 바로 연결할지 (false) - 이 메서드 안에서 로딩 시킴)
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TodoViewHolder {
        val view : RecyclerviewItemBinding = RecyclerviewItemBinding.inflate(
            LayoutInflater.from(parent.context), parent, false )

        return TodoViewHolder(view) // 실행순서 1
    }

    //리사이클러뷰에서 관리하는 리스트의 사이즈를 반환
    override fun getItemCount(): Int {
        return list.size
    }

    // 뷰 홀더가 데이터와 연결될 때마다 호출됩니다 - 즉 한 행에 대한(아이템에 대한 처리를 넣어줍니다)
    override fun onBindViewHolder(holder: TodoViewHolder, position: Int) { // 뷰홀더, 인덱스
        val todo = list[position]

        holder.setItem(todo)

        Log.d("myLog", "onBindViewHolder: $position")
        // 실행순서 3
    }
}
package com.example.basickotlin3

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.example.basickotlin3.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        fun sum(num1: Int, num2: Int): Int {
            return num1 + num2
        }

        Log.d("파라미터와 반환있는 sum 함수", "${sum(4, 5)}")


        fun age(year: Int) {
            val result = 2023 - year
            Log.d("파라미터는 있고 반환없는 age 함수", "당신의 나이는 ${result}이군요")
        }

        age(1991)

        fun pi(): Double {
            return 3.14
        }

        Log.d("파라미터는 없고 반환있는 pi 함수", "${pi()}")

        fun people(name: String, age: Int = 31, gender: String = "male"): String {
            val sex = if(gender == "male") "남성" else "여성"
            Log.d("people 함수 실행", "${name}의 나이는 ${age}살이며, 성별은 ${sex}이다.")
            return "${name}의 나이는 ${age}살이며, 성별은 ${sex}이다."
        }

        people("코틀린", 24, "female")
        people("코틀린")    // 함수 기본값 적용

        val binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnView.setOnClickListener {
            binding.textView.text = "${people("코틀린", gender = "female")}"  // 파라미터명으로 값 입력
        }
    }
}
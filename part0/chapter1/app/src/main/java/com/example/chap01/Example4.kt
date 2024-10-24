package com.example.chap01

fun main() {
    val user = User("주성현")
    println(user.age)
    Kid("아이", 3, "male")

}

open class User(open val name: String,open var age: Int = 100)

class Kid(override val name: String, override var age: Int) : User(name, age) {
    private var gender: String = "female"

    init {
        println("초기화 중 입니다.")
    }

    constructor(name: String, age: Int, gender: String) : this(name, age) {
        this.gender = gender
        println("부 생성자 호출")
    }
}
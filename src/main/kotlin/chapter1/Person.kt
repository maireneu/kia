package chapter1

data class Person(val name: String, val age: Int? = null)

fun main(args: Array<String>) {
    val person = listOf(Person("영희"), Person(age=30, name = "철수"))
    val oldest = person.maxByOrNull { it.age ?: 0 }
    println("나이가 가장 많은 사람: $oldest")
}
package ragna.kt

import kotlinx.collections.immutable.ImmutableList
import kotlinx.collections.immutable.persistentListOf

class HelloWorldkt {

}

fun main() {
    println("Hello World KT!")
    val list: ImmutableList<String> = persistentListOf("I", "am", "immutable")
    println(list)
    println(list.dropLast(1))
    println(list)
    println(list.drop(1))
    println(list.first())
    println(list.head)
    println(list.tail)
}


val <T> List<T>.tail: List<T>
    get() = drop(1)

val <T> List<T>.head: T
    get() = first()
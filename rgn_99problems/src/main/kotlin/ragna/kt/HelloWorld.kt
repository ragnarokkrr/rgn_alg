package ragna.kt

import kotlinx.collections.immutable.ImmutableList
import kotlinx.collections.immutable.persistentListOf

fun main() {
    println("Hello World KT!")
    val list: ImmutableList<String> = persistentListOf("I", "am", "immutable")
    println(list)
    println(list.dropLast(1))
    println(list)
    println(list.drop(1))
    println(list.first())
}

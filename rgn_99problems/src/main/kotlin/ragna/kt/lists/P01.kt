package ragna.kt.lists

import kotlinx.collections.immutable.ImmutableList
import kotlinx.collections.immutable.persistentListOf

fun <T> lastRecursive(list: List<T>): T {
    val head = list.head()
    val tail = list.tail()

    return when {
        head != null && tail.isEmpty() -> head
        tail.isNotEmpty() -> lastRecursive(tail)
        else -> throw NoSuchElementException()
    }
}

fun main() {
    val list: ImmutableList<Int> = persistentListOf(1, 1, 2, 3, 5, 8);
    println(list)
    println(lastRecursive(list))

}


fun <T> List<T>.tail(): List<T> {
    return drop(1)
}

fun <T> List<T>.head(): T {
    return first()
}

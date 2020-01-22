package ragna.kt.lists;

import ragna.ALists;

import java.util.List;
import java.util.NoSuchElementException;

public class P01 {

    static <T> T lastRecursive(List<T> list) {
        var head = ALists.head(list);
        var tail = ALists.tail(list);
        if (head != null && tail.isEmpty()) {
            return head;
        }
        if (!tail.isEmpty()) {
            return lastRecursive(tail);
        }
        throw new NoSuchElementException();
    }

    static <T> T last(List<T> list) {
        return lastRecursive(list);
    }

    public static void main(String[] args) {
        var list = List.of(1, 1, 2, 3, 5, 8);

        System.out.println(list);
        System.out.println(lastRecursive(list));
    }
}

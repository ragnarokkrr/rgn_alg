package ragna;

import java.util.List;

public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello World!");
        var list = List.of();

        System.out.println(list);
        System.out.println(ALists.head(list));
        System.out.println(ALists.tail(list));

    }

}

package ragna;

import java.util.List;
import java.util.stream.Collectors;

public class ALists {
    public static <T> List<T> tail(List<T> list) {
        return list.stream().skip(1).collect(Collectors.toUnmodifiableList());
    }

    public static <T> T head(List<T> list) {
        return list.stream().findFirst().orElse(null);
    }

}

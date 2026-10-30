package List;

import java.util.ArrayList;
import java.util.List;

public class list {

    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        List<Integer> numbers = List.of(12, 23, 34, 4);
        // System.out.println(names);

       List<Integer>sortedList = numbers.stream()
       .sorted((a, b) -> b - a)
       .toList();
        System.out.println(sortedList);

    }
}

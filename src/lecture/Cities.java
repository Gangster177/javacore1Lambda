package lecture;

import java.util.*;

public class Cities {
    public static void main(String[] args) {
        List<String> cities = Arrays.asList("Мадрид", "Париж", "Москва", "Токио");

        // первый вариант
//        Collections.sort(cities, new Comparator<String>() {
//            @Override
//            public int compare(String a, String b) {
//                return b.compareTo(a);
//            }
//        });

        // второй вариант
//        Collections.sort(cities, (String a, String b) -> {
//            return b.compareTo(a);
//        });
//TODO   Используем лямбда-выражение сокращенной записи
        Collections.sort(cities, (a, b) -> b.compareTo(a));

        cities.forEach(System.out::println);
    }
}

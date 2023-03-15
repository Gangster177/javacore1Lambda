package lecture;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Cities2 {
    public static void main(String[] args) {
        List<String> city = Arrays.asList("Мадрид", "Париж", "Москва", "Токио");

        Comparator<String> comparator1 = (a,b) -> b.compareTo(a);
        Comparator<String> comparator2 = (a,b) -> a.compareTo(b);

        sortList(city, comparator2);
    }

    public static <T> void sortList(List<T> list, Comparator<T> comparator) {
        list.sort(comparator);
        list.forEach(System.out::println);
    }
}

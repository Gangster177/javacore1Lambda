package lecture.onDone;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> cities = Arrays.asList("Мадрид", "Париж", "Москва", "Токио");

        OnDoneListener listener = (v) -> System.out.println(v);
        Test test = new Test(listener);
        test.execute();
    }
}

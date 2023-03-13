package сalculator;

import java.util.function.*;

public class Calculator {
    static Supplier<Calculator> instance = Calculator::new;  //instance- пример,случай
    BinaryOperator<Integer> plus = (x, y) -> x + y; // -двоичный оператор
    BinaryOperator<Integer> minus = (x, y) -> x - y;
    BinaryOperator<Integer> multiply = (x, y) -> x * y;
    //    BinaryOperator<Integer> devide = (x, y) -> y != 0 ? x / y : 0;
    BinaryOperator<Integer> devide = (x, y) -> {
        int answer;
        if (y == 0) {
            System.out.print("Exception:'y' is zero! ");
            answer = 0;
        } else {
            answer = x / y;
        }
        return answer;
    };

    UnaryOperator<Integer> pow = x -> x * x; // -унарный оператор
    UnaryOperator<Integer> abs = x -> x > 0 ? x : x * -1;

    Predicate<Integer> isPositive = x -> x > 0; // -сказуемое

    Consumer<Integer> println = System.out::println; // -потребитель, клиент
}

package сalculator;

public class Main {
    public static void main(String[] args) {
        Calculator calc = Calculator.instance.get();

        int a = calc.plus.apply(1, 2);
        int b = calc.minus.apply(1,1);
        int c = calc.devide.apply(a, b);
// не было проверки деления на ноль,выбрасывалась ошибка
// Exception in thread "main" java.lang.ArithmeticException: / by zero
        calc.println.accept(c);
    }
}
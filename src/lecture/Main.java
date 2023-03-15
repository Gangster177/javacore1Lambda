package lecture;

public class Main {
    public static void main(String[] args) {
//1        Calc calc = new Calc();

//2        ISum summer = new ISum() {
//2            @Override
//2            public int sum(int a, int b) {
//2                return a + b;
//2            }
//2        };
//1        System.out.println(calc.sum(3,2));

        ISum summer = (a, b) -> a + b; // лямбда - выражение
        System.out.println(summer.sum(3, 2));
    }
}

@FunctionalInterface
interface ISum {
    int sum(int a, int b);
}

class Calc implements ISum {
    @Override
    public int sum(int a, int b) {
        return a + b;
    }
}
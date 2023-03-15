package lecture;

public class Main {
    public static void main(String[] args) {
        Calc calc = new Calc();
        System.out.println(calc.sum(3,2));
    }
}

@FunctionalInterface
interface ISum {
    int sum(int a, int b);
}

class Calc implements ISum{
    @Override
    public int sum(int a, int b){
        return a + b;
    }
}
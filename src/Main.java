public class Main {
    public static void main (String[] args) {

       Calculator calc = Calculator.instance.get();

        int a = calc.plus.apply(1, 2);
        int b = calc.minus.apply(1,1);
     /* int c = calc.devide.apply(a, b); - ошибка ArithmeticException,
                                           т.к. b = 1-1 = 0, а на 0 делить нельзя */
        int c = calc.avoidError(a, b);

        calc.println.accept(c);
    }
}

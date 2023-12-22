import java.util.function.*;

public class Calculator {

    static Supplier <Calculator> instance = Calculator::new;
    BinaryOperator<Integer> plus = (x, y) -> x + y;
    BinaryOperator<Integer> minus = (x, y) -> x - y;
    BinaryOperator<Integer> multiply = (x, y) -> x * y;
    BinaryOperator<Integer> divide = (x, y) -> x / y;

    UnaryOperator<Integer> pow = x -> x * x;
    UnaryOperator<Integer> abs = x -> x > 0 ? x : x * -1;

    Predicate<Integer> isPositive = x -> x > 0;

    Consumer<Integer> println = System.out::println;

    UnaryOperator<Integer> check = x -> x != 0 ? x : -1;

    public int avoidError (int a, int b) {
        if (b != 0) {
            int c = divide.apply(a, b);
            return c;
        } else {
            System.out.println("На 0 разделить нельзя");
            return 0;
        }
    }
}



import java.util.function.*;


public class Calculator {
     static Supplier<Calculator> instance = Calculator::new;
     BinaryOperator<Integer> plus = (x, y) -> x + y;
     BinaryOperator<Integer> minus = (x, y) -> x - y;
     BinaryOperator<Integer> multiply = (x, y) -> x * y;
     BinaryOperator<Integer> devide = (x, y) -> {
          try {
               if (y==0)
                    throw new ArithmeticException("Exception: divide by zero.");
               return x/y; // если b!=0, то вернуть результат деления
          }  catch (ArithmeticException e) {
               System.out.println(e.getMessage()); // Вывести сообщение
               return 0;
          }
     };

     UnaryOperator<Integer> pow = x -> x * x;
     UnaryOperator<Integer> abs = x -> x > 0 ? x : x * -1;

     Predicate<Integer> isPositive = x -> x > 0;

     Consumer<Integer> println = System.out::println;

}

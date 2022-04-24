public class Main {

    public static void main(String[] args) {

        //ЗАДАЧА 1 КАЛЬКУЛЯТОР
        Calculator calc = Calculator.instance.get();

        int a = calc.plus.apply(1, 2);
        int b = calc.minus.apply(1,1);
        int c = calc.devide.apply(a, b); //ошибка - деление на 0. Решение - обработать исключение.

        calc.println.accept(c);

        //ЗАДАЧА 2 РАБОТЯГА
        Worker.OnTaskDoneListener listener = System.out::println;
        Worker.OnTaskErrorListener listener1 = System.out::println;
        Worker worker = new Worker(listener, listener1);
        worker.start();

    }
}

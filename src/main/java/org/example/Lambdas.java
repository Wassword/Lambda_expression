package org.example;
import java.util.function.*;

public class Lambdas {
    @FunctionalInterface
    public interface StringTransformer {
        String transform(String input);
    }

    public static void main(String[] args) {
        //Task 1
        BinaryOperator<Integer> add = (a, b) -> a + b;
        BinaryOperator<Integer> sub = (a, b) -> a - b;
        BinaryOperator<Integer> mul = (a, b) -> a * b;
        BinaryOperator<Integer> div = (a, b) -> a / b;

        System.out.println(add.apply(2, 3));
        System.out.println(sub.apply(10, 5));
        System.out.println(mul.apply(7, 6));
        System.out.println(div.apply(4, 8));

        //Task 2

        //Lambda expression to convert string to an uppercase
        StringTransformer toUpperCase = (input) -> input.toUpperCase();
        StringTransformer toLowerCase = (input) -> input.toLowerCase();


        //Test
        System.out.println("Uppercase: " + toUpperCase.transform("hello")); // Output: HELLO
        System.out.println("Lowercase: " + toLowerCase.transform("HELLO")); //Output hello


        //Task 3
        //Predicate: fn interface to represent a boolean value fn of one arg
        Predicate<Integer> isEven = (input) -> input % 2 == 0;
        System.out.println("Even: " + isEven.test(5)); //OUTPUT : False

        //Function: Accepts one arg and produces a result
        Function<String,Integer> stringLength = (input) -> input.length();
        System.out.println("Length of 'Safari': " + stringLength.apply("Safari"));

        // Consumer: represents an operation that accepts a single input arg and returns no result
        Consumer<String> printUpperCase = (input) -> System.out.println(input.toUpperCase());
        printUpperCase.accept("bla bla bla");

        // Supplier : represents supplier of results. includes an abstract method get(), which returns a result & not accept args
        Supplier<Double> randomDouble = () -> Math.random();
        System.out.println("Random Value: " + randomDouble.get());

    }
}



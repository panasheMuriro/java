// Lesson Objectives
// Understand the basics of lambda expressions in Java.
// Learn how to use lambda expressions to simplify code.
// Explore functional interfaces and their role in lambda expressions.

// Basic syntax
// (parameters) -> expression
// // or
// (parameters) -> { statements }

// Functional Interfaces
// A lambda expression can be used only with functional interfaces. 
// A functional interface is an interface with just one abstract method,
// which serves as a “target” for lambda expressions.

// Some key functional interfaces in Java include:

// Runnable: void run()
// Comparator<T>: int compare(T o1, T o2)
// Consumer<T>: void accept(T t)
// Supplier<T>: T get()

import java.util.Arrays;
import java.util.List;

@FunctionalInterface
interface MathOperation {
    int operation(int a, int b);
}

public class Lambdas {
    public static void main(String[] args) {
        MathOperation addition = (a, b) -> a + b;
        System.out.println("Addition result is: " + addition.operation(6, 7));

        // built in
        // sorting
        List<String> names = Arrays.asList("John", "Erica", "Abel");
        names.sort((a, b) -> a.compareTo(b));
        System.out.println(names);

        List<String> items = Arrays.asList("apple", "banana", "orange");
        items.forEach(item -> System.out.println(item));

    }
}

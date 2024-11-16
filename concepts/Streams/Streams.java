// Lesson Objectives
// Understand the purpose of the Streams API in Java.
// Learn how to create and manipulate streams.
// Explore commonly used stream operations, such as filtering, mapping, reducing, and collecting.

// Java Streams provide a powerful, functional approach to processing collections. 
// The Streams API allows you to express complex data processing queries in a concise, 
// readable way, often using lambda expressions.

// Key Benefits of Streams
// Declarative Code: You describe what you want to do rather than how.
// Efficient Data Processing: Streams can be processed sequentially or in parallel.
// Immutability: Operations on streams do not modify the source; they return a new stream or result.

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Streams {

    // from collections
    // List<String> fruits = Arrays.asList("banana", "apple",
    // "kiwi","cherry","strawberry");
    // Stream<String> stream = fruits.stream();

    // // from an array
    // String[] arr = {"A","B","C","D"};
    // Stream<String> arrStream = Arrays.stream(arr);

    // common ops

    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
        numbers.stream().filter(n -> n % 2 == 0).forEach(System.out::println);

        List<String> names = Arrays.asList("john", "alice", "bob");
        names.stream().map(String::toUpperCase).forEach(System.out::println);

        List<String> names2 = Arrays.asList("John", "Alice", "Bob");
        names2.stream().sorted().forEach(System.out::println);

        List<Integer> nums = Arrays.asList(1, 2, 2, 3, 4, 4);
        nums.stream().distinct().forEach(System.out::println);

        // Terminal operations trigger the stream pipeline and produce a result.
        //  Common terminal operations include forEach, collect, reduce, count, and findAny or findFirst.
        List<String> uppercased = names.stream().map(String::toUpperCase).collect(Collectors.toList());

        List<Integer> nums2 = Arrays.asList(1, 2, 3, 4);
        int sum = nums2.stream().reduce(0, Integer::sum); 

        long count = nums2.stream().count();
        System.out.println(count);


        List<String> items = Arrays.asList("apple", "banana", "orange");
items.parallelStream().forEach(System.out::println);



    }

}

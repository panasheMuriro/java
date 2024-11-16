// Lesson Objectives
// Understand the purpose of the Optional class in Java.
// Learn how to create and use Optional objects.
// Explore common methods of Optional to avoid NullPointerException and write more readable code.

// The Optional class, introduced in Java 8, is a container that may or may not contain a value.
// It provides a safer way to handle null values, helping to avoid NullPointerException.

import java.util.Optional;

public class OptionalLearn {

    public static void main(String[] args) {

        // Optional.of: Used when you are sure the value is non-null.
        Optional<String> name = Optional.of("John");

        // Optional.ofNullable: Used when the value might be null.
        Optional<String> name2 = Optional.ofNullable(null);

        // Optional.empty: Represents an absent value.
        Optional<String> empty = Optional.empty();

        Optional<String> name3 = Optional.of("Alice");
        if (name3.isPresent()) {
            System.out.println("Name: " + name3.get());
        }

    }

}

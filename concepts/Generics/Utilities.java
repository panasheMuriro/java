// Creating a Generic Method
// A generic method allows you to define a method that can operate on
//  various types. You can declare a generic method inside a regular or generic class

public class Utilities {
    public static <T> void printArray(T[] array) {
        for (T element : array) {
            System.out.println(element);
        }
    }


    public static void main(String[] args) {
        Integer[] intArray = {1, 2, 3, 4};
        String[] strArray = {"A", "B", "C"};
        Utilities.printArray(intArray);
        Utilities.printArray(strArray);
    }
}

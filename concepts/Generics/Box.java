// Generics allow classes, interfaces, and methods to operate on different types
//  without explicitly specifying the type each time. By using Generics, you can
//   create reusable and type-safe code that reduces errors and enhances flexibility.

public class Box<T> {
    private T value;

    public Box(T value) {
        this.value = value;
    }

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }

    public static void main(String[] args) {
        Box<Integer> intBox = new Box<>(10);
        Box<String> strBox = new Box<>("Hello");

        System.out.println("Integer Box: " + intBox.getValue());
        System.out.println("String Box: " + strBox.getValue());
    }

}

import java.util.Scanner;

public class AlienPizzaMaker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the Alien Pizza Maker!");
        System.out.print("Which alien species is ordering? (Martian, Jupiterian, Saturnian): ");
        String species = scanner.nextLine();

        try {
            Pizza pizza = PizzaFactory.createPizza(species);
            pizza.prepare();
            pizza.bake();
            pizza.deliver();
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

        scanner.close();
    }
}

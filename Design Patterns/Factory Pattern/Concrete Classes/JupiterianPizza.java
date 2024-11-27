public class JupiterianPizza implements Pizza {
    @Override
    public void prepare() {
        System.out.println("Preparing Jupiterian Pizza with storm-flavored toppings.");
    }

    @Override
    public void bake() {
        System.out.println("Baking Jupiterian Pizza with lightning!");
    }

    @Override
    public void deliver() {
        System.out.println("Delivering Jupiterian Pizza via space shuttle.");
    }
}

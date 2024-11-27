public class SaturnianPizza implements Pizza {
    @Override
    public void prepare() {
        System.out.println("Preparing Saturnian Pizza with ring-shaped crust.");
    }

    @Override
    public void bake() {
        System.out.println("Baking Saturnian Pizza at 400°F with stardust.");
    }

    @Override
    public void deliver() {
        System.out.println("Delivering Saturnian Pizza via asteroid belt.");
    }
}
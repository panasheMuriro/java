public class MartianPizza implements Pizza {
    @Override
    public void prepare() {
        System.out.println("Preparing Martian Pizza with red sauce and space cheese.");
    }

    @Override
    public void bake() {
        System.out.println("Baking Martian Pizza at 450°F.");
    }

    @Override
    public void deliver() {
        System.out.println("Delivering Martian Pizza via drone.");
    }
}
package FactoryPatterPizzaStore;

public class SalamiPizza implements Pizza{
    @Override
    public void prepare() {
        System.out.println("Pizza wird mit Salami bestückt");
    }

    @Override
    public void bake() {
        System.out.println("Salami pizza muss 20 min gebacken werden.");
    }

    @Override
    public void cut() {
        System.out.println("Salami Pizza wird 6 mal geschnitten.");

    }

    @Override
    public void box() {
        System.out.println("Pizza Salami braucht ein dickes Box.");

    }
}

package FactoryPatterPizzaStore;

public class VeggiPizza implements Pizza{
    @Override
    public void prepare() {
        System.out.println("Veggi Pizza wird mit Gemüse bestückt.");
    }

    @Override
    public void bake() {
        System.out.println("Veggi Pizza muss 15 min gebacken werden.");

    }

    @Override
    public void cut() {
        System.out.println("Veggi Pizza muss 8 mal geschnitten werden.");

    }

    @Override
    public void box() {
        System.out.println("VeggiPizza braucht ein rundes Box.");

    }
}

package FactoryPatterPizzaStore;

public class ItalianRestorante extends PizzaStore{
    @Override
    Pizza createPizza(String type) {
        return switch (type) {
            case "Salami" -> new SalamiPizza();
            case "Veggi" -> new VeggiPizza();
            default -> null;
        };
    }
}

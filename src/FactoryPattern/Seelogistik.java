package FactoryPattern;

public class Seelogistik extends Creator{
    @Override
    public Transport createMethode() {
        return new Ship();
    }
}

package FactoryPattern;

public class Ship implements Transport{

    @Override
    public void deliver() {
        System.out.println("ich transportiere über das Wasser!");
    }
}

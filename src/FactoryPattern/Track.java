package FactoryPattern;

public class Track implements Transport{
    @Override
    public void deliver() {
        System.out.println("ich fahre auf den Straßen");
    }
}

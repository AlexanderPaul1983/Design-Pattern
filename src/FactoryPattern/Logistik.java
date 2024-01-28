package FactoryPattern;

public class Logistik extends Creator{


    @Override
    public Transport createMethode() {
        return  new Track();
    }
}

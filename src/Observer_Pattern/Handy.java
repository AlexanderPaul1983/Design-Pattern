package Observer_Pattern;

public class Handy implements Observer{


    @Override
    public void update(int temperatur) {
        System.out.println("Neu Temperatur am Handy ist " + temperatur + " Grad Celsius.");
    }
}

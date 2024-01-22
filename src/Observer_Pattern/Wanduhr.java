package Observer_Pattern;

public class Wanduhr implements Observer{

    @Override
    public void update(int temperatur) {
        System.out.println("Neu Temperatur an der Wanduhr ist " + temperatur+ " Grad Celsius.");
    }
}

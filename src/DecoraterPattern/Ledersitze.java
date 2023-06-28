package DecoraterPattern;

public class Ledersitze extends CarDecorater{
    Auto auto;

    public Ledersitze(Auto chosenCar){
        auto = chosenCar;
    }
    @Override
    public double getPreis() {
        return auto.getPreis()+5000;
    }

    @Override
    public String getAusstatung() {
       return auto.getAusstatung() + " mit Ledersitzen";
    }
}

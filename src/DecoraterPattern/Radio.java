package DecoraterPattern;

public class Radio extends CarDecorater{
    Auto auto;

    public Radio(Auto chosenCar){
        auto = chosenCar;
    }
    @Override
    public double getPreis() {
        return auto.getPreis() + 1000;
    }

    @Override
    public String getAusstatung() {
        return auto.getAusstatung() + " mit Radio.";
    }
}

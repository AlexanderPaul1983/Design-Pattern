package DecoraterPattern;

public class Audi extends Auto{
    public Audi(){
        ausstatung = "Audi A6";
    }
    @Override
    public double getPreis() {
        return 50000;
    }
}

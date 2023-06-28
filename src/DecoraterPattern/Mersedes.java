package DecoraterPattern;

public class Mersedes extends Auto {
    public Mersedes(){
        ausstatung = "Mercedes SLS";
    }
    @Override
    public double getPreis() {
        return 200000;
    }
}

import DecoraterPattern.*;


public class Main {
    public static void main(String[] args) {
        Auto meinAudi = new Audi();
        System.out.println(meinAudi.getAusstatung());
        System.out.println(meinAudi.getPreis());
        meinAudi = new Ledersitze(meinAudi);
        meinAudi = new Radio(meinAudi);
        System.out.println(meinAudi.getPreis());
        Auto mercedes = new Mersedes();
        mercedes = new Ledersitze(mercedes);
        System.out.println(mercedes.getPreis());
    }
}
import DecoraterPattern.*;
import Observer_Pattern.Handy;
import Observer_Pattern.Wanduhr;
import Observer_Pattern.ZugspitzeStation;


public class Main {
    public static void main(String[] args) {
        ZugspitzeStation zugspitzeStation = new ZugspitzeStation();

        Wanduhr wanduhr = new Wanduhr();
        Handy handy = new Handy();
        zugspitzeStation.registerObserver(handy);
        zugspitzeStation.registerObserver(wanduhr);
        zugspitzeStation.setTemperatur(25);
        zugspitzeStation.removeObserver(handy);
        zugspitzeStation.setTemperatur(30);
    }
}
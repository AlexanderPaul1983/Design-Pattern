import Observer_Pattern.Handy;
import Observer_Pattern.Observer;
import Observer_Pattern.WetterStation;
import Observer_Pattern.ZugspitzeStation;
import Singleton.DatabaseConnection;

public class Main {
    public static void main(String[] args) {
        DatabaseConnection db = DatabaseConnection.getInstance("gf");
        db.getName();


    }
}
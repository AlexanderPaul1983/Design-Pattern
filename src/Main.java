import Singleton.DatabaseConnection;

public class Main {
    public static void main(String[] args) {
        DatabaseConnection db = DatabaseConnection.createConnection();
        assert db != null;
        db.setName("Vodafone");
        db.connect();

        DatabaseConnection db2 = DatabaseConnection.createConnection();

        db2.connect();

        db.disconnect();

        System.out.println(db.getName());
        System.out.println(db2.getName());
        if (db == db2){
            System.out.println("die sind gleich");
        }else {
            System.out.println("die sind nicht gleich");
        }



    }
}
package Singleton;

public class DatabaseConnection {

   private static DatabaseConnection connection;
   private String name;

    private DatabaseConnection(String name){
        this.name = name;
    }
    public static DatabaseConnection getInstance(String name){
        if(connection == null){
        connection = new DatabaseConnection(name);
        }
        return connection;
    }


    public void getName() {
        System.out.println(name);
    }



    public void connect(){
        System.out.println("Connection with " + name + " has been created");
    }

}

package Singleton;

public class DatabaseConnection {

   static private DatabaseConnection connection;
   private String name;

    private DatabaseConnection(){

    }
    public void setName(String name){
            this.name = name;
    }
    public String getName(){
      return name;

    }

    public static synchronized DatabaseConnection createConnection(){
        if (connection == null){
            connection = new DatabaseConnection();
        }else {
            System.out.println("Sie haben schon connection");
        } return connection;

    }
    public void connect(){
        System.out.println("Connection with " + name + " was created");
    }
    public void disconnect(){
        System.out.println( name + " was disconnected");
    }
}

package AdapterPattern;

public class Client {
   public  void  executeOperation(Ziel ziel){
       ziel.operation();
   }

    public static void main(String[] args) {
       VorhandeneClasse adaptee = new VorhandeneClasse();


       Adapter adapter = new Adapter(adaptee);
       adapter.operation();


       Client client = new Client();
       client.executeOperation(adapter);

    }
}

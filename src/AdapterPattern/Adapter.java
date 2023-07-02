package AdapterPattern;

public class Adapter implements Ziel{
    public VorhandeneClasse newOperation;
    @Override
    public void operation() {
        newOperation.konkreteOperation();

    }

    public Adapter(VorhandeneClasse newOperation) {
        this.newOperation = newOperation;

    }
}

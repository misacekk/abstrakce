package abstrakce;

public class SuchozemskaZelva extends Zelva{
    public SuchozemskaZelva(int rokNarozeni, String jmeno) {
        super(rokNarozeni, jmeno);
    }

    @Override
    public void vydejZvuk() {
        System.out.println("ratata");
    }

}

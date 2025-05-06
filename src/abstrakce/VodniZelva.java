package abstrakce;

public class VodniZelva extends Zelva{
    public VodniZelva(int rokNarozeni, String jmeno) {
        super(rokNarozeni, jmeno);
    }

    @Override
    public void vydejZvuk() {
        System.out.println("ratata");
    }

}

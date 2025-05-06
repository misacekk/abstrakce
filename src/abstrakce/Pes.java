package abstrakce;

public class Pes extends Zvire{

    public Pes(int rokNarozeni, String jmeno) {
        super(rokNarozeni, jmeno);
    }

    @Override
    public void vydejZvuk() {
System.out.println("haf");
    }
}

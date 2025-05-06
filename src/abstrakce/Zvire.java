package abstrakce;

public abstract class Zvire {
    private int rokNarozeni;
    private String jmeno;

    public Zvire(int rokNarozeni, String jmeno) {
        this.rokNarozeni = rokNarozeni;
        this.jmeno = jmeno;
    }

    public void vypisJmenoADatum(){
        System.out.println("Jmeno: " + jmeno);
        System.out.println("Datum: " + rokNarozeni);
    }
    public abstract void vydejZvuk();
}

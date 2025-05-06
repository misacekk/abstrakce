import abstrakce.Had;
import abstrakce.Pes;
import abstrakce.Zelva;

public class Main {
    public static void main(String[] args) {

        Pes pes = new Pes(2,"pepa");
        pes.vypisJmenoADatum();
        pes.vydejZvuk();
        Zelva zelva = new Zelva(5,"honzicek");
        zelva.vypisJmenoADatum();
        zelva.vydejZvuk();
        Had had = new Had(3,"franta");
        had.vypisJmenoADatum();
        had.vydejZvuk();

    }
}
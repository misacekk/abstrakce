import abstrakce.*;

public class Main {
    public static void main(String[] args) {

        Pes pes = new Pes(2,"pepa");
        pes.vypisJmenoADatum();
        pes.vydejZvuk();
        System.out.println("------------------------------------------------------------------");
        Zelva zelva = new Zelva(5,"honzicek");
        zelva.vypisJmenoADatum();
        zelva.vydejZvuk();
        System.out.println("------------------------------------------------------------------");
        VodniZelva vodniZelva = new VodniZelva(10,"ojojojbobritobonditou");
        vodniZelva.vypisJmenoADatum();
        vodniZelva.vydejZvuk();
        System.out.println("------------------------------------------------------------------");
        SuchozemskaZelva suchozemskaZelva = new SuchozemskaZelva(1,"lirililarila");
        suchozemskaZelva.vypisJmenoADatum();
        suchozemskaZelva.vydejZvuk();
        System.out.println("------------------------------------------------------------------");
        Had had = new Had(3,"franta");
        had.vypisJmenoADatum();
        had.vydejZvuk();

    }
}
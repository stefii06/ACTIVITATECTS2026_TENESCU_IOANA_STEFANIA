package ro.ase.cts.clase.STB;

public class Autobuz {
    private String producator;


    public Autobuz(String producator) {
        this.producator = producator;
    }

    public void pornestePeTraseu(int nrLinie){
        System.out.println(" Autobuzul " +this.producator+ " porneste pe traseul " +nrLinie);

    }

}

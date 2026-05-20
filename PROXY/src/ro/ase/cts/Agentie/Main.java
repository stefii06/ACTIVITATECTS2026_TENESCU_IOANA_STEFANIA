package ro.ase.cts.Agentie;

public class Main {
    public static void main(String[] args) {

        Client client1 =new Client("Oana", 70);
        Client client2 =new Client("Gigel", 35);


        PachetTuristic pachet = new PachetTransport();
        PachetTuristic pachetPensionari = new PachetTransportPensionari(pachet);

        pachet.rezervaPachet(client1);
        pachet.rezervaPachet(client2);


        System.out.println("---------------------------------");

        pachetPensionari.rezervaPachet(client1);
        pachetPensionari.rezervaPachet(client2);



    }
}

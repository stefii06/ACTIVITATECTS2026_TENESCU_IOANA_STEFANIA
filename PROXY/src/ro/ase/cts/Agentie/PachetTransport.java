package ro.ase.cts.Agentie;

public class PachetTransport implements PachetTuristic {
    @Override
    public void rezervaPachet(Client client) {
        System.out.println("Pachetul turistic a fost rezervat cu succes de " +client.getNume());

    }
}

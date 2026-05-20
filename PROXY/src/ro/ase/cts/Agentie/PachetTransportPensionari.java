package ro.ase.cts.Agentie;

public class PachetTransportPensionari implements PachetTuristic {
    PachetTuristic pachet;

    public PachetTransportPensionari(PachetTuristic pachet) {
        this.pachet = pachet;
    }

    @Override
    public void rezervaPachet(Client client) {
        if(client.getVarsta()>=65){
            pachet.rezervaPachet(client);
        } else {
            System.out.println(" Pachetul turistic transport poate fi rezervat doar de pensionari! \n Rezervare refuzata pentru "   +client.getNume()+ " !");
        }


    }
}

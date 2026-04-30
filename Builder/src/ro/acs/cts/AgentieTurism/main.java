package ro.acs.cts.AgentieTurism;


import ro.acs.cts.RezervareMasa.AbstractBuilder;

public class main {
    public static void main(String[] args) {


PachetTuristic pachetTuristic = new PachetTuristic.BuilderPachetTuristic("Pachet1").set_ActivExtra(true).set_Cazare(true).set_Transport(true).build();
PachetTuristic pachetTuristic2 = new PachetTuristic.BuilderPachetTuristic("Pachet 2").set_Cazare(true).set_Transport(true).build();


        System.out.println(pachetTuristic.toString());
        System.out.println(pachetTuristic2.toString());






    }

}

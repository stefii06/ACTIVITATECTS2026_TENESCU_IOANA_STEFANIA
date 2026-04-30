package ro.ase.cts.main;

import ro.ase.cts.clase.LicentaTurism.LicenseAlreadySetException;
import ro.ase.cts.clase.LicentaTurism.LicentaTurism;

public class MainLicentaTurism {
    public static void main(String[] args) throws LicenseAlreadySetException, InterruptedException {


        LicentaTurism licentaTurism1 = LicentaTurism.getInstance();
        LicentaTurism licentaTurism2 = LicentaTurism.getInstance();

        final LicentaTurism[] licentaTurism3 = new LicentaTurism[1];

        Thread thread = new Thread(() -> {
            licentaTurism3[0] = LicentaTurism.getInstance();
        });

        thread.start();
       // thread.join();



    LicentaTurism[] licentaTurism4 = new LicentaTurism[1];
    Thread thread2 = new Thread(() -> {
        licentaTurism4[0] = LicentaTurism.getInstance();
    });
thread2.start();

        licentaTurism1.setLicenseNumber("1022");

        licentaTurism1.afisare();
        licentaTurism2.afisare();
        licentaTurism3[0].afisare();

        licentaTurism1.setLicenseNumber("1244");
        licentaTurism1.afisare();



        System.out.println(licentaTurism1 == licentaTurism2);
        System.out.println(licentaTurism1 == licentaTurism3[0]);
        System.out.println(licentaTurism2 == licentaTurism3[0]);

    }
}

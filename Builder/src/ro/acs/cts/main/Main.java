package ro.acs.cts.main;

import ro.acs.cts.builder01.AbstractBuilder;
import ro.acs.cts.builder01.Internare;
import ro.acs.cts.builder01.InternareBuilder;
import ro.acs.cts.builder02.AbstractBuilder02;
import ro.acs.cts.builder02.Internare02;
import ro.acs.cts.builder02.InternareBuilder02;

public class Main {
    public static void main(String[] args) {
        Internare internare1=new Internare();
        internare1.setNume_pacient("Nyanu");
        internare1.setPat_rabatabil(true);
        Internare internare2=new Internare();
        internare2.setNume_pacient("Annie");
        internare2.setPat_rabatabil(true);


        AbstractBuilder builder=new InternareBuilder("Nyanu");

        Internare internare3=builder.setPatRabatabil(true).build();
        Internare internare4=builder.setArePapuci(true).setNume("Annie").build();
        // internare3 si internare 4 e aceeasi internare modificata de  2 ori

        System.out.println(internare3.toString());
        System.out.println(internare4.toString());


        AbstractBuilder02 builder02=new InternareBuilder02();
        builder02.setMic_dejun(true);
        Internare02 internare5=builder02.build("Alin");
        Internare02 internare6=builder02.build("Gigel");

        System.out.println(internare5.toString());
        System.out.println(internare6.toString());

        internare5.setHalat(true);

    }
}
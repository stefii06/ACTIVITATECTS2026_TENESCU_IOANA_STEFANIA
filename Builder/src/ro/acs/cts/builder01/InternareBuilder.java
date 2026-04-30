package ro.acs.cts.builder01;

public class InternareBuilder implements  AbstractBuilder{
   private Internare internare;


    public InternareBuilder(String nume_pacient) {
        internare=new Internare(false,false,false,false,nume_pacient);

    }



    @Override
    public Internare build() {
        return this.internare;
    }

    @Override
    public AbstractBuilder setNume(String nume_pacient) {
        this.internare.setNume_pacient(nume_pacient);
        return this;
    }

    @Override
    public AbstractBuilder setPatRabatabil(boolean pat_rabatabil) {
        this.internare.setPat_rabatabil(pat_rabatabil);
        return this;
    }

    @Override
    public AbstractBuilder setArePapuci(boolean are_papuci) {
        this.internare.setPapuci_camera(are_papuci);
        return this;
    }

    @Override
    public AbstractBuilder setMic_dejun(boolean mic_dejun) {
        this.internare.setMic_dejun_inclus(mic_dejun);
        return this;
    }

    @Override
    public AbstractBuilder setare_halat(boolean are_halat) {
        this.internare.setHalat(are_halat);
        return this;
    }
}

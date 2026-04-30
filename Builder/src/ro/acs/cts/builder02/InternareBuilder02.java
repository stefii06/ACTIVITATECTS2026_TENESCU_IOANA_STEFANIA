package ro.acs.cts.builder02;

import ro.acs.cts.builder02.Internare02;

public class InternareBuilder02 implements AbstractBuilder02{

    private boolean pat_rabatabil;
    private boolean mic_dejun_inclus;
    private boolean papuci_camera;
    private boolean halat;


    public InternareBuilder02() {
        this.pat_rabatabil = false;
        this.mic_dejun_inclus = false;
        this.papuci_camera = false;
        this.halat = false;
    }

    @Override
    public Internare02 build(String nume) {
        return new Internare02(pat_rabatabil,mic_dejun_inclus,papuci_camera,halat,nume);
    }



    @Override
    public AbstractBuilder02 setPatRabatabil(boolean pat_rabatabil) {
        this.pat_rabatabil=pat_rabatabil;
        return this;
    }

    @Override
    public AbstractBuilder02 setArePapuci(boolean are_papuci) {
        this.papuci_camera=are_papuci;
        return this;
    }

    @Override
    public AbstractBuilder02 setMic_dejun(boolean mic_dejun) {
        this.mic_dejun_inclus=mic_dejun;
        return this;
    }

    @Override
    public AbstractBuilder02 setare_halat(boolean are_halat) {
        this.halat=halat;
        return this;
    }
}

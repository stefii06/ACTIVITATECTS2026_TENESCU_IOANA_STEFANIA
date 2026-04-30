package ro.acs.cts.RezervareMasa;

public class RezervareMasa {
    private final String numeClient;
    private final int nrPers;
    private final boolean asezareGeam;
    private final boolean decorareMasa;
    private final boolean scaunPentruCopil;

    public RezervareMasa(Builder builder) {

        this.numeClient = builder.numeClient;
        this.nrPers = builder.nrPers;
        this.asezareGeam = builder.asezareGeam;
        this.decorareMasa = builder.decorareMasa;
        this.scaunPentruCopil = builder.scaunPentruCopil;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("RezervareMasa{");
        sb.append("numeClient='").append(numeClient).append('\'');
        sb.append(", nrPers=").append(nrPers);
        sb.append(", asezareGeam=").append(asezareGeam);
        sb.append(", decorareMasa=").append(decorareMasa);
        sb.append(", scaunPentruCopil=").append(scaunPentruCopil);
        sb.append('}');
        return sb.toString();
    }


    public static class Builder implements AbstractBuilder {
        private final String numeClient;
        private final int nrPers;
        private  boolean asezareGeam= false;
        private  boolean decorareMasa= false;
        private  boolean scaunPentruCopil=false;

        public Builder(String numeClient, int nrPers) {
            this.numeClient = numeClient;
            this.nrPers = nrPers;
        }

        public Builder setAsezareGeam(boolean asezareGeam) {
            this.asezareGeam = asezareGeam;
            return this;
        }

        public Builder setDecorareMasa(boolean decorareMasa) {
            this.decorareMasa = decorareMasa;
            return this;
        }

        public Builder setScaunPentruCopil(boolean scaunPentruCopil) {
            this.scaunPentruCopil = scaunPentruCopil;
            return this;
        }

        @Override
        public RezervareMasa build() {
            return  new RezervareMasa(this);
        }
    }
}

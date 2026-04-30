package ro.acs.cts.AgentieTurism;

public class PachetTuristic {
    //toate atributele final ca sa fie imutabil
    private final String nume;
    private final boolean transport;
    private final boolean cazare;
    private final boolean activExtra;

    public PachetTuristic(BuilderPachetTuristic builder) {
        this.nume = builder.nume;
        this.transport = builder.transport;
        this.cazare = builder.cazare;
        this.activExtra = builder.activExtra;
    }



    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("PachetTuristic{");
        sb.append("nume='").append(nume).append('\'');
        sb.append("transport=").append(transport);
        sb.append(", cazare=").append(cazare);
        sb.append(", activExtra=").append(activExtra);
        sb.append('}');
        return sb.toString();
    }

    public static class BuilderPachetTuristic implements HolidayPackageAbstract{
        private final String nume;
        private boolean transport= false;
        private boolean cazare=false;
        private boolean activExtra=false;


        // in constructor intra atributele obligatorii + validari daca e cazul
        public BuilderPachetTuristic(String nume) {
            this.nume = nume;
        }

        //returnam builder ul, construim prin setarile pe care le am dat in builder
        @Override
        public PachetTuristic build() {
            return new PachetTuristic(this);
        }

        @Override
        public HolidayPackageAbstract set_Transport(boolean transport) {
            this.transport = transport;
            return this;
        }

        @Override
        public HolidayPackageAbstract set_Cazare(boolean cazare) {
            this.cazare = cazare;
            return this;
            }

        @Override
        public HolidayPackageAbstract set_ActivExtra(boolean activExtra) {
            this.activExtra = activExtra;
            return this;
        }


    }



}

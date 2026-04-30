package ro.acs.cts.Banca;

public class ContBancar {
    private final String numeClient;
    private final String moneda;
    private final boolean cardAtasat;
    private final boolean internetBanking;
    private final boolean notificariSMS;

    public ContBancar(Builder builder) {
        this.numeClient = builder.numeClient;
        this.moneda = builder.moneda;
        this.cardAtasat = builder.cardAtasat;
        this.internetBanking = builder.internetBanking;
        this.notificariSMS = builder.notificariSMS;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("ContBancar{");
        sb.append("numeClient='").append(numeClient).append('\'');
        sb.append(", moneda='").append(moneda).append('\'');
        sb.append(", cardAtasat=").append(cardAtasat);
        sb.append(", internetBanking=").append(internetBanking);
        sb.append(", notificariSMS=").append(notificariSMS);
        sb.append('}');
        return sb.toString();
    }


    public static class Builder implements AbstractBuilder{
        private final String numeClient;
        private final String moneda;
        private  boolean cardAtasat = false;
        private boolean internetBanking=false;
        private boolean notificariSMS=false;


        public Builder(String numeClient, String moneda) {
           if ( numeClient == null || numeClient.isEmpty())
               throw new IllegalArgumentException("numeClient cannot be null or empty");
            if (moneda == null || moneda.isEmpty())
                throw new IllegalArgumentException("moneda cannot be null or empty");

            this.numeClient = numeClient;
            this.moneda = moneda;
        }


        @Override
        public ContBancar build() {
            return new ContBancar(this);
        }

        @Override
        public AbstractBuilder cardAtasabil(boolean cardAtasabil) {
            this.cardAtasat = cardAtasabil;
            return this;
        }

        @Override
        public AbstractBuilder internetBanking(boolean internetBanking) {
            this.internetBanking = internetBanking;
            return this;
        }

        @Override
        public AbstractBuilder notificariSMS(boolean notificariSMS) {
            this.notificariSMS = notificariSMS;
        return this;

        }
    }
}

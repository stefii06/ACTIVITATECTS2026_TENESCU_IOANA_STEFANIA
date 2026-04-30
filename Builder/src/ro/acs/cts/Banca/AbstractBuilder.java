package ro.acs.cts.Banca;

public interface AbstractBuilder {
    ContBancar build();
    AbstractBuilder cardAtasabil(boolean  cardAtasabil);
    AbstractBuilder internetBanking(boolean internetBanking);
    AbstractBuilder notificariSMS(boolean  notificariSMS);
}

package ro.acs.cts.Banca;

public class main {
    public static void main(String[] args) {

        ContBancar contBancar = new ContBancar.Builder("Marcel", "euro").build();
        ContBancar contBancar1 = new ContBancar.Builder("Marian", "ron").cardAtasabil(true).internetBanking(true).build();


        System.out.println(contBancar.toString());
        System.out.println(contBancar1.toString());


    }
}

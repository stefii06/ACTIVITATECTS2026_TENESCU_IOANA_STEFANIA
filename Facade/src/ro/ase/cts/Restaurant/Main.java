package ro.ase.cts.Restaurant;

public class Main {
    public static void main(String[] args) {

        Masa masa = new Masa();
        Debarasare debarasare = new Debarasare();
        Servetele servetele = new Servetele();

        ReceptieRestaurant receptieRestaurant = new ReceptieRestaurant(masa, debarasare, servetele);

        receptieRestaurant.verificaDisponibilitate("Ilinca", 16);
        receptieRestaurant.verificaDisponibilitate("Matei", 21);


    }


}

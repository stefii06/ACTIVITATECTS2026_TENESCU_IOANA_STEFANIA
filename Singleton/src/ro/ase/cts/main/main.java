package ro.ase.cts.main;

import ro.ase.cts.clase.Hotel;
import ro.ase.cts.clase.Opera;

public class main {
    public static void main(String[] args) {
        Hotel hotel1 = Hotel.getInstance("Continental", 100,50);
        Hotel hotel2 = Hotel.getInstance("MegaContinental", 200,0);  // e aceeasi instanta in spate, deci tot hotel1



        // hotel1 = hotel2
        //punctaj pentru testare: de oricate ori creez un hotel (hotel1,hotel2,hotel3 e defapt aceeasi instanta)

        //mai sunt 2 camere libere, care pot fi rezervate
      hotel1.rezervaCamera();
      hotel1.rezervaCamera();

       //mai sunt 0 camere libere
      hotel2.rezervaCamera();
      hotel2.rezervaCamera();


        Opera opera1 = Opera.getInstance("Opera Fantastico", 100,50);
        Opera opera2 = Opera.getInstance("Opera ULTRA Fantastico", 200,80);

        opera1.afiseazaDetalii();
        opera2.afiseazaDetalii();

    }
}

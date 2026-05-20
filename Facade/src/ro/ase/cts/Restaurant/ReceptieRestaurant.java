package ro.ase.cts.Restaurant;

public class ReceptieRestaurant {
    private Masa masa;
    private Debarasare serviciuDebarasre;
    private Servetele serviciuServetele;

    public ReceptieRestaurant(Masa masa, Debarasare serviciuDebarasre, Servetele serviciuServetele) {
        this.masa = masa;
        this.serviciuDebarasre = serviciuDebarasre;
        this.serviciuServetele = serviciuServetele;
    }


    public void verificaDisponibilitate(String numeClient, int nrMasa){
        if(masa.esteLiberа(nrMasa)){
            if (serviciuDebarasre.esteDebarasata(nrMasa)) {
                if(serviciuServetele.auFostPuseServetele(nrMasa)){
                    System.out.println(" Masa nr " +nrMasa+ " este disponibila , debarasata si are servetele noi puse!\n" + "Clientul " +numeClient+ " poate fi condus la masa!");
                } else {
                    System.out.println("Masa nr " +nrMasa+ " este disponibila si debarasata , dar nu are servetele\n Clientul " +numeClient+ " trebuie sa astepte putin!");
                }

            } else {
                System.out.println(" Masa nr " +nrMasa+ " este disponibila , dar trebuie debarasata\n Clientul " +numeClient+ " trebuie sa astepte 5 minute!");
            }

        } else {
            System.out.println(" Masa nr ul " +nrMasa+ " nu este disponibila!\n Clientul va fi condus la alta masa!");
        }



    }


}

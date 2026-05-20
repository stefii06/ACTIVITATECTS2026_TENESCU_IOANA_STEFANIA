package ro.ase.cts.Restaurant;

public class Main {
    public static void main(String[] args) {

        // frunze
        Element pizza = new Element("Pizza Margherita");
        Element paste = new Element("Paste Carbonara");
        Element tiramisu = new Element("Tiramisu");
        Element apa = new Element("Apa minerala");
        Element suc = new Element("Suc de portocale");

        // noduri
        Sectiuni mancare = new Sectiuni("Mancare");
        mancare.adaugaOptiune(pizza);
        mancare.adaugaOptiune(paste);

        Sectiuni desert = new Sectiuni("Desert");
        desert.adaugaOptiune(tiramisu);

        Sectiuni bauturi = new Sectiuni("Bauturi");
        bauturi.adaugaOptiune(apa);
        bauturi.adaugaOptiune(suc);

        // radacina
        Sectiuni meniu = new Sectiuni("Meniu Restaurant");
        meniu.adaugaOptiune(mancare);
        meniu.adaugaOptiune(desert);
        meniu.adaugaOptiune(bauturi);

        // afiseaza tot!
        meniu.afiseaza();
    }
}
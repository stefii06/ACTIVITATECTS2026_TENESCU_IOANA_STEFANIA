package ro.ase.cts.Librarie;

public class main {
    public static void main(String[] args) {


        Carte carteFizica = new CarteFizica("Zborul", "Martin Lu", 55.5 );
        EbookExtern  ebook = new EbookExtern("Harry Potter", "J.K.Rowling", 70.0, 560);
        Carte adapterEbook = new AdapterEbook(ebook);

        carteFizica.achizitionare();
        adapterEbook.achizitionare();




    }




}

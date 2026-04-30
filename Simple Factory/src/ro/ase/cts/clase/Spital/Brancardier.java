package ro.ase.cts.clase.Spital;

public class Brancardier extends PersonalSpital{


    public Brancardier(String nume, int varsta) {
        super(nume, varsta);
    }

    @Override
    public void afisareDescriere() {
        StringBuilder sb = new StringBuilder("Brancardier{");
        sb.append("nume='").append(nume).append('\'');
        sb.append(", varsta=").append(varsta);
        sb.append('}');
        System.out.println(sb.toString());
    }


}

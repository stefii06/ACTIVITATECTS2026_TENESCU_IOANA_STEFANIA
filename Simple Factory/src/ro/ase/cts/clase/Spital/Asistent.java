package ro.ase.cts.clase.Spital;

public class Asistent extends PersonalSpital{


    public Asistent(String nume, int varsta) {
        super(nume, varsta);
    }



    @Override
    public void afisareDescriere() {
        StringBuilder sb = new StringBuilder("Asistent{");
        sb.append("nume='").append(nume).append('\'');
        sb.append(", varsta=").append(varsta);
        sb.append('}');
        System.out.println(sb.toString());

    }
}

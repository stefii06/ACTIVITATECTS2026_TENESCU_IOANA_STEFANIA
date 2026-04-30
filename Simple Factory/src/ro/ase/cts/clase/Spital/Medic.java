package ro.ase.cts.clase.Spital;

public class Medic extends PersonalSpital{


    public Medic(String nume, int varsta) {
        super(nume, varsta);
    }

    @Override
    public void afisareDescriere() {
        StringBuilder sb = new StringBuilder("Medic{");
        sb.append("nume='").append(nume).append('\'');
        sb.append(", varsta=").append(varsta);
        sb.append('}');
        System.out.println(sb.toString());
    }
}

package ro.ase.cts.clase;

public abstract class CalatorieHandler {
    protected CalatorieHandler successor;


    public CalatorieHandler() {
        this.successor = null;
    }


    public void setCalatorieHandler() {
        this.successor = null;
    }

    public String recomandaCalatorie(double distanta){
        return "";
    }

}

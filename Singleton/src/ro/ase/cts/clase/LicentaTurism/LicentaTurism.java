package ro.ase.cts.clase.LicentaTurism;

public class LicentaTurism implements ILicentaTurism {

    private static LicentaTurism instance = null;
    private String licenseNumber;

    private LicentaTurism() {
    }

    public static synchronized LicentaTurism getInstance() {
        if (instance == null) {
            instance = new LicentaTurism();
        }
        return instance;
    }

    @Override
    public synchronized void setLicenseNumber(String licenseNumber) throws LicenseAlreadySetException {
        if (this.licenseNumber != null) {
            throw new LicenseAlreadySetException("Numarul licentei a fost deja setat.");
        }
        this.licenseNumber = licenseNumber;
    }

    @Override
    public void afisare() {
        System.out.println("Licenta turism: " + licenseNumber);
    }

}
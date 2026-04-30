package ro.ase.cts.clase.LicentaTurism;

public interface ILicentaTurism {
    void afisare ();
    void setLicenseNumber(String licenseNumber) throws LicenseAlreadySetException;

}

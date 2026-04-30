package ro.acs.cts.AgentieTurism;

public interface HolidayPackageAbstract {
 PachetTuristic build();

    HolidayPackageAbstract set_Transport(boolean transport);

    HolidayPackageAbstract set_Cazare(boolean cazare);

    HolidayPackageAbstract set_ActivExtra(boolean activExtra);
}

package Zaverecny_projekt;

import JFrame_Obrazovka1.Window;
import JFrame_Obrazovka2.Window2;

public class Rozhodci extends Osoba {

	private boolean platnostLicence;
    public Datum DatumLicence;
	
	//Constructor with all fields
	public Rozhodci(String jmeno, String prijmeni, int vek, String oddil, String pasek, Window window, Window2 zapas,  boolean platnostLicence, Datum DatumLicence) {
		super(jmeno, prijmeni, vek, oddil, pasek, window, zapas);
		this.platnostLicence = platnostLicence;
		this.DatumLicence = DatumLicence;
	}

	//Getters and Setters
	public void setPlatnostLicence(boolean platnostLicence) {
		this.platnostLicence = platnostLicence;
	}
	public boolean isPlatnostLicence() {
		return platnostLicence;
	}

}

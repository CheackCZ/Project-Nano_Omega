package Zaverecny_projekt;

import javax.swing.JOptionPane;

import JFrame_Obrazovka1.Window;

public class Datum {
	
	private int den;
	private int mesic;
	private int rok;
	
	private Window window;
	
	public Datum(int den, int mesic, int rok, Window window) {
		this.den = den;
		this.mesic = mesic;
		this.rok = rok;
		this.window = window;
	}
	
	public Datum(int den, int mesic, int rok) {
		this.den = den;
		this.mesic = mesic;
		this.rok = rok;
	}
	
   //Getters and Setters
	public int getDen() {
		return den;
	}
   //This setter is controlling	if the day can be used
	public void setDen(int den) {
		if (this.getMesic() == 2) {
			if ((den > 28) || (den < 1)) {
				JOptionPane.showMessageDialog(null, "Tento m�s�c nem� tolik dn�!! Zadejte nov� datum.", "WARNING - Neexistuj�c� datum", JOptionPane.WARNING_MESSAGE);
				window.povoleno = false;
			} 
		} else if ((this.getMesic() == 1) || (this.getMesic() == 3) || (this.getMesic() == 5) || (this.getMesic() == 7)
				|| (this.getMesic() == 8) || (this.getMesic() == 10) || (this.getMesic() == 12)) {
			if ((den > 31) || (den < 1)) {
				JOptionPane.showMessageDialog(null, "Tento m�s�c nem� tolik dn�!! Zadejte nov� datum.", "WARNING - Neexistuj�c� datum", JOptionPane.WARNING_MESSAGE);
				window.povoleno = false;
			} 
		} else if ((this.getMesic() == 4) || (this.getMesic() == 6) || (this.getMesic() == 9) || (this.getMesic() == 11)) {
			if ((den > 30) || (den < 1)) {
				JOptionPane.showMessageDialog(null, "Tento m�s�c nem� tolik dn�!! Zadejte nov� datum.", "WARNING - Neexistuj�c� datum", JOptionPane.WARNING_MESSAGE);
				window.povoleno = false;
			} 
		} else {
			this.den = den;
		}
	}
	
	public int getMesic() {
		return mesic;
	}
   //This setter is controlling	if the month can be used
	public void setMesic(int mesic) {
		if ((mesic > 12) || (mesic < 1)){
			JOptionPane.showMessageDialog(null, "Tento m�s�c neexistuje! Rok m� 12 m�s�c�.", "WARNING - Neexistuj�c� datum", JOptionPane.WARNING_MESSAGE);
			window.povoleno = false;
		} else {
			this.mesic = mesic;
		}
	}
	
	public int getRok() {
		return rok;
	}
	public void setRok(int rok) {
		if (rok < 2022) {
			JOptionPane.showMessageDialog(null, "Tento rok ji� byl! Zadejte nov� rok.", "WARNING - Neexistuj�c� datum", JOptionPane.WARNING_MESSAGE);
			window.povoleno = false;
		} else {
			this.rok = rok;
		}
	}

	
   //Method that controls if the date user typed in can be used
	public void KontrolaData() {
		
		window.datumLicence.setMesic(Integer.parseInt(window.d.R.zadaniMesicePlatnostiLicence.getText()));
		window.datumLicence.setDen(Integer.parseInt(window.d.R.zadaniDnePlatnostiLicence.getText()));
		window.datumLicence.setRok(Integer.parseInt(window.d.R.zadaniRokuPlatnostiLicence.getText()));
		
		if (window.datumLicence.getRok() < window.dnesniDatum.getRok()) {
			window.datumPovoleno = false;
		} else if (window.datumLicence.getRok() == window.dnesniDatum.getRok()) {
			
			if (window.datumLicence.getMesic() < window.dnesniDatum.getMesic()) {
				window.datumPovoleno = false;
			} else if (window.datumLicence.getMesic() == window.dnesniDatum.getMesic()) {
				
				if (window.datumLicence.getDen() < window.dnesniDatum.getDen()) {
					window.datumPovoleno = false;
				} else if (window.datumLicence.getDen() == window.dnesniDatum.getDen()) {
					
				} 
			}
		} 
		
	} 
	
	
}

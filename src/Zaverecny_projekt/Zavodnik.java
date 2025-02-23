package Zaverecny_projekt;

import javax.swing.JOptionPane;

import JFrame_Obrazovka1.Window;
import JFrame_Obrazovka2.Window2;

public class Zavodnik extends Osoba {

	private double vaha;
	private Statistiky statistiky;
	
	//Constructor with all fields
	public Zavodnik(String jmeno, String prijmeni, int vek, String oddil, String pasek, Window window, Window2 zapas, double vaha, Statistiky statistiky) {
		super(jmeno, prijmeni, vek, oddil, pasek, window, zapas);
		this.vaha = vaha; 
		this.statistiky = statistiky;
	}

	
	//Getters and Setters
	public double getVaha() {
		return vaha;
	}
	public void setVaha(double vaha) {
		if ((vaha > 150) || (vaha < 15)) {
			JOptionPane.showMessageDialog(null, "Z�vodn�k s touto v�hou nem��e z�vodit! Maxim�ln� p�ijateln� v�ha je 150kg a minim�ln� 15kg.", "WARNING - Nep�ijateln� v�ha", JOptionPane.WARNING_MESSAGE);
			window.povoleno = false;
		} else if (vaha  > window.kategorie.getVybranaVahovaKategorie() * (- 1)) {
			if (window.K.VahoveKategorie.getSelectedIndex() == window.K.VahoveKategorie.getItemCount()-1) {
				
			} else {
				JOptionPane.showMessageDialog(null, "Z�vodn�k s touto v�hou nem��e z�vodit ve v�mi vybran� v�kov� kategorii!", "WARNING - Nep�ijateln� v�ha", JOptionPane.WARNING_MESSAGE);
				window.povoleno = false;
			}
		} else {
			this.vaha = vaha;
		}
	}

    public Statistiky getStatistiky() {
		return statistiky;
	}
	public void setStatistiky(Statistiky statistiky) {
		this.statistiky = statistiky;
	}


	//Method - Checking the belt if it's higher (or equal) than blue belt
	public void KontrolaPaskuZavodnik() {
		for (int i = 0; i < TechnickeStupneZavodnici.length; i++) {
			if (this.getPasek() != TechnickeStupneZavodnici[i]) {
				System.out.println("S t�mto p�skem z�vodn�k nesm� z�vodit v mastogi!");
			} 
		}
	}
	
	
   //Method - Adding points to the red competitor
	public void PridaniBoduCerveny() {
		window.CervenyZavodnik.getStatistiky().getBody().setBodyZavodnika(window.CervenyZavodnik.getStatistiky().getBody().getBodyZavodnika() + 1);;
		zapas.B.btnBodyCerveny.setText(window.CervenyZavodnik.getStatistiky().getBody().getBodyZavodnika() + "");
	}
	
	
  //Method - Adding points to the blue competitor
	public void PridaniBoduModry() {
		window.ModryZavodnik.getStatistiky().getBody().setBodyZavodnika(window.ModryZavodnik.getStatistiky().getBody().getBodyZavodnika() + 1);;
		zapas.B.btnBodyModry.setText(window.ModryZavodnik.getStatistiky().getBody().getBodyZavodnika() + "");
	}

}

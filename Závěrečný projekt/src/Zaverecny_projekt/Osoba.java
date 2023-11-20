package Zaverecny_projekt;

import javax.swing.JOptionPane;

import JFrame_Obrazovka1.Window;
import JFrame_Obrazovka2.Window2;

public class Osoba {
	
	private String jmeno;
	private String prijmeni;
	private int vek;
	private String oddil;
	private Object pasek;
	public Window window;
	public Window2 zapas;
	
	//Constructor with all fields
	protected Osoba(String jmeno, String prijmeni, int vek, String oddil, String pasek, Window window, Window2 zapas) {
		this.jmeno = jmeno;
		this.prijmeni = prijmeni;
		this.vek = vek;
		this.oddil = oddil;
		this.pasek = pasek;
		this.window = window;
		this.zapas = zapas;
	}
	
   //Empty constructor	
	public Osoba() {
	}
	
	
	//Getters and Setters
	public String getJmeno() {
		return jmeno;
	}
	public void setJmeno(String jmeno) {
		this.jmeno = jmeno;
	}

	public String getPrijmeni() {
		return prijmeni;
	}
	public void setPrijmeni(String prijmeni) {
		this.prijmeni = prijmeni;
	}

	public int getVek() {
		return vek;
	}
	public void setVek(int vek) {
		if (this == window.rozhodci) {
			if (vek < 16) {
				JOptionPane.showMessageDialog(null, "Rozhodèí s tímto vìkem nemùže rozhodovat! Minimální vìk je 16 let.", "WARNING - Nepøijatelný vìk", JOptionPane.WARNING_MESSAGE);
				window.povoleno = false;
			}
		} else {
			if ((vek > 60) || (vek < 6)) { 
				JOptionPane.showMessageDialog(null, "Závodník s tímto vìkem nemùže závodit! Maximální vìk je 60 let a minimální 6 let.", "WARNING - Nepøijatelný vìk", JOptionPane.WARNING_MESSAGE);
				window.povoleno = false;
			} else if ((vek < window.kategorie.getdolniLinieVekoveKategorie()) || (vek > window.kategorie.getHorniLinieVekoveKategorie())) {
				JOptionPane.showMessageDialog(null, "Závodník s tímto vìkem nemùže závodit ve vámi vybrané kategorii!", "WARNING - Vìk mimo zadanou kategorii", JOptionPane.WARNING_MESSAGE);
				window.povoleno = false;
			} else {
				this.vek = vek;
			}
		}
	}

	public String getOddil() {
		return oddil;
	}
	public void setOddil(String oddil) {
		this.oddil = oddil;
	}

	public Object getPasek() {
		return pasek;
	}
	public void setPasek(Object object) {
		this.pasek = object;
	}
	
	
   //Array with the belts for the competitors
	public static String [] TechnickeStupneZavodnici = {"", "4.kup", "3.kup", "2.kup", "1.kup", "1.dan", "2.dan", "3.dan", "4.dan",
			"5.dan", "6.dan"};
	
   //Array with the belts for the referees
	public static String [] TechnickeStupneRozhodci = {"", "2.kup", "1.kup", "1.dan", "2.dan", "3.dan", "4.dan", "5.dan", "6.dan",
			"7.dan", "8.dan", "9.dan"};
	
	//Array with all the belts for the competitors
		public static String [] TechnickeStupne = {"", "10.kup", "9.kup", "8.kup", "7.kup", "6.kup", "5.kup", "4.kup", "3.kup", 
				"2.kup", "1.kup", "1.dan", "2.dan", "3.dan", "4.dan", "5.dan", "6.dan", "7.dan", "8.dan", "9.dan"};
	
}

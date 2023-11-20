package Zaverecny_projekt;

import JFrame_Obrazovka1.Window;
import JFrame_Obrazovka2.Window2;

public class Statistiky {

	private Body body;
	private boolean otocka;
	
	private Window window;
	private Window2 zapas;
	
	
	//Constructor with all fields
	public Statistiky(Body body, boolean otocka, Window window, Window2 zapas) {
		this.body = body;
		this.otocka = otocka;
		this.window = window;
		this.zapas = zapas;
	}
	
	
   //Method - set red competitor's attribute(otocka) to true 
	public boolean PotvrzeniOtockyCerveny() {
		window.CervenyZavodnik.getStatistiky().getBody().setBodyZavodnika(window.CervenyZavodnik.getStatistiky().getBody().getBodyZavodnika() + 2);
		zapas.B.btnBodyCerveny.setText(window.CervenyZavodnik.getStatistiky().getBody().getBodyZavodnika() + "");
		
		zapas.B.ViceBoduCerveny();
		zapas.B.ViceBoduModry();
		
		return this.otocka = true;
	}
	
	
   //Method - set red competitor's attribute(otocka) to true 
	public boolean PotvrzeniOtockyModry() {
		window.ModryZavodnik.getStatistiky().getBody().setBodyZavodnika(window.ModryZavodnik.getStatistiky().getBody().getBodyZavodnika() + 2);
		zapas.B.btnBodyModry.setText(window.ModryZavodnik.getStatistiky().getBody().getBodyZavodnika() + "");
		
		zapas.B.ViceBoduCerveny();
		zapas.B.ViceBoduModry();
		
		return this.otocka = true;
	}

	
   //Getters and Setters
	public Body getBody() {
		return body;
	}
	public void setBody(Body body) {
		this.body = body;
	}

}

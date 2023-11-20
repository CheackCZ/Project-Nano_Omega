package Zaverecny_projekt;

import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

import JFrame_Obrazovka1.Window;
import JFrame_Obrazovka2.Window2;

public class Body {

	private int bodyTrestne;
	private int bodyZavodnika;
	
	private int zluteKarty;
	
	private Window window;
	private Window2 zapas;
	
	//Constructor with all fields
	public Body(int bodyTrestne, int bodyZavodnika, int zluteKarty, Window window, Window2 zapas) { 
		this.bodyTrestne = bodyTrestne;
		this.bodyZavodnika = bodyZavodnika;
		this.zluteKarty = zluteKarty;
		this.window = window;
		this.zapas = zapas;
	}

	//Getters and Setters
	public int getBodyTrestne() {
		return bodyTrestne;
	}
	public void setBodyTrestne(int bodyTrestne) {
		if (bodyTrestne % 3 == 0) {
			this.bodyZavodnika--;
			this.bodyTrestne = bodyTrestne;			
		} else {
			this.bodyTrestne = bodyTrestne;			
		}
	}
	
	public int getBodyZavodnika() {
		return bodyZavodnika;
	}
	public void setBodyZavodnika(int bodyZavodnika) {
		this.bodyZavodnika = bodyZavodnika;
	}
	
    public int getZluteKarty() {
		return zluteKarty;
	}
	public void setZluteKarty(int zluteKarty) {
		if (this.zluteKarty == 3) {
			
		} else {
			this.zluteKarty = zluteKarty;			
		}
	}

	
   //Method that add yellow cards to the red competitor and controls if he can go on in the match
	public void PridaniZluteKartyCerveny() {
		if (window.CervenyZavodnik.getStatistiky().getBody().getZluteKarty() == 2) {

			zapas.CasKoloZapasu.btnClock.setEnabled(false);
			zapas.CasKoloZapasu.timer.stop();
			
			JOptionPane.showMessageDialog(null, "Èervený závodník má tøi žluté karty! Tudíž je diskvalifikován.", "WARNING - Diskvalifikace èerveného závodníka", JOptionPane.WARNING_MESSAGE);
			JOptionPane.showMessageDialog(null, "Vítìzem zápasu je modrý závodník.", "Pøedèasnì urèený vítìz", JOptionPane.INFORMATION_MESSAGE);
			
			window.CervenyZavodnik.getStatistiky().getBody().setZluteKarty(window.CervenyZavodnik.getStatistiky().getBody().getZluteKarty() + 1);
			
			zapas.TrestneBodyKartyCerveny.btnZluteKarty.setText("3");
			
			zapas.TrestneBodyKartyCerveny.btnZluteKarty.setEnabled(false);
			zapas.TrestneBodyKartyModry.btnZluteKarty.setEnabled(false);
			
			zapas.B.btnBodyCerveny.setEnabled(false);
			zapas.B.btnBodyModry.setEnabled(false);
			
			zapas.TrestneBodyKartyCerveny.btnTrestneBody.setEnabled(false);
			zapas.TrestneBodyKartyModry.btnTrestneBody.setEnabled(false);

			zapas.HorniCast.txtCisloRingu.setBackground(Color.BLUE);
			zapas.B.lblTriangle.setIcon(new ImageIcon("triangle_blue.png"));
			
		} else {
			
			window.CervenyZavodnik.getStatistiky().getBody().setZluteKarty(window.CervenyZavodnik.getStatistiky().getBody().getZluteKarty() + 1);
			window.CervenyZavodnik.getStatistiky().getBody().setBodyZavodnika(window.CervenyZavodnik.getStatistiky().getBody().getBodyZavodnika() - 1);

			zapas.TrestneBodyKartyCerveny.btnZluteKarty.setText(window.CervenyZavodnik.getStatistiky().getBody().getZluteKarty() + "");
			zapas.B.btnBodyCerveny.setText(window.CervenyZavodnik.getStatistiky().getBody().getBodyZavodnika() + "");
			
			zapas.B.ViceBoduCerveny();
			zapas.B.ViceBoduModry();
		
		}
	}
	
	
   //Method that add yellow cards to the blue competitor and controls if he can go on in the match
	public void PridaniZluteKartyModry() {
		if (window.ModryZavodnik.getStatistiky().getBody().getZluteKarty() == 2) {

			zapas.CasKoloZapasu.btnClock.setEnabled(false);
			zapas.CasKoloZapasu.timer.stop();
			
			JOptionPane.showMessageDialog(null, "Modrý závodník má tøi žluté karty! Tudíž je diskvalifikován.", "WARNING - Diskvalifikace modrého závodníka", JOptionPane.WARNING_MESSAGE);
			JOptionPane.showMessageDialog(null, "Vítìzem zápasu je èervený závodník.", "Pøedèasnì urèený vítìz", JOptionPane.INFORMATION_MESSAGE);
			
			window.ModryZavodnik.getStatistiky().getBody().setZluteKarty(window.ModryZavodnik.getStatistiky().getBody().getZluteKarty() + 1);
			
			zapas.TrestneBodyKartyModry.btnZluteKarty.setText("3");
			
			zapas.TrestneBodyKartyModry.btnZluteKarty.setEnabled(false);
            zapas.TrestneBodyKartyCerveny.btnZluteKarty.setEnabled(false);
			
			zapas.B.btnBodyCerveny.setEnabled(false);
			zapas.B.btnBodyModry.setEnabled(false);
			
			zapas.TrestneBodyKartyCerveny.btnTrestneBody.setEnabled(false);
			zapas.TrestneBodyKartyModry.btnTrestneBody.setEnabled(false); 
			
			zapas.HorniCast.txtCisloRingu.setBackground(Color.RED);
			zapas.B.lblTriangle.setIcon(new ImageIcon("triangle_red.png"));
		
		} else {
			
			window.ModryZavodnik.getStatistiky().getBody().setZluteKarty(window.ModryZavodnik.getStatistiky().getBody().getZluteKarty() + 1);
			window.ModryZavodnik.getStatistiky().getBody().setBodyZavodnika(window.ModryZavodnik.getStatistiky().getBody().getBodyZavodnika() - 1);
			
			zapas.TrestneBodyKartyModry.btnZluteKarty.setText(window.ModryZavodnik.getStatistiky().getBody().getZluteKarty() + "");
			zapas.B.btnBodyModry.setText(window.ModryZavodnik.getStatistiky().getBody().getBodyZavodnika() + "");
		
			zapas.B.ViceBoduCerveny();
			zapas.B.ViceBoduModry();
			
		}
	}

	
   //Method that add foul points to the red competitor and controls the points
	public void PridaniTrestnychBoduCerveny() {
		
		window.CervenyZavodnik.getStatistiky().getBody().setBodyTrestne(window.CervenyZavodnik.getStatistiky().getBody().getBodyTrestne() + 1);		
		
		if (window.CervenyZavodnik.getStatistiky().getBody().getBodyTrestne() % 3 == 0) {
			window.CervenyZavodnik.getStatistiky().getBody().setBodyZavodnika(window.CervenyZavodnik.getStatistiky().getBody().getBodyZavodnika() - 0);
			
			zapas.B.btnBodyCerveny.setText(window.CervenyZavodnik.getStatistiky().getBody().getBodyZavodnika() + "");
		} 
		
		zapas.TrestneBodyKartyCerveny.btnTrestneBody.setText(window.CervenyZavodnik.getStatistiky().getBody().getBodyTrestne() + "");
		
		zapas.B.ViceBoduCerveny();
		zapas.B.ViceBoduModry();
		
	}
	
	
   //Method that add foul points to the blue competitor and controls the points
	public void PridaniTrestnychBoduModry() {
		
		window.ModryZavodnik.getStatistiky().getBody().setBodyTrestne(window.ModryZavodnik.getStatistiky().getBody().getBodyTrestne() + 1);		
		
		if (window.ModryZavodnik.getStatistiky().getBody().getBodyTrestne() % 3 == 0) {
			window.ModryZavodnik.getStatistiky().getBody().setBodyZavodnika(window.ModryZavodnik.getStatistiky().getBody().getBodyZavodnika() - 0);
			
			zapas.B.btnBodyModry.setText(window.ModryZavodnik.getStatistiky().getBody().getBodyZavodnika() + "");
		} 
		
		zapas.TrestneBodyKartyModry.btnTrestneBody.setText(window.ModryZavodnik.getStatistiky().getBody().getBodyTrestne() + "");
		
		zapas.B.ViceBoduCerveny();
		zapas.B.ViceBoduModry();
		
	}
	
}

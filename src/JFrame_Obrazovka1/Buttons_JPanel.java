package JFrame_Obrazovka1;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

import JFrame_Obrazovka2.Window2;

public class Buttons_JPanel extends JPanel {

	public JButton presunNaZapas;
	public JButton potvrzeniUdaju;
	public JButton upraveniUdaju;
	public JButton refreshUdaju;
	
	public Window window;
	
	public KontrolaUdajuCervenyZavodnik kontrolaUdajuCerveny;
	private KontrolaUdajuModryZavodnik kontrolaUdajuModry;
	private KontrolaUdajuRozhodci kontrolaUdajuRozhodci;
	private KontrolaUdajuZapas kontrolaUdajuZapas;
	private KontrolaKategorie kontrolaKategorie;
	
	private Window2 zapas;
	
	/**
	 * Create the panel.
	 */
	public Buttons_JPanel(Window window, Window2 zapas) {
		
		this.zapas = zapas; 
		this.window = window;
		
		this.kontrolaUdajuCerveny  = new KontrolaUdajuCervenyZavodnik(window, zapas);
		this.kontrolaUdajuModry = new KontrolaUdajuModryZavodnik(window, zapas);
		this.kontrolaUdajuRozhodci = new KontrolaUdajuRozhodci(window);
		this.kontrolaUdajuZapas = new KontrolaUdajuZapas(window, zapas);
		this.kontrolaKategorie = new KontrolaKategorie(window, zapas);
		
		setBackground(Color.GRAY);
				setLayout(null);

		//Button that sends you to another screen	
		
				presunNaZapas = new JButton("P�esunout na z�pas");
				presunNaZapas.setEnabled(false);
				presunNaZapas.addActionListener(new ActionListener() {
					@Override
					public void actionPerformed(ActionEvent e) {
						
						kontrolaUdajuCerveny.ZiskaniUdajuCerveny();
						kontrolaUdajuModry.ZiskaniUdajuModry();
						kontrolaKategorie.ZiskaniUdaju();
						kontrolaUdajuZapas.ZiskaniUdajuZapasu();
						
						zapas.setExtendedState(JFrame.MAXIMIZED_BOTH);
						zapas.setUndecorated(true);
						zapas.show();
					}
				});
				presunNaZapas.setFocusable(false);
				presunNaZapas.setCursor(new Cursor(Cursor.HAND_CURSOR));
				presunNaZapas.setBorder(BorderFactory.createLineBorder(Color.DARK_GRAY));
				presunNaZapas.setBackground(Color.WHITE);
				presunNaZapas.setFont(new Font("Arial", Font.BOLD, 12));
				presunNaZapas.setBounds(205, 10, 130, 25);
				add(presunNaZapas);
				
			//Button to set everything
				
				potvrzeniUdaju = new JButton("Povrdit");
				potvrzeniUdaju.setToolTipText("Potvrzen� zadan�ch �daj�");
				potvrzeniUdaju.addActionListener(new ActionListener() {
					@Override
					public void actionPerformed(ActionEvent e) {
						window.povoleno = true;
						window.datumPovoleno = true;
						if (kontrolaKategorie.KontrolaVyplneni() == false) {
							JOptionPane.showMessageDialog(null, "Chyb� �daj/e v kategori�ch z�pasu!", "ERROR", JOptionPane.ERROR_MESSAGE);
						} else if (kontrolaUdajuCerveny.KontrolaVyplneni() == false) {
							JOptionPane.showMessageDialog(null, "Chyb� �daj/e u �erven�ho z�vodn�ka!", "ERROR", JOptionPane.ERROR_MESSAGE);
						} else if (kontrolaUdajuModry.KontrolaVyplneni() == false) {
							JOptionPane.showMessageDialog(null, "Chyb� �daj/e u modr�ho z�vodn�ka!", "ERROR", JOptionPane.ERROR_MESSAGE);
						} else if (kontrolaUdajuRozhodci.KontrolaVyplneni() == false) {
							JOptionPane.showMessageDialog(null, "Chyb� �daj/e u rozhod��ho!", "ERROR", JOptionPane.ERROR_MESSAGE);
						} else if (kontrolaUdajuZapas.KontrolaVyplneni() == false) {
							JOptionPane.showMessageDialog(null, "Chyb� �daj/e v �daj�ch o z�pase!", "ERROR", JOptionPane.ERROR_MESSAGE);
						} else if (window.povoleno == false) {
							presunNaZapas.setEnabled(false);
						} else if (window.datumPovoleno == false) {
							JOptionPane.showMessageDialog(null, "Licence ji� nen� platn�! Zadejte jin� datum licence.", "WARNING - Neplatn� licence rozhod��ho", JOptionPane.WARNING_MESSAGE);
						} else {
							
							kontrolaUdajuModry.EditPolicekNepovolen();
							kontrolaUdajuCerveny.EditPolicekNepovolen();
							kontrolaUdajuRozhodci.EditPolicekNepovolen();
							kontrolaKategorie.EditPolicekNepovolen();
							kontrolaUdajuZapas.EditPolicekNepovolen();

							presunNaZapas.setEnabled(true);
							upraveniUdaju.setEnabled(true);
							refreshUdaju.setEnabled(true);
							potvrzeniUdaju.setEnabled(false);
							
						}
					}
				});
				potvrzeniUdaju.setFocusable(false);
				potvrzeniUdaju.setCursor(new Cursor(Cursor.HAND_CURSOR));
				potvrzeniUdaju.setBorder(BorderFactory.createLineBorder(Color.DARK_GRAY));
				potvrzeniUdaju.setBackground(Color.WHITE);
				potvrzeniUdaju.setFont(new Font("Arial", Font.BOLD, 12));
				potvrzeniUdaju.setBounds(140, 10, 60, 25);
				add(potvrzeniUdaju);
				
			//Button to edit everything
				
				upraveniUdaju = new JButton("Upravit");
				upraveniUdaju.setToolTipText("Upraven� �daj�");
				upraveniUdaju.setEnabled(false);
				upraveniUdaju.addActionListener(new ActionListener() {
					@Override
					public void actionPerformed(ActionEvent e) {
						kontrolaUdajuCerveny.EditPolicekPovolen();
						kontrolaUdajuModry.EditPolicekPovolen();
						kontrolaUdajuRozhodci.EditPolicekPovolen();
						kontrolaUdajuZapas.EditPolicekPovolen();
						kontrolaKategorie.EditPolicekPovolen();
						
						presunNaZapas.setEnabled(false);
						potvrzeniUdaju.setEnabled(true);
						upraveniUdaju.setEnabled(false);
						refreshUdaju.setEnabled(true);
						
					}
				});
				upraveniUdaju.setFocusable(false);
				upraveniUdaju.setCursor(new Cursor(Cursor.HAND_CURSOR));
				upraveniUdaju.setBorder(BorderFactory.createLineBorder(Color.DARK_GRAY));
				upraveniUdaju.setBackground(Color.WHITE);
				upraveniUdaju.setFont(new Font("Arial", Font.BOLD, 12));
				upraveniUdaju.setBounds(75, 10, 60, 25);
				add(upraveniUdaju);
				
			//Button to refresh everything	
				
				refreshUdaju = new JButton("Refresh");
				refreshUdaju.setToolTipText("Refresh �daj�");
				refreshUdaju.addActionListener(new ActionListener() {
					@Override
					public void actionPerformed(ActionEvent e) {
						kontrolaUdajuCerveny.RefreshPolicek();
						kontrolaUdajuModry.RefreshPolicek();
						kontrolaUdajuRozhodci.RefreshPolicek();
						kontrolaUdajuZapas.RefreshPolicek();
						kontrolaKategorie.RefreshPolicek();
						
						presunNaZapas.setEnabled(false);
						upraveniUdaju.setEnabled(false);
						refreshUdaju.setEnabled(false);
						
					}
					
				});
				refreshUdaju.setEnabled(false);
				refreshUdaju.setFocusable(false);
				refreshUdaju.setCursor(new Cursor(Cursor.HAND_CURSOR));
				refreshUdaju.setBorder(BorderFactory.createLineBorder(Color.DARK_GRAY));
				refreshUdaju.setBackground(Color.WHITE);
				refreshUdaju.setFont(new Font("Arial", Font.BOLD, 12));
				refreshUdaju.setBounds(10, 10, 60, 25);
				add(refreshUdaju);
		
	}

}

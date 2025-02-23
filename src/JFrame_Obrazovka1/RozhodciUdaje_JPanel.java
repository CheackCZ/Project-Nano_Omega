package JFrame_Obrazovka1;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.Font;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.LineBorder;
import javax.swing.text.AttributeSet;
import javax.swing.text.BadLocationException;
import javax.swing.text.PlainDocument;
import javax.swing.JComboBox;

import Zaverecny_projekt.Osoba;


public class RozhodciUdaje_JPanel extends JPanel {

	public JLabel fotoRozhodci;
	public JTextField popisRozhodci;

	public JTextField vekRozhodci;
	public JTextField pasekRozhodci;
	public JTextField licenceRozhodci;
	
	public JTextField zadaniVekRozhodci;

	public JTextField zadaniDnePlatnostiLicence;
	public JTextField zadaniMesicePlatnostiLicence;
	public JTextField zadaniRokuPlatnostiLicence;
	
	public JComboBox boxPaskyRozhodci;
	
	public Osoba osoba = new Osoba();;
	
	/**
	 * Create the panel.
	 */
	public RozhodciUdaje_JPanel() {
		
		setBackground(Color.DARK_GRAY);
		 setLayout(null);
		 
		//JLabel - photo for better design
		 fotoRozhodci = new JLabel("");
		 fotoRozhodci.setIcon(new ImageIcon("img/account_photo.png"));
		 fotoRozhodci.setBounds(39, 0, 100, 105);
		 add(fotoRozhodci);
		 
		//JTextField - title of the photo above
		 popisRozhodci = new JTextField("Rozhod��");
		 popisRozhodci.setHorizontalAlignment(SwingConstants.CENTER);
		 popisRozhodci.setFont(new Font("Arial", Font.BOLD, 12));
		 popisRozhodci.setForeground(Color.WHITE);
		 popisRozhodci.setBorder(BorderFactory.createLineBorder(Color.DARK_GRAY));
		 popisRozhodci.setEditable(false);
		 popisRozhodci.setBackground(Color.DARK_GRAY);
		 popisRozhodci.setBounds(39, 115, 100, 20);
		 add(popisRozhodci);
		 popisRozhodci.setColumns(10);
		 
		 
		//JTextField - for user to know where to write age of referee
		 vekRozhodci = new JTextField("V�k");
		 vekRozhodci.setForeground(Color.WHITE);
		 vekRozhodci.setBorder(BorderFactory.createLineBorder(Color.DARK_GRAY));
		 vekRozhodci.setEditable(false);
		 vekRozhodci.setFont(new Font("Arial", Font.BOLD, 15));
		 vekRozhodci.setBackground(Color.DARK_GRAY);
		 vekRozhodci.setBounds(0, 145, 35, 25);
		 add(vekRozhodci);
		 vekRozhodci.setColumns(10);
		 
		//JTextField - for user to write in the age of the referee
		 zadaniVekRozhodci = new JTextField();
		 zadaniVekRozhodci.addKeyListener((KeyListener) new KeyAdapter() {
			 public void keyTyped(KeyEvent e) {
				 char c = e.getKeyChar();
				 if ( ((c < '0') || (c > '9')) && (c != KeyEvent.VK_BACK_SPACE)) {
					 e.consume();  
				 }
			 }
		 });
		 zadaniVekRozhodci.setDocument(new JTextFieldLimit(2));
		 zadaniVekRozhodci.setBorder(BorderFactory.createLineBorder(Color.DARK_GRAY));
		 zadaniVekRozhodci.setHorizontalAlignment(SwingConstants.TRAILING);
		 zadaniVekRozhodci.setFont(new Font("Arial", Font.BOLD, 12));
		 zadaniVekRozhodci.setBackground(Color.WHITE);
		 zadaniVekRozhodci.setBounds(35, 145, 25, 25);
		 add(zadaniVekRozhodci);
		 zadaniVekRozhodci.setColumns(10);

		 
		//JTextField - for user to know where to write the belt of the referee
		 pasekRozhodci = new JTextField("P�sek");
		 pasekRozhodci.setForeground(Color.WHITE);
		 pasekRozhodci.setBorder(BorderFactory.createLineBorder(Color.DARK_GRAY));
		 pasekRozhodci.setEditable(false);
		 pasekRozhodci.setFont(new Font("Arial", Font.BOLD, 15));
		 pasekRozhodci.setBackground(Color.DARK_GRAY);
		 pasekRozhodci.setBounds(65, 145, 50, 25);
		 add(pasekRozhodci);
		 pasekRozhodci.setColumns(10);
		 
		//JComboBox - Box with the belts for the referees 
		 boxPaskyRozhodci = new JComboBox(osoba.TechnickeStupneRozhodci);
		 boxPaskyRozhodci.setFocusable(false);
		 boxPaskyRozhodci.setCursor(new Cursor(Cursor.HAND_CURSOR));
		 boxPaskyRozhodci.setToolTipText("P�sky rozhod��");
		 boxPaskyRozhodci.setBackground(Color.white);
		 boxPaskyRozhodci.setFont(new Font("Arial", Font.BOLD, 12));
		 boxPaskyRozhodci.setBorder(new LineBorder(Color.DARK_GRAY, 1, true));
		 boxPaskyRozhodci.setBounds(120, 145, 60, 25);
		 add(boxPaskyRozhodci);
		 
		 
		//JTextField - for user to know where to write the license of the referee 
		 licenceRozhodci = new JTextField("Plat. lic.");
		 licenceRozhodci.setForeground(Color.WHITE);
		 licenceRozhodci.setBorder(BorderFactory.createLineBorder(Color.DARK_GRAY));
		 licenceRozhodci.setEditable(false);
		 licenceRozhodci.setFont(new Font("Arial", Font.BOLD, 15));
		 licenceRozhodci.setBackground(Color.DARK_GRAY);
		 licenceRozhodci.setBounds(0, 180, 60, 25);
		 add(licenceRozhodci);
		 licenceRozhodci.setColumns(10);
		 
	//JTextFields - For user to write in the expiration date of the license of the referee

		//JTextField - to write in the day of the expiration
		 zadaniDnePlatnostiLicence = new JTextField();
		 zadaniDnePlatnostiLicence.addKeyListener((KeyListener) new KeyAdapter() {
			 public void keyTyped(KeyEvent e) {
				 char c = e.getKeyChar();
				 if ( ((c < '0') || (c > '9')) && (c != KeyEvent.VK_BACK_SPACE)) {
					 e.consume();  
				 }
			 }
		 });
		 zadaniDnePlatnostiLicence.setDocument(new JTextFieldLimit(2));
		 zadaniDnePlatnostiLicence.setToolTipText("Zad�n� dne platnosti licence");
		 zadaniDnePlatnostiLicence.setBorder(BorderFactory.createLineBorder(Color.DARK_GRAY));
		 zadaniDnePlatnostiLicence.setHorizontalAlignment(SwingConstants.TRAILING);
		 zadaniDnePlatnostiLicence.setFont(new Font("Arial", Font.BOLD, 12));
		 zadaniDnePlatnostiLicence.setBackground(Color.WHITE);
		 zadaniDnePlatnostiLicence.setBounds(65, 180, 25, 25);
		 add(zadaniDnePlatnostiLicence);
		 zadaniDnePlatnostiLicence.setColumns(10);
		 
		//JTextField - to write in the month of the expiration
		 zadaniMesicePlatnostiLicence = new JTextField();
		 zadaniMesicePlatnostiLicence.addKeyListener((KeyListener) new KeyAdapter() {
			 public void keyTyped(KeyEvent e) {
				 char c = e.getKeyChar();
				 if ( ((c < '0') || (c > '9')) && (c != KeyEvent.VK_BACK_SPACE)) {
					 e.consume();  
				 }
			 }
		 });
		 zadaniMesicePlatnostiLicence.setDocument(new JTextFieldLimit(2));
		 zadaniMesicePlatnostiLicence.setToolTipText("Zad�n� m�s�ce platnosti licence");
		 zadaniMesicePlatnostiLicence.setBorder(BorderFactory.createLineBorder(Color.DARK_GRAY));
		 zadaniMesicePlatnostiLicence.setHorizontalAlignment(SwingConstants.TRAILING);
		 zadaniMesicePlatnostiLicence.setFont(new Font("Arial", Font.BOLD, 12));
		 zadaniMesicePlatnostiLicence.setBackground(Color.WHITE);
		 zadaniMesicePlatnostiLicence.setBounds(95, 180, 25, 25);
		 add(zadaniMesicePlatnostiLicence);
		 zadaniMesicePlatnostiLicence.setColumns(10);
		 
		//JTextField - to write in the year of the expiration
		 zadaniRokuPlatnostiLicence = new JTextField();
		 zadaniRokuPlatnostiLicence.addKeyListener((KeyListener) new KeyAdapter() {
			 public void keyTyped(KeyEvent e) {
				 char c = e.getKeyChar();
				 if ( ((c < '0') || (c > '9')) && (c != KeyEvent.VK_BACK_SPACE)) {
					 e.consume();  
				 }
			 }
		 });
		 zadaniRokuPlatnostiLicence.setDocument(new JTextFieldLimit(4));
		 zadaniRokuPlatnostiLicence.setToolTipText("Zad�n� roku platnosti licence");
		 zadaniRokuPlatnostiLicence.setBorder(BorderFactory.createLineBorder(Color.DARK_GRAY));
		 zadaniRokuPlatnostiLicence.setHorizontalAlignment(SwingConstants.TRAILING);
		 zadaniRokuPlatnostiLicence.setFont(new Font("Arial", Font.BOLD, 12));
		 zadaniRokuPlatnostiLicence.setBackground(Color.WHITE);
		 zadaniRokuPlatnostiLicence.setBounds(125, 180, 53, 25);
		 add(zadaniRokuPlatnostiLicence);
		 zadaniRokuPlatnostiLicence.setColumns(10);
		 
	}
	
	class JTextFieldLimit extends PlainDocument { 
		   public int limit;
		   JTextFieldLimit(int limit) {
		      super();
		      this.limit = limit;
		   }
		   JTextFieldLimit(int limit, boolean upper) {
		      super();
		      this.limit = limit;
		   }
		   public void insertString(int offset, String str, AttributeSet attr) throws BadLocationException {
		      if (str == null)
		         return;
		      if ((getLength() + str.length()) <= limit) {
		         super.insertString(offset, str, attr);
		      }
		   }
		}	
}

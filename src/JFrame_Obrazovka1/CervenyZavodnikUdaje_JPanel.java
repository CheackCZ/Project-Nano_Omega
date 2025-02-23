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

import Zaverecny_projekt.Osoba;

import javax.swing.JComboBox;

public class CervenyZavodnikUdaje_JPanel extends JPanel {

	private JLabel fotoCervenyZavodnik;
	private JTextField popisCerZavodnik;

	private JTextField jmenoCerveny;
	private JTextField prijmeniCerveny;
	private JTextField vekCerveny;
	private JTextField vahaCerveny;
	private JTextField pasekCerveny;
	private JTextField oddilCerveny;
	
	public JTextField zadaniJmenaCerveny;
	public JTextField zadaniPrijmeniCerveny;
	public JTextField zadaniVekCerveny;
	public JTextField zadaniVahyCerveny;
	public JTextField zadaniOddilCerveny;
	
	public JComboBox boxPaskyCerveny;
	
	public Osoba osoba = new Osoba();;
	
	private Window window;
	
	/**
	 * Create the panel.
	 */
	public CervenyZavodnikUdaje_JPanel(Window window) {
		
		this.window = window;
		
		setLayout(null);
		setBackground(Color.DARK_GRAY);
		
		//JLabel - photo for better design
		 fotoCervenyZavodnik = new JLabel("");
		 fotoCervenyZavodnik.setIcon(new ImageIcon("img/account_photo.png"));
		 fotoCervenyZavodnik.setBounds(0, 3, 100, 105);
		 add(fotoCervenyZavodnik);
		 
	    //JTextField - title of the photo above
		 popisCerZavodnik = new JTextField("�erven� z�vodn�k");
		 popisCerZavodnik.setHorizontalAlignment(SwingConstants.CENTER);
		 popisCerZavodnik.setFont(new Font("Arial", Font.BOLD, 12));
		 popisCerZavodnik.setForeground(Color.RED);
		 popisCerZavodnik.setBorder(BorderFactory.createLineBorder(Color.DARK_GRAY));
		 popisCerZavodnik.setEditable(false);
		 popisCerZavodnik.setBackground(Color.DARK_GRAY);
		 popisCerZavodnik.setBounds(-4, 116, 110, 20);
		 add(popisCerZavodnik);
		 
		//JTextField - for user to know, where he has to write the first name of the red competitor
		 jmenoCerveny = new JTextField("Jm�no");
		 jmenoCerveny.setForeground(Color.WHITE);
		 jmenoCerveny.setBorder(BorderFactory.createLineBorder(Color.DARK_GRAY));
		 jmenoCerveny.setEditable(false);
		 jmenoCerveny.setFont(new Font("Arial", Font.BOLD, 15));
		 jmenoCerveny.setBackground(Color.DARK_GRAY);
		 jmenoCerveny.setBounds(120, 0, 69, 25);
		 add(jmenoCerveny);
		 
		//JTextField - for user to know, where he has to write the last name of the red competitor
		 prijmeniCerveny = new JTextField("P�ijmen�");
		 prijmeniCerveny.setForeground(Color.WHITE);
		 prijmeniCerveny.setBorder(BorderFactory.createLineBorder(Color.DARK_GRAY));
		 prijmeniCerveny.setEditable(false);
		 prijmeniCerveny.setFont(new Font("Arial", Font.BOLD, 15));
		 prijmeniCerveny.setBackground(Color.DARK_GRAY);
		 prijmeniCerveny.setBounds(120, 35, 69, 25);
		 add(prijmeniCerveny);
		 
		//JTextField - for user to know, where he has to write the age of the red competitor
		 vekCerveny = new JTextField("V�k");
		 vekCerveny.setForeground(Color.white);
		 vekCerveny.setBorder(BorderFactory.createLineBorder(Color.DARK_GRAY));
		 vekCerveny.setEditable(false);
		 vekCerveny.setFont(new Font("Arial", Font.BOLD, 15));
		 vekCerveny.setBackground(Color.DARK_GRAY);
		 vekCerveny.setBounds(120, 70, 69, 25);
		 add(vekCerveny);
		 vekCerveny.setColumns(10);
		 
		//JTextField - for user to know, where he has to write the weight of the red competitor
		 vahaCerveny = new JTextField("V�ha");
		 vahaCerveny.setForeground(Color.WHITE);
		 vahaCerveny.setBorder(BorderFactory.createLineBorder(Color.DARK_GRAY));
		 vahaCerveny.setEditable(false);
		 vahaCerveny.setFont(new Font("Arial", Font.BOLD, 15));
		 vahaCerveny.setBackground(Color.DARK_GRAY);
		 vahaCerveny.setBounds(120, 105, 69, 25);
		 add(vahaCerveny);
		 vahaCerveny.setColumns(10);
		 
		//JTextField - for user to know, where he has to write the belt of the red competitor
		 pasekCerveny = new JTextField("P�sek");
		 pasekCerveny.setForeground(Color.WHITE);
		 pasekCerveny.setBorder(BorderFactory.createLineBorder(Color.DARK_GRAY));
		 pasekCerveny.setEditable(false);
		 pasekCerveny.setFont(new Font("Arial", Font.BOLD, 15));
		 pasekCerveny.setBackground(Color.DARK_GRAY);
		 pasekCerveny.setBounds(120, 140, 69, 25);
		 add(pasekCerveny);
		 pasekCerveny.setColumns(10);		
		 
		//JTextField - for user to know, where he has to write the team of the red competitor
		 oddilCerveny = new JTextField("Odd�l/T�m");
		 oddilCerveny.setForeground(Color.WHITE);
		 oddilCerveny.setBorder(BorderFactory.createLineBorder(Color.DARK_GRAY));
		 oddilCerveny.setEditable(false);
		 oddilCerveny.setFont(new Font("Arial", Font.BOLD, 15));
		 oddilCerveny.setBackground(Color.DARK_GRAY);
		 oddilCerveny.setBounds(120, 175, 80, 25);
		 add(oddilCerveny);
		 
		//JTextField - field for user to write in the first name of the red competitor
		 zadaniJmenaCerveny = new JTextField();
		 zadaniJmenaCerveny.addKeyListener(new KeyAdapter() {
			  public void keyTyped(KeyEvent e) {
			    char c = e.getKeyChar();
			       if(!(Character.isAlphabetic(c) || (c==KeyEvent.VK_BACK_SPACE) || c==KeyEvent.VK_DELETE )) {
			        e.consume();  
			       }
			  }
			});
		 zadaniJmenaCerveny.setBorder(BorderFactory.createLineBorder(Color.DARK_GRAY));
		 zadaniJmenaCerveny.setHorizontalAlignment(SwingConstants.LEFT);
		 zadaniJmenaCerveny.setFont(new Font("Arial", Font.BOLD, 12));
		 zadaniJmenaCerveny.setBackground(Color.WHITE);
		 zadaniJmenaCerveny.setDocument(new JTextFieldLimit(10));
		 zadaniJmenaCerveny.setBounds(209, 0, 110, 25);
		 add(zadaniJmenaCerveny);
		 
		//JTextField - field for user to write in the last name of the red competitor
		 zadaniPrijmeniCerveny = new JTextField();
		 zadaniPrijmeniCerveny.addKeyListener(new KeyAdapter() {
			  public void keyTyped(KeyEvent e) {
			    char c = e.getKeyChar();
			       if(!(Character.isAlphabetic(c) || (c==KeyEvent.VK_BACK_SPACE) || c==KeyEvent.VK_DELETE )) {
			        e.consume();  
			       }
			   }
			});
		 zadaniPrijmeniCerveny.setBorder(BorderFactory.createLineBorder(Color.DARK_GRAY));
		 zadaniPrijmeniCerveny.setHorizontalAlignment(SwingConstants.LEFT);
		 zadaniPrijmeniCerveny.setFont(new Font("Arial", Font.BOLD, 12));
		 zadaniPrijmeniCerveny.setBackground(Color.WHITE);
		 zadaniPrijmeniCerveny.setDocument(new JTextFieldLimit(10));
		 zadaniPrijmeniCerveny.setBounds(209, 35, 110, 25);
		 add(zadaniPrijmeniCerveny);
		 
		//JTextField - field for user to write in the age of the red competitor
		 zadaniVekCerveny = new JTextField();
		 zadaniVekCerveny.addKeyListener((KeyListener) new KeyAdapter() {
			 public void keyTyped(KeyEvent e) {
				 char c = e.getKeyChar();
				 if ( ((c < '0') || (c > '9')) && (c != KeyEvent.VK_BACK_SPACE)) {
					 e.consume();  
				 }
			 }
		 });
		 zadaniVekCerveny.setBorder(BorderFactory.createLineBorder(Color.DARK_GRAY));
		 zadaniVekCerveny.setHorizontalAlignment(SwingConstants.LEFT);
		 zadaniVekCerveny.setFont(new Font("Arial", Font.BOLD, 12));
		 zadaniVekCerveny.setBackground(Color.WHITE);
		 zadaniVekCerveny.setDocument(new JTextFieldLimit(2));
		 zadaniVekCerveny.setBounds(209, 70, 110, 25);
		 add(zadaniVekCerveny);
		 
		//JTextField - field for user to write in the weight of the red competitor 
		 zadaniVahyCerveny = new JTextField();
		 zadaniVahyCerveny.addKeyListener(new KeyAdapter() {
				boolean uzPouzito;
				 public void keyTyped(KeyEvent e) {
					  char c = e.getKeyChar();
						 if ( ((c < '0') || (c > '9')) && (c != KeyEvent.VK_BACK_SPACE)) {
						        if((Character.isDigit(c))||(c==KeyEvent.VK_PERIOD)||(c==KeyEvent.VK_BACK_SPACE)){
						            int punto=0;
						            if(c==KeyEvent.VK_PERIOD){ 
						                        String s=zadaniVahyCerveny.getText();
						                        int dot=s.indexOf('.');
						                        punto=dot;
						                        if(dot!=-1){
						                            getToolkit().beep();
						                            e.consume();
						                        }
						                    }
						        }
						        else{    
						            getToolkit().beep();
						            e.consume();
						        }
						 }
					 }
				});
		 zadaniVahyCerveny.setBorder(BorderFactory.createLineBorder(Color.DARK_GRAY));
		 zadaniVahyCerveny.setHorizontalAlignment(SwingConstants.LEFT);
		 zadaniVahyCerveny.setFont(new Font("Arial", Font.BOLD, 12));
		 zadaniVahyCerveny.setBackground(Color.WHITE);
		 zadaniVahyCerveny.setDocument(new JTextFieldLimit(4));
		 zadaniVahyCerveny.setBounds(209, 105, 110, 25);
		 add(zadaniVahyCerveny);
		 
		//JComboBox - Box with the belts for the competitors 
		 boxPaskyCerveny = new JComboBox(osoba.TechnickeStupneZavodnici);
		 boxPaskyCerveny.setFocusable(false);
		 boxPaskyCerveny.setCursor(new Cursor(Cursor.HAND_CURSOR));
		 boxPaskyCerveny.setToolTipText("P�sky z�vodn�ci");
		 boxPaskyCerveny.setBackground(Color.white);
		 boxPaskyCerveny.setFont(new Font("Arial", Font.BOLD, 12));
		 boxPaskyCerveny.setBorder(new LineBorder(Color.DARK_GRAY, 1, true));
		 boxPaskyCerveny.setBounds(209, 140, 110, 25);
		 add(boxPaskyCerveny);
		 
		//JTextField - field for user to write in the team of the red competitor
		 zadaniOddilCerveny = new JTextField();
		 zadaniOddilCerveny.addKeyListener(new KeyAdapter() {
			  public void keyTyped(KeyEvent e) {
			    char c = e.getKeyChar();
			       if(!(Character.isAlphabetic(c) || (c==KeyEvent.VK_BACK_SPACE) || c==KeyEvent.VK_DELETE )) {
			    	   if ((c == ' ') || (c == '-')) {
			    	   } else {
			    		   e.consume();			    		   
			    	   }
			       } 
			  }
			});
		 zadaniOddilCerveny.setBorder(BorderFactory.createLineBorder(Color.DARK_GRAY));
		 zadaniOddilCerveny.setHorizontalAlignment(SwingConstants.LEFT);
		 zadaniOddilCerveny.setFont(new Font("Arial", Font.BOLD, 12));
		 zadaniOddilCerveny.setBackground(Color.WHITE);
		 zadaniOddilCerveny.setBounds(209, 175, 110, 25);
		 add(zadaniOddilCerveny);
		 
	}

	//Class/Method - maximum size of text in textfield 
	 class JTextFieldLimit extends PlainDocument {
		   private int limit;
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


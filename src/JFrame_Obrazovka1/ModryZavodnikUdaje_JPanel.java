package JFrame_Obrazovka1;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.Font;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.LineBorder;
import javax.swing.text.AttributeSet;
import javax.swing.text.BadLocationException;
import javax.swing.text.PlainDocument;

import Zaverecny_projekt.Osoba;

public class ModryZavodnikUdaje_JPanel extends JPanel {

	private JLabel fotoModryZavodnik;
	private JTextField popisModryZavodnik;

	private JTextField jmenoModry;
	private JTextField prijmeniModry;
	private JTextField vekModry;
	private JTextField vahaModry;
	private JTextField pasekModry;
	private JTextField oddilModry;
	
    public JTextField zadaniJmenaModry;
	public JTextField zadaniPrijmeniModry;
	public JTextField zadaniVekModry;
	public JTextField zadaniVahyModry;
	public JTextField zadaniOddilModry;
	
	public JComboBox boxPasekModry;
	
	public Osoba osoba = new Osoba();;
	
	/**
	 * Create the panel.
	 */
	public ModryZavodnikUdaje_JPanel() {
		
		setBackground(Color.DARK_GRAY);
		 setLayout(null);

		//JLabel - photo for better design
		 fotoModryZavodnik = new JLabel("");
		 fotoModryZavodnik.setIcon(new ImageIcon("img/account_photo.png"));
		 fotoModryZavodnik.setBounds(219, 3, 100, 105);
		 add(fotoModryZavodnik);		 
		 
		//JTextField - title of the photo above
		 popisModryZavodnik = new JTextField("Modr� z�vodn�k");
		 popisModryZavodnik.setHorizontalAlignment(SwingConstants.CENTER);
		 popisModryZavodnik.setFont(new Font("Arial", Font.BOLD, 12));
		 popisModryZavodnik.setForeground(Color.CYAN);
		 popisModryZavodnik.setBorder(BorderFactory.createLineBorder(Color.DARK_GRAY));
		 popisModryZavodnik.setEditable(false);
		 popisModryZavodnik.setBackground(Color.DARK_GRAY);
		 popisModryZavodnik.setBounds(219, 116, 100, 20);
		 add(popisModryZavodnik);
		 
		//JTextField - for user to know, where he has to write the first name of the blue competitor
		 jmenoModry = new JTextField("Jm�no");
		 jmenoModry.setForeground(Color.WHITE);
		 jmenoModry.setBorder(BorderFactory.createLineBorder(Color.DARK_GRAY));
		 jmenoModry.setEditable(false);
		 jmenoModry.setFont(new Font("Arial", Font.BOLD, 15));
		 jmenoModry.setBackground(Color.DARK_GRAY);
		 jmenoModry.setBounds(0, 0, 69, 25);
		 add(jmenoModry);

		//JTextField - for user to know, where he has to write the last name of the blue competitor
		 prijmeniModry = new JTextField("P�ijmen�");
		 prijmeniModry.setForeground(Color.WHITE);
		 prijmeniModry.setBorder(BorderFactory.createLineBorder(Color.DARK_GRAY));
		 prijmeniModry.setEditable(false);
		 prijmeniModry.setFont(new Font("Arial", Font.BOLD, 15));
		 prijmeniModry.setBackground(Color.DARK_GRAY);
		 prijmeniModry.setBounds(0, 35, 69, 25);
		 add(prijmeniModry);
		 
		//JTextField - for user to know, where he has to write the age of the blue competitor
		 vekModry = new JTextField("V�k");
		 vekModry.setForeground(Color.WHITE);
		 vekModry.setBorder(BorderFactory.createLineBorder(Color.DARK_GRAY));
		 vekModry.setEditable(false);
		 vekModry.setFont(new Font("Arial", Font.BOLD, 15));
		 vekModry.setBackground(Color.DARK_GRAY);
		 vekModry.setBounds(0, 70, 69, 25);
		 add(vekModry);
		 
		//JTextField - for user to know, where he has to write the weight of the blue competitor
		 vahaModry = new JTextField("V�ha");
		 vahaModry.setForeground(Color.WHITE);
		 vahaModry.setBorder(BorderFactory.createLineBorder(Color.DARK_GRAY));
		 vahaModry.setEditable(false);
		 vahaModry.setFont(new Font("Arial", Font.BOLD, 15));
		 vahaModry.setBackground(Color.DARK_GRAY);
		 vahaModry.setBounds(0, 105, 69, 25);
		 add(vahaModry);
		 
		//JTextField - for user to know, where he has to write the belt of the blue competitor
		 pasekModry = new JTextField("P�sek");
		 pasekModry.setForeground(Color.WHITE);
		 pasekModry.setBorder(BorderFactory.createLineBorder(Color.DARK_GRAY));
		 pasekModry.setEditable(false);
		 pasekModry.setFont(new Font("Arial", Font.BOLD, 15));
		 pasekModry.setBackground(Color.DARK_GRAY);
		 pasekModry.setBounds(0, 140, 69, 25);
		 add(pasekModry);
		 
		//JTextField - for user to know, where he has to write the team of the blue competitor
		 oddilModry = new JTextField("Odd�l/T�m");
		 oddilModry.setForeground(Color.WHITE);
		 oddilModry.setBorder(BorderFactory.createLineBorder(Color.DARK_GRAY));
		 oddilModry.setEditable(false);
		 oddilModry.setFont(new Font("Arial", Font.BOLD, 15));
		 oddilModry.setBackground(Color.DARK_GRAY);
		 oddilModry.setBounds(0, 175, 80, 25);
		 add(oddilModry);
		 
		//JTextField - field for user to write in the first name of the blue competitor
		 zadaniJmenaModry = new JTextField();
		 zadaniJmenaModry.addKeyListener(new KeyAdapter() {
			  public void keyTyped(KeyEvent e) {
			    char c = e.getKeyChar();
			       if(!(Character.isAlphabetic(c) || (c==KeyEvent.VK_BACK_SPACE) || c==KeyEvent.VK_DELETE )) {
			        e.consume();  
			    }
			   }
			});
		 zadaniJmenaModry.setBorder(BorderFactory.createLineBorder(Color.DARK_GRAY));
		 zadaniJmenaModry.setHorizontalAlignment(SwingConstants.RIGHT);
		 zadaniJmenaModry.setFont(new Font("Arial", Font.BOLD, 12));
		 zadaniJmenaModry.setBackground(Color.WHITE);
		 zadaniJmenaModry.setDocument(new JTextFieldLimit(10));
		 zadaniJmenaModry.setBounds(89, 0, 110, 25);
		 add(zadaniJmenaModry);
		 
		//JTextField - field for user to write in the last name of the blue competitor
		 zadaniPrijmeniModry = new JTextField();
		 zadaniPrijmeniModry.addKeyListener(new KeyAdapter() {
			  public void keyTyped(KeyEvent e) {
			    char c = e.getKeyChar();
			       if(!(Character.isAlphabetic(c) || (c==KeyEvent.VK_BACK_SPACE) || c==KeyEvent.VK_DELETE )) {
			        e.consume();  
			    }
			   }
			});
		 zadaniPrijmeniModry.setBorder(BorderFactory.createLineBorder(Color.DARK_GRAY));
		 zadaniPrijmeniModry.setHorizontalAlignment(SwingConstants.RIGHT);
		 zadaniPrijmeniModry.setFont(new Font("Arial", Font.BOLD, 12));
		 zadaniPrijmeniModry.setBackground(Color.WHITE);
		 zadaniPrijmeniModry.setDocument(new JTextFieldLimit(10));
		 zadaniPrijmeniModry.setBounds(89, 35, 110, 25);
		 add(zadaniPrijmeniModry);
		 
		//JTextField - field for user to write in the age of the blue competitor		 
		 zadaniVekModry = new JTextField();
		 zadaniVekModry.addKeyListener((KeyListener) new KeyAdapter() {
			 public void keyTyped(KeyEvent e) {
				 char c = e.getKeyChar();
				 if ( ((c < '0') || (c > '9')) && (c != KeyEvent.VK_BACK_SPACE)) {
					 e.consume();  
				 }
			 }
		 });
		 zadaniVekModry.setBorder(BorderFactory.createLineBorder(Color.DARK_GRAY));
		 zadaniVekModry.setHorizontalAlignment(SwingConstants.RIGHT);
		 zadaniVekModry.setFont(new Font("Arial", Font.BOLD, 12));
		 zadaniVekModry.setBackground(Color.WHITE);
		 zadaniVekModry.setBounds(89, 70, 110, 25);
		 zadaniVekModry.setDocument(new JTextFieldLimit(2));
		 add(zadaniVekModry);

		//JTextField - field for user to write in the weight of the blue competitor		 
		 zadaniVahyModry = new JTextField();
		 zadaniVahyModry.addKeyListener(new KeyAdapter() {
				boolean uzPouzito;
				 public void keyTyped(KeyEvent e) {
					  char c = e.getKeyChar();
						 if ( ((c < '0') || (c > '9')) && (c != KeyEvent.VK_BACK_SPACE)) {
						        if((Character.isDigit(c))||(c==KeyEvent.VK_PERIOD)||(c==KeyEvent.VK_BACK_SPACE)){
						            int punto=0;
						            if(c==KeyEvent.VK_PERIOD){ 
						                        String s=zadaniVahyModry.getText();
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
		 zadaniVahyModry.setBorder(BorderFactory.createLineBorder(Color.DARK_GRAY));
		 zadaniVahyModry.setHorizontalAlignment(SwingConstants.RIGHT);
		 zadaniVahyModry.setFont(new Font("Arial", Font.BOLD, 12));
		 zadaniVahyModry.setBackground(Color.WHITE);
		 zadaniVahyModry.setDocument(new JTextFieldLimit(4));
		 zadaniVahyModry.setBounds(89, 105, 110, 25);
		 add(zadaniVahyModry);
		 zadaniVahyModry.setColumns(10);
		 
		//JComboBox - Box with the belts for the competitors 
		 boxPasekModry = new JComboBox(osoba.TechnickeStupneZavodnici);
		 boxPasekModry.setFocusable(false);
	     boxPasekModry.setCursor(new Cursor(Cursor.HAND_CURSOR));
		 boxPasekModry.setToolTipText("P�sky z�vodn�ci");
		 boxPasekModry.setBackground(Color.white);
		 boxPasekModry.setFont(new Font("Arial", Font.BOLD, 12));
		 boxPasekModry.setBorder(new LineBorder(Color.DARK_GRAY, 1, true));
		 boxPasekModry.setBounds(89, 140, 110, 25);
		 add(boxPasekModry);
		 
		//JTextField - field for user to write in the belt of the blue competitor		 
		 zadaniOddilModry = new JTextField();
		 zadaniOddilModry.addKeyListener(new KeyAdapter() {
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
		 zadaniOddilModry.setBorder(BorderFactory.createLineBorder(Color.DARK_GRAY));
		 zadaniOddilModry.setHorizontalAlignment(SwingConstants.RIGHT);
		 zadaniOddilModry.setFont(new Font("Arial", Font.BOLD, 12));
		 zadaniOddilModry.setBackground(Color.WHITE);
		 zadaniOddilModry.setBounds(89, 175, 110, 25);
		 add(zadaniOddilModry);
		 
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

package JFrame_Obrazovka1;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.BorderFactory;
import javax.swing.Box;
import javax.swing.JComboBox;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.LineBorder;
import javax.swing.text.AttributeSet;
import javax.swing.text.BadLocationException;
import javax.swing.text.PlainDocument;

import Zaverecny_projekt.Ring;

public class Kategorie_JPanel extends JPanel {

	private JTextField VyberKategorie;
	
	private JTextField txtKg;
	private JTextField txtVek;
	private JTextField txtVaha;
	
	private JTextField CisloRingu;
	public JTextField ZadaniCislaRingu;
	
	public JComboBox VahoveKategorie;
	public JComboBox VekoveKategorie;
	
	private Ring ring;

	private Window window;
	
	/**
	 * Create the panel.
	 */
	public Kategorie_JPanel(Ring ring, Window window) {
		
		this.window = window;
		this.ring = ring;
		
		setSize(906, 78);
		setBackground(Color.DARK_GRAY);
		 setLayout(null); 

		 
		//TextField - for user to know what to choose 
		 VyberKategorie = new JTextField("Vyberte kategorii:");
		 VyberKategorie.setBounds(20, 20, 135, 38);
		 VyberKategorie.setForeground(Color.WHITE);
		 VyberKategorie.setBackground(Color.DARK_GRAY);
		 VyberKategorie.setBorder(BorderFactory.createLineBorder(Color.DARK_GRAY));
		 VyberKategorie.setEditable(false);
		 VyberKategorie.setFont(new Font("Arial Black", Font.BOLD, 12));
		 add(VyberKategorie);
		 VyberKategorie.setColumns(10);
		 
		 
		//JTextField - Helps the user to know what to choose 
		 txtVek = new JTextField("v\u011Bkovou");
		 txtVek.setBounds(165, 20, 70, 38);
		 txtVek.setForeground(Color.WHITE);
		 txtVek.setBackground(Color.DARK_GRAY);
		 txtVek.setBorder(BorderFactory.createLineBorder(Color.DARK_GRAY));
		 txtVek.setEditable(false);
		 txtVek.setFont(new Font("Arial Black", Font.BOLD, 12));
		 add(txtVek);
		 txtVek.setColumns(10);

		//ComboBox - choose from the boxes with age and gender categories
		 VekoveKategorie = new JComboBox(window.kategorie.vekoveKategorie);
		 VekoveKategorie.setFocusable(false);
		 VekoveKategorie.setToolTipText("V\u011Bkov\u00E1 kategorie");
		 VekoveKategorie.setCursor(new Cursor(Cursor.HAND_CURSOR));
		 VekoveKategorie.addActionListener(new ActionListener() {
			 public void actionPerformed(ActionEvent event) {
				 int vyber = VekoveKategorie.getSelectedIndex();
				 window.kategorie.NastaveniVekoveKategorie(vyber, window.kategorie);
				 window.kategorie.VybraniVahoveKategorie(window.kategorie, VahoveKategorie);
			 }
		 });
		 VekoveKategorie.setBackground(Color.WHITE);
		 VekoveKategorie.setFont(new Font("Arial", Font.BOLD, 12));
		 VekoveKategorie.setBorder(new LineBorder(Color.DARK_GRAY, 1, true));
		 VekoveKategorie.setCursor(new Cursor(Cursor.HAND_CURSOR));
		 VekoveKategorie.setBounds(245, 20, 180, 38);
		 add(VekoveKategorie);
	 	
		 
		//JTextField - Helps the user to know what to choose 
		 txtVaha = new JTextField("a v\u00E1hovou");
		 txtVaha.setBounds(435, 20, 80, 38);
		 txtVaha.setForeground(Color.WHITE);
		 txtVaha.setBackground(Color.DARK_GRAY);
		 txtVaha.setBorder(BorderFactory.createLineBorder(Color.DARK_GRAY));
		 txtVaha.setEditable(false);
		 txtVaha.setFont(new Font("Arial Black", Font.BOLD, 12));
		 add(txtVaha);
		 txtVaha.setColumns(10);
		 
	 	//ComboBox - choose the categorie
		 VahoveKategorie = new JComboBox();
		 VahoveKategorie.setFocusable(false);
		 VahoveKategorie.setCursor(new Cursor(Cursor.HAND_CURSOR));
		 VahoveKategorie.setBounds(525, 21, 70, 38);
		 VahoveKategorie.setToolTipText("V\u00E1hov\u00E1 kategorie");
		 VahoveKategorie.setBackground(Color.white);
		 VahoveKategorie.setFont(new Font("Arial", Font.BOLD, 12));
		 VahoveKategorie.setBorder(new LineBorder(Color.DARK_GRAY, 1, true));
		 add(VahoveKategorie);
		
		//JTextField - Shows the measurement for the weight category 
		 txtKg = new JTextField("Kg");
		 txtKg.setBounds(605, 20, 30, 38);
		 txtKg.setForeground(Color.WHITE);
		 txtKg.setBackground(Color.DARK_GRAY);
		 txtKg.setBorder(BorderFactory.createLineBorder(Color.DARK_GRAY));
		 txtKg.setEditable(false);
		 txtKg.setFont(new Font("Arial Black", Font.BOLD, 12));
		 add(txtKg);
		 
		//Box over the categories 
		 Box boxKategorie = Box.createHorizontalBox();
		 boxKategorie.setBorder(new LineBorder(Color.WHITE, 1, true));
		 boxKategorie.setBounds(10, 10, 635, 58);
		 add(boxKategorie);
		 
		 
		//TextField - for user to know, that he should write the number of the ring 
		 CisloRingu = new JTextField("Zadejte \u010D\u00EDslo ringu:");
		 CisloRingu.setBounds(686, 20, 140, 38);
		 CisloRingu.setForeground(Color.WHITE);
		 CisloRingu.setHorizontalAlignment(SwingConstants.CENTER);
		 CisloRingu.setBorder(BorderFactory.createLineBorder(Color.DARK_GRAY));
		 CisloRingu.setBackground(Color.DARK_GRAY);
		 CisloRingu.setFont(new Font("Arial Black", Font.BOLD, 12));
		 CisloRingu.setEditable(false);
		 add(CisloRingu);
			
		 //TextField - field for user to write in the number of ring 
		 ZadaniCislaRingu = new JTextField();
		 ZadaniCislaRingu.setBounds(836, 21, 50, 38);
		 ZadaniCislaRingu.addKeyListener((KeyListener) new KeyAdapter() {
			 public void keyTyped(KeyEvent e) {
				 char c = e.getKeyChar();
				 if ( ((c < '1') || (c > '9')) && (c != KeyEvent.VK_BACK_SPACE)) {
					 e.consume();  
					 }
				 }
			 });
		 ZadaniCislaRingu.setToolTipText("\u010C\u00EDslo ringu");
		 ZadaniCislaRingu.setBorder(BorderFactory.createLineBorder(Color.DARK_GRAY));
		 ZadaniCislaRingu.setDocument(new JTextFieldLimit(1));
		 ZadaniCislaRingu.setHorizontalAlignment(SwingConstants.CENTER);
		 ZadaniCislaRingu.setBackground(Color.WHITE);
		 ZadaniCislaRingu.setFont(new Font("Arial", Font.BOLD, 12));
		 add(ZadaniCislaRingu);
		
		//HorizontalBox - Design for the number of the ring column 
		 Box BoxCisloRingu = Box.createHorizontalBox();
		 BoxCisloRingu.setBounds(676, 10, 220, 58);
		 BoxCisloRingu.setBorder(new LineBorder(Color.WHITE, 1, true));
		 add(BoxCisloRingu);
		 
	}
	
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


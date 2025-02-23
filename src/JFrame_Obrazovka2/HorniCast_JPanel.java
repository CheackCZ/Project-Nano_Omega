package JFrame_Obrazovka2;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.LineBorder;

import JFrame_Obrazovka1.Window;

import java.awt.Font;
import javax.swing.JRadioButton;

public class HorniCast_JPanel extends JPanel {

	public JTextField txtKategorie;
	public JTextField txtCisloRingu;	
	
	public JRadioButton povinnaOtockaCerveny1;
	public JRadioButton povinnaOtockaCerveny2;
	
	public JRadioButton povinnaOtockaModry1;
	public JRadioButton povinnaOtockaModry2;
	
	private Window window;
	private Window2 zapas;
	
	Dimension dim;
	
	/**
	 * Create the panel.
	 */
	public HorniCast_JPanel(Window window, Window2 zapas) { 
		
		this.window = window;
		this.zapas = zapas;
		
		setBackground(Color.WHITE); 

		dim = Toolkit.getDefaultToolkit().getScreenSize();
		
		setLayout(null);
		setSize(1536, 235);
		
	   //TextField with the category  	
		txtKategorie = new JTextField();
		txtKategorie.setEditable(false);
		txtKategorie.setFont(new Font("MS Reference Sans Serif", Font.PLAIN, 60));
		txtKategorie.setHorizontalAlignment(SwingConstants.CENTER);
		txtKategorie.setForeground(Color.WHITE);
		txtKategorie.setBackground(Color.BLACK);
		txtKategorie.setBorder(BorderFactory.createLineBorder(Color.BLACK));
		txtKategorie.setBounds(0, 0, (int) dim.getWidth(), 135);
		add(txtKategorie);
		
		
	   //TextField with the number of the ring 	
		txtCisloRingu = new JTextField("RING");
		txtCisloRingu.setBorder(new LineBorder(Color.GREEN));
		txtCisloRingu.setEditable(false);
		txtCisloRingu.setHorizontalAlignment(SwingConstants.CENTER);
		txtCisloRingu.setFont(new Font("MS Reference Sans Serif", Font.BOLD, 48));
		txtCisloRingu.setForeground(Color.WHITE);
		txtCisloRingu.setBackground(new Color(0, 128, 0));
		txtCisloRingu.setBorder(BorderFactory.createLineBorder(new Color(0, 128, 0)));
		txtCisloRingu.setBounds(493, 135, 550, 100);
		add(txtCisloRingu);
		
		
	//Buttons that shows if the spinning kick was done or not by the red competitor
		
	   //JRadioButton that shows if the red competitor did the spinning kick in the first round or not
		povinnaOtockaCerveny1 = new JRadioButton("");
		povinnaOtockaCerveny1.setToolTipText("Povinn� oto�ka �erven�, 1. kolo");
		povinnaOtockaCerveny1.addActionListener(new ActionListener() {
			boolean kopnuto = false;
			public void actionPerformed(ActionEvent e) {
				if (kopnuto == true) {
					
				} else {
					povinnaOtockaCerveny1.setIcon(new ImageIcon("img/povinnaOtocka_selected_icon-red.png"));
					window.CervenyZavodnik.getStatistiky().PotvrzeniOtockyCerveny();
				}
				kopnuto = true;
			}
		}); 
		povinnaOtockaCerveny1.setIcon(new ImageIcon("img/povinnaOtocka_unselected_icon.png"));
		povinnaOtockaCerveny1.setForeground(Color.BLACK);
		povinnaOtockaCerveny1.setBackground(Color.WHITE);
		povinnaOtockaCerveny1.setHorizontalAlignment(SwingConstants.CENTER);
		povinnaOtockaCerveny1.setBounds(1416, 155, 60, 60);
		add(povinnaOtockaCerveny1);
		
	   //JRadioButton that shows if the red competitor did the spinning kick or in the second round not
		povinnaOtockaCerveny2 = new JRadioButton("");
		povinnaOtockaCerveny2.setToolTipText("Povinn� oto�ka �erven�, 2. kolo");
		povinnaOtockaCerveny2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				povinnaOtockaCerveny2.setIcon(new ImageIcon("img/povinnaOtocka_selected_icon-red.png"));
			}
		});
		povinnaOtockaCerveny2.setIcon(new ImageIcon("img/povinnaOtocka_unselected_icon.png"));
		povinnaOtockaCerveny2.setForeground(Color.BLACK);
		povinnaOtockaCerveny2.setBackground(Color.WHITE);
		povinnaOtockaCerveny2.setHorizontalAlignment(SwingConstants.CENTER);
		povinnaOtockaCerveny2.setBounds(1326, 155, 60, 60);
		add(povinnaOtockaCerveny2);
		
		

	 //Buttons that shows if the spinning kick was done or not by the red blue competitor

	   //JRadioButton that shows if the blue competitor did the spinning kick in the first round or not
		povinnaOtockaModry1 = new JRadioButton("");
		povinnaOtockaModry1.setToolTipText("Povinn� oto�ka modr�, 1. kolo");
		povinnaOtockaModry1.addActionListener(new ActionListener() {
			boolean kopnuto = false;
			public void actionPerformed(ActionEvent e) {
				if (kopnuto == true) {
					
				} else {
					povinnaOtockaModry1.setIcon(new ImageIcon("img/povinnaOtocka_selected_icon-blue.png"));
					window.ModryZavodnik.getStatistiky().PotvrzeniOtockyModry();	
				}
				kopnuto = true;
			}
		});
		povinnaOtockaModry1.setIcon(new ImageIcon("img/povinnaOtocka_unselected_icon.png"));
		povinnaOtockaModry1.setForeground(Color.BLACK);
		povinnaOtockaModry1.setBackground(Color.WHITE);
		povinnaOtockaModry1.setHorizontalAlignment(SwingConstants.CENTER);
		povinnaOtockaModry1.setBounds(60, 155, 60, 60);
		add(povinnaOtockaModry1);
		
	   //JRadioButton that shows if the blue competitor did the spinning kick in the second round or not
		povinnaOtockaModry2 = new JRadioButton("");
		povinnaOtockaModry2.setToolTipText("Povinn� oto�ka modr�, 2. kolo");
		povinnaOtockaModry2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				povinnaOtockaModry2.setIcon(new ImageIcon("img/povinnaOtocka_selected_icon-blue.png"));
			}
		});
		povinnaOtockaModry2.setIcon(new ImageIcon("img/povinnaOtocka_unselected_icon.png"));
		povinnaOtockaModry2.setForeground(Color.BLACK);
		povinnaOtockaModry2.setBackground(Color.WHITE);
		povinnaOtockaModry2.setHorizontalAlignment(SwingConstants.CENTER);
		povinnaOtockaModry2.setBounds(150, 155, 60, 60);
		add(povinnaOtockaModry2);
		
		
	}
}

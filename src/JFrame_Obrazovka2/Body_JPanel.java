package JFrame_Obrazovka2;

import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

import JFrame_Obrazovka1.Window;
import Zaverecny_projekt.Body;

import java.awt.Font;
import java.awt.Color;
import java.awt.Cursor;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;

public class Body_JPanel extends JPanel {
	
	private JTextField txtDvojtecka;
	
	public JButton btnBodyModry;
	public JButton btnBodyCerveny;
	
	public JLabel lblTriangle;

	private Window window;
	private Window2 zapas;
	
	public int count;
	
	/**
	 * Create the panel.
	 */
	public Body_JPanel(Window window, Window2 zapas) {
		setBackground(Color.WHITE); 
		
		this.window = window;
		this.zapas = zapas;
		
		this.setSize(375, 150); 
		this.setBorder(BorderFactory.createLineBorder(Color.BLACK));

		setLayout(null);
		
	   //The text between the points of the competitors
		txtDvojtecka = new JTextField(":");
		txtDvojtecka.setBackground(Color.WHITE);
		txtDvojtecka.setForeground(Color.BLACK);
		txtDvojtecka.setFont(new Font("Arial", Font.BOLD, 48));
		txtDvojtecka.setHorizontalAlignment(SwingConstants.CENTER);
		txtDvojtecka.setEditable(false);
		txtDvojtecka.setBorder(BorderFactory.createLineBorder(Color.WHITE));
		txtDvojtecka.setBounds(212, 10, 20, 130);
		add(txtDvojtecka);
		
		
	   //JButton - add points of the blue competitor	
		btnBodyModry = new JButton("-2");
		btnBodyModry.setFocusable(false);
		btnBodyModry.setToolTipText("Body - modr� z�vodn�k");
		btnBodyModry.setCursor(new Cursor(Cursor.HAND_CURSOR));
		btnBodyModry.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				window.ModryZavodnik.PridaniBoduModry();
				
				System.out.println("Modr� body: " + window.ModryZavodnik.getStatistiky().getBody().getBodyZavodnika());
				
				ViceBoduModry();
			}
		});
		btnBodyModry.setFont(new Font("Dialog", Font.PLAIN, 84));
		btnBodyModry.setForeground(Color.BLUE);
		btnBodyModry.setBackground(Color.WHITE);
		btnBodyModry.setBorder(BorderFactory.createLineBorder(Color.WHITE));
		btnBodyModry.setBounds(107, 20, 100, 110);
		add(btnBodyModry);
		
	   //JButton - add points of the red competitor	
		btnBodyCerveny = new JButton("-2");
		btnBodyCerveny.setFocusable(false);
		btnBodyCerveny.setToolTipText("Body - �erven� z�vodn�k");
		btnBodyCerveny.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				window.CervenyZavodnik.PridaniBoduCerveny();
				
				System.out.println("�erven� body: " + window.CervenyZavodnik.getStatistiky().getBody().getBodyZavodnika());
				
				ViceBoduCerveny();
			}
		});
		btnBodyCerveny.setFont(new Font("Dialog", Font.PLAIN, 84));
		btnBodyCerveny.setCursor(new Cursor(Cursor.HAND_CURSOR));
		btnBodyCerveny.setForeground(Color.RED);
		btnBodyCerveny.setBackground(Color.WHITE);
		btnBodyCerveny.setBorder(BorderFactory.createLineBorder(Color.WHITE));
		btnBodyCerveny.setBounds(237, 20, 105, 110);
		add(btnBodyCerveny);

		
	   //JLabel - that shows the triangle which changes the color depends on who is winning	
		lblTriangle = new JLabel("");
		lblTriangle.setIcon(new ImageIcon("img/triangle.png"));
		lblTriangle.setBounds(1, 1, 125, 125);
		add(lblTriangle);
		
	}
	
   //Method that solves that red competitor has more points
	public void ViceBoduCerveny() {
		if ((window.ModryBody.getBodyZavodnika() < window.CervenyBody.getBodyZavodnika())) {
			lblTriangle.setIcon(new ImageIcon("img/triangle_red.png"));
			zapas.HorniCast.txtCisloRingu.setBackground(Color.RED);
		} else if (window.ModryBody.getBodyZavodnika() == window.CervenyBody.getBodyZavodnika()) {
			lblTriangle.setIcon(new ImageIcon("img/triangle.png"));
			zapas.HorniCast.txtCisloRingu.setBackground(new Color(0, 128, 0));
		}
	}


   //Method that solves that blue competitor has more points
	public void ViceBoduModry() { 
		if ((window.ModryBody.getBodyZavodnika() > window.CervenyBody.getBodyZavodnika())) {
			lblTriangle.setIcon(new ImageIcon("img/triangle_blue.png"));
			zapas.HorniCast.txtCisloRingu.setBackground(Color.BLUE);
		} else if (window.ModryBody.getBodyZavodnika() == window.CervenyBody.getBodyZavodnika()) {
			lblTriangle.setIcon(new ImageIcon("img/triangle.png"));
			zapas.HorniCast.txtCisloRingu.setBackground(new Color(0, 128, 0));
		}
	}

}
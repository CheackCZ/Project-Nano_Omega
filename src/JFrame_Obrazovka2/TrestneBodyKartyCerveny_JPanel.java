package JFrame_Obrazovka2;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JPanel;

import JFrame_Obrazovka1.Window;

public class TrestneBodyKartyCerveny_JPanel extends JPanel {

	public JButton btnTrestneBody;
	
	public JButton btnZluteKarty;
	
	private Window window;
	private Window2 zapas;
	
	/**
	 * Create the panel.
	 */ 
	public TrestneBodyKartyCerveny_JPanel(Window window, Window2 zapas) {
		setBackground(Color.WHITE);
		
		this.window = window;
		this.zapas = zapas;

		//JButton that shows how many yellow cards red competitor has
			    btnZluteKarty = new JButton("0");
			    btnZluteKarty.setToolTipText("Žluté karty èervený závodník");
			    btnZluteKarty.setFocusable(false);
			    btnZluteKarty.setCursor(new Cursor(Cursor.HAND_CURSOR));
			    btnZluteKarty.addActionListener(new ActionListener() {
					@Override 
					public void actionPerformed(ActionEvent e) {
						window.CervenyZavodnik.getStatistiky().getBody().PridaniZluteKartyCerveny();
						
						System.out.println("Èervený plus žlutá karta");
					}
				});
				setLayout(null);
				btnZluteKarty.setFont(new Font("Dialog", Font.PLAIN, 88));
				btnZluteKarty.setForeground(Color.RED);
				btnZluteKarty.setBackground(Color.WHITE);
				btnZluteKarty.setBorder(BorderFactory.createLineBorder(Color.WHITE));
				btnZluteKarty.setBounds(35, 5, 90, 90);
				add(btnZluteKarty);
				
			   //JButton that counts how many foul points red competitor has
				btnTrestneBody = new JButton("0");
			    btnTrestneBody.setCursor(new Cursor(Cursor.HAND_CURSOR));
			    btnTrestneBody.setToolTipText("Trestné body èervený závodník");
				btnTrestneBody.setFocusable(false);
				btnTrestneBody.addActionListener(new ActionListener() {
					@Override
					public void actionPerformed(ActionEvent e) {
						window.CervenyZavodnik.getStatistiky().getBody().PridaniTrestnychBoduCerveny();
						
						System.out.println("Èervený plus trestný bod");
					}
				});
				btnTrestneBody.setFont(new Font("Dialog", Font.PLAIN, 72));
				btnTrestneBody.setForeground(Color.RED);
				btnTrestneBody.setBackground(Color.WHITE);
				btnTrestneBody.setBorder(BorderFactory.createLineBorder(Color.WHITE));
				btnTrestneBody.setBounds(225, 10, 90, 90);
				add(btnTrestneBody);

		
	}
	
}

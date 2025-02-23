package JFrame_Obrazovka2;

import javax.swing.JPanel;

import JFrame_Obrazovka1.Window;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TrestneBodyKartyModry_JPanel extends JPanel {

	public JButton btnTrestneBody;
	
	public JButton btnZluteKarty;
	
	private Window window;
	private Window2 zapas;
	
	/**
	 * Create the panel.
	 */
	
	public TrestneBodyKartyModry_JPanel(Window window, Window2 zapas) {
		setBackground(Color.WHITE);
	
		this.window = window;
		this.zapas = zapas;
		
		setLayout(null);
		
	   //JButton that adds foul points to the blue competitor	
		btnTrestneBody = new JButton("0");
	    btnTrestneBody.setToolTipText("Trestné body modrý závodník");
		btnTrestneBody.setFocusable(false);
	    btnTrestneBody.setCursor(new Cursor(Cursor.HAND_CURSOR));
		btnTrestneBody.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				window.ModryZavodnik.getStatistiky().getBody().PridaniTrestnychBoduModry();
				
				System.out.println("Modrý plus trestný bod");
			}
		});
		btnTrestneBody.setFont(new Font("MS Reference Sans Serif", Font.PLAIN, 72));
		btnTrestneBody.setForeground(Color.BLUE);
		btnTrestneBody.setBackground(Color.WHITE);
		btnTrestneBody.setBorder(BorderFactory.createLineBorder(Color.WHITE));
		btnTrestneBody.setBounds(25, 10, 90, 90);
		add(btnTrestneBody);
		
	   //JButton that shows how many yellow cards blue competitor have	
		btnZluteKarty = new JButton("0");
	    btnZluteKarty.setToolTipText("Žluté karty modrý závodník");
	    btnZluteKarty.setCursor(new Cursor(Cursor.HAND_CURSOR));
		btnZluteKarty.setFocusable(false);
		btnZluteKarty.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				window.ModryZavodnik.getStatistiky().getBody().PridaniZluteKartyModry();
				
				System.out.println("Modrý plus žlutá karta");
			}
		});
		btnZluteKarty.setFont(new Font("MS Reference Sans Serif", Font.PLAIN, 88));
		btnZluteKarty.setForeground(Color.BLUE);
		btnZluteKarty.setBackground(Color.WHITE);
		btnZluteKarty.setBorder(BorderFactory.createLineBorder(Color.WHITE));
		btnZluteKarty.setBounds(225, 5, 90, 90);
		add(btnZluteKarty);

	}
	
}

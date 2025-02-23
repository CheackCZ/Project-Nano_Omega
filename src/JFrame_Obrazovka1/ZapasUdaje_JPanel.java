package JFrame_Obrazovka1;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.Font;

import javax.swing.BorderFactory;
import javax.swing.Box;
import javax.swing.ButtonGroup;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.JRadioButton;

public class ZapasUdaje_JPanel extends JPanel {

	private JTextField PocetKol;
	
	public JRadioButton btnJednoKolo;
	public JRadioButton btnDveKola;
	
	public JRadioButton btnJednaMinuta;
	public JRadioButton btnJednaMinutaTricetSekund;
	public JRadioButton btnDveMinuty;
	
	private JTextField NastaveniCasu;
	
	public ButtonGroup groupRounds;
	public ButtonGroup groupTimes;
	
	/**
	 * Create the panel.
	 */
	public ZapasUdaje_JPanel() { 
		
		setSize(906, 78);
		setBackground(Color.DARK_GRAY);
		 setLayout(null);
		 
		//JTextField - For user to know where he has to write the number of rounds 
		 PocetKol = new JTextField("Vyberte po\u010Det kol:");
		 PocetKol.setBounds(20, 20, 135, 38);
		 PocetKol.setForeground(Color.WHITE);
		 PocetKol.setHorizontalAlignment(SwingConstants.CENTER);
		 PocetKol.setBorder(BorderFactory.createLineBorder(Color.DARK_GRAY));
		 PocetKol.setBackground(Color.DARK_GRAY);
		 PocetKol.setFont(new Font("Arial Black", Font.BOLD, 12));
		 PocetKol.setEditable(false);
		 add(PocetKol);
		 
		//Set/shows that the match will have one round 
		 btnJednoKolo = new JRadioButton("1. Kolo");
		 btnJednoKolo.setFocusable(false);
		 btnJednoKolo.setCursor(new Cursor(Cursor.HAND_CURSOR));
		 btnJednoKolo.setFont(new Font("MS Reference Sans Serif", Font.PLAIN, 12));
		 btnJednoKolo.setHorizontalAlignment(SwingConstants.CENTER);
		 btnJednoKolo.setForeground(Color.WHITE);
		 btnJednoKolo.setBackground(Color.DARK_GRAY);
		 btnJednoKolo.setBounds(160, 20, 80, 38);
		 add(btnJednoKolo);
		 
		//Set/shows that the match will have one round 
		 btnDveKola = new JRadioButton("2. Kola");
		 btnDveKola.setEnabled(false);
		 btnDveKola.setFocusable(false);
		 btnDveKola.setCursor(new Cursor(Cursor.HAND_CURSOR));
		 btnDveKola.setHorizontalAlignment(SwingConstants.CENTER);
		 btnDveKola.setForeground(Color.WHITE);
		 btnDveKola.setFont(new Font("MS Reference Sans Serif", Font.PLAIN, 12));
		 btnDveKola.setBackground(Color.DARK_GRAY);
		 btnDveKola.setBounds(250, 20, 80, 38);
		 add(btnDveKola);
		 
		 
		//Group of radio buttons to choose just one round
		 groupRounds = new ButtonGroup();
		 groupRounds.add(btnDveKola);
		 groupRounds.add(btnJednoKolo);
		 
		 
		//JTextField - For user to know where is the time
		 NastaveniCasu = new JTextField("Vyberte \u010Das z\u00E1pasu:");
		 NastaveniCasu.setBounds(506, 20, 145, 38);
		 NastaveniCasu.setForeground(Color.WHITE);
		 NastaveniCasu.setHorizontalAlignment(SwingConstants.CENTER);
		 NastaveniCasu.setBorder(BorderFactory.createLineBorder(Color.DARK_GRAY));
		 NastaveniCasu.setBackground(Color.DARK_GRAY);
		 NastaveniCasu.setFont(new Font("Arial Black", Font.BOLD, 12));
		 NastaveniCasu.setEditable(false);
		 add(NastaveniCasu);


		//Box over the columns of rounds
		 Box boxKola = Box.createHorizontalBox();
		 boxKola.setBounds(10, 10, 330, 58);
		 boxKola.setBorder(BorderFactory.createLineBorder(Color.WHITE, 1, true));
		 add(boxKola);
		 
		 
		//For user to choose that the time will be one minute 
		 btnJednaMinuta = new JRadioButton("01:00");
		 btnJednaMinuta.setFocusable(false);
		 btnJednaMinuta.setCursor(new Cursor(Cursor.HAND_CURSOR));
		 btnJednaMinuta.setFont(new Font("MS Reference Sans Serif", Font.PLAIN, 12));
		 btnJednaMinuta.setForeground(Color.WHITE);
		 btnJednaMinuta.setBackground(Color.DARK_GRAY);
		 btnJednaMinuta.setBounds(656, 20, 70, 38);
		 add(btnJednaMinuta);
		 
		//For user to choose that the time will be one minute and thirty seconds
		 btnJednaMinutaTricetSekund = new JRadioButton("01:30");
		 btnJednaMinutaTricetSekund.setFocusable(false);
		 btnJednaMinutaTricetSekund.setCursor(new Cursor(Cursor.HAND_CURSOR));
		 btnJednaMinutaTricetSekund.setFont(new Font("MS Reference Sans Serif", Font.PLAIN, 12));
		 btnJednaMinutaTricetSekund.setForeground(Color.WHITE);
		 btnJednaMinutaTricetSekund.setBackground(Color.DARK_GRAY);
		 btnJednaMinutaTricetSekund.setBounds(736, 20, 70, 38);
		 add(btnJednaMinutaTricetSekund);
		 
		//For user to choose that the time will be two minutes
		 btnDveMinuty = new JRadioButton("02:00");
		 btnDveMinuty.setFocusable(false);
		 btnDveMinuty.setCursor(new Cursor(Cursor.HAND_CURSOR));
		 btnDveMinuty.setFont(new Font("MS Reference Sans Serif", Font.PLAIN, 12));
		 btnDveMinuty.setForeground(Color.WHITE);
		 btnDveMinuty.setBackground(Color.DARK_GRAY);
		 btnDveMinuty.setBounds(816, 20, 70, 38);
		 add(btnDveMinuty);

		 
		//Group of radio buttons to choose just one time
		 groupTimes = new ButtonGroup();
		 groupTimes.add(btnJednaMinuta);
		 groupTimes.add(btnJednaMinutaTricetSekund);
		 groupTimes.add(btnDveMinuty);
		 
		 
		//Box over the columns of times
		 Box BoxCas = Box.createHorizontalBox();
		 BoxCas.setBorder(BorderFactory.createLineBorder(Color.WHITE, 1, true));
		 BoxCas.setBounds(496, 10, 400, 58);
		 add(BoxCas);
		 
	 }
}
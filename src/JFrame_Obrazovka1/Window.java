package JFrame_Obrazovka1;

import java.awt.EventQueue;
import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.Box;
import javax.swing.border.LineBorder;
import javax.swing.JSeparator;

import JFrame_Obrazovka2.Window2;
import Zaverecny_projekt.Body;
import Zaverecny_projekt.Datum;
import Zaverecny_projekt.Kategorie;
import Zaverecny_projekt.Statistiky;
import Zaverecny_projekt.Ring;
import Zaverecny_projekt.Rozhodci;
import Zaverecny_projekt.Zavodnik;

public class Window extends JFrame {

	private JPanel contentPane;

	public Window2 zapas = new Window2(this);
	
	public Statistiky CervenyStatistiky;
	public Body CervenyBody;
	public Zavodnik CervenyZavodnik;
	
	public Statistiky ModryStatistiky;
	public Body ModryBody;
	public Zavodnik ModryZavodnik;
	
	public Rozhodci rozhodci;
	public Datum datumLicence;
	public Datum dnesniDatum;
	
	public Ring ring;
	public Kategorie kategorie;
	
	public ZapasUdaje_JPanel ZU;
	public DolniCast_JPanel d;
	public Buttons_JPanel B;
	public Kategorie_JPanel K;
	
	public boolean povoleno;
	public boolean datumPovoleno;
	
	public static void main(String[] args) {

		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Window frame = new Window();
					frame.setVisible(true);
					frame.setLocationRelativeTo(null);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public Window() {
		
		CervenyBody = new Body(0, -2, 0, this, zapas);
		CervenyStatistiky = new Statistiky(CervenyBody, false, this, zapas);
		CervenyZavodnik = new Zavodnik(null, null, 0, null, null, this, zapas, 0, CervenyStatistiky);
		
		ModryBody = new Body(0, -2, 0, this, zapas);
		ModryStatistiky = new Statistiky(ModryBody, false, this, zapas);
		ModryZavodnik = new Zavodnik(null, null, 0, null, null, this, zapas, 0, ModryStatistiky);
		
		rozhodci = new Rozhodci(null, null, 0, null, null, this, zapas, false, datumLicence);
		datumLicence = new Datum(0, 0, 0, this);
		dnesniDatum = new Datum(9, 6, 2022, this);
		
		kategorie = new Kategorie();
		ring = new Ring(0);
		
		ZU = new ZapasUdaje_JPanel();
		d = new DolniCast_JPanel(this);
		B = new Buttons_JPanel(this, zapas);
		K = new Kategorie_JPanel(ring, this);
		
		setTitle("Zad\u00E1n\u00ED \u00FAdaj\u016F");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 960, 535);
		contentPane = new JPanel();
		contentPane.setBackground(Color.DARK_GRAY);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		
	   // Upper part of the first screen with setting the time, choosing the number of the ring and set the number of rounds

		ZU.setBounds(20, 340, 906, 78);
		contentPane.add(ZU);

		
	   // Lower part of the first screen

		d.setBounds(20, 11, 906, 245);
		contentPane.add(d);

		
	   // Box over the whole jFrame

		Box boxWindow = Box.createHorizontalBox();
		boxWindow.setBounds(10, 10, 926, 413);
		boxWindow.setBorder(new LineBorder(Color.white, 1, true));
     	contentPane.add(boxWindow);
 
	   // Seperate the screen

		JSeparator separator = new JSeparator();
		separator.setForeground(Color.WHITE); separator.setBounds(10, 256, 926, 1);
		contentPane.add(separator);
		 

	   // Buttons for refresh, edit, confirm and move to the next jFrame

		B.setBounds(591, 438, 345, 45);
		contentPane.add(B);

	   // Middle part of the screen with choosing the categories

		K.setBounds(20, 262, 906, 78);
		contentPane.add(K);

	}
}
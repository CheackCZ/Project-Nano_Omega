package JFrame_Obrazovka2;

import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;

import javax.swing.AbstractAction;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import JFrame_Obrazovka1.Window;

import javax.swing.KeyStroke;
import javax.swing.Timer;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.SystemColor;

public class Window2 extends JFrame  {

	private JPanel contentPane;
	
	public Window window;
	
	public HorniCast_JPanel HorniCast;
	public TymJmenoPrijmeniCerveny_JPanel TymJmenoPrijmeniCerveny;
	public TymJmenoPrijmeniModry_JPanel TymJmenoPrijmeniModry;
	public TrestneBodyKartyModry_JPanel TrestneBodyKartyModry;
    public TrestneBodyKartyCerveny_JPanel TrestneBodyKartyCerveny;
    public Body_JPanel B;
	public CasKoloZapasu_JPanel CasKoloZapasu;
	
	Dimension dim;
	Timer timer;
	
	/**
	 * Create the frame.
	 */
	public Window2(Window window) {
		
		this.window = window;
		
		HorniCast = new HorniCast_JPanel(window, this);
		dim = Toolkit.getDefaultToolkit().getScreenSize();
		
		TymJmenoPrijmeniCerveny = new TymJmenoPrijmeniCerveny_JPanel(window);
		TymJmenoPrijmeniCerveny.setForeground(SystemColor.desktop);
		TymJmenoPrijmeniModry = new TymJmenoPrijmeniModry_JPanel();
		TrestneBodyKartyModry = new TrestneBodyKartyModry_JPanel(window, this);
		TrestneBodyKartyCerveny = new TrestneBodyKartyCerveny_JPanel(window, this);
		B = new Body_JPanel(window, this);
		CasKoloZapasu = new CasKoloZapasu_JPanel(window, this);
		
	   //Method that the window closes on escape button	
		 getRootPane().getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW).put(
		          KeyStroke.getKeyStroke(KeyEvent.VK_ESCAPE, 0), "Cancel");
		          getRootPane().getActionMap().put("Cancel", new AbstractAction()
		          { 
		              public void actionPerformed(ActionEvent e)
		              {
		                  dispose();
		              }
		       });
		          
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setForeground(Color.BLACK);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

	   //The upper part of the second screen - name of the category, ring number, and spinning kicks buttons	
		
		HorniCast.setBounds(0, 0, 1536, 235);
		contentPane.add(HorniCast);
		
	   
	   //The red competitor name, last name and name of the club 
		
		TymJmenoPrijmeniCerveny.setBounds(996, 250, 490, 155);
		contentPane.add(TymJmenoPrijmeniCerveny);
		
		
	   //The blue competitor name, last name and name of the club 
		
		TymJmenoPrijmeniModry.setBounds(60, 250, 490, 155);
		contentPane.add(TymJmenoPrijmeniModry);
		
		
	   //The blue competitor foul points and yellow cards he has
		
		TrestneBodyKartyModry.setBounds(60, 465, 350, 110);
		contentPane.add(TrestneBodyKartyModry);
		
		
	   //The blue competitor foul points and yellow cards he has
		
		TrestneBodyKartyCerveny.setBounds(1126, 465, 350, 110);
		contentPane.add(TrestneBodyKartyCerveny);
	
	
	   //The points of competitors	
		
		B.setBounds(570, 715, 375, 150);
		contentPane.add(B);
		
		
	   //The timer and the number of round	
		
		CasKoloZapasu.setBounds(582, 295, 370, 300);
		contentPane.add(CasKoloZapasu);
	}

}

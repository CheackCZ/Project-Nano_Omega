package JFrame_Obrazovka1;

import javax.swing.JPanel;
import javax.swing.border.LineBorder;

import java.awt.Color;

import javax.swing.Box;

public class DolniCast_JPanel extends JPanel {

	private Window window;
	
	public CervenyZavodnikUdaje_JPanel CZU = new CervenyZavodnikUdaje_JPanel(window);
	public ModryZavodnikUdaje_JPanel MZU = new ModryZavodnikUdaje_JPanel();
	public RozhodciUdaje_JPanel R = new RozhodciUdaje_JPanel();
	
	/**
	 * Create the panel.
	 */
	
	public DolniCast_JPanel(Window window) {
		
		this.window = window;
		
		setBackground(Color.DARK_GRAY);
    	 setLayout(null);
		
	//Lower left side of the screen
		 
    	//Setting the constructor of the CervenyZavodnik_JPanel
    	 CZU.setBounds(10, 20, 319, 205);
		 add(CZU);
		 
		//Horizontalbox - over the lower left side JPanel 
		 Box boxLevaSpodniCast = Box.createHorizontalBox();
		 boxLevaSpodniCast.setBorder(new LineBorder(Color.white, 1, true));
		 boxLevaSpodniCast.setBounds(0, 10, 339, 225);
		 add(boxLevaSpodniCast);
		
		 
	//Lower middle-right side of the screen
		
	   //Setting the constructor of the ModryZavodnik_JPanel
		 MZU.setBounds(364, 20, 319, 205);
		 add(MZU);
	    
	   //Horizontalbox - over the lower middle-right side JPanel 
	    Box boxPravaSpodniCast = Box.createHorizontalBox();
		boxPravaSpodniCast.setBorder(new LineBorder(Color.white, 1, true));
	    boxPravaSpodniCast.setBounds(354, 10, 339, 225);
	    add(boxPravaSpodniCast);
	    
	    
	//Lower right side of the screen
	    
	   //Setting the constructor of the Rozhodci_JPanel
	    R.setBounds(718, 20, 178, 205);
	    add(R);
	    
	   //Horizontalbox - over the lower right side JPanel 
	    Box boxRozhodciOkno = Box.createHorizontalBox();
	    boxRozhodciOkno.setBorder(new LineBorder(Color.white, 1, true));
	    boxRozhodciOkno.setBounds(708, 10, 198, 225);
	    add(boxRozhodciOkno);
	 
	    
	}
}

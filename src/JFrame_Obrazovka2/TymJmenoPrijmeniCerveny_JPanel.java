package JFrame_Obrazovka2;

import javax.swing.BorderFactory;
import javax.swing.JPanel;
import javax.swing.JTextField;
import java.awt.Color;
import java.awt.Font;

import javax.swing.SwingConstants;

import JFrame_Obrazovka1.Window;

public class TymJmenoPrijmeniCerveny_JPanel extends JPanel {
	
	public JTextField txtOddilCerveny;
	public JTextField txtJmenoCerveny;
	public JTextField txtPrijmeniCerveny;
	
	private Window window;
	
	/**
	 * Create the panel.
	 */
	public TymJmenoPrijmeniCerveny_JPanel(Window window) {
		setForeground(Color.BLACK); 
		
		this.window = window;
		
		setSize(490, 155);
		setBackground(Color.WHITE);
		setLayout(null);
		
	   //JTextField - show the club/Team of the red competitor	
		txtOddilCerveny = new JTextField();
		txtOddilCerveny.setEditable(false);
		txtOddilCerveny.setHorizontalAlignment(SwingConstants.RIGHT);
		txtOddilCerveny.setFont(new Font("MS Reference Sans Serif", Font.BOLD, 42));
		txtOddilCerveny.setBackground(Color.WHITE);
		txtOddilCerveny.setForeground(Color.BLACK);
		txtOddilCerveny.setBorder(BorderFactory.createLineBorder((Color.WHITE)));
		txtOddilCerveny.setBounds(0, 0, 480, 65);
		add(txtOddilCerveny);
		
	   //JTextField - show the first name of the red competitor	
		txtJmenoCerveny = new JTextField("");
		txtJmenoCerveny.setEditable(false);
		txtJmenoCerveny.setBackground(Color.WHITE);
		txtJmenoCerveny.setHorizontalAlignment(SwingConstants.RIGHT);
		txtJmenoCerveny.setForeground(Color.BLACK);
		txtJmenoCerveny.setFont(new Font("MS Reference Sans Serif", Font.PLAIN, 30));
		txtJmenoCerveny.setBorder(BorderFactory.createLineBorder((Color.WHITE)));
		txtJmenoCerveny.setBounds(0, 60, 480, 50);
		add(txtJmenoCerveny);
		
	   //JTextField - show the last name of the red competitor	
		txtPrijmeniCerveny = new JTextField("");
		txtPrijmeniCerveny.setEditable(false);
		txtPrijmeniCerveny.setBackground(Color.WHITE);
		txtPrijmeniCerveny.setHorizontalAlignment(SwingConstants.RIGHT);
		txtPrijmeniCerveny.setFont(new Font("MS Reference Sans Serif", Font.BOLD, 40));
		txtPrijmeniCerveny.setBorder(BorderFactory.createLineBorder((Color.WHITE)));
		txtPrijmeniCerveny.setForeground(Color.BLACK);
		txtPrijmeniCerveny.setBounds(0, 105, 480, 50);
		add(txtPrijmeniCerveny);

		
		
	}
}

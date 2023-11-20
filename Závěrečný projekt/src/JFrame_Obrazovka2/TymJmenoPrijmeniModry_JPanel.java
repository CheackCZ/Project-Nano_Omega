package JFrame_Obrazovka2;

import java.awt.Color;
import java.awt.Font;

import javax.swing.BorderFactory;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class TymJmenoPrijmeniModry_JPanel extends JPanel {

	public JTextField txtOddilModry;
	public JTextField txtJmenoModry;
	public JTextField txtPrijmeniModry;
	/**
	 * Create the panel.
	 */
	public TymJmenoPrijmeniModry_JPanel() { 
		setBackground(Color.WHITE);
				setLayout(null);
				setSize(490, 155); 

		//JTextField - show the club/Team of the blue competitor	
				txtOddilModry = new JTextField();
				txtOddilModry.setForeground(Color.BLACK);
				txtOddilModry.setEditable(false);
				txtOddilModry.setHorizontalAlignment(SwingConstants.LEFT);
				txtOddilModry.setFont(new Font("MS Reference Sans Serif", Font.BOLD, 42));
				txtOddilModry.setBackground(Color.WHITE);
				txtOddilModry.setBorder(BorderFactory.createLineBorder((Color.WHITE)));
				txtOddilModry.setBounds(10, 0, 480, 65);
				add(txtOddilModry);
				txtOddilModry.setColumns(10);
				
			   //JTextField - show the first name of the blue competitor	
				txtJmenoModry = new JTextField();
				txtJmenoModry.setForeground(Color.BLACK);
				txtJmenoModry.setEditable(false);
				txtJmenoModry.setBackground(Color.WHITE);
				txtJmenoModry.setHorizontalAlignment(SwingConstants.LEFT);
				txtJmenoModry.setFont(new Font("MS Reference Sans Serif", Font.PLAIN, 30));
				txtJmenoModry.setBorder(BorderFactory.createLineBorder((Color.WHITE)));
				txtJmenoModry.setBounds(10, 60, 480, 50);
				add(txtJmenoModry);
				txtJmenoModry.setColumns(10);
				
			   //JTextField - show the last name of the blue competitor	
				txtPrijmeniModry = new JTextField();
				txtPrijmeniModry.setForeground(Color.BLACK);
				txtPrijmeniModry.setEditable(false);
				txtPrijmeniModry.setBackground(Color.WHITE);
				txtPrijmeniModry.setHorizontalAlignment(SwingConstants.LEFT);
				txtPrijmeniModry.setFont(new Font("MS Reference Sans Serif", Font.BOLD, 40));
				txtPrijmeniModry.setBorder(BorderFactory.createLineBorder((Color.WHITE)));
				txtPrijmeniModry.setBounds(10, 105, 480, 50);
				add(txtPrijmeniModry);
				txtPrijmeniModry.setColumns(10);
		
	}

}

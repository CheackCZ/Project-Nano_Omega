package JFrame_Obrazovka1;

import javax.swing.ImageIcon;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Window zapas = new Window();
		ImageIcon image = new ImageIcon("IconOfJFrame.jpg");
		zapas.setIconImage(image.getImage());
		zapas.setLocationRelativeTo(null);
		zapas.setVisible(true);
		
	}

}

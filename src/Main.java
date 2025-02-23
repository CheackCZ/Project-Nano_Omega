

import javax.swing.ImageIcon;

import JFrame_Obrazovka1.Window;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Window zapas = new Window();
		ImageIcon image = new ImageIcon("img/IconOfJFrame.jpg");
		zapas.setIconImage(image.getImage());
		zapas.setLocationRelativeTo(null);
		zapas.setVisible(true);
		
	}
}
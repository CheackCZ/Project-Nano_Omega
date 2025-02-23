package JFrame_Obrazovka1;

public class KontrolaUdajuRozhodci implements IKontrola {

	private Window window;
	
	public KontrolaUdajuRozhodci(Window window) {
		this.window = window;
	}

	 
   //Method that controls if everything is filled out	
	@Override
	public boolean KontrolaVyplneni() {
		if (window.d.R.zadaniVekRozhodci.getText().isEmpty()) {
			return false;
		} else if (window.d.R.boxPaskyRozhodci.getSelectedItem().equals("")) {
			return false;
		} else if (window.d.R.zadaniDnePlatnostiLicence.getText().isEmpty()) {
			return false;
		} else if (window.d.R.zadaniMesicePlatnostiLicence.getText().isEmpty()) {
			return false;
		} else if (window.d.R.zadaniRokuPlatnostiLicence.getText().isEmpty()) {
			return false;
		} else {
			this.NastaveniUdajuRozhodci();
			return true;
		}
	}
	

   //Method that set all the columns to not editable	
	public void EditPolicekNepovolen() {
		if (KontrolaVyplneni() == true) {
			window.d.R.zadaniVekRozhodci.setEditable(false);
			window.d.R.boxPaskyRozhodci.setEnabled(false);
			window.d.R.zadaniDnePlatnostiLicence.setEditable(false);
			window.d.R.zadaniMesicePlatnostiLicence.setEditable(false);
			window.d.R.zadaniRokuPlatnostiLicence.setEditable(false);
		}
	}
	
	
   //Method that set all the columns to editable again after they were set to not editable
	public void EditPolicekPovolen() {
		if (KontrolaVyplneni() == true) {
			window.d.R.zadaniVekRozhodci.setEditable(true);
			window.d.R.boxPaskyRozhodci.setEnabled(true);
			window.d.R.zadaniDnePlatnostiLicence.setEditable(true);
			window.d.R.zadaniMesicePlatnostiLicence.setEditable(true);
			window.d.R.zadaniRokuPlatnostiLicence.setEditable(true);
		}
	}
	
	
   //Method that refreshes all the columns
	public void RefreshPolicek() {
		if (KontrolaVyplneni() == true) {
			window.d.R.zadaniVekRozhodci.setText("");;
			window.d.R.boxPaskyRozhodci.setEnabled(true);
			window.d.R.boxPaskyRozhodci.setSelectedIndex(0);
			window.d.R.zadaniDnePlatnostiLicence.setText("");
			window.d.R.zadaniMesicePlatnostiLicence.setText("");;
			window.d.R.zadaniRokuPlatnostiLicence.setText("");;		
		}
	}
	
	
   //Method that sets the attributes of referee
	public void NastaveniUdajuRozhodci() {
		window.rozhodci.setVek(Integer.parseInt(window.d.R.zadaniVekRozhodci.getText()));
		window.rozhodci.setPasek(window.d.R.boxPaskyRozhodci.getSelectedItem());
		
		window.datumLicence.KontrolaData();
		
	}
}

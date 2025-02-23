package JFrame_Obrazovka1;

import JFrame_Obrazovka2.Window2;

public class KontrolaUdajuModryZavodnik implements IKontrola {

	private Window window;
	private Window2 zapas;
	
	public KontrolaUdajuModryZavodnik(Window window, Window2 zapas) {
		this.window = window;
		this.zapas = zapas;
	}
	

   //Method that controls if everything is filled out	
	@Override
	public boolean KontrolaVyplneni() {
		if (window.d.MZU.zadaniJmenaModry.getText().isEmpty()) {
			return false;
		} else if (window.d.MZU.zadaniPrijmeniModry.getText().isEmpty()) {
			return false;
		} else if (window.d.MZU.zadaniVekModry.getText().isEmpty()) {
			return false;			 
		} else if (window.d.MZU.boxPasekModry.getSelectedItem().equals("")) {		
			return false; 
		} else if (window.d.MZU.zadaniVahyModry.getText().isEmpty()) {
			return false; 
		} else if (window.d.MZU.zadaniOddilModry.getText().isEmpty()) {
			return false;
		} else {
			this.NastaveniUdajuModremu();
			return true;
		}
	}
	
	
   //Method that set all the columns to not editable	
	public void EditPolicekNepovolen() {
		if (KontrolaVyplneni() == true) {
			window.d.MZU.zadaniJmenaModry.setEditable(false);
			window.d.MZU.zadaniPrijmeniModry.setEditable(false);
			window.d.MZU.zadaniVekModry.setEditable(false);
			window.d.MZU.zadaniVahyModry.setEditable(false);
			window.d.MZU.boxPasekModry.setEnabled(false);
			window.d.MZU.zadaniOddilModry.setEditable(false);			
		}
	}
	

   //Method that set all the columns to editable again after they were set to not editable
	public void EditPolicekPovolen() {
		if (KontrolaVyplneni() == true) {
			window.d.MZU.zadaniJmenaModry.setEditable(true);
			window.d.MZU.zadaniPrijmeniModry.setEditable(true);
			window.d.MZU.zadaniVekModry.setEditable(true);
			window.d.MZU.zadaniVahyModry.setEditable(true);
			window.d.MZU.boxPasekModry.setEnabled(true);
			window.d.MZU.zadaniOddilModry.setEditable(true);			
		}
	}
	
	
   //Method that refreshes all the columns
	public void RefreshPolicek() {
		if (KontrolaVyplneni() == true) {
			window.d.MZU.zadaniJmenaModry.setText("");
			window.d.MZU.zadaniPrijmeniModry.setText("");
			window.d.MZU.zadaniVekModry.setText("");
			window.d.MZU.zadaniVahyModry.setText("");
			window.d.MZU.boxPasekModry.setEnabled(true);
			window.d.MZU.boxPasekModry.setSelectedIndex(0);
			window.d.MZU.zadaniOddilModry.setText("");			
		}
	}
	
	
   //Method that sets red competitors attributes
	public void NastaveniUdajuModremu() {
			window.ModryZavodnik.setJmeno(window.d.MZU.zadaniJmenaModry.getText().toUpperCase());
			window.ModryZavodnik.setPrijmeni(window.d.MZU.zadaniPrijmeniModry.getText().toUpperCase());
			window.ModryZavodnik.setVek(Integer.parseInt(window.d.MZU.zadaniVekModry.getText()));
			window.ModryZavodnik.setVaha(Double.parseDouble(window.d.MZU.zadaniVahyModry.getText()));
			window.ModryZavodnik.setPasek(window.d.MZU.boxPasekModry.getSelectedItem());
			window.ModryZavodnik.setOddil(window.d.MZU.zadaniOddilModry.getText().toUpperCase());
	}
		

   //Sets the red competitors attributes to the second JFrame
	public void ZiskaniUdajuModry() {
		if (KontrolaVyplneni() == true) {
			zapas.TymJmenoPrijmeniModry.txtJmenoModry.setText(window.ModryZavodnik.getJmeno());
			zapas.TymJmenoPrijmeniModry.txtPrijmeniModry.setText(window.ModryZavodnik.getPrijmeni());
			zapas.TymJmenoPrijmeniModry.txtOddilModry.setText(window.ModryZavodnik.getOddil());
		}
	}
}

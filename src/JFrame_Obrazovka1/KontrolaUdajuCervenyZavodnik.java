package JFrame_Obrazovka1;

import JFrame_Obrazovka2.Window2;

public class KontrolaUdajuCervenyZavodnik implements IKontrola {

	private Window2 window2;
	private Window window;
	 
	public KontrolaUdajuCervenyZavodnik(Window window, Window2 window2) {
		this.window = window;
		this.window2 = window2;
	}
	
	@Override
	public boolean KontrolaVyplneni() {
		if (window.d.CZU.zadaniJmenaCerveny.getText().isEmpty()) {
			return false;
		} else if (window.d.CZU.zadaniPrijmeniCerveny.getText().isEmpty()) {
			return false;
		} else if (window.d.CZU.zadaniVekCerveny.getText().isEmpty()) {
			return false;			
		} else if (window.d.CZU.boxPaskyCerveny.getSelectedItem().equals("")) {		
			return false;
		} else if (window.d.CZU.zadaniVahyCerveny.getText().isEmpty()) {
			return false; 
		} else if (window.d.CZU.zadaniOddilCerveny.getText().isEmpty()) {
			return false;
		} else {
			this.NastaveniUdajuCervenemu();
			return true;
		}
	}
	
   
   //Method that set all the columns to not editable	
	public void EditPolicekNepovolen() {
		if (KontrolaVyplneni() == true) {
			window.d.CZU.zadaniJmenaCerveny.setEditable(false);
			window.d.CZU.zadaniPrijmeniCerveny.setEditable(false);
			window.d.CZU.zadaniVekCerveny.setEditable(false);
			window.d.CZU.zadaniVahyCerveny.setEditable(false);
			window.d.CZU.boxPaskyCerveny.setEnabled(false);
			window.d.CZU.zadaniOddilCerveny.setEditable(false);			
		}
	}
	
	
   //Method that set all the columns to editable again after they were set to not editable
	public void EditPolicekPovolen() {
		if (KontrolaVyplneni() == true) {
			window.d.CZU.zadaniJmenaCerveny.setEditable(true);
			window.d.CZU.zadaniPrijmeniCerveny.setEditable(true);
			window.d.CZU.zadaniVekCerveny.setEditable(true);
			window.d.CZU.zadaniVahyCerveny.setEditable(true);
			window.d.CZU.boxPaskyCerveny.setEnabled(true);
			window.d.CZU.zadaniOddilCerveny.setEditable(true);			
		}
	}
	
	
   //Method that refreshes all the columns
	public void RefreshPolicek() {
		if (KontrolaVyplneni() == true) {
			window.d.CZU.zadaniJmenaCerveny.setText("");
			window.d.CZU.zadaniPrijmeniCerveny.setText("");
			window.d.CZU.zadaniVekCerveny.setText("");
			window.d.CZU.zadaniVahyCerveny.setText("");
			window.d.CZU.boxPaskyCerveny.setEnabled(true);
			window.d.CZU.boxPaskyCerveny.setSelectedIndex(0);
			window.d.CZU.zadaniOddilCerveny.setText("");			
		}
	}
	
	
   //Method that sets red competitors attributes
	public void NastaveniUdajuCervenemu() {
			window.CervenyZavodnik.setJmeno(window.d.CZU.zadaniJmenaCerveny.getText().toUpperCase());
			window.CervenyZavodnik.setPrijmeni(window.d.CZU.zadaniPrijmeniCerveny.getText().toUpperCase());
			window.CervenyZavodnik.setVek(Integer.parseInt(window.d.CZU.zadaniVekCerveny.getText()));
			window.CervenyZavodnik.setVaha(Double.parseDouble(window.d.CZU.zadaniVahyCerveny.getText()));
			window.CervenyZavodnik.setPasek(window.d.CZU.boxPaskyCerveny.getSelectedItem());
			window.CervenyZavodnik.setOddil(window.d.CZU.zadaniOddilCerveny.getText().toUpperCase());
	}
	
	
   //Sets the red competitors attributes to the second JFrame
	public void ZiskaniUdajuCerveny() {
		if (KontrolaVyplneni() == true) {
			window2.TymJmenoPrijmeniCerveny.txtJmenoCerveny.setText(window.CervenyZavodnik.getJmeno());
			window2.TymJmenoPrijmeniCerveny.txtPrijmeniCerveny.setText(window.CervenyZavodnik.getPrijmeni());
			window2.TymJmenoPrijmeniCerveny.txtOddilCerveny.setText(window.CervenyZavodnik.getOddil());
		}
	}
	
	
}

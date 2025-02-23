package JFrame_Obrazovka1;

import JFrame_Obrazovka2.Window2;

public class KontrolaKategorie implements IKontrola {
	
	private Window window;
	private Window2 zapas;
	
	public KontrolaKategorie(Window window, Window2 zapas) {
		this.window = window; 
		this.zapas = zapas;
	}

	
   //Method that controls if everything is filled out	
	@Override
	public boolean KontrolaVyplneni() {
		if (window.K.ZadaniCislaRingu.getText().isEmpty()) {
			return false; 
		} else if (window.K.VahoveKategorie.getSelectedItem().equals("")) {
			return false;
		} else if (window.K.VekoveKategorie.getSelectedItem().equals("")) {
			return false;
		} else {
			this.NastaveniUdaju();
			return true;
		}
	}

	
   //Method that set all the columns to not editable	
	public void EditPolicekNepovolen() {
		if (KontrolaVyplneni() == true) {
			window.K.ZadaniCislaRingu.setEditable(false);
			window.K.VahoveKategorie.setEnabled(false);
			window.K.VekoveKategorie.setEnabled(false);
		}
	}	
	
	
   //Method that set all the columns to editable again after they were set to not editable
	public void EditPolicekPovolen() {
		if (KontrolaVyplneni() == true) {
			window.K.ZadaniCislaRingu.setEditable(true);
			window.K.VahoveKategorie.setEnabled(true);
			window.K.VekoveKategorie.setEnabled(true);
		}
	}	
	
	
   //Method that refreshes all the columns
	public void RefreshPolicek() {
		if (KontrolaVyplneni() == true) {
			window.K.ZadaniCislaRingu.setText("");
			window.K.VahoveKategorie.setEnabled(true);
			window.K.VahoveKategorie.setSelectedIndex(0);
			window.K.VekoveKategorie.setEnabled(true);
			window.K.VekoveKategorie.setSelectedIndex(0);
		}
	}
	
	
   //Method that sets category attributes
	public void NastaveniUdaju() {
			window.ring.setCisloRingu(Integer.parseInt(window.K.ZadaniCislaRingu.getText()));
			window.kategorie.setVybranaVahovaKategorie((int)window.K.VahoveKategorie.getSelectedItem());
			if (window.K.VahoveKategorie.getSelectedIndex() == window.K.VahoveKategorie.getItemCount()-1) {
				String str = (String) window.K.VekoveKategorie.getSelectedItem(); 
				window.kategorie.setNazev("MATSOGI " + str.toUpperCase() + " +" + window.K.VahoveKategorie.getSelectedItem() + " KG");
			} else {
				String str = (String) window.K.VekoveKategorie.getSelectedItem(); 
				window.kategorie.setNazev("MATSOGI " + str.toUpperCase() + " " + window.K.VahoveKategorie.getSelectedItem() + " KG");				
		}
	}
	
	
   //Sets the red competitors attributes to the second JFrame
	public void ZiskaniUdaju() {
		if (KontrolaVyplneni() == true) {
			zapas.HorniCast.txtCisloRingu.setText("RING " + window.ring.getCisloRingu());
			zapas.HorniCast.txtKategorie.setText((String)window.kategorie.getNazev());
		}
	}
	
}

package JFrame_Obrazovka1;

import JFrame_Obrazovka2.Window2;

public class KontrolaUdajuZapas implements IKontrola {

	private Window window;
	private Window2 zapas;
	
	public KontrolaUdajuZapas(Window window, Window2 zapas) {
		this.window = window;
		this.zapas = zapas;
	}
	
   //Method that controls if everything is filled out	
	@Override
	public boolean KontrolaVyplneni() {
		if (window.ZU.btnDveKola.isSelected() == false && window.ZU.btnJednoKolo.isSelected() == false) {
			return false;
		} else if (window.ZU.btnJednaMinuta.isSelected() == false && window.ZU.btnJednaMinutaTricetSekund.isSelected() == false && 
				window.ZU.btnDveMinuty.isSelected() == false) {
			return false;
		} else {
			return true;			 
		}
	}

	
   //Method that set all the columns to not editable	
	public void EditPolicekNepovolen() {
		if (KontrolaVyplneni() == true) {
			window.ZU.btnJednoKolo.setEnabled(false);
			window.ZU.btnDveKola.setEnabled(false);
			window.ZU.btnJednaMinuta.setEnabled(false);
			window.ZU.btnJednaMinutaTricetSekund.setEnabled(false);
			window.ZU.btnDveMinuty.setEnabled(false);
		}
	}
	
	
   //Method that set all the columns to editable again after they were set to not editable
	public void EditPolicekPovolen() {
		if (KontrolaVyplneni() == true) {
			window.ZU.btnJednoKolo.setEnabled(true);
			window.ZU.btnDveKola.setEnabled(true);
			window.ZU.btnJednaMinuta.setEnabled(true);
			window.ZU.btnJednaMinutaTricetSekund.setEnabled(true);
			window.ZU.btnDveMinuty.setEnabled(true);
		}
	}
	
	
   //Method that refreshes all the columns
	public void RefreshPolicek() {
		if (KontrolaVyplneni() == true) {
			window.ZU.btnJednoKolo.setEnabled(true);
			window.ZU.btnDveKola.setEnabled(true);	
			window.ZU.groupRounds.clearSelection();
			window.ZU.btnJednaMinuta.setEnabled(true);
			window.ZU.btnJednaMinutaTricetSekund.setEnabled(true);
			window.ZU.btnDveMinuty.setEnabled(true);
			window.ZU.groupTimes.clearSelection();
		}
	}
	
	
   //Method that sets the time if one round has been chosen 
	public void NastaveniUdajuZapasuJednoKolo() {
		zapas.CasKoloZapasu.txtKoloZapasu.setText("1.KOLO");
		if (window.ZU.btnJednaMinuta.isSelected()) {
			zapas.CasKoloZapasu.setMinute(1);
			zapas.CasKoloZapasu.setSecond(0);
			zapas.CasKoloZapasu.btnClock.setText(window.ZU.btnJednaMinuta.getText());
		} else if (window.ZU.btnJednaMinutaTricetSekund.isSelected()) {
			zapas.CasKoloZapasu.setMinute(1);
			zapas.CasKoloZapasu.setSecond(30);
			zapas.CasKoloZapasu.btnClock.setText(window.ZU.btnJednaMinutaTricetSekund.getText());
		} else if (window.ZU.btnDveMinuty.isSelected()) {
			zapas.CasKoloZapasu.setMinute(2);
			zapas.CasKoloZapasu.setSecond(0);
			zapas.CasKoloZapasu.btnClock.setText(window.ZU.btnDveMinuty.getText());
		}
	}
	
	
   //Method that sets the time if two rounds have been chosen
	public void NastaveniUdajuZapasuDveKola() {
		
	}
	
   //Method that sets red competitors attributes
	public void ZiskaniUdajuZapasu() {
			if (window.ZU.btnJednoKolo.isSelected() == true) {
				zapas.HorniCast.povinnaOtockaCerveny2.setVisible(false);
				zapas.HorniCast.povinnaOtockaModry2.setVisible(false);
				this.NastaveniUdajuZapasuJednoKolo();
			} else if (window.ZU.btnDveKola.isSelected() == true) {
				zapas.HorniCast.povinnaOtockaCerveny2.setEnabled(false);
				zapas.HorniCast.povinnaOtockaModry2.setEnabled(false);
				this.NastaveniUdajuZapasuDveKola();
			}
	}
}
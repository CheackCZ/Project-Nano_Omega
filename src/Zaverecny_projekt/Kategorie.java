package Zaverecny_projekt;

import javax.swing.JComboBox;

public class Kategorie {

	private Object nazev;
	
	private boolean novaKategorie = false; 
	
   //Variable - Define the age and gender of the category 	
	private String vybranaVekovaKategorie;
	
   //Variables that defines the interval of the age category 	
	private int dolniLinieVekoveKategorie;
	private int horniLinieVekoveKategorie;
	
   //Variable - Define the weight of the category
	private int vybranaVahovaKategorie;
	
	
   //Array - Of the age and gender categories
	public String [] vekoveKategorie = {"", "Mladší žáci (- 10 let)", "Mladší žákynì (- 10 let)", "Starší žáci (11 - 13 let)", "Starší žákynì (11 - 13 let)",
			"Mladší junioøi (14 - 15 let)", "Mladší juniorky (14 - 15 let)", "Starší junioøí (16 - 18 let)", "Starší juniorky (16 - 18 let)", "Senioøi (19 - 39 let)",
			"Seniorky (19 - 39 let)", "Veteráni (40 + let)", "Veteránky (40 + let)"};
	
   //Arrays - with the weight categories in every age and gender category
	public static int [] vahovkyMlZaciaZakyne = {- 25, - 30, - 35, - 40, + 40}; 
	public static int [] vahovkyStZaci = {- 35, - 40, - 45, - 50, - 55, - 60, + 60};
	public static int [] vahovkyStZakyne = {- 30, - 35, - 40, - 45, - 50, - 55, + 55};
 	public static int [] vahovkyMlJuniori = {- 45, - 50, - 55, - 60, - 65, - 70, + 70};
 	public static int [] vahovkyMlJuniorky = {- 40, - 45, - 50, - 55, - 60, - 65, + 65};
 	public static int [] vahovkyStJuniori = {- 45, - 51, - 57, - 63, - 69, - 75, + 75};
 	public static int [] vahovkyStJuniorky = {- 40, - 46, - 52, - 58, - 64 , - 70, + 70};
 	public static int [] vahovkySeniori = {- 52, - 58, - 64, - 71, - 78, - 85, - 92, + 92};
 	public static int [] vahovkySeniorky = {- 47, - 52, - 57, - 62, - 67, - 72, - 77, + 77}; 
 	public static int [] vahovkyVeterani = {- 64, - 73, - 80, - 90, + 90};
 	public static int [] vahovkyVeteranky = {- 54, - 61, - 68, - 75, + 75}; 
 	
 	
   //Method - Which selects and sets the age and gender category 
	public void NastaveniVekoveKategorie(int vyber, Kategorie kategorie) {
		novaKategorie = true;
		switch (vyber) {
		 case 0:
			 kategorie.setVybranaVekovaKategorie("");
			 System.err.println("Nic jste nevybral");
			 break;
		 case 1:
			 kategorie.setVybranaVekovaKategorie("Mladší žáci");
			 System.out.println("Vybral jste kategorii: " + kategorie.getVybranaVekovaKategorie());
			 this.NastaveniVekovehoRozmezi(6, 10); 
			 break;
		 case 2:
			 kategorie.setVybranaVekovaKategorie("Mladší žákynì");
			 System.out.println("Vybral jste kategorii: " + kategorie.getVybranaVekovaKategorie());
			 this.NastaveniVekovehoRozmezi(6, 10);
			 break;
		 case 3:
			 kategorie.setVybranaVekovaKategorie("Starší žáci");
			 System.out.println("Vybral jste kategorii: " + kategorie.getVybranaVekovaKategorie());
			 this.NastaveniVekovehoRozmezi(11, 13);
			 break;
		 case 4:
			 kategorie.setVybranaVekovaKategorie("Starší žákynì");
			 System.out.println("Vybral jste kategorii: " + kategorie.getVybranaVekovaKategorie());
			 this.NastaveniVekovehoRozmezi(11, 13);
			 break;
		 case 5:
			 kategorie.setVybranaVekovaKategorie("Mladší junioøi");
			 System.out.println("Vybral jste kategorii: " + kategorie.getVybranaVekovaKategorie());
			 this.NastaveniVekovehoRozmezi(14, 15);
			 break;
		 case 6:
			 kategorie.setVybranaVekovaKategorie("Mladší juniorky");
			 System.out.println("Vybral jste kategorii: " + kategorie.getVybranaVekovaKategorie());
			 this.NastaveniVekovehoRozmezi(14, 15);
			 break;
		 case 7:
			 kategorie.setVybranaVekovaKategorie("Starší junioøi");
			 System.out.println("Vybral jste kategorii: " + kategorie.getVybranaVekovaKategorie());
			 this.NastaveniVekovehoRozmezi(16, 18);
			 break;
		 case 8:
			 kategorie.setVybranaVekovaKategorie("Starší juniorky");
			 System.out.println("Vybral jste kategorii: " + kategorie.getVybranaVekovaKategorie());
			 this.NastaveniVekovehoRozmezi(16, 18);
			 break;
		 case 9:
			 kategorie.setVybranaVekovaKategorie("Senioøi");
			 System.out.println("Vybral jste kategorii: " + kategorie.getVybranaVekovaKategorie());
			 this.NastaveniVekovehoRozmezi(19, 39);
			 break;
		 case 10:
			 kategorie.setVybranaVekovaKategorie("Seniorky");
			 System.out.println("Vybral jste kategorii: " + kategorie.getVybranaVekovaKategorie());
			 this.NastaveniVekovehoRozmezi(19, 39);
			 break;
		 case 11:
			 kategorie.setVybranaVekovaKategorie("Veteráni");
			 System.out.println("Vybral jste kategorii: " + kategorie.getVybranaVekovaKategorie());
			 this.NastaveniVekovehoRozmezi(40, 60);
			 break;
		 case 12:
			 kategorie.setVybranaVekovaKategorie("Veteránky");
			 System.out.println("Vybral jste kategorii: " + kategorie.getVybranaVekovaKategorie());
			 this.NastaveniVekovehoRozmezi(40, 60);
			 break;
		 } 
	}

   //Method - for cycle adding array into the JComboBpx
	public void PridaniPoleVahovekDoBoxu(int [] pole, JComboBox box) {
		if (novaKategorie == true) {
			box.removeAllItems();
			for (int i = 0; i < pole.length; i++) {
				box.addItem(pole[i]);				
			}
		} else {
			for (int i = 0; i < pole.length; i++) {
				box.addItem(pole[i]);				
			}
		}
	}
	
   //Method - Choose the right weight categories and fill the combobox up with them 
	public void VybraniVahoveKategorie(Kategorie kategorie, JComboBox box) { 
		switch (kategorie.getVybranaVekovaKategorie()) {
		case "":
			break;
		case "Mladší žáci":
			PridaniPoleVahovekDoBoxu(vahovkyMlZaciaZakyne, box);
			break;
		case "Mladší žákynì":
			PridaniPoleVahovekDoBoxu(vahovkyMlZaciaZakyne, box);
			break;
		case "Starší žáci":
			PridaniPoleVahovekDoBoxu(vahovkyStZaci, box);
			break;
		case "Starší žákynì":
			PridaniPoleVahovekDoBoxu(vahovkyStZakyne, box);
			break;
		case "Mladší junioøi":
			PridaniPoleVahovekDoBoxu(vahovkyMlJuniori, box);
			break;
		case "Mladší juniorky":
			PridaniPoleVahovekDoBoxu(vahovkyMlJuniorky, box);
			break;
		case "Starší junioøi":
			PridaniPoleVahovekDoBoxu(vahovkyStJuniori, box);
			break;
		case "Starší juniorky":
			PridaniPoleVahovekDoBoxu(vahovkyStJuniorky, box);
			break;
		case "Senioøi":
			PridaniPoleVahovekDoBoxu(vahovkySeniori, box);
			break;
		case "Seniorky":
			PridaniPoleVahovekDoBoxu(vahovkySeniorky, box);
			break;
		case "Veteráni":
			PridaniPoleVahovekDoBoxu(vahovkyVeterani, box);
			break;
		case "Veteránky":
			PridaniPoleVahovekDoBoxu(vahovkyVeteranky, box);
			break;
		}
	}
	
	
   //Method that sets the bottom and the upper age category limit
	public void NastaveniVekovehoRozmezi(int dolniLinie, int HorniLinie) {
		this.setdolniLinieVekoveKategorie(dolniLinie);
		this.setHorniLinieVekoveKategorie(HorniLinie);
	}
	
	
   //Getters and Setters
	public String getVybranaVekovaKategorie() {
		return vybranaVekovaKategorie;
	}
	public void setVybranaVekovaKategorie(String vybranaVekovaKategorie) {
		this.vybranaVekovaKategorie = vybranaVekovaKategorie;
	}

	public int getVybranaVahovaKategorie() {
		return vybranaVahovaKategorie;
	}
	public void setVybranaVahovaKategorie(int vybranaVahovaKategorie) {
		this.vybranaVahovaKategorie = vybranaVahovaKategorie;
	}

	public Object getNazev() {
		return nazev;
	}
	public void setNazev(Object object) {
		this.nazev = object;
	}

	public int getdolniLinieVekoveKategorie() {
		return dolniLinieVekoveKategorie;
	}
	public void setdolniLinieVekoveKategorie(int dolniLinieVekoveKategorie) {
		this.dolniLinieVekoveKategorie = dolniLinieVekoveKategorie;
	}

	public int getHorniLinieVekoveKategorie() {
		return horniLinieVekoveKategorie;
	}
	public void setHorniLinieVekoveKategorie(int horniLinieVekoveKategorie) {
		this.horniLinieVekoveKategorie = horniLinieVekoveKategorie;
	}
	
}

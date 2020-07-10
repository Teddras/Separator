package controleur;

import modele.Separateur;
import vue.VuePrincipale;

public class Main {

	public static void main(String[] args) {
		Controleur controleur = new Controleur();
		VuePrincipale vue = new VuePrincipale();
		Separateur separateur = new Separateur();
		
		controleur.setSep(separateur);
		controleur.setVue(vue);
		
		vue.setContoleur(controleur);
		vue.frame.setVisible(true);
		
		
		

	}

}

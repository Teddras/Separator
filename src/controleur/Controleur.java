package controleur;

import modele.Separateur;
import vue.VuePrincipale;

public class Controleur {
	VuePrincipale fenetre;
	Separateur separateur;
	
	public Controleur(){
		this.separateur = new Separateur();
	}
	
	public void setVue(VuePrincipale v) {
		this.fenetre = v;
	}
	public void setSep(Separateur s) {
		this.separateur = s;
	}
	
	public void lancerAnalyse() {
		System.out.println("Bouton Appuyé");
	}
	
	
	
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		System.out.println("Hello world... Enfin je crois...");
//		VuePrincipale vue = new VuePrincipale();
//		vue.setContoleur(this);
//		
//		
//		test.charger("test.txt");
//		test.nbrLigne();
//	}
		
}

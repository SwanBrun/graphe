package carte;

import graphe.Arc;
import graphe.Noeud;

public abstract class Voie extends Arc{
	/** Parameters **/
	private String nom;
	private double distance; //distance entre deux �tapes
	private double vitesse; //vitesse autoris�e sur la voie
	
	/** Constructor **/
	public Voie(int id, Noeud o, Noeud d) {
		super(id, o, d);
		// A REMPLIR
	}
	
	public double getDistance(){return 0;}
	public abstract double getTemps();
	public abstract double getPrix();
}

package carte;

import graphe.Arc;

public abstract class Voie extends Arc{
	private String nom;
	private double distance; //distance entre deux �tapes
	private double vitesse; //vitesse autoris�e sur la voie
	
	public double getDistance(){return 0;}
	public abstract double getTemps();
	public abstract double getPrix();
}

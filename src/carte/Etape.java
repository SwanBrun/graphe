package carte;

import graphe.Noeud;

public class Etape extends Noeud {
	/** Parameters **/
	String nom;
	double x; //latitude
	double y; //longitude
	
	/** Constructor **/
	public Etape(int id, String n, double xPos, double yPos) {
		super(id);
		this.nom = n;
		this.x = xPos;
		this.y = yPos;
	}
	
	/** Methods **/
	public String getNom(){
		return this.nom;
	}
	
	public double getX(){
		return this.x;
	}
	
	public double getY(){
		return this.y;
	}
}

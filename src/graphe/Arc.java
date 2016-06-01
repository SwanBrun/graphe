package graphe;

public abstract class Arc {
	private int idArc;
	private Noeud origine;
	private Noeud destination;
	
	public abstract double getPoids();
}

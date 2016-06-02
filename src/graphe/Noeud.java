package graphe;

import java.util.Collection;

public abstract class Noeud {
	/** Parameters **/
	private int idNoeud;
	private Collection<Arc> arcSortants;
	
	/** Constructor **/
	public Noeud(int id){
		this.idNoeud = id;
	}
	
	/** Methods **/
	public void addArc(Arc a){
		this.arcSortants.add(a);
	}
	
}

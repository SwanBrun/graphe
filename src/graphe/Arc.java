package graphe;

public abstract class Arc {
	/** Parameters **/
	private int idArc;
	private Noeud origine;
	private Noeud destination;
	
	/** Constructor **/
	public Arc(int id, Noeud o, Noeud d){
		this.idArc = id;
		this.origine = o;
		this.destination = d;
		
		//à la création d'un arc, on l'ajoute dans la collection des arcs sortants de son noeud d'origine
		this.origine.addArc(this);
	}
	
	/** Methods **/
	public abstract double getPoids();
	
	//Getter
	public int getIdArc(){
		return this.idArc;
	}
	
	public Noeud getOrigine(){
		return this.origine;
	}
	
	public Noeud getDestination(){
		return this.destination;
	}
}

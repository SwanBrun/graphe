package graphe;

import java.util.Collection;

public abstract class Noeud {
	private int idNoeud;
	private Collection<Arc> arcSortants;
	private Collection<Arc> arcsEntrants;
}

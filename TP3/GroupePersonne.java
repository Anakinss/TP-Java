public class GroupePersonne {
	private Personne tabPersonne[];
	private int nbPersonne;
	
	public GroupePersonne( Personne[] tabPersonne) {
		this.tabPersonne = tabPersonne;
	}
	
	
	public GroupePersonne( Personne[] tabPersonne, int nbMaxPersonne) {
		//On test si le nbMaxPersonne est valide
		if(tabPersonne.length < nbMaxPersonne) {
			this.tabPersonne = new Personne[nbMaxPersonne];
			for (int i = 0; i < tabPersonne.length; i++) {
				this.ajouterPersonne(tabPersonne[i]);
			}
		}
		else {
			//Taille donnee par l'utilisateur trop petite
			this.tabPersonne = tabPersonne;
		}
	}

	public void ajouterPersonne(Personne personne) {
		int elementVide = this.caseVide();
		if(elementVide < this.tabPersonne.length ) {
			this.tabPersonne[elementVide] = personne;
		}
		else {
			System.out.println("Tableau de personne plein");
		}
	}
	
	public boolean supprimerPersonne(String nom, String prenom, int age) {
		boolean succes = false;
		
		int i = 0;
		while (!succes && i < this.tabPersonne.length) {
			if(this.tabPersonne[i] != null) {
				succes = true;
			
				//On test que l'age est valide
				if(age > 0)
					if(this.tabPersonne[i].getAge() != age)
						succes = false;
				
				if(!this.tabPersonne[i].getNom().equals(nom)
				   || !this.tabPersonne[i].getPrenom().equals(prenom))
					succes = false;
			}
			else {
				succes = false;
			}
			
			//Si on ne trouve pas l'element, on incremente i
			if(!succes)
				i++;
		}
		
		if(succes) {
			this.tabPersonne[i] = null;
		}
		
		return succes;
	}
	
	//retourne la taille du tableau si le tableau est complet
	private int caseVide() {
		int elementVide = 0;
		boolean elementVideTrouve = false;
		while(!elementVideTrouve && elementVide < this.tabPersonne.length) {
			if(this.tabPersonne[elementVide] == null) {
				elementVideTrouve = true;
			}
			else {
				elementVide++;
			}
		}
		
		return elementVide;
	}
	
	public String toString() {
		String retour = "";
		for (int i = 0; i < tabPersonne.length; i++) {
			if (this.tabPersonne[i] != null) {
				retour += this.tabPersonne[i] + "\n\n";
			}
		}
		
		return retour;
	}
	
	

	/**
	 * @return the tabPersonne
	 */
	public Personne[] getTabPersonne() {
		return tabPersonne;
	}

	/**
	 * @param tabPersonne the tabPersonne to set
	 */
	public void setTabPersonne(Personne[] tabPersonne) {
		this.tabPersonne = tabPersonne;
	}

	/**
	 * @return the nbPersonne
	 */
	public int getNbPersonne() {
		return nbPersonne;
	}

	/**
	 * @param nbPersonne the nbPersonne to set
	 */
	public void setNbPersonne(int nbPersonne) {
		this.nbPersonne = nbPersonne;
	}
	
}









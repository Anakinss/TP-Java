public class Ville{
	private String nom;
	private double superficie;
	private long population;


	public Ville(){
		this.nom = "inconnu";
		this.superficie = 0;
		this.population = 0;
	}

	public Ville(String nom, double superficie, long population){
		this.nom = nom;
		this.superficie = superficie;
		this.population = population;
	}


	//Methode

	public String toString(){
		return this.nom + ", " + this.superficie + " kilomètres carrés, pour " + this.population + " habitants";
	}
	
	//Test si deux villes sont identiques
	public boolean estIdentiqueA(Ville ville){
		boolean sontIdentiques = false;
		
		//Si chaques attributs sont identiques, les villes sont les mêmes
		if(this.nom.equals(ville.getNom()) && 
		   this.population == ville.getPopulation() &&
		   this.superficie == ville.getSuperficie()){
			sontIdentiques = true;
		}
		
		return sontIdentiques;
	}
	
	static public boolean sontIdentiqueA(Ville ville1, Ville ville2){
		boolean sontIdentiques = false;
		
		//Si chaques attributs sont identiques, les villes sont les mêmes
		if(ville1.getNom().equals(ville2.getNom()) && 
		   ville1.getPopulation() == ville2.getPopulation() &&
		   ville1.getSuperficie() == ville2.getSuperficie()){
			sontIdentiques = true;
		}
		
		return sontIdentiques;
	}

	//Renvoie true si la ville est dans le departement
	public boolean estDans(Departement departement){
		boolean estPresente = false;
		
		int i = 0;
		while(i < departement.getNbVillesSaisies() && !estPresente){
			if(this.estIdentiqueA(departement.getTabVilles()[i]))
				estPresente = true;
			i++;
		}
		
		return estPresente;
	}

	/**
	* Returns value of nom
	* @return
	*/
	public String getNom() {
		return nom;
	}

	/**
	* Sets new value of nom
	* @param
	*/
	public void setNom(String nom) {
		this.nom = nom;
	}

	/**
	* Returns value of superficie
	* @return
	*/
	public double getSuperficie() {
		return superficie;
	}

	/**
	* Sets new value of superficie
	* @param
	*/
	public void setSuperficie(double superficie) {
		this.superficie = superficie;
	}

	/**
	* Returns value of population
	* @return
	*/
	public long getPopulation() {
		return population;
	}

	/**
	* Sets new value of population
	* @param
	*/
	public void setPopulation(long population) {
		this.population = population;
	}

}

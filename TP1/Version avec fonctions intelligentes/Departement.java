public class Departement{
  private Ville[] tabVilles;
  private int nbVilles;
  private int numero;
  private String nom;
  private int nbVillesSaisies;


	/**
	* Default empty Departement constructor
	*/
	public Departement(String nom, int numero, int nb) {
		super();
    this.nbVillesSaisies = 0;
    this.nom = nom;
    this.numero = numero;
    this.nbVilles = nb;
    tabVilles = new Ville[this.nbVilles];
	}

	public void ajouterVille(Ville ville){
		if (this.nbVillesSaisies < this.nbVilles){
		//On regarde maintenant si la ville est deja presente dans le departement
		boolean estDejaDansDepartement = false;
		int i = 0;
		while(i < this.nbVillesSaisies && !estDejaDansDepartement){
			if(ville.estIdentiqueA(tabVilles[i]))
				estDejaDansDepartement = true;
			i++;
		}

		//On ajoute la ville
		if(!estDejaDansDepartement){
			this.tabVilles[this.nbVillesSaisies] = ville;
			this.nbVillesSaisies+=1;
		}
		else
			System.out.println(ville.getNom() + " est deja dans " + this.nom);
		}
		else{
			System.out.println("Il n'y a plus de place pour rajouter une ville dans " + this.nom);
		}
	}
  
	public String toString(){
		String texte = "";
		texte += "Villes du département "+ this.nom + " (" + this.numero + ") :\n";
		for(int i = 0; i<nbVillesSaisies; i++){
		  texte += (i+1) + ". " + this.tabVilles[i] + "\n";
		}
		return texte;
	}

	//Test si deux departements sont identiques
	public boolean estIdentiqueA(Departement departement){
		boolean sontIdentiques = true;
		
		//Si il n'y a pas le même nombre de villes, pas besoin d'aller plus loin
		if(this.nbVillesSaisies != departement.getNbVillesSaisies()){
			sontIdentiques = false;
		}
		else{
			if(!(this.estContenuDans(departement) && departement.estContenuDans(this)))
				sontIdentiques = false;
		}
		
		return sontIdentiques;
	}
	
	//Renvoie true si toute les villes du departement sont contenu dans le departement passé en paramètre
	public boolean estContenuDans(Departement departement){
		boolean estContenuDans = true;
		int i = 0;
		while(estContenuDans && i < this.nbVillesSaisies){
			if(!(this.tabVilles[i].estDans(departement)))
				estContenuDans = false;
			i++;
		}
		
		return estContenuDans;
	}
  
	/**
	* Returns value of e
	* @return
	*/
	public Ville[] getTabVilles() {
		return this.tabVilles;
	}

	/**
	* Sets new value of e
	* @param
	*/
	public void setTabVilles(Ville[] tab) {
		this.tabVilles = tab;
	}

	/**
	* Returns value of nbVilles
	* @return
	*/
	public int getNbVilles() {
		return nbVilles;
	}

	/**
	* Sets new value of nbVilles
	* @param
	*/
	public void setNbVilles(int nbVilles) {
		this.nbVilles = nbVilles;
	}

	/**
	* Returns value of numero
	* @return
	*/
	public int getNumero() {
		return numero;
	}

	/**
	* Sets new value of numero
	* @param
	*/
	public void setNumero(int numero) {
		this.numero = numero;
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
	* Returns value of nbVillesSaisies
	* @return
	*/
	public int getNbVillesSaisies() {
		return nbVillesSaisies;
	}

	/**
	* Sets new value of nbVillesSaisies
	* @param
	*/
	public void setNbVillesSaisies(int nbVillesSaisies) {
		this.nbVillesSaisies = nbVillesSaisies;
	}
}

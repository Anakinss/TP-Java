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
      this.tabVilles[this.nbVillesSaisies] = ville;
      this.nbVillesSaisies+=1;
    }
    else{
      System.out.println("Il n'y a plus de place pour rajouter une ville dans" + this.nom);
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

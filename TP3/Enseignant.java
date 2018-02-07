public class Enseignant extends Personnel{
    protected String matierePrincipal;
    protected String matiereSecondaire;

    public Enseignant (String nom, String prenom, int age, String services, String matierePrincipal, String matiereSecondaire){
        super(nom, prenom, age, services);
        this.matiereSecondaire = matiereSecondaire;
        this.matierePrincipal = matierePrincipal;
    }

    @Override
    public void ouMeTrouver(){
        System.out.println("Ce n'est pas la peine de me chercher, je saurai vous trouver !");
    }

    @Override
    public String toString(){
        return super.toString() + "\nMatière Principale: " + matierePrincipal + "\nMatière Secondaire: "+ matiereSecondaire; 
    }
	/**
	* Returns value of matierePrincipal
	* @return
	*/
	public String getMatierePrincipal() {
		return matierePrincipal;
	}

	/**
	* Sets new value of matierePrincipal
	* @param
	*/
	public void setMatierePrincipal(String matierePrincipal) {
		this.matierePrincipal = matierePrincipal;
	}

	/**
	* Returns value of matiereSecondaire
	* @return
	*/
	public String getMatiereSecondaire() {
		return matiereSecondaire;
	}

	/**
	* Sets new value of matiereSecondaire
	* @param
	*/
	public void setMatiereSecondaire(String matiereSecondaire) {
		this.matiereSecondaire = matiereSecondaire;
	}
}

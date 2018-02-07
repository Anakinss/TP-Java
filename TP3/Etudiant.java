public class Etudiant extends Personne{
    private String promotion;
    private int nbAbsences;

    public Etudiant(){
        this.nom = "Inconnu";
        this.prenom = "Inconnu";
        this.promotion = "Promotion Inconnue";
        this.nbAbsences = 0;
        this.age = 0;
    }
    public Etudiant(String nom, String prenom, int age, String promotion, int nbAbsences){
        super(nom,prenom,age);
        this.promotion = promotion;
        this.nbAbsences = nbAbsences;
    }

    public void ouMeTrouver(){
        System.out.println("Je suis en cours, sauf les jeudi apres-midi");
    }
    @Override
    public String toString(){
        return super.toString() + "\nPromotion: " + promotion + "\nNombre Absences: "+ nbAbsences;
    }
	/**
	* Returns value of promotion
	* @return
	*/
	public String getPromotion() {
		return promotion;
	}

	/**
	* Sets new value of promotion
	* @param
	*/
	public void setPromotion(String promotion) {
		this.promotion = promotion;
	}

	/**
	* Returns value of nbAbsences
	* @return
	*/
	public int getNbAbsences() {
		return nbAbsences;
	}

	/**
	* Sets new value of nbAbsences
	* @param
	*/
	public void setNbAbsences(int nbAbsences) {
		this.nbAbsences = nbAbsences;
	}
}

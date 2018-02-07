public class Personne{

    protected String nom;
    protected String prenom;
    protected int age;

    public Personne(){
        nom = "Anonyme";
        prenom = "Anonyme";
        age = -1;
    }

    public Personne(String nom, String prenom, int age){
        this.nom = nom;
        this.prenom = prenom;
        this.age = age;
    }

    public void ouMeTrouver(){
        System.out.println("Je ne sais pas ou je suis");
    }
    public String toString(){
        return "Nom: "+nom+ "\nPrénom: " + prenom + "\nAge: " + age;
    }

    public int tempsAvant(){
        return 100-this.age;
    }

    public int tempsAvant(int tempsMax){
        return tempsMax-this.age;
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
	* Returns value of prenom
	* @return
	*/
	public String getPrenom() {
		return prenom;
	}

	/**
	* Sets new value of prenom
	* @param
	*/
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	/**
	* Returns value of age
	* @return
	*/
	public int getAge() {
		return age;
	}


	/**
	* Sets new value of age
	* @param
	*/
	public void setAge(int age) {
		this.age = age;
    }

}

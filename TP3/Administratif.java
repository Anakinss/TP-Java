public class Administratif extends Personnel{
    protected String fonction;

    public Administratif(String nom, String prenom, int age, String services, String fonction){
        super(nom, prenom, age, services);
        this.fonction = fonction;
    }

    public void ouMeTrouver(){
        System.out.println("Le plus facile est de passer dans mon bureau.");
    }
    @Override
    public String toString(){
        return super.toString() + "\nFonction: " + fonction ;
    }


	/**
	* Returns value of fonction
	* @return
	*/
	public String getFonction() {
		return fonction;
	}

	/**
	* Sets new value of fonction
	* @param
	*/
	public void setFonction(String fonction) {
		this.fonction = fonction;
	}

}

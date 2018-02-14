public class Personnel extends Personne{
    protected String services;

    public Personnel(String nom, String prenom, int age, String services){
        super(nom, prenom, age);
        this.services = services;
    }

    public void afficherAge(){
        System.out.println("Ce personnel a "+ age+" an(s)");
    }
    
    @Override
    public String toString(){
        return super.toString() + "\nServices: " + services ;
    }
	/**
	* Returns value of services
	* @return
	*/
	public String getServices() {
		return services;
	}

	/**
	* Sets new value of services
	* @param
	*/
	public void setServices(String services) {
		this.services = services;
	}

}

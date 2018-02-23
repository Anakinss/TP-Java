
public abstract class Quadrilatere extends FormeGeometrique{

    protected double longueur;
    protected double largeur;
	
	Quadrilatere(double epaisseurTrait,double longueur, double largeur){
        super(epaisseurTrait);
        this.longueur = longueur;
        this.largeur = largeur;
    }
}

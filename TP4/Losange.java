
public class Losange extends Quadrilatere{

	protected double diagonale1;
	
	Losange(double epaisseurTrait, double longueur,double  diagonale) {
		super(epaisseurTrait, longueur, longueur);
		this.diagonale1 = diagonale;
	}

	public double calculPerimetre(){
        return longueur*4;
    }
    
    public double calculSuperficie(){
    	//On calcul l'air d'un triangle (1/4 du losange)
    	double demiDiagonale2 = Math.sqrt(Math.pow(longueur, 2) - Math.pow(diagonale1/2, 2));
    	double airTriangle = ((diagonale1/2)*demiDiagonale2)/2;
        return airTriangle*4;
    }
    
    public String toString(){
        return "Losange de longueur " + longueur + " et de diagonale donnee " + diagonale1+ " et de traits d'épaisseur "+epaisseurTrait;
    }
}

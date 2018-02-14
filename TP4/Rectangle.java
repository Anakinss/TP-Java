public class Rectangle extends FormeGeometrique{
    private double longueur;
    private double largeur;

    Rectangle(double epaisseurTrait,double longueur, double largeur){
        super(epaisseurTrait);
        this.longueur = longueur;
        this.largeur = largeur;
    }
    public double calculPerimetre(){
        return longueur*2+largeur*2;
    }
    public double calculSuperficie(){
        return longueur*largeur;
    }
    public String toString(){
        return "Rectangle de longueur " + longueur + " et de largeur " + largeur+ " et de traits d'épaisseur "+epaisseurTrait;
    }
}

public class Rectangle extends Quadrilatere{

    Rectangle(double epaisseurTrait,double longueur, double largeur){
        super(epaisseurTrait, longueur, largeur);
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

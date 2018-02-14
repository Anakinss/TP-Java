public class Cercle extends FormeGeometrique{
    private double rayon;

    public Cercle(int epaisseurTrait, double rayon){
        super(epaisseurTrait);
        this.rayon = rayon;
    }

    public double calculPerimetre(){
        return rayon*2*22/7;
    }

    public double calculSuperficie(){
        return rayon*rayon*22/7;
    }

    public String toString(){
        return "Cercle d'épaisseur de trait " + epaisseurTrait + " et de rayon : " + rayon;
    }
}

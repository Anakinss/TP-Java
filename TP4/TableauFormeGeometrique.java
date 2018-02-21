public class TableauFormeGeometrique{
    private int nbFormeGeometrique;
    private FormeGeometrique tabFormeGeometrique[];

    public TableauFormeGeometrique(int nbFormeGeometriqueMax){
        tabFormeGeometrique = new FormeGeometrique[nbFormeGeometriqueMax];
    }

    //Retourne 1 si l'objet est ajoute, -1 sinon
    public int ajouterForme(FormeGeometrique obj){
        if(nbFormeGeometrique < tabFormeGeometrique.length){
            tabFormeGeometrique[nbFormeGeometrique] = obj;
            nbFormeGeometrique++;
            return 1;
        }
        else return -1;
    }

    public void tri(){
        double[] tab;
        int len = tabFormeGeometrique.length;
        tab = new double[len];
        double buffDouble;
        
        FormeGeometrique buffForme;
        for(int i = 0; i<len; i++) tab[i] = tabFormeGeometrique[i].calculSuperficie();
        
        for(int i = 0; i<len; i++){
            for(int j = 0; j<len-1; j++){
                if(tab[j]>tab[j+1]){
                	//Inversion des formes et des superficies correspondantes
                    buffDouble = tab[j];
                    tab[j] = tab[j+1];
                    tab[j+1] = buffDouble;
                    buffForme = tabFormeGeometrique[j];
                    tabFormeGeometrique[j] = tabFormeGeometrique[j+1];
                    tabFormeGeometrique[j+1] = buffForme;
                }
            }
        }
    }
    
    
    public String toString(){
        String str = "";
        for(int i = 0; i<nbFormeGeometrique; i++) str+= tabFormeGeometrique[i] +"\n";
        return str;
    }
}

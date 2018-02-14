public class TableauFormeGeometrique{
    private int nbFormeGeometrique;
    private FormeGeometrique tabFormeGeometrique[];

    public TableauFormeGeometrique(int nbFormeGeometriqueMax){
        tabFormeGeometrique = new FormeGeometrique[nbFormeGeometriqueMax];
    }

    public int ajouterForme(FormeGeometrique obj){
        if(nbFormeGeometrique < tabFormeGeometrique.length){
            tabFormeGeometrique[nbFormeGeometrique] = obj;
            nbFormeGeometrique++;
            return 1;
        }
        else return -1;
    }

    public void tri(){
        double
    }
    public String toString(){
        String str = "";
        for(int i = 0; i<nbFormeGeometrique; i++) str+= tabFormeGeometrique[i] +"\n";
        return str;
    }
}

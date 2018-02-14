public class Main{
    public static void main(String args[]){
        FormeGeometrique forme1;
        FormeGeometrique forme2;
        Rectangle formeR = new Rectangle(1,3,4);
        Cercle formeC = new Cercle(2,2);
        System.out.println(formeR);
        System.out.println(formeC);
        TableauFormeGeometrique tab;
        tab = new TableauFormeGeometrique(2);

        tab.ajouterForme(formeC);
        tab.ajouterForme(formeR);
        System.out.println("\n"+tab);

    }
}

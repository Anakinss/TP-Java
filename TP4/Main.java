public class Main{
    public static void main(String args[]){
    	//Initialisation des objets
        Rectangle formeR = new Rectangle(1,4,3);
        Rectangle formeR1 = new Rectangle(1,4,5);
        Rectangle formeR2 = new Rectangle(1,6,5);
        
        Losange formeL = new Losange(1,6,4);

        Cercle formeC = new Cercle(2,1);

        //Instruction
        System.out.println(formeR);
        System.out.println(formeC);
        TableauFormeGeometrique tab;
        tab = new TableauFormeGeometrique(5);

        tab.ajouterForme(formeC);
        tab.ajouterForme(formeL);
        tab.ajouterForme(formeR);
        tab.ajouterForme(formeR1);
        tab.ajouterForme(formeR2);
        System.out.println("\n"+tab);
        tab.tri();
        System.out.println("\n"+tab);
    }
}

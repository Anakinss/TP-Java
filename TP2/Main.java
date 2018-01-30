public class Main{
    public static void main(String[] args) {
        //Les cours
        Cours math = new Cours("1", "Math", 90);
        Cours infoC = new Cours("2", "C/C++", 100);
        Cours baseDeDonnee = new Cours("3", "BDD", 30);
        Cours infoJava = new Cours("4", "Java", 50);
        Cours traitementSignal = new Cours("5", "Traitement de Signal", 50);
        Cours web = new Cours("6", "Web", 30);
        Cours qualite = new Cours("7", "SQR", 10);
        Cours electronique = new Cours("8", "Electronique", 90);

        //Formationca
        Formation infotro = new Formation("0", "Infotro");
        infotro.ajouterCours(infoC);
        infotro.ajouterCours(math);
        infotro.ajouterCours(baseDeDonnee);
        infotro.ajouterCours(infoJava);
        infotro.ajouterCours(traitementSignal);
        infotro.ajouterCours(web);
        infotro.ajouterCours(qualite);
        infotro.ajouterCours(electronique);


        //Instruction
        System.out.println(infotro);
        infotro.supprimerCours(1);
        System.out.println(infotro);
        System.out.println(infotro.getListeCours().get(1));

        //Exo4
        infotro.trierCours();
        System.out.println(infotro);
        System.out.println("Volume horaire de " + infotro.getNom() + " : "+ infotro.calcVolHor() + " heures;");
    }
}

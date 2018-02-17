public class Execution{
    public static void main(String[] args) {
        Personne personne[] = new Personne[6];
        personne[0] = new Etudiant("Dupont", "Alice", 21, "3A IE", 0);
        personne[1] = new Etudiant("Dujardin", "Benjamin", 22, "3A IE", 560);
        personne[2] = new Etudiant();
        personne[3] = new Etudiant();
        personne[4] = new Administratif("Dupont", "Beatrice", 19, "Administratif", "Secretaire");
        personne[5] = new  Enseignant("Machin", "Boris", 36, "Enseignant", "Informatique", "Electronique");
        
        for (int i = 0; i < personne.length; i++) {
            personne[i].ouMeTrouver();
        }

        //Modification des personnes en utilisant les ascesseur
        personne[1].setAge(21);
        personne[1].setNom("Thomas");
        personne[1].setPrenom("Kevin");
        ((Etudiant) personne[1]).setPromotion("4A MDD");
        ((Etudiant) personne[1]).setNbAbsences(5);
        
        personne[2].setAge(23);
        personne[2].setNom("Thomash");
        personne[2].setPrenom("Axel");
        ((Etudiant) personne[2]).setPromotion("6A MDD");
        ((Etudiant) personne[2]).setNbAbsences(2);

        //Utilisation du groupePersonne
        System.out.println("\n\n\n\n\n");
        GroupePersonne groupe = new GroupePersonne(personne, 10);
        groupe.supprimerPersonne("Dupont", "Beatrice", 19);
        
        System.out.println(groupe);
    }
}







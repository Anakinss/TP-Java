import java.util.ArrayList;
import java.util.*;

public class Formation{
    private String code;
    private String nom;
    private ArrayList<Cours> listeCours;

    //Constructeur
    public Formation(String code, String nom){
        this.code = code;
        this.nom = nom;
        listeCours = new ArrayList<Cours>();
    }

    public String toString(){
        String sFinal = "Formation: "+nom+"("+code+"):\n";
        for(Cours iCours:listeCours){
            sFinal+=iCours;
        }
        return sFinal;
    }

    public void trierCours(){
        //this.listeCours.sort();
        Collections.sort(this.listeCours);
    }

    public void ajouterCours(Cours nCours){
        listeCours.add(nCours);
    }

    public void supprimerCours(int index){
        listeCours.remove(index);
    }

    //calcul le volume horaire d'une formatiom
    public int calcVolHor(){
        int somme = 0;
        for (Cours iCours: this.listeCours){
            somme += iCours.getVolHor();
        }
        return somme;
    }


    /**
    * Returns value of code
    * @return
    */
    public String getCode() {
        return code;
    }

    /**
    * Sets new value of code
    * @param
    */
    public void setCode(String code) {
        this.code = code;
    }

    /**
    * Returns value of nom
    * @return
    */
    public String getNom() {
        return nom;
    }

    /**
    * Sets new value of nom
    * @param
    */
    public void setNom(String nom) {
        this.nom = nom;
    }

    /**
    * Returns value of listeCours
    * @return
    */
    public ArrayList<Cours> getListeCours() {
        return listeCours;
    }

    /**
    * Sets new value of listeCours
    * @param
    */
    public void setListeCours(ArrayList<Cours> listeCours) {
        this.listeCours = listeCours;
    }

}

public class Cours implements Comparable{
    private String code;
    private String intitule;
    private int volHor;

    public Cours(String code, String intitule, int volHor){
        this.code = code;
        this.intitule = intitule;
        this.volHor = volHor;
    }

    public String toString(){
        return "Le cours \"" + intitule + "\" a pour code: "+code+" et dispose de "+ volHor+ " heures de cours.\n";
    }

    @Override
    public int compareTo(Object obj){
        String intitule = ((Cours)obj).getIntitule();
        return this.intitule.compareTo(intitule);
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
    * Returns value of intitule
    * @return
    */
    public String getIntitule() {
        return intitule;
    }

    /**
    * Sets new value of intitule
    * @param
    */
    public void setIntitule(String intitule) {
        this.intitule = intitule;
    }

    /**
    * Returns value of volHor
    * @return
    */
    public int getVolHor() {
        return volHor;
    }

    /**
    * Sets new value of volHor
    * @param
    */
    public void setVolHor(int volHor) {
        this.volHor = volHor;
    }

}

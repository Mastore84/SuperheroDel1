public class Superhero {

    private String superheroName;
    private String realName;
    private int yearCreated;
    private String superPowers;
    private boolean isHuman;
    private double strength;

    public Superhero(String superheroName, String realName, int yearCreated, String superPowers, boolean isHuman, double strength){
        this.superheroName = superheroName;
        this.realName = realName;
        this.yearCreated = yearCreated;
        this.superPowers = superPowers;
        this.isHuman = isHuman;
        this.strength = strength;
    }

    public String getSuperheroName(){
        return superheroName;
    }
    public String getRealName(){
        return realName;
    }
    public int getYearCreated(){
        return yearCreated;
    }
    public boolean getIsHuman() {
        return isHuman;
    }
    public String getSuperPowers(){
        return superPowers;
    }
    public double getStrength(){
        return strength;
    }
    public String toString(){
        return "Superheltenavn: " + superheroName + "\nRigtige navn: " + realName + "\nÅr skabt: " + yearCreated + "\nSuperkrafter: " + superPowers + "\nEr menneske: " + isHuman + "\nStyrke: " + strength;
    }


}

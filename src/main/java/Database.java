public class Database {

    private Object[] database;

    public void addSuperhero(String superheroName, String realName, int yearCreated, String superPowers, boolean isHuman, double strength){
        Superhero superhero = new Superhero(superheroName, realName, yearCreated, superPowers, isHuman, strength);
        //database[database.length].(superhero);
    }
}

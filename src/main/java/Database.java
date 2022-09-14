public class Database {

    Superhero[] database = new Superhero[4];

    int databaseLength = 0;

    public void addSuperhero(String superheroName, String realName, int yearCreated, String superPowers, boolean isHuman, double strength){
        database[databaseLength] = new Superhero(superheroName, realName, yearCreated, superPowers, isHuman, strength);
        System.out.println(database[databaseLength]);
        databaseLength++;
    }
}

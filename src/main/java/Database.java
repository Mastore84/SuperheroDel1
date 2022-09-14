public class Database {

    Superhero[] database = new Superhero[4];

    int database_Length = 0;

    public void addSuperhero(String superheroName, String realName, int yearCreated, String superPowers, boolean isHuman, double strength){
        database[database_Length] = new Superhero(superheroName, realName, yearCreated, superPowers, isHuman, strength);
        System.out.println(database[database_Length]);
        database_Length++;
    }
}

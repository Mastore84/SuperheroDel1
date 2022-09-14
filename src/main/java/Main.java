import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        boolean isHuman;
        Database database = new Database();
        Scanner sc = new Scanner(System.in);
        System.out.println("Indtast superheltenavn: ");
        String superheroName = sc.nextLine();
        System.out.println("Indtast rigtige navn: ");
        String realName = sc.nextLine();
        System.out.println("Indtast år skabt: ");
        int yearCreated = sc.nextInt();
        sc.nextLine();
        System.out.println("Indtast superkrafter: ");
        String superPowers = sc.nextLine();
        System.out.println("Er et menneske? j/n: ");
        String isHumanQ = sc.nextLine();
        if (isHumanQ.equalsIgnoreCase( "j")){
            isHuman = true;
        }
        else {
            isHuman = false;
        }
        System.out.println("Indtast styrke (tal med to decimaler): ");
        double strength = sc.nextDouble();
        database.addSuperhero(superheroName, realName, yearCreated, superPowers, isHuman, strength);

    }
}

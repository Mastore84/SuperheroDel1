import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        boolean isHuman = true;
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
        String isHumanQ = sc.next();
        if (isHumanQ == "j"){
            isHuman = true;
        }
        else if (isHumanQ == "n"){
            isHuman = false;
        }
        System.out.println("Indtast styrke (tal med to decimaler): ");
        double strength = sc.nextDouble();
        Superhero superhero = new Superhero(superheroName, realName, yearCreated, superPowers, isHuman, strength);

        System.out.println(superhero.toString());
    }
}

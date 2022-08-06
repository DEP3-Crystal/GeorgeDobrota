import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class randomPerson {
    //all names
    static List<String> names = new ArrayList<>(List.of("isuf.muca@crystal-system.eu\n" +
            "danjel.halili@crystal-system.eu\n" +
            "flavio.lorenci@crystal-system.eu\n" +
            "elia.omeri@crystal-system.eu\n" +
            "ardit.elezi@crystal-system.eu\n" +
            "luka.buziu@crystal-system.eu\n" +
            "megi.lala@crystal-system.eu\n" +
            "irena.shahini@crystal-system.eu\n" +
            "indrit.vaka@crystal-system.eu\n" +
            "griselda.muci@crystal-system.eu\n" +
            "theodor.gheorghe@crystal-system.eu\n" +
            "ioan.cocianu@crystal-system.eu\n" +
            "teofil.mitrea@crystal-system.eu\n" +
            "eduard.tiutiu@crystal-system.eu\n" +
            "george.dobrota@crystal-system.eu\n" +
            "stefanita.plesa@crystal-system.eu\n" +
            "adrian-nicolae.tigau@crystal-system.eu\n" +
            "emanuel.grabovschi@crystal-system.eu\n" +
            "george.sirbu@crystal-system.eu\n" +
            "andrei.state@crystal-system.eu\n" +
            "florin-adrian.dumitru@crystal-system.eu\n" +
            "victor.hincu@crystal-system.eu"));

    public static void main(String[] args) {
        menu();
    }

    public static void menu() {
        Scanner scan = new Scanner(System.in);
        int option;
        System.out.println("Hello!");

        //choose option
        System.out.println("Please choose an option:");
        System.out.println();
        System.out.println("1. Show all names.");
        System.out.println("2.Choose a random name.");
        System.out.println("3.Add a new person.");
        System.out.println("4.Remove a person.");
        System.out.println();
        System.out.println("0.For Exit");

        System.out.println("Intoduce your option:");
        option = scan.nextInt();
        do {

            if (option == 0)
                break;
            else if (option == 1) {
                showNames();
                break;
            } else if (option == 2) {
                randomPerson();
                break;
            } else if (option == 3) {
                addPerson();
                break;
            } else if (option == 4) {
                removePerson();
                break;
            }

        } while (option != 0);


    }

    static void showNames() {
        names.forEach(System.out::println);
    }

    public static void randomPerson() {
        Random random=new Random();
        int randomNumber;
        randomNumber = random.nextInt(names.size());
        System.out.println(names.get(randomNumber));
    }

    public static void addPerson() {
        boolean exit = true;
        Scanner scan = new Scanner(System.in);

        System.out.println("The email format is 'user@domain.com'");
        String person = scan.nextLine();
        names.add(person);
        System.out.println(names);
    }

    public static void removePerson() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Select one person to remove it:");
        names.forEach(System.out::println);
        System.out.println("The email format is 'user@domain.com'");
        String person = scan.nextLine();
        names.removeIf(v->v.equals(person));
        System.out.println(names);
    }
}





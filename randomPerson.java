import java.util.*;

public class randomPerson {
    //all names
    static ArrayList<String> names = new ArrayList<String>(
            Arrays.asList("isuf.muca@crystal-system.eu",
                    "\n danjel.halili@crystal-system.eu",
                    "\n flavio.lorenci@crystal-system.eu",
                    "\n elia.omeri@crystal-system.eu",
                    "\n ardit.elezi@crystal-system.eu",
                    "\n luka.buziu@crystal-system.eu",
                    "\n megi.lala@crystal-system.eu",
                    "\n irena.shahini@crystal-system.eu",
                    "\n indrit.vaka@crystal-system.eu",
                    "\n griselda.muci@crystal-system.eu",
                    "\n theodor.gheorghe@crystal-system.eu",
                    "\n ioan.cocianu@crystal-system.eu",
                    "\n teofil.mitrea@crystal-system.eu",
                    "\n eduard.tiutiu@crystal-system.eu",
                    "\n george.dobrota@crystal-system.eu",
                    "\n stefanita.plesa@crystal-system.eu",
                    "\n adrian-nicolae.tigau@crystal-system.eu",
                    "\n emanuel.grabovschi@crystal-system.eu",
                    "\n george.sirbu@crystal-system.eu",
                    "\n andrei.state@crystal-system.eu",
                    "\n florin-adrian.dumitru@crystal-system.eu",
                    "\n victor.hincu@crystal-system.eu"));


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
            else if (option>4)
            {System.out.println("You don't select anything, please try again ");
            System.out.println("Intoduce your option:");
            option = scan.nextInt();}
        } while (option != 0);


    }

    static void showNames() {
        System.out.println(names);
        System.out.println();
        System.out.println();
        System.out.println();
        menu();
    }

    public static void randomPerson() {
        Random random=new Random();
        int randomNumber;
        randomNumber = random.nextInt(names.size());
        System.out.println(names.get(randomNumber));
        names.remove(randomNumber);
        System.out.println();
        System.out.println();
        System.out.println();
        menu();
    }

    public static void addPerson() {
        Scanner scan = new Scanner(System.in);

        System.out.println("The name should be 'user@domain.com'");
        String person = scan.nextLine();
        names.add(person);
        System.out.println(names);
        System.out.println();
        System.out.println();
        System.out.println();
        menu();
    }

    public static void removePerson() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Select one person to remove it:");
        System.out.println(names);
        System.out.println("The name should be 'user@domain.com'");
        String person = scan.nextLine();
        names.removeIf(v->v.equals(person));
        System.out.println(names);
        System.out.println();
        System.out.println();
        System.out.println();
        menu();
    }
}





import java.util.*;

public class RandomPerson {
    //all names
    static List<String> names = new ArrayList<>(
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

    //My program starts with a menu that asks you to choose what you would like to do:
    //-show all names
    //-choose a random person
    //-add a new person
    //-remove a person
    //-quit program


    //The first step is choose an option from the above.
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
            } else if (option > 4) {
                System.out.println("You don't select anything, please try again ");
                System.out.println("Intoduce your option:");
                option = scan.nextInt();
            }
        } while (option != 0);


        // The second step is if you choose to show all names, the program must show all names from the list

    }

    public static void showNames() {
        System.out.println(names);
        System.out.println();
        System.out.println();
        System.out.println();
        menu();
    }

    //The third step is  if you choose a random person, the program must randomly choose a person from the list .
    // If you resume this random pick, the previously chosen person should no longer be chosen because was deleted from list.
    public static void randomPerson() {
        Random random = new Random();
        int randomNumber;
        randomNumber = random.nextInt(names.size());
        System.out.println(names.get(randomNumber));
        names.remove(randomNumber);
        System.out.println();
        System.out.println();
        System.out.println();
        menu();
    }

    //The next step is if you choose to add new person, you should introduce a name and the program adds the name to the end of the list
    //still working on this one
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

    //The final step is if you choose to remove a person, the program checks if there is a name in the list and if there is, it will delete the person
    public static void removePerson() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Select one person to remove it:");
        System.out.println(names);
        System.out.println("The name should be 'user@domain.com'");
        String person = scan.nextLine();
        names.removeIf(v -> v.equals(person));
        System.out.println(names);
        System.out.println();
        System.out.println();
        System.out.println();
        menu();
    }
}





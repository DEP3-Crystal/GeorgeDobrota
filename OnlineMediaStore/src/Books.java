import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Books {
    public void books() {
        System.out.println("Welcome to Books List");
        System.out.println();
        System.out.println("We have a lot of books for you!");


        ArrayList<String> fiction = new ArrayList<>();
        fiction.add("The Color of Feeling");
        fiction.add("Memoirs of a Geisha");
        fiction.add("Three women");


        ArrayList<String> fantasy = new ArrayList<>();
        fantasy.add("War in the Separation Zone");
        fantasy.add("Agent Cormac");
        fantasy.add("The War of the Elites");


        Address address = new Address();

        System.out.println("What is your choice?");
        Scanner scanner = new Scanner(System.in);
        String choice;
        choice = scanner.nextLine();
        switch (choice) {
            case "fiction":
                System.out.println(Arrays.toString(fiction.toArray()));
                System.out.println("Do you want to buy one of them?");
                String option;
                option = scanner.nextLine();
                switch (option) {
                    case "yes":
                        System.out.println("Which one?");
                        option = scanner.nextLine();
                        switch (option) {
                            case "The Color of Feeling":
                                System.out.println("The price for The Color of Feeling is $356.It's ok for you?");
                                option = scanner.nextLine();
                                switch (option) {
                                    case "yes":
                                        System.out.println("Complete your address for delievering!");
                                        address.completeAddress();
                                        break;
                                    case "no":
                                        System.out.println("Thanks for watching!");
                                }

                            case "Memoirs of a Geisha":
                                System.out.println("The price for Memoirs of a Geisha is 741.It's ok for you?");
                                option = scanner.nextLine();
                                switch (option) {
                                    case "yes":
                                        System.out.println("Complete your address for delievering!");
                                        address.completeAddress();
                                        break;
                                    case "no":
                                        System.out.println("Thanks for watching!");
                                }

                            case "Three women":
                                System.out.println("The price for The Breakfast Club movie is $254.It's ok for you?");
                                option = scanner.nextLine();
                                switch (option) {
                                    case "yes":
                                        System.out.println("Complete your address for delievering!");
                                        address.completeAddress();
                                        break;
                                    case "no":
                                        System.out.println("Thanks for watching!");
                                }


                        }
                        break;
                    case "no":
                        System.out.println("Thanks for watching!");
                }
                break;
            case "fantasy":
                System.out.println(Arrays.toString(fantasy.toArray()));
                System.out.println("Do you want to buy one of them?");
                String option1;
                option1 = scanner.nextLine();
                switch (option1) {
                    case "yes":
                        System.out.println("Which one?");
                        option = scanner.nextLine();
                        switch (option) {
                            case "War in the Separation Zone":
                                System.out.println("The price for War in the Separation Zone is $356.It's ok for you?");
                                option = scanner.nextLine();
                                switch (option) {
                                    case "yes":
                                        System.out.println("Complete your address for delievering!");
                                        address.completeAddress();
                                        break;
                                    case "no":
                                        System.out.println("Thanks for watching!");
                                }

                            case "Agent Cormac":
                                System.out.println("The price for Agent Cormac is 741.It's ok for you?");
                                option = scanner.nextLine();
                                switch (option) {
                                    case "yes":
                                        System.out.println("Complete your address for delievering!");
                                        address.completeAddress();
                                        break;
                                    case "no":
                                        System.out.println("Thanks for watching!");
                                }

                            case "The War of the Elites":
                                System.out.println("The price for The War of the Elites is $254.It's ok for you?");
                                option = scanner.nextLine();
                                switch (option) {
                                    case "yes":
                                        System.out.println("Complete your address for delievering!");
                                        address.completeAddress();
                                        break;
                                    case "no":
                                        System.out.println("Thanks for watching!");
                                }

                                break;
                            case "no":
                                System.out.println("Thanks for watching!");
                        }
                        break;
                    default:
                        System.err.println("We don't have this category, please try again. ");

                }
        }

    }
}


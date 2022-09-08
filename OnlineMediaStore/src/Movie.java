import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Movie {
    public void movie() {
        System.out.println("Welcome to the Movie List!");
        System.out.println();
        System.out.println("There are 100 movie in the list");


        ArrayList<String> animated = new ArrayList<>();
        animated.add("Robot Chicken");
        animated.add("Family Guy");
        animated.add("American Dad");
        animated.add("Bob's Burgers");
        animated.add("The Simpsons");


        ArrayList<String> drama = new ArrayList<>();
        drama.add("John Q");
        drama.add("The Green Mile");
        drama.add("The Breakfast Club");
        drama.add("The Shawshank Redemption");
        drama.add("Braveheart");

        ArrayList<String> horror = new ArrayList<>();
        horror.add("Scream");
        horror.add("Carrie");
        horror.add("Insideous");
        horror.add("Sinister");

        ArrayList<String> scifi = new ArrayList<>();
        scifi.add("The Book of Eli");
        scifi.add("Daybreakers");
        scifi.add("Hunter Prey");
        scifi.add("Predators");
        scifi.add("Skyline");

        Address address = new Address();


        System.out.println("What is your choice?");
        Scanner scanner = new Scanner(System.in);
        String choice;
        choice = scanner.nextLine();
        switch (choice) {
            case "drama":
                System.out.println(Arrays.toString(drama.toArray()));
                System.out.println("Do you want to buy one of them?");
                String option;
                option = scanner.nextLine();
                switch (option) {
                    case "yes":
                        System.out.println("Which one?");
                        option = scanner.nextLine();
                        switch (option) {
                            case "John Q":
                                System.out.println("The price for John Q movie is $356.It's ok for you?");
                                option = scanner.nextLine();
                                switch (option) {
                                    case "yes":
                                        System.out.println("Complete your address for delievering!");
                                        address.completeAddress();
                                        break;
                                    case "no":
                                        System.out.println("Thanks for watching!");
                                }

                            case "The Green Mile":
                                System.out.println("The price for The Green Mile movie is 741.It's ok for you?");
                                option = scanner.nextLine();
                                switch (option) {
                                    case "yes":
                                        System.out.println("Complete your address for delievering!");
                                        address.completeAddress();
                                        break;
                                    case "no":
                                        System.out.println("Thanks for watching!");
                                }

                            case "The Breakfast Club":
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

                            case "The Shawshank Redemption":
                                System.out.println("The price for The Shawshank Redemption movie is $123.It's ok for you?");
                                option = scanner.nextLine();
                                switch (option) {
                                    case "yes":
                                        System.out.println("Complete your address for delievering!");
                                        address.completeAddress();
                                        break;
                                    case "no":
                                        System.out.println("Thanks for watching!");
                                }

                            case "Braveheart":
                                System.out.println("The price for Braveheart movie is $356.It's ok for you?");
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
            case "horror":
                System.out.println(Arrays.toString(horror.toArray()));
                System.out.println("Do you want to buy one of them?");
                String option1;
                option1 = scanner.nextLine();
                switch (option1) {
                    case "yes":
                        System.out.println("Which one?");
                        option = scanner.nextLine();
                        switch (option) {
                            case "Scream":
                                System.out.println("The price for Scream movie is $356.It's ok for you?");
                                option = scanner.nextLine();
                                switch (option) {
                                    case "yes":
                                        System.out.println("Complete your address for delievering!");
                                        address.completeAddress();
                                        break;
                                    case "no":
                                        System.out.println("Thanks for watching!");
                                }

                            case "Carrie":
                                System.out.println("The price for Carrie movie is 741.It's ok for you?");
                                option = scanner.nextLine();
                                switch (option) {
                                    case "yes":
                                        System.out.println("Complete your address for delievering!");
                                        address.completeAddress();
                                        break;
                                    case "no":
                                        System.out.println("Thanks for watching!");
                                }

                            case "Insideous":
                                System.out.println("The price for Insideous movie is $254.It's ok for you?");
                                option = scanner.nextLine();
                                switch (option) {
                                    case "yes":
                                        System.out.println("Complete your address for delievering!");
                                        address.completeAddress();
                                        break;
                                    case "no":
                                        System.out.println("Thanks for watching!");
                                }

                            case "Sinister":
                                System.out.println("The price for Sinister movie is $123.It's ok for you?");
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
            case "scifi":
                System.out.println(Arrays.toString(scifi.toArray()));
                System.out.println("Do you want to buy one of them?");
                String option2;
                option2 = scanner.nextLine();
                switch (option2) {
                    case "yes":
                        System.out.println("Which one?");
                        option = scanner.nextLine();
                        switch (option) {
                            case "The Book of Eli":
                                System.out.println("The price for The Book of Eli movie is $356.It's ok for you?");
                                option = scanner.nextLine();
                                switch (option) {
                                    case "yes":
                                        System.out.println("Complete your address for delievering!");
                                        address.completeAddress();
                                        break;
                                    case "no":
                                        System.out.println("Thanks for watching!");
                                }

                            case "Daybreakers":
                                System.out.println("The price for Daybreakers movie is 741.It's ok for you?");
                                option = scanner.nextLine();
                                switch (option) {
                                    case "yes":
                                        System.out.println("Complete your address for delievering!");
                                        address.completeAddress();
                                        break;
                                    case "no":
                                        System.out.println("Thanks for watching!");
                                }

                            case "Hunter Prey":
                                System.out.println("The price for Hunter Prey movie is $254.It's ok for you?");
                                option = scanner.nextLine();
                                switch (option) {
                                    case "yes":
                                        System.out.println("Complete your address for delievering!");
                                        address.completeAddress();
                                        break;
                                    case "no":
                                        System.out.println("Thanks for watching!");
                                }

                            case "Predators":
                                System.out.println("The price for Predators movie is $123.It's ok for you?");
                                option = scanner.nextLine();
                                switch (option) {
                                    case "yes":
                                        System.out.println("Complete your address for delievering!");
                                        address.completeAddress();
                                        break;
                                    case "no":
                                        System.out.println("Thanks for watching!");
                                }

                            case "Skyline":
                                System.out.println("The price for Skyline movie is $356.It's ok for you?");
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
            case "animated":
                System.out.println(Arrays.toString(animated.toArray()));
                System.out.println("Do you want to buy one of them?");
                String option3;
                option3 = scanner.nextLine();
                switch (option3) {
                    case "yes":
                        System.out.println("Which one?");
                        option = scanner.nextLine();
                        switch (option) {
                            case "Robot Chicken":
                                System.out.println("The price for Robot Chicken movie is $356.It's ok for you?");
                                option = scanner.nextLine();
                                switch (option) {
                                    case "yes":
                                        System.out.println("Complete your address for delievering!");
                                        address.completeAddress();
                                        break;
                                    case "no":
                                        System.out.println("Thanks for watching!");
                                }

                            case "Family Guy":
                                System.out.println("The price for Family Guy movie is 741.It's ok for you?");
                                option = scanner.nextLine();
                                switch (option) {
                                    case "yes":
                                        System.out.println("Complete your address for delievering!");
                                        address.completeAddress();
                                        break;
                                    case "no":
                                        System.out.println("Thanks for watching!");
                                }

                            case "American Dad":
                                System.out.println("The price for American Dad movie is $254.It's ok for you?");
                                option = scanner.nextLine();
                                switch (option) {
                                    case "yes":
                                        System.out.println("Complete your address for delievering!");
                                        address.completeAddress();
                                        break;
                                    case "no":
                                        System.out.println("Thanks for watching!");
                                }

                            case "Bob's Burgers":
                                System.out.println("The price for Bob's Burgers movie is $123.It's ok for you?");
                                option = scanner.nextLine();
                                switch (option) {
                                    case "yes":
                                        System.out.println("Complete your address for delievering!");
                                        address.completeAddress();
                                        break;
                                    case "no":
                                        System.out.println("Thanks for watching!");
                                }

                            case "The Simpsons":
                                System.out.println("The price for The Simpsons movie is $356.It's ok for you?");
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
            default:
                System.err.println("We don't have this category, please try again. ");

        }
    }


}

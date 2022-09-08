import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Game {
    public void game() {
        System.out.println("Welcome to Game List");
        System.out.println();
        System.out.println("We have a lot of games for you!");


        ArrayList<String> shooter = new ArrayList<>();
        shooter.add("PUBG");
        shooter.add("CS GO");
        shooter.add("Tom Clancy");
        shooter.add("Call of Duty");

        ArrayList<String> strategy = new ArrayList<>();
        strategy.add("TFT");
        strategy.add("Tetris");
        strategy.add("Solitaire");
        strategy.add("Zuma");

        ArrayList<String> sport = new ArrayList<>();
        sport.add("Fifa");
        sport.add("Need for Speed");
        sport.add("NFL");
        sport.add("PES");

        Address address = new Address();


        System.out.println("What is your choice?");
        Scanner scanner = new Scanner(System.in);
        String choice;
        choice = scanner.nextLine();
        switch (choice) {
            case "shooter":
                System.out.println(Arrays.toString(shooter.toArray()));
                System.out.println("Do you want to buy one of them?");
                String option;
                option = scanner.nextLine();
                switch (option) {
                    case "yes":
                        System.out.println("Which one?");
                        option = scanner.nextLine();
                        switch (option) {
                            case "PUBG":
                                System.out.println("The price for PUBG game is $356.It's ok for you?");
                                option = scanner.nextLine();
                                switch (option) {
                                    case "yes":
                                        System.out.println("Complete your address for delievering!");
                                        address.completeAddress();
                                        break;
                                    case "no":
                                        System.out.println("Thanks for watching!");
                                }

                            case "CS GO":
                                System.out.println("The price for CS GO game is 741.It's ok for you?");
                                option = scanner.nextLine();
                                switch (option) {
                                    case "yes":
                                        System.out.println("Complete your address for delievering!");
                                        address.completeAddress();
                                        break;
                                    case "no":
                                        System.out.println("Thanks for watching!");
                                }

                            case "Tom Clancy":
                                System.out.println("The price for Tom Clancy game is $254.It's ok for you?");
                                option = scanner.nextLine();
                                switch (option) {
                                    case "yes":
                                        System.out.println("Complete your address for delievering!");
                                        address.completeAddress();
                                        break;
                                    case "no":
                                        System.out.println("Thanks for watching!");
                                }

                            case "Call of Duty":
                                System.out.println("The price for Call of Duty game is $123.It's ok for you?");
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
            case "strategy":
                System.out.println(Arrays.toString(strategy.toArray()));
                System.out.println("Do you want to buy one of them?");
                String option1;
                option1 = scanner.nextLine();
                switch (option1) {
                    case "yes":
                        System.out.println("Which one?");
                        option = scanner.nextLine();
                        switch (option) {
                            case "TFT":
                                System.out.println("The price for TFT game is $356.It's ok for you?");
                                option = scanner.nextLine();
                                switch (option) {
                                    case "yes":
                                        System.out.println("Complete your address for delievering!");
                                        address.completeAddress();
                                        break;
                                    case "no":
                                        System.out.println("Thanks for watching!");
                                }

                            case "Tetris":
                                System.out.println("The price for Tetris game is 741.It's ok for you?");
                                option = scanner.nextLine();
                                switch (option) {
                                    case "yes":
                                        System.out.println("Complete your address for delievering!");
                                        address.completeAddress();
                                        break;
                                    case "no":
                                        System.out.println("Thanks for watching!");
                                }

                            case "Solitaire":
                                System.out.println("The price for Solitaire game is $254.It's ok for you?");
                                option = scanner.nextLine();
                                switch (option) {
                                    case "yes":
                                        System.out.println("Complete your address for delievering!");
                                        address.completeAddress();
                                        break;
                                    case "no":
                                        System.out.println("Thanks for watching!");
                                }

                            case "Zuma":
                                System.out.println("The price for Zuma game is $123.It's ok for you?");
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
            case "sport":
                System.out.println(Arrays.toString(sport.toArray()));
                System.out.println("Do you want to buy one of them?");
                String option2;
                option2 = scanner.nextLine();
                switch (option2) {
                    case "yes":
                        System.out.println("Which one?");
                        option = scanner.nextLine();
                        switch (option) {
                            case "Fifa":
                                System.out.println("The price for Fifa game is $356.It's ok for you?");
                                option = scanner.nextLine();
                                switch (option) {
                                    case "yes":
                                        System.out.println("Complete your address for delievering!");
                                        address.completeAddress();
                                        break;
                                    case "no":
                                        System.out.println("Thanks for watching!");
                                }

                            case "Need for Speed":
                                System.out.println("The price for Need for Speed game is 741.It's ok for you?");
                                option = scanner.nextLine();
                                switch (option) {
                                    case "yes":
                                        System.out.println("Complete your address for delievering!");
                                        address.completeAddress();
                                        break;
                                    case "no":
                                        System.out.println("Thanks for watching!");
                                }

                            case "NFL":
                                System.out.println("The price for NFL game is $254.It's ok for you?");
                                option = scanner.nextLine();
                                switch (option) {
                                    case "yes":
                                        System.out.println("Complete your address for delievering!");
                                        address.completeAddress();
                                        break;
                                    case "no":
                                        System.out.println("Thanks for watching!");
                                }

                            case "PES":
                                System.out.println("The price for PES game is $123.It's ok for you?");
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

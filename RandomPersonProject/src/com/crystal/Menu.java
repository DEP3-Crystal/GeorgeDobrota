package com.crystal;

import java.util.Scanner;

import static com.crystal.People.*;

public class Menu {

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
        System.out.println();
        System.out.println("Intoduce your option:");
        option = scan.nextInt();
        do {

            if (option == 0) break;
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
                System.err.println("You introduce an invalid option, please try again. ");
                option = scan.nextInt();
            }
        } while (option != 0);
    }
}
package com.crystal;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Random;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static com.crystal.ListPeople.names;
import static com.crystal.ListPeople.names2;

public class People extends Menu {

    // The second step is if you choose to show all names, the program must show all names from the list
    public static void showNames() {
        try {
            File myObj = new File("C:\\Users\\george.dobrota\\Desktop\\java core\\RandomPersonProject\\src\\com\\crystal\\name.txt");
            Scanner myReader = new Scanner(myObj);
            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                System.out.println(data);
            }
            myReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
        System.out.println();
        System.out.println();
        System.out.println();
        menu();
    }

    //The third step is  if you choose a random person, the program must randomly choose a person from the list .
    // If you resume this random pick, the previously chosen person should no longer be chosen because was deleted from list and was added into second list
    public static void randomPerson() {
        Random random = new Random();
        int randomNumber;
        randomNumber = random.nextInt(names.size());
        System.out.println(names.get(randomNumber));
        String name;
        name = names.get(randomNumber);
        names2.add(name);
        names.remove(randomNumber);
        if (names.size() == 0) {
            Random random2 = new Random();
            int randomNumber2;
            randomNumber2 = random2.nextInt(names2.size());
            System.out.println(names2.get(randomNumber2));
            String name2;
            name2 = names2.get(randomNumber2);
            names.add(name2);
            names2.remove(randomNumber2);
        }

        //System.out.println("List 2: "+names2);
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
        if(names.contains(person)){
            System.err.println("This person is already on the list !!! Please try again !!!");
            addPerson();
        }else if(validateEmail(person)) {
            names.add(person);
            System.out.println(names);
            System.out.println();
            System.out.println();
            System.out.println();
        }else {
            System.err.println("Invalid email !!! Please try again !!!!");
            addPerson();
        }
        menu();
    }

    public static boolean validateEmail(String email)
    {
        String emailRegex = "^[a-zA-Z0-9_+&*-]+(?:\\."+
                "[a-zA-Z0-9_+&*-]+)*@" +
                "(?:[a-zA-Z0-9-]+\\.)+[a-z" +
                "A-Z]{2,7}$";

        Pattern pat = Pattern.compile(emailRegex);
        if (email == null)
            return false;
        return pat.matcher(email).matches();
    }

    //The final step is if you choose to remove a person, the program checks if there is a name in the list and if there is, it will delete the person
    public static void removePerson() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Select one person to remove it:");
        System.out.println(names);
        System.out.println("The name should be 'user@domain.com'");
        String person;
        person=scan.nextLine();
        if(names.contains(person)){
            names.remove(person);
            System.out.println(names);
        }else {
            System.err.println("This name doesn't exist. Please enter a name that is in the list");
            removePerson();
        }
        menu();
    }
}

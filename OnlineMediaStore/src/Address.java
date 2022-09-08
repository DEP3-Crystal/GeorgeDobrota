import java.util.Scanner;

public class Address {

    public void completeAddress() {
        Scanner scan = new Scanner(System.in);
        String street;
        int number;
        System.out.println("Street: ");
        street = scan.nextLine();
        System.out.println("Number: ");
        number = scan.nextInt();
        System.out.println("Your address is: Street " + street + " and number " + number + " . It's ok?");
        String optionadd;
        optionadd = scan.nextLine();
        switch (optionadd) {
            case "yes":
                System.out.println("Your DVD is ready for delievering!");
                break;
            case "no":
                System.out.println("Street: ");
                street = scan.nextLine();
                System.out.println("Number: ");
                number = scan.nextInt();
                System.out.println("Your address is: Street " + street + " and number " + number);
                break;

        }

    }
}

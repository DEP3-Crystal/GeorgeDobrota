import java.util.Arrays;
import java.util.Scanner;

public class VendingMachine {
    static int[] Change(double sum, double price){

        int[] money={1, 5, 10, 25, 50, 100};
        int[] rest=new int[6];
        int i;
        int change= (int) ((sum-price)*100);
        for( i=5; i>=0;i--)
        {
            rest[i]=change/money[i];
            change=change%money[i];
        }
        return rest;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Introduce your money: ");
        double sum = in.nextDouble();
        System.out.print("Introduce price: ");
        double price = in.nextDouble();
        in.close();
        System.out.println("Your change is: " + Arrays.toString(Change(sum, price)));
    }

}
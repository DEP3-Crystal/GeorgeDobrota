import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static int[] money={1, 5, 10, 25, 50, 100};
    public static int[] changerecieved=new int[6];
    public static int[] computeChange(double sum, double price){


        int change= (int) ((sum-price)*100);
        for( int i=5; i>=0;i--)
        {
            changerecieved[i]=change/money[i];
            change=change%money[i];
        }
        return changerecieved;
    }

    public static void menu(){
        double[] priceList = new double[]{0.25, 0.55, 0.89, 1, 4};
        Scanner scanner = new Scanner(System.in);
        int selectedProduct;
        double price = 0;
        System.out.println();
        System.out.println();
        System.out.println("The available products are: Gum: 0.25$ Candy: 0.55$ Chocolate: 0.89$ Soda: 1$ Beef Jerky: 4$ ");
        System.out.println();
        System.out.println("Please select a product:");
        selectedProduct = scanner.nextInt();
        if (selectedProduct == 1) {
            price = priceList[0];
        }

        if (selectedProduct == 2) {
            price = priceList[1];
        }

        if (selectedProduct == 3) {
            price = priceList[2];
        }

        if (selectedProduct == 4) {
            price = priceList[3];
        }

        if (selectedProduct == 5) {
            price = priceList[4];
        }
        Scanner scanner1 = new Scanner(System.in);
        System.out.print("Introduce your money: ");
        double sum = scanner1.nextDouble();
        scanner1.close();
        System.out.println("Your change is: " + Arrays.toString(computeChange(sum, price)));

    }
    public static void main(String[] args) {
        menu();
    }

}
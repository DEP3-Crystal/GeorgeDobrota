package main;

import static main.VendingMachine.Change;

class VendingMachineTest {
   public static void main(String[] args) {
        double sum=7;
        double price=2;
        int[] result=Change(sum,price);
        int[] expectresult={0, 0, 0, 0, 0, 5};
        if(result==expectresult)
            System.out.println("Test ok");
            else System.out.println("Test fail");
    }

}
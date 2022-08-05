import java.util.Scanner;

public class Hour {

    Scanner in = new Scanner(System.in);
    int seconds = in.nextInt();
    int p1 = seconds % 60;
    int p2 = (seconds / 60)/60;
    int p3 = p2 % 60;


}



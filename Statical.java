import java.util.Scanner;

import static java.lang.Math.sqrt;

public class Statical {
    Scanner in = new Scanner(System.in);
    int x1 = in.nextInt();
    int x2 = in.nextInt();
    int x3 = in.nextInt();
    int u=(x1+x2+x3)/3;
    double tt = ((x1 - u) ^ 2 + (x2 - u)^ 2 + (x3 - u) ^ 2) / 3;
    double t= sqrt(tt);
}

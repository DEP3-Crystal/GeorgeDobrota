import java.util.Scanner;
import java.util.Vector;


public class Primenr {

    public int p;
    Scanner in = new Scanner(System.in);
    int nr1 = in.nextInt();
    int nr2 = in.nextInt();

    Vector<Integer> vc = new Vector<>();
    public Vector<Integer> primenr1() {


        for (p = nr1; p <= nr2; p++) {
            boolean prime = true;
            for (int j = 2; j < p; j++) {
                if (p % j == 0) {
                    prime = false;
                    break;
                }
            }
            if (prime) {
                vc.add(p);
            }

        }

        return vc;
    }
}

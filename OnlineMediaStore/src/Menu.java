import java.util.Scanner;

public class Menu {


    public void menu() {
        Scanner scan = new Scanner(System.in);
        int option;
        System.out.println("Hello!");

        //choose option
        System.out.println("Please choose an option:");
        System.out.println();
        System.out.println("1. Movie DVDs");
        System.out.println("2. Game DVDs");
        System.out.println("3. Books");
        System.out.println();
        System.out.println("0.For Exit");
        System.out.println();
        System.out.println("Intoduce your option:");
        option = scan.nextInt();
        do {

            if (option == 0)
                break;
            else if (option == 1) {
                Movie movie = new Movie();
                movie.movie();
                break;
            } else if (option == 2) {
                Game game = new Game();
                game.game();
                break;
            } else if (option == 3) {
                Books books = new Books();
                books.books();
                break;
            } else if (option > 3) {
                System.err.println("You introduced an invalid option, please try again. ");
                option = scan.nextInt();
            }
        } while (option != 0);

    }


}

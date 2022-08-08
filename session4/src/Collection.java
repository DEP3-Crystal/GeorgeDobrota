import java.util.ArrayList;
import java.util.List;

public class Collection {

    public static void main(String[] args) {

        List<String> namesList = new ArrayList<>();
        List<String> namesList2 = new ArrayList<>();
        String name1 = "Ion";

        namesList.add("George");
        namesList.add("Mihai");
        namesList.add("Andrei");
        namesList.add("Ilinca");
        namesList.add("Florenta");

        namesList2.add("George");
        namesList2.add("Mihai");
        namesList2.add("Andrei");
        namesList2.add("Ilinca");
        namesList2.add("Florenta");


        System.out.println(namesList);
        System.out.println(namesList.hashCode());
        System.out.println(namesList.equals(namesList2));

        namesList.remove(2);

        System.out.println(namesList);

        namesList.remove("Florenta");

        System.out.println(namesList);











    }
}
import java.util.Locale;
import java.util.Objects;
public class Person {
    public static String COUNTRY;

    public int id;
    private String firstname;
    private String lastname;
    private int age;
    private String phoneNumber;

    public Person(int id, String firstname, String lastname, int age ){
        this.id=id;
        this.firstname=firstname;
        this.lastname=lastname;
        this.age=age;
    }

    public int getId(){
        return id;
    }

    public String getFirstname(){
        return firstname;
    }

    public String getLastname(){
        return lastname;
    }

    public int getAge() {
        return age;
    }

    public static String getCountry(){
        return COUNTRY;
    }

    static{
        System.out.println("Person class static initializer");
        if(Locale.getDefault().equals(Locale.forLanguageTag("ro"))){
            COUNTRY="Romania";
        }
        else {
            COUNTRY="Albania";
        }
    }

    static class SomeClass {
        static {
            System.out.println("Some class static initializer");
        }
    }

}

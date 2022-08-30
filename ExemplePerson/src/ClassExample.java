public class ClassExample {
    public static void main(String[] args) {
        Person p1= new Person(1,"John","Doe",25);
        Person p2= new Person(1,"Jane","Doe",26);

        System.out.println(p1.getFirstname());
        System.out.println(p1.getAge());
        System.out.println(p2.getAge());
        System.out.println(Person.COUNTRY);
    }
}
public class ReverseNumber {

    public static void main(String[] args) {

        String reversed = new StringBuilder("123").reverse().toString();

        Integer num = 123;
        Integer newNumber = 0;

        while (num != 0) {

            int digit = num % 10;

            newNumber = (newNumber * 10) + digit;
            num /= 10;
        }

        System.out.println(reversed);
        System.out.println(newNumber);

    }
}
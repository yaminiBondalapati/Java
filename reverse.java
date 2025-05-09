import java.util.*;
public class reverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a three-digit number:");
        int number = sc.nextInt();

        int reverse = 0;

        if (number < 100 || number > 999) {
            System.out.println("Not a three-digit number");
        } else {

            while (number != 0) {
                int digit = number % 10;
                reverse = reverse * 10 + digit;
                number /= 10;
            }

            System.out.println("Reversed number: " + reverse);
        }

        sc.close(); 
    }
}


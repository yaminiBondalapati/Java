import java.util.*;
public class Kaprekar_Num {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number:");
        int num = sc.nextInt();

        int sq_num = num * num;
        int count = String.valueOf(num).length();
        int divisor = (int) Math.pow(10, count);

        int leftPart = sq_num / divisor;
        int rightPart = sq_num % divisor;
        int sum = leftPart + rightPart;

        if (num == sum) {
            System.out.println("Kaprekar number");
        } else {
            System.out.println("Not a Kaprekar number");
        }

        sc.close();
    }
}